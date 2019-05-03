FETCH WHERE ACTIONS ARE (
    action = VISIT AND url = $url
)
THEN 
WGETEXPLORE WHERE spitter = "div.page > a.next" AND PARAMETERS ARE (
     depthKey=$page
)
THEN 
JOIN  PIVOTED(span.big-name).text AS title,
      PIVOTED(span > a).text AS review_count
WHERE splitter = CURRENT(ul.shop-list > li) AND PARAMETERS ARE(
    ordinalKey = $row
)
AND ACTIONS ARE(
    (action = Visit AND url = PIVOTED(p.title > a.shopname).href + "/review_all")
)
THEN
WGETEXPLORE WHERE splitter = CURRENT(div.Pages > a.NextPage) AND PARAMETERS ARE (
    depthKey=$comment_page
)
THEN
FLATSELECT PIVOTED(span.item-rank-rst).attr("class") AS rating,
        PIVOTED(span.time).text AS date,
        PIVOTED(span.comm-per).text AS average_price,
        PIVOTED(pan.rst:nth-of-type(1)).text AS taste,
        PIVOTED(span.rst:nth-of-type(3)).text AS service,
        PIVOTED(div.comment-txt > div.J_brief-cont).text AS comment,
        PIVOTED(div.comment-txt > div.J_extra-cont).text AS comment_extra
WHERE splitter = "div.comment-list > ul > li" AND PARAMETERS ARE (
     ordinalKey = $comment_row
)