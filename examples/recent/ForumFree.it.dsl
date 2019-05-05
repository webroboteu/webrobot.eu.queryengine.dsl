FETCH WHERE ACTIONS ARE (
    action = VISIT AND url = $url
)
WGETEXPLORE WHERE splitter = CURRENT(ul.pages li a[href^=https])                    //foreach page in the datagrid. Will be necessary to test
THEN 
WGETJOIN WHERE splitter = CURRENT(table.main6 tr td div h2.web a)                   // navigate to the target section of the forum
THEN 
WGETEXPLORE WHERE splitter = CURRENT(ul.pages li a[href^=https])                    //foreach page in the datagrid. Will be necessary to test
THEN
WGETJOIN WHERE splitter = CURRENT(table.main6 tr td div h2.web a)                   //navigate to the thread
FLATSELECT PIVOTED(div.nick).text AS nickname,
           PIVOTED(div.color).text AS html_description
           PIVOTED(a:contains('Posted on')).text.replaceAll("<b>Posted on</b>","") AS post_date
WHERE splitter = CURRENT(div.topic table)
