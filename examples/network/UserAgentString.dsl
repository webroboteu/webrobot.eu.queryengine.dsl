FETCH WHERE ACTIONS ARE (
    (action = WGET AND url = "http://www.useragentstring.com")
)
THEN
SELECT CURRENT(li a).text AS agent_string