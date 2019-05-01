/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 by Roger Giuffrè
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : webrobot.eu query engine; an ANTLR4 grammar for webrobot.eu project
 * Developed by : Roger Giuffrè, giuffresoft@gmail.com
 */
grammar webroboteudsl;

parse
 : ( sql_stmt_list | error )* EOF
 ;

error
 : UNEXPECTED_CHAR 
   { 
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text); 
   }
 ;

sql_stmt_list
 : ';'* query_stmt ( ';'+ query_stmt )* ';'*;                                     //only if is necessary            
query_stmt : fetch_stmt (K_THEN (sql_stmt (K_THEN sql_stmt)*))*;

sql_stmt : fetch_stmt | explore_stmt | join_stmt | flatten_stmt | flatselect_stmt | select_stmt;

fetch_stmt : C_FETCH K_WHERE K_ACTIONS K_ARE '(' list_actions_stmt ')' (K_AND K_PARAMETERS K_ARE '(' list_parameters_stmt ')')*;

list_actions_stmt : '(' action_stmt (K_AND action_stmt)*')';

action_stmt : '(' K_ACTION ASSIGN actions (K_AND argument_alias ASSIGN string_expr)*  ')';

list_parameters_stmt : '(' parameter_stmt (K_AND parameter_stmt)* ')';

parameter_stmt : argument_alias ASSIGN string_expr;

explore_stmt : C_EXPLORE K_WHERE K_SPLITTER ASSIGN literal_value K_ACTIONS K_ARE '(' list_actions_stmt ')' (K_AND K_PARAMETERS K_ARE '(' list_parameters_stmt ')')*;
join_stmt: C_JOIN (select_automatic_stmt | select_static_field_stmt) K_WHERE K_SPLITTER ASSIGN literal_value K_ACTIONS K_ARE '(' list_actions_stmt ')' (K_AND K_PARAMETERS K_ARE '(' list_parameters_stmt ')')*;
flatten_stmt: C_FLATTEN K_WHERE K_SPLITTER ASSIGN literal_value (K_AND K_PARAMETERS K_ARE '(' list_parameters_stmt ')')*;
flatselect_stmt: C_FLATSELECT (select_automatic_stmt | select_static_field_stmt) K_WHERE K_SPLITTER ASSIGN literal_value (K_AND K_PARAMETERS K_ARE '(' list_parameters_stmt ')')*;
select_stmt: C_SELECT select_automatic_stmt | select_static_field_stmt;

select_static_field_stmt : selector_expression K_AS column_alias;

select_automatic_stmt : K_AUTOMATIC K_WITH (algotype | K_CONCEPT '(' literal_value ')'); 

//select_stmt : SELECT AUTOMATIC WITH CONCEPT(idConcept);


                                                            // "http://dbpedia.org/page/" + eval(CURRENT(['a']).text)
                                                            // "http://dbpedia.org/page/" + $page
algotype : K_PTA;


string_expr : (literal_value (PLUS (symbol | eval_expression))?)+; 

symbol : '$' IDENTIFIER;

eval_expression : K_EVAL '(' selector_expression ')';

suboperator : K_FINDALL |
              K_FINDFIRST |
              K_CHILDREN |
              K_CHILD |
              K_URI |
              K_CODE |
              K_TEXT |
              K_OWNTEXT |
              K_ATTR |
              K_HREF |
              K_SRC |
              K_BOILERPIPE;
nlpoperator: K_LANGUAGE | 
            K_TOKENIZER | 
            K_POSTAGGER | 
            K_NER | 
            K_POLARITY | 
            K_SENTIMENT;

selector_expression : K_CURRENT | K_PIVOTED '(' literal_value ')' (DOT suboperator)? (DOT nlpoperator)?;

signed_number
 : ( '+' | '-' )? NUMERIC_LITERAL
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 ;

error_message
 : STRING_LITERAL
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;

keyword :
K_EVAL |
K_FINDALL |
K_FINDFIRST |
K_CHILDREN |
K_CHILD |
K_URI |
K_CODE |
K_TEXT |
K_OWNTEXT |
K_ATTR |
K_HREF |
K_SRC |
K_BOILERPIPE |
K_AUTOMATIC |
K_PTA |
K_LANGUAGE
K_TOKENIZER |
K_POSTAGGER |
K_NER |
K_POLARITY |
K_SENTIMENT |
K_CONCEPT |
K_COMMENTS |
K_ARTICLE |
K_URL |
K_SPLITTER |
K_VALUE |
K_SELECTOR
K_VISIT |
K_ARE |
K_PARAMETERS |
K_PIVOTED |
K_CURRENT |
K_ACTION |
K_ACTIONS |
K_AND |
K_AS |
K_FROM |
K_IN |
K_TRY |
K_THEN |
K_WHERE |
K_WITH
 ;

// TODO check all names below

name
 : any_name
 ;


any_name
 : IDENTIFIER 
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';

//actions

argument_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;

actions : A_SCREENSHOT | A_CLICK | A_ASSERT | A_OAUTHSIGN | A_DELAY | A_RANDOMDELAY | A_CLICKNEXT | A_DROPDOWNSELECT | A_EXESCRIPT | A_DRAGSLIDER | A_WAITFOR | A_LOOP |  A_IF |  A_WGET | A_SNAPSHOT | A_SUBMIT | A_TEXTINPUT;

A_SCREENSHOT : S C R E E N S H O T;

A_CLICK : C L I C K;

A_ASSERT : A S S E R T;

A_OAUTHSIGN : O A U T H S I G N;

A_DELAY : D E L E Y;

A_RANDOMDELAY : R A N D O M D E L A Y;

A_CLICKNEXT : C L I C K N E X T;

A_DROPDOWNSELECT : D R O P D O W N S E L E C T;

A_EXESCRIPT : E X E C S C R I P T;

A_DRAGSLIDER : D R A G S L I D E R;

A_WAITFOR : W A I T F O R;

A_LOOP : L O O P;

A_IF : I F;

A_WGET : W G E T;

A_SNAPSHOT : S N A P S H O T;

A_SUBMIT : S U B M I T;

A_TEXTINPUT : T E X T I N P U T;

//clauses

C_JOIN : J O I N;
C_VISITJOIN : V I S I T J O I N;

C_VISITEXPLORE : V I S I T E X P L O R E;

C_FLATSELECT : F L A T S E L E C T;

C_SELECT : S E L E C T;

C_EXPLORE : E X P L O R E;

C_FLATTEN : F L A T T E N;

C_EXPLODE : E X P L O D E;

C_FETCH : F E T C H;

//parameters

P_MAXDEPTH : M A X D E P T H;

P_CACHEERROR : C A C H E E R R O R;

P_RETRIES : R E T R I E S;

P_LIMIT : L I M I T;

P_BLOCKING : B L O C K I N G;

P_DELEY : D E L E Y;

P_TIMEOUT : T I M E O U T;

P_ALIAS : A L I A S;

P_FILTER : F I L T E R;

P_OPTIMIZER : O P T I M I Z E R;


//keywords

K_EVAL : E V A L;
K_FINDALL: F I N D A L L;
K_FINDFIRST: F I N D F I R S T;
K_CHILDREN: C H I L D R E N;
K_CHILD: C H I L D;
K_URI: U R I;
K_CODE: C O D E;
K_TEXT: T E X T;
K_OWNTEXT: O W N T E X T;
K_ATTR: A T T R;
K_HREF: H R E F;
K_SRC: S R C;
K_BOILERPIPE: B O I L E R P I P E;

K_AUTOMATIC : A U T O M A T I C;

K_PTA : P T A;

K_LANGUAGE : L A N G U A G E;
K_TOKENIZER : T O K E N I Z E R;
K_POSTAGGER : P O S T A G G E R;
K_NER : N E R;
K_POLARITY : P O L A R I T Y;
K_SENTIMENT : S E N T I M E N T;
K_CONCEPT: C O N C E P T;
K_COMMENTS: C O M M E N T S;
K_ARTICLE: A R T I C L E;
K_URL : U R L;

K_SPLITTER : S P L I T T E R;

K_VALUE : V A L U E;
K_SELECTOR : S E L E C T O R;

K_VISIT : V I S I T;

K_ARE : A R E;
K_PARAMETERS : P A R A M E T E R S;
K_PIVOTED : P I V O T E D;

K_CURRENT : C U R R E N T;

K_ACTION : A C T I O N;
K_ACTIONS : A C T I O N S;

K_AND : A N D;
K_AS : A S;
K_FROM : F R O M;
K_IN : I N;

K_TRY : T R Y;


K_THEN : T H E N;

K_WHERE : W H E R E;
K_WITH : W I T H;


IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];