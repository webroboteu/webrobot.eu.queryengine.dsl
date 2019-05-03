FETCH WITH ACTION ARE (
    action = WGET AND url = "http://www.imdb.com/chart" 
)
THEN
FLATSELECT PIVOTED(tr td.titleColumn).ownText.replaceAll("\"","").trim AS rank,
        PIVOTED(tr td.titleColumn a).text AS name,
        PIVOTED(tr td.titleColumn span).text AS year,
        PIVOTED(tr td.ratingColumn,0).text AS box_weekend,
        PIVOTED(td.ratingColumn,1).text AS box_gross,
        PIVOTED(tr td.weeksColumn).text AS weeks
WHERE splitter = CURRENT(div#boxoffice tbody tr)
THEN
WGETJOIN CURRENT(tr td.titleColumn a")                                                                          //go to movie pages, e.g. http://www.imdb.com/title/tt2015381/?ref_=cht_bo_1
THEN 
SELECT  CURRENT(td#overview-top div.titlePageSprite).text AS score,
        CURRENT(td#overview-top span[itemprop=ratingCount]).text AS rating_count,
        CURRENT(td#overview-top span[itemprop=reviewCount]).text AS review_count
THEN
WGETJOIN(CURRENT(div#maindetails_quicklinks a:contains(Reviews)))                                               //go to review pages, e.g. http://www.imdb.com/title/tt2015381/reviews?ref_=tt_urv
THEN
WGETEXPLORE(CURRENT(div#tn15content a:has(img[alt~=Next])) AND PARAMETERS ARE(
    depthKey = page AND optimizer = Narrow)               //grab all pages by using the right arrow button.
) 
THEN
FLATSELECT  PIVOTED(img[alt]).attr("alt") AS review_rating,
            PIVOTED(h2).text AS review_title,
            PIVOTED(small).text AS review_meta
WHERE splitter = CURRENT(div#tn15content div:has(h2))
THEN 
WGETJOIN WHERE splitter = CURRENT(a)                                                                              //go to reviewers' page, e.g. http://www.imdb.com/user/ur23582121/
THEN 
SELECT  CURRENT(div.user-profile h1).text AS user_name,
        CURRENT(div.user-profile div.timestamp).text AS user_timestamp,
        CURRENT(div.user-lists div.see-more).text AS user_post_count,
        CURRENT(div.ratings div.see-more).text AS user_rating_count,
        CURRENT(div.reviews div.see-more).text AS user_review_count,
        CURRENT(div.overall div.histogram-horizontal a).attrs("title") AS user_rating_histogram