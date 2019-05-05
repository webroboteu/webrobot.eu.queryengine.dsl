FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://www.whatsmyuseragent.com/")
)
THEN
SELECT  CURRENT(h3.info).text AS ip,
        CURRENT(h2.info).text AS user_agent,
        CURRENT(table.table-striped).text AS referer