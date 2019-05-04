FETCH WHERE ACTIONS ARE (
    (action = WGET AND url = $url)
)
THEN
WGETEXPLORE WHERE splitter = CURRENT(a.page-option.prev-next:contains(→)) AND PARAMETERS ARE (
    depthKey = $page AND maxDepth = 10 AND optimizer = Narrow
)
THEN
FLATSELECT  PIVOTED(p.review_comment).text AS comment,
            PIVOTED(div.review-content span.rating-qualifier).text AS date_status,
            PIVOTED(div.biz-rating div div.rating-very-large meta).attr("content") AS stars,
            PIVOTED(div.review-wrapper > div.review-footer a.ybtn.useful span.i-wrap span.count).text AS useful,
            PIVOTED(li.user-name a.user-display-name).text AS user_name,
            PIVOTED(li.user-location).text AS user_location,
            PIVOTED(li.friend-count b) AS friend_count,
            PIVOTED(li.review-count b).text AS review_count
WHERE splitter = CURRENT(div.review) 
AND PARAMETERS ARE (
    ordinalKey = $row
)