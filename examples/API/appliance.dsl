FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://www.appliancepartspros.com/") AND
    (action = TEXTINPUT AND selector = "input.ac-input" AND value = CURRENT) AND
    (action = CLICK AND selector = "input[value=Search) AND
    (action = WAITFOR and selector = "div.dgrm-lst div.header h2")
)
THEN
SELECT CURRENT(div.dgrm-lst div.header h2).text AS model
THEN
WGETJOIN WHERE spitter = CURRENT(div.inner li a:has(img)) AND FLATTEN PARAMETERS ARE (
    ordinalKey = 'schematic_index'
)
THEN
SELECT CURRENT(div.dgrm-lst div.header h2).text AS model
THEN
WGETJOIN WHERE spitter = CURRENT(tbody.m-bsc td.pdct-descr h2 a) AND FLATTEN PARAMETERS ARE (
    ordinalKey = 'part_index'
)
THEN
SELECT CURRENT(div.m-pdct h1).text AS name,
       CURRENT(div.m-pdct td[itemprop=brand]).text AS brand,
       CURRENT(div.m-bsc div.mod ul li:contains(Manufacturer) strong).text AS manufacturer,
       CURRENT(div.m-pdct div.m-chm p).text AS replace,
       CURRENT.uri AS uri
