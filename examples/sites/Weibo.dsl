FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://www.weibo.com/login.php" ) AND
    (action = TEXTINPUT AND selector = "div.username input.W_input" AND value = "webroboteu") AND
    (action = TEXTINPUT AND selector = "div.password input.W_input" AND value = "password") AND
    (action = CLICK AND selector = "div.info_list a.W_btn_g span" AND duration = 40.seconds) AND
    (action = DELAY AND duration = 40.seconds) AND
    (action = TEXTINPUT AND selector = "input.gn_input" AND value = $search) AND
    (action = CLICK AND selector = "ul.formbox_tab a:nth-of-type(2)") AND
    (action = DELAY AND duration = 10.seconds) AND
    (action = SNAPSHOT) THEN
    (action = LOOP AND ACTIONS ARE (
        (action = CLICK AND selector = "ul.search_page_M li:last-of-type a") AND
        (action = DELEY AND duration = 10.seconds) AND
        (action = WAITFOR AND selector = "ul.search_page_M li:nth-of-type(10) a" AND duration = 10.seconds) AND
        (action = SNAPSHOT)
    ))
    )
)
AND PARAMETERS ARE (
    flattenPagesOrdinalKey = $page
)
THEN
FLATSELECT PIVOTED(dl.feed_list p em).text AS text
WHERE CURRENT(dl.feed_list) AND PARAMETERS ARE (
    ordinalKey = item
)