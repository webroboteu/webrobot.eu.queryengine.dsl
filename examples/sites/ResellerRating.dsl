FETCH WHERE ACTIONS ARE (
    action = WGET AND url = "http://www.resellerratings.com/store/$keyword"
)
THEN
WGETEXPLORE WHERE splitter = CURRENT(div#survey-header ul.pagination a:contains(next)) AND PARAMETERS ARE (
    depthKey = $page
)
THEN
FLATSELECT PIVOTED(div.rating strong).text AS rating,
        PIVOTED(div.date span).text AS date,
        PIVOTED(p.review-body).text AS body
WHERE spliter = CURRENT(div.review)
