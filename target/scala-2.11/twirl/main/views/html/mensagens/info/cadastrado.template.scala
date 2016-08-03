
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastrado_Scope0 {
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

class cadastrado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    <title>"""),_display_(/*13.13*/Messages("app.title")),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""- """),_display_(/*13.38*/Messages("register.success")),format.raw/*13.66*/("""</title>
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
                            <b>"""),_display_(/*27.33*/Messages("register.error")),format.raw/*27.59*/("""</b>
                        </p>
                    """)))}/*29.24*/else/*29.29*/{_display_(Seq[Any](format.raw/*29.30*/("""
                        """),format.raw/*30.25*/("""<div align="center">
                            <p class="sucesso">"""),_display_(/*31.49*/Messages("register.success")),format.raw/*31.77*/(""" """),format.raw/*31.78*/("""<b>""""),_display_(/*31.83*/username),format.raw/*31.91*/(""""</b>. <br>"""),_display_(/*31.103*/Messages("register.success.verify")),format.raw/*31.138*/("""</p>
                        </div>
                    """)))}),format.raw/*33.22*/("""

                """),format.raw/*35.17*/("""</div>
                <div class="mdl-card__menu">
                    <a href=""""),_display_(/*37.31*/routes/*37.37*/.Application.index),format.raw/*37.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*45.19*/routes/*45.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*45.95*/("""" type="text/javascript"></script>
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
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/info/cadastrado.scala.html
                  HASH: f1ab92aada65a946ffa362897cb764dfb730dfa1
                  MATRIX: 770->1|883->19|910->20|1178->262|1192->268|1252->307|1571->599|1586->605|1683->680|1762->732|1777->738|1849->788|1891->803|1933->824|1962->825|1992->828|2041->856|2411->1199|2453->1220|2588->1328|2617->1348|2657->1350|2710->1375|2801->1439|2848->1465|2922->1522|2935->1527|2974->1528|3027->1553|3123->1622|3172->1650|3201->1651|3233->1656|3262->1664|3302->1676|3359->1711|3447->1768|3493->1786|3602->1868|3617->1874|3656->1892|3951->2160|3966->2166|4057->2236
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|51->20|51->20|56->25|56->25|56->25|57->26|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|64->33|66->35|68->37|68->37|68->37|76->45|76->45|76->45
                  -- GENERATED --
              */
          