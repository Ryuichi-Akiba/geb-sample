package com.example.devtesting.geb

import geb.Page

/**
 * Created by akiba on 6/25/14.
 */
class WikipediaPage extends Page {

    static at = { title == "Wikipedia, the free encyclopedia" }
}
