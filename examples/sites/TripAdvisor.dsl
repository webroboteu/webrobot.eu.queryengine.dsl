FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = $url) AND
    (action = TRY AND ACTIONS ARE (
        (action = CLICK AND selector = "span.partnerRvw span.taLnk")
    ))
)
THEN
EXPLORE WHERE ACTIONS ARE (
    (action = VISIT AND url = $url) AND
    (action = TRY AND ACTIONS ARE (
        (action = CLICK AND selector = "span.partnerRvw span.taLnk))
    ))
)
FLATSELECT  PIVOTED(p".last.text) AS comment,
            PIVOTED(span.ratingDate".last).text AS date_status,
            PIVOTED(div.innerBubble img.sprite-rating_s_fill).last.attr("alt") AS stars,
            PIVOTED(span.numHlpIn).last.text AS useful,
            PIVOTED(div.member_info div.username mo).last.text AS user_name,
            PIVOTED(div.member_info div.location).last.text AS user_location,
            PIVOTED(div.passportStampsBadge span.badgeText).last.text AS city_count,
            PIVOTED(div.totalReviewBadge) AS review_count
WHERE spitter = CURRENT(div.reviewSelector) AND PARAMETERS ARE (
    ordinalKey = $row
)