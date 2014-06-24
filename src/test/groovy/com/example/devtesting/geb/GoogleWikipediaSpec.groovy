package com.example.devtesting.geb

import geb.spock.GebSpec

/**
 * Created by akiba on 6/25/14.
 */
class GoogleWikipediaSpec extends GebSpec {

    def "first result for wikipedia search should be wikipedia"() {

        given:
        to GoogleHomePage

        expect:
        at GoogleHomePage

        when:
        search.field.value("wikipedia")

        then:
        waitFor { at GoogleResultsPage }

        and:
        firstResultLink.text() == "Wikipedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }

    }
}
