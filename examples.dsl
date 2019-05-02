FETCH WHERE ACTIONS ARE (
    ( action = WGET AND url = "https://ajax.googleapis.com/ajax/services/search/news?v=1.0&q=nepal")
    )
THEN
WGETJOIN WHERE url="http://api.mymemory.translated.net/get?q=" + eval("CURRENT(responseData)" + "!&langpair=en|fr")
THEN
SELECT CURRENT(responseData) AS text

CONFIG OAUTHKEYS WITH KEYS ("zfiG0XPsYgSAQ7iSXL6D5g","MkMaVzoOL_s-00y0Agd5V9ZAEaU");
CONFIG FETCH WITH PARAMETERS (  )
CONFIG EXPLORE WITH DEFAULT PARAMETERS ('')

