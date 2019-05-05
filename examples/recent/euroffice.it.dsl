FETCH WHERE ACTIONS ARE (
    (action = VISIT AND url = "https://www.euroffice.it/search?term=" + $keyword)
)
THEN
WGETEXPLORE WHERE splitter = CURRENT(a[title="Avanti"])
THEN 
WGETJOIN WHERE splitter = CURRENT(a.productListItem__link ga-item)
THEN
SELECT  CURRENT(span[itemprop="price"]).text AS price,
        CURRENT(h1[itemprox="name"]).text AS name,
        CURRENT(div[itemprop="description"]).text AS description