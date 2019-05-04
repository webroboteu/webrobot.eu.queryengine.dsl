FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://www.youtube.com/user/" + $param + "/videos") AND
    (action = LOOP AND ACTIONS ARE (
        (action = CLICK AND selector = "button.load-more-button span.load-more-text") AND
        (action = WAITFOR AND selector = "button.load-more-button span.hid.load-more-loading" and duration = 10.seconds)
    ))
)
THEN 
JOIN PIVOTED(h3.yt-lockup-title).text AS title WHERE ACTIONS ARE (
    (action = VISIT AND url = PIVOTED(h3.yt-lockup-title a.yt-uix-tile-link).href) AND
    (action = EXESCRIPT AND code = "window.scrollBy(0,500)") AND
    (action = TRY and ACTIONS ARE (
        (action = WAITFOR AND selector = "iframe[title^=Comment]")
    )
    )        
)
AND PARAMETERS ARE (
    numPartitions = 400
)
THEN
SELECT CURRENT(div#watch-description-text).text AS description,
        CURRENT(strong.watch-time-text).text AS publish,
        CURRENT(div.watch-view-count).text AS total_view,
        CURRENT(button#watch-like).text AS like_count,
        CURRENT(button#watch-dislike).text AS dislike_count
THEN
FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = CURRENT(iframe[title^=Comment]).src) AND
    (action = LOOP AND ACTIONS ARE (
        (action = CLICK AND selector = "span[title^=Load]") AND
        (action = WAITFOR and selector = "span.PA[style^=display]" AND duration = 10.seconds)
    ))
)
THEN
SELECT CURRENT(div.DJa).text AS num_comments
THEN
FLATSELECT  PIVOTED(h3.Mpa).text AS comment1,
            PIVOTED(div.Al).text AS comment2