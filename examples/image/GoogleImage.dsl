 FETCH WHERE ACTIONS ARE (
     (action = VISIT AND url = "http://images.google.com/"),
     (action = TEXTINPUT AND selector = "input[name='q']" AND value = "Logo" + $keyword),
     (action = SUBMIT AND selector = "input[name='btnG']")
 )
THEN
SELECT "html " + CURRENT(div#search img).slice(0,5).codes.mkString("<table><tr><td>","</td><td>","</td></tr></table>") AS logo              //string interpolation in the selector phase