FETCH WITH ACTIONS (
    (action = VISIT AND url = $url) AND
    (action = LOADMORE AND selector = "div.R4 span.d-s")
)
THEN
FLATSELECT PIVOTED(div.VSb span.GKa).text AS comment,
        PIVOTED(span.VUb).text AS date_status,
        PIVOTED(div.b-db span.b-db-ac-th).size AS stars,
        PIVOTED(span.Gl a.d-s).text AS user_name
WHERE splitter = CURRENT(div.Qxb div.Ee) AND PARAMETERS ARE (
    ordinalKey = $row
)