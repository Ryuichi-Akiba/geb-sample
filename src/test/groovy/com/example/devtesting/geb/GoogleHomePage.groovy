package com.example.devtesting.geb

import geb.Page

/**
 * Created by akiba on 6/25/14.
 */
class GoogleHomePage extends Page {

    static url = "http://google.com/ncr"

    static at = { title == "Google" }

    static content = {
        search { module GoogleSearchModule, buttonValue: "Google Search" }
    }
}
