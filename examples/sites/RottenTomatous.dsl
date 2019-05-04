FETCH WITH ACTIONS (
    (action = VISIT AND url = "http://www.rottentomatoes.com/")
)
THEN
WGETJOIN WHERE splitter = CURRENT(table.top_box_office tr.sidebarInTheaterTopBoxOffice a) AND PARAMETERS ARE (
    ordinalKey = $rank
)
THEN
SELECT  CURRENT(h1.movie_title).text AS name,
        CURRENT(div#all-critics-numbers span#all-critics-meter).text AS meter,
        CURRENT(div#all-critics-numbers p.critic_stats span).text AS meter,
        CURRENT(div#all-critics-numbers p.critic_stats span[itemprop=reviewCount]) AS review_count
THEN
WGETJOIN WHERE splitter = CURRENT(div#contentReviews h3 a)                      //go to review page, e.g. http://www.rottentomatoes.com/m/guardians_of_the_galaxy/reviews/
THEN
WGETEXPLORE WHERE splitter = CURRENT(div.scroller a.right) AND PARAMETERS ARE (
    depthKey = $page
)
THEN
FLATSELECT PIVOTED(div.criticinfo strong a).text AS critic_name,
        PIVOTED(div.criticinfo em.subtle).text AS critic_org,
        PIVOTED(div.reviewsnippet p).text AS critic_review,
        PIVOTED(div.reviewsnippet p.subtle).ownText AS critic_score
WHERE splitter = CURRENT(div#reviews div.media_block)
THEN
WGETJOIN WHERE splitter = PIVOTED(div.criticinfo strong a)                      //go to critic page, e.g. http://www.rottentomatoes.com/critic/sean-means/
THEN
SELECT CURRENT(div.media_block div.clearfix dd).text AS total_reviews_ratings