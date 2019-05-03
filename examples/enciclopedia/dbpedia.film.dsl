FETCH WHERE ACTIONS ARE (
    action = WGET AND url = "http://lookup.dbpedia.org/api/search/KeywordSearch?QueryClass=film&QueryString=" + $keyword
)
THEN
JOIN PIVOTED(Label).text AS moive,  WHERE spitter = CURRENT(Result).slice(0,3) AND ACTIONS ARE (
    action = TRY AND attempts = 2 AND ACTIONS ARE (
        action = WGET AND URL = PIVOTED(URI).text
    )
)
THEN
JOIN CURRENT.uri AS uri, PIVOTED.text.replaceAll("dbpedia:", "") AS personnel
WHERE splitter = CURRENT(a[rel^=dbo][href*=dbpedia]".distinctBy(_.href)) ACTIONS ARE (
    action = TRY AND attempts = 2 AND ACTIONS ARE (
        action = WGET AND URL = PIVOTED.href
    )
)
THEN
FLATSELECT 
        PIVOTED.text.replaceAll("dbpedia:List_of_", "").replaceAll("_episodes.*","") AS guest_of,
        PIVOTED.text.replaceAll("dbpedia:List_of_", "").replaceAll(".*episodes_","") AS episodes
WHERE splitter = CURRENT(a[rev*=guests]:contains(dbpedia:List_of_))