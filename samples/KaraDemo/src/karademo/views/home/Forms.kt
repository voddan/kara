package karademo.views.home

import kara.views.*
import kara.styles.*
import karademo.models.Book
import karademo.styles.StyleClasses.*
import kara.views.FormMethod
import karademo.routes.Home
import kara.controllers.link

class Forms(val book : Book) : HtmlView() {
    override fun render(context: ActionContext) {
        h2("Forms")
        formFor(book, Home.Update(), FormMethod.post) {

            table(fields) {
                tr {
                    td(cLabel) {
                        labelFor("title")
                    }
                    td {
                        textFieldFor("title")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("author")
                    }
                    td {
                        textFieldFor("author")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("isPublished", "Is Published?")
                    }
                    td {
                        checkBoxFor("isPublished")
                    }
                }
                tr {
                    td(cLabel + top) {
                        labelFor("description")
                    }
                    td {
                        textAreaFor("description")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("category")
                    }
                    td {
                        radioFor("category", "fiction")
                        radioFor("category", "nonfiction")
                    }
                }
                tr {
                    td(cLabel) {
                    }
                    td {
                        submitButton("Submit")
                    }
                }
            }
        }
    }
}
