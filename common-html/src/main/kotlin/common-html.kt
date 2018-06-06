package org.jetbrains.demo

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.span
import kotlinx.html.stream.appendHTML
import kotlinx.html.title


fun renderTimeHTML(time: String) =
        buildString {

          appendHTML(prettyPrint = true).html {
            head {
              title { + "Time bot v99" }
            }
            body {
              div {
                + "The time is "
                span {
                  +time
                }
              }
            }
          }
        }

