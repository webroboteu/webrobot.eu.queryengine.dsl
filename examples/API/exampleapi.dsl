FETCH WHERE ACTIONS ARE (
    ( action = WGET AND url = "https://ajax.googleapis.com/ajax/services/search/news?v=1.0&q=nepal")
    )
THEN
WGETJOIN WHERE url="http://api.mymemory.translated.net/get?q=" + eval("CURRENT(responseData)" + "!&langpair=en|fr")
THEN
SELECT CURRENT(responseData) AS text

CONFIG OAUTHKEYS WITH KEYS ("zfiG0XPsYgSAQ7iSXL6D5g","MkMaVzoOL_s-00y0Agd5V9ZAEaU");
FETCH WHERE ACTIONS ARE (
    (action = OAUTHSIGN AND ACTIONS ARE (
        action = WGET AND url = "http://api.yelp.com/v2/search?term="+$q + "&location=" + $city
    ))
)
THEN
JOIN PIVOTED(name).text AS name, PIVOTED(id).text AS id WHERE splitter = CURRENT(businesses).slice(0,10)
AND ACTIONS ARE (
    TRY WHERE ACTIONS ARE (
        OAUTHSIGN WHERE ACTIONS ARE (
            WGET WHERE url = "http://api.yelp.com/v2/business/" + eval("PIVOTED(id text)")+"?lang="+$lang
        )
    )
)
THEN
SELECT CURRENT(image_url text) AS image, CURRENT(location coordinate latitude text) AS MAP  //todo valutare la possibilità di raffinazione la string expression
THEN
FLATSELECT                  