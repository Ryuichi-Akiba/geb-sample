package com.example.devtesting.geb

import geb.Module

/**
 * Created by akiba on 6/24/14.
 */
class GoogleSearchModule extends Module {

    def buttonValue

    static content = {

        field { $("input", name: "q") }

        button(to: GoogleResultsPage) {
            $("input", value: buttonValue)

        }
    }
}
