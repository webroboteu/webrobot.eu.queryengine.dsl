FETCH WHERE ACTIONS ARE (
    action = WGET AND url = "http://lookup.dbpedia.org/api/search/KeywordSearch?QueryClass=" + $cls+ "&QueryString=" +$st
)
THEN
WGETJOIN WHERE splitter = CURRENT(Result URI).text AND failSafe = 2
THEN
EXPLORE DISTICT BY name CURRENT(h1#title a).text.replaceAll("http://dbpedia.org.resource/","") AS name
WHERE splitter = CURRENT(a[rel^=dbo][href*=dbpedia],a[rev^=dbo][href*=dbpedia]).distinctBy(_.href).slice(0,30) 
AND ACTIONS ARE (
(action = TRY and attempts = 3 AND ACTIONS ARE 
    (
        (action = DELAY AND delay = 2.seconds) AND 
        (action = WGET and url = PIVOTED)
    )
)
)
AND PARAMETERS ARE (
    depthKey = "depth" AND maxDepth = 3
)
THEN
FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://images.google.com") AND
    (action = TEXTINPUT AND selector = "input[name='q'] AND value = $name) AND
    (action = SUBMIT AND selector = "input[name='btnG']") 
)
