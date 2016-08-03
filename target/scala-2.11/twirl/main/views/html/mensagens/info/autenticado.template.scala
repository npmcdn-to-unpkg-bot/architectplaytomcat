
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object autenticado_Scope0 {
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

class autenticado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("bower_components/material-design-lite/material.min.css")),format.raw/*11.131*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/mdl/mensagens.css")),format.raw/*12.106*/("""">
    <title>"""),_display_(/*13.13*/Messages("app.title")),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""- """),_display_(/*13.38*/Messages("authenticated.page.title")),format.raw/*13.74*/("""</title>
</head>
<body>
    <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
        <main class="mdl-layout__content">
            <div class="mdl-card mdl-shadow--6dp tamanho">
                <div class="mdl-card__title mdl-color-text--white mdl-color--deep-orange-cibiogas">
                    <h2 class="mdl-card__title-text">"""),_display_(/*20.55*/Messages("app.title")),format.raw/*20.76*/("""</h2>
                </div>

                <div class="mdl-card__supporting-text">

                    """),_display_(/*25.22*/if(username == null)/*25.42*/ {_display_(Seq[Any](format.raw/*25.44*/("""
                        """),format.raw/*26.25*/("""<p align="center" class="erro">
                            <b>"""),_display_(/*27.33*/Messages("login.error.register")),format.raw/*27.65*/("""</b>
                        </p>
                    """)))}/*29.24*/else/*29.29*/{_display_(Seq[Any](format.raw/*29.30*/("""
                        """),format.raw/*30.25*/("""<div align="center">
                            <p align="center" class="sucesso">
                                """),_display_(/*32.34*/Messages("login.success")),format.raw/*32.59*/(""" """),format.raw/*32.60*/("""<b>""""),_display_(/*32.65*/username),format.raw/*32.73*/(""""</b>
                            </p>
                        </div>
                    """)))}),format.raw/*35.22*/("""

                """),format.raw/*37.17*/("""</div>
                <div class="mdl-card__menu">
                    <a href=""""),_display_(/*39.31*/routes/*39.37*/.Application.index),format.raw/*39.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*47.95*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object autenticado extends autenticado_Scope0.autenticado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/info/autenticado.scala.html
                  HASH: 827b12f1c06ab52aabfda85873d434a37af539f5
                  MATRIX: 772->1|885->19|912->20|1180->262|1194->268|1254->307|1573->599|1588->605|1685->680|1764->732|1779->738|1851->788|1893->803|1935->824|1964->825|1994->828|2051->864|2421->1207|2463->1228|2598->1336|2627->1356|2667->1358|2720->1383|2811->1447|2864->1479|2938->1536|2951->1541|2990->1542|3043->1567|3187->1684|3233->1709|3262->1710|3294->1715|3323->1723|3445->1814|3491->1832|3600->1914|3615->1920|3654->1938|3949->2206|3964->2212|4055->2282
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|51->20|51->20|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|63->32|63->32|63->32|63->32|63->32|66->35|68->37|70->39|70->39|70->39|78->47|78->47|78->47
                  -- GENERATED --
              */
          