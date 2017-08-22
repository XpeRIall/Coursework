
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object main_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String, Html, play.twirl.api.HtmlFormat.Appendable] {

    /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* three arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page and an `Int` for refreshing the
* page after a set interval.
*/
    def apply /*8.2*/ (title: String, content: Html): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*8.32*/ ("""

"""), format.raw /*10.1*/ ("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""), _display_( /*13.17*/ title), format.raw /*13.22*/ ("""</title>
        <link rel="stylesheet" media="screen" href=""""), _display_( /*14.54*/ routes /*14.60*/ .Assets.versioned("stylesheets/bootstrap.css")), format.raw /*14.106*/ ("""">
    </head>
    <body>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js"></script>
        """), _display_( /*19.10*/ content), format.raw /*19.17*/ ("""
        """), _display_( /*20.10*/ playscalajs /*20.21*/ .html.scripts("client")), format.raw /*20.44*/ ("""
    """), format.raw /*21.5*/ ("""</body>
</html>
"""))
        }
      }
    }

    def render(title: String, content: Html): play.twirl.api.HtmlFormat.Appendable = apply(title, content)

    def f: ((String, Html) => play.twirl.api.HtmlFormat.Appendable) = (title, content) => apply(title, content)

    def ref: this.type = this

  }

}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* three arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page and an `Int` for refreshing the
* page after a set interval.
*/
object main extends main_Scope0.main
/*
                  -- GENERATED --
                  DATE: Wed Apr 19 22:51:48 EEST 2017
                  SOURCE: /root/Загрузки/ScalaJs_Weather_Report-master/server/app/views/main.scala.html
                  HASH: c5a655df37f0c36b07b6ce8eefae5cb9822c80f8
                  MATRIX: 841->317|966->347|995->349|1082->409|1108->414|1197->476|1212->482|1280->528|1509->730|1537->737|1574->747|1594->758|1638->781|1670->786
                  LINES: 26->8|31->8|33->10|36->13|36->13|37->14|37->14|37->14|42->19|42->19|43->20|43->20|43->20|44->21
                  -- GENERATED --
              */
