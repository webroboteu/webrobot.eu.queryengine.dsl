FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "http://www.whatsmyip.org/")
)
THEN 
SELECT CURRENT(h1).text AS ip