Hi guys, the webrobot.eu project is going great and we are starting to release information in order for the community to begin to become familiar with the environment.
Grammar concentrates the definition of the following main clauses

One of the most important parts is represented by the query engine which is the one responsible for interoperability with the outside world and with any APP that wants to exploit our service as an infrastructure backend

1) SELECT
2) JOIN
3) EXPLORE
4) FLATTEN
5) FLATSELECT
6) FETCH

Here is an example:

FETCH WHERE ACTIONS ARE ((action = VISIT AND url = "http://dbpedia.org/page/" + eval (CURRENT (['a']). Href)) AND (action = EXESCRIPT AND id = idScript)
THEN
EXPLORE WHERE splitter = PTA AND actions ARE (action = VISIT AND url = PIVOTED (a [rel ^ = dbo "]). Href AND PARAMETERS ARE ((maxDepth = 2)))
THEN
SELECT AUTOMATIC WITH CONCEPT (idConcept)

The version is currently in a preliminary version and has not yet been validated at the logical level nor tested by generating the parsers in any target language.

The query is the basis for handling queries to our web scraping service www.webrobot.eu coming soon on stack aws and its marketplace.

We propose to update this guide and publish articles on medium shortly to highlight the expressiveness of the languages ​​and the use cases that may consequently emerge