
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.130*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.106*/("""">
        <title>"""),_display_(/*11.17*/Messages("app.title")),format.raw/*11.38*/(""" """),format.raw/*11.39*/("""- """),_display_(/*11.42*/Messages("app.error")),format.raw/*11.63*/("""</title>
    </head>
    <body>
        <div class="row">
            <div class="container-fluid">
                <div class="mensagens">
                    <div class="panel panel-default">
                        <div class="panel-heading">"""),_display_(/*18.53*/Messages("app.title")),format.raw/*18.74*/("""
                            """),format.raw/*19.29*/("""<a href=""""),_display_(/*19.39*/routes/*19.45*/.Application.index),format.raw/*19.63*/("""" class="pull-right">"""),_display_(/*19.85*/Messages("menu.1")),format.raw/*19.103*/("""</a>
                        </div>
                        <div class="panel-body">
                            <p class="mensagem alert alert-danger text-center">"""),_display_(/*22.81*/mensagem),format.raw/*22.89*/("""</p>
                        </div>
                        <div class="panel-footer">
                            <p class="text-center">&copy; 2016 """),_display_(/*25.65*/Messages("app.title")),format.raw/*25.86*/("""</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*32.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*33.97*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => apply(mensagem)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/error.scala.html
                  HASH: 90aeda2c6359ac71cb2e7ee4ecca888091274db4
                  MATRIX: 745->1|857->18|884->19|1174->283|1188->289|1248->328|1330->384|1344->390|1435->460|1518->516|1533->522|1601->568|1647->587|1689->608|1718->609|1748->612|1790->633|2063->879|2105->900|2162->929|2199->939|2214->945|2253->963|2302->985|2342->1003|2534->1168|2563->1176|2741->1327|2783->1348|2953->1491|2968->1497|3048->1556|3132->1613|3147->1619|3236->1687
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|53->22|53->22|56->25|56->25|63->32|63->32|63->32|64->33|64->33|64->33
                  -- GENERATED --
              */
          