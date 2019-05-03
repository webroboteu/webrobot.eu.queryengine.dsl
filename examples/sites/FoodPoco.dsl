(
FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = $url)
)
THEN
WGETEXPLORE WHERE spitter = CURRENT(div.pag a[title=下一页) AND PARAMETERS ARE (
    depthKey = $page
)
THEN
FLATSELECT PIVOTED(h2 a).text AS name,
        PIVOTED(div.pa_text).text AS info,
        PIVOTED(div.page_aq).text AS avg_price_per_capita,
        PIVOTED(div.iconimg > img).text.replaceAll("images/","").replaceAll(".png","") AS stars,
        PIVOTED(div.iconimg div.pop3 ul).texts.mkString("|") AS ratings 
WHERE splitter = CURRENT(div.page_content)
THEN
WGETJOIN PERSIST PIVOTED(div.text_link a)
THEN
SELECT  "comment" AS type,CURRENT.uri AS uri
THEN
FLATSELECT PIVOTED(div#res_cmts_content).text AS comment,
        PIVOTED(li.ph_text p img).attrs("alt").mkString("|") AS user_ratings,
        PIVOTED(li.ph_tag p).text AS user,
        PIVOTED(p.red).text AS useful 
WHERE spitter = CURRENT(div#food_comment_list ul.text_con) AND PARAMETERS ARE (
    ordinalKey = $commentRow)
)
UNION

(
FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = $url)
)
THEN
WGETEXPLORE WHERE spitter = CURRENT(div.pag a[title=下一页) AND PARAMETERS ARE (
    depthKey = $page
)
THEN
FLATSELECT PIVOTED(h2 a).text AS name,
        PIVOTED(div.pa_text).text AS info,
        PIVOTED(div.page_aq).text AS avg_price_per_capita,
        PIVOTED(div.iconimg > img).text.replaceAll("images/","").replaceAll(".png","") AS stars,
        PIVOTED(div.iconimg div.pop3 ul).texts.mkString("|") AS ratings 
WHERE splitter = CURRENT(div.page_content)
THEN
WGETJOIN PERSIST PIVOTED(div.text_link a) 
THEN
SELECT  "review" AS type,CURRENT.uri AS uri
THEN
FLATSELECT PIVOTED(div.title a).text AS title,
        PIVOTED(p.lh18).text AS comment,
        PIVOTED(p.lh20 a).text AS user,
        PIVOTED(p.fl).ownText AS stats,
        PIVOTED(p.fr).text AS date
WHERE spitter = CURRENT(li.text) AND PARAMETERS ARE (
    ordinalKey = $commentRow
)
)
ORDER BY page ASC, row ASC 
