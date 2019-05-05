FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "https://hidemyna.me/en/proxy-list/")
)
THEN WGETEXPLORE WHERE splitter = CURRENT(div.proxy__pagination ul li.arrow__right a)
THEN 
FLASTSELECT PIVOTED(td:nth-child(1)).text AS ip,
            PIVOTED(td:nth-child(2)).text AS port,
            PIVOTED(td:nth-child(3)).text AS country,               //is necessary to test this selector
            VOTED(td:nth-child(4)).text AS speed,                   //is necessary to test this selector
            PIVOTED(td:nth-child(5)).text AS type,
            PIVOTED(td:nth-child(6)).text AS anonimity,
            PIVOTED(td:nth-child(7)).text AS last_check
WHERE splitter = CURRENT(table.proxy__t tbody tr)