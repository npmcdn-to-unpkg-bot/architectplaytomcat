
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String)(tipoMensagem:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
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
    <title>"""),_display_(/*13.13*/Messages("app.title")),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""- """),_display_(/*13.38*/Messages("reset.page.title")),format.raw/*13.66*/("""</title>
</head>
<body>
    <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
        <main class="mdl-layout__content">
            <div class="mdl-card mdl-shadow--6dp tamanho">
                <div class="mdl-card__title mdl-color-text--white mdl-color--deep-orange-cibiogas">
                    <h2 class="mdl-card__title-text">"""),_display_(/*20.55*/Messages("app.title")),format.raw/*20.76*/("""</h2>
                </div>

                <div class="mdl-card__supporting-text">

                    """),_display_(/*25.22*/if(tipoMensagem.equals("Sucesso"))/*25.56*/{_display_(Seq[Any](format.raw/*25.57*/("""
                    """),format.raw/*26.21*/("""<p align="center" class="sucesso">
                        """),_display_(/*27.26*/mensagem),format.raw/*27.34*/("""
                    """),format.raw/*28.21*/("""</p>
                    """)))}),format.raw/*29.22*/("""
                    """),_display_(/*30.22*/if(tipoMensagem.equals("Validado"))/*30.57*/{_display_(Seq[Any](format.raw/*30.58*/("""
                    """),format.raw/*31.21*/("""<p align="center" class="sucesso">
                        """),_display_(/*32.26*/mensagem),format.raw/*32.34*/("""
                    """),format.raw/*33.21*/("""</p>
                    """)))}),format.raw/*34.22*/("""
                    """),_display_(/*35.22*/if(tipoMensagem.equals("Invalido"))/*35.57*/{_display_(Seq[Any](format.raw/*35.58*/("""
                    """),format.raw/*36.21*/("""<p align="center" class="erro">
                        """),_display_(/*37.26*/mensagem),format.raw/*37.34*/("""
                    """),format.raw/*38.21*/("""</p>
                    """)))}),format.raw/*39.22*/("""
                    """),_display_(/*40.22*/if(tipoMensagem.equals("Erro"))/*40.53*/{_display_(Seq[Any](format.raw/*40.54*/("""
                    """),format.raw/*41.21*/("""<p align="center" class="erro">
                        """),_display_(/*42.26*/mensagem),format.raw/*42.34*/("""
                    """),format.raw/*43.21*/("""</p>
                    """)))}),format.raw/*44.22*/("""

                """),format.raw/*46.17*/("""</div>
                <div class="mdl-card__menu">
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.Application.index),format.raw/*48.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*56.95*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(mensagem:String,tipoMensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)(tipoMensagem)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => (tipoMensagem) => apply(mensagem)(tipoMensagem)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/info/reset.scala.html
                  HASH: 9edf59badfde87bab810fb0d7a51918dc638f9ff
                  MATRIX: 767->1|900->39|927->40|1195->282|1209->288|1269->327|1588->619|1603->625|1700->700|1779->752|1794->758|1866->808|1908->823|1950->844|1979->845|2009->848|2058->876|2428->1219|2470->1240|2605->1348|2648->1382|2687->1383|2736->1404|2823->1464|2852->1472|2901->1493|2958->1519|3007->1541|3051->1576|3090->1577|3139->1598|3226->1658|3255->1666|3304->1687|3361->1713|3410->1735|3454->1770|3493->1771|3542->1792|3626->1849|3655->1857|3704->1878|3761->1904|3810->1926|3850->1957|3889->1958|3938->1979|4022->2036|4051->2044|4100->2065|4157->2091|4203->2109|4312->2191|4327->2197|4366->2215|4661->2483|4676->2489|4767->2559
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|51->20|51->20|56->25|56->25|56->25|57->26|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|63->32|63->32|64->33|65->34|66->35|66->35|66->35|67->36|68->37|68->37|69->38|70->39|71->40|71->40|71->40|72->41|73->42|73->42|74->43|75->44|77->46|79->48|79->48|79->48|87->56|87->56|87->56
                  -- GENERATED --
              */
          