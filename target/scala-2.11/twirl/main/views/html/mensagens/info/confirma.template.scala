
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirma_Scope0 {
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

class confirma extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String)(tipoMensagem:String)(usuarioNome:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
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
    <title>"""),_display_(/*13.13*/Messages("app.title")),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""- """),_display_(/*13.38*/Messages("confirmation.page.title")),format.raw/*13.73*/("""</title>
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
                        """),_display_(/*27.26*/mensagem),format.raw/*27.34*/(""" """),format.raw/*27.35*/("""<b>""""),_display_(/*27.40*/usuarioNome),format.raw/*27.51*/(""""</b>. <br>"""),_display_(/*27.63*/Messages("confirmation.success.login")),format.raw/*27.101*/("""!
                    </p>
                        <hr>
                    <p>
                        <a type="button" href="/login" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color--primary">"""),_display_(/*31.168*/Messages("login")),format.raw/*31.185*/("""</a>
                    </p>
                    """)))}),format.raw/*33.22*/("""
                    """),_display_(/*34.22*/if(tipoMensagem.equals("Validado"))/*34.57*/{_display_(Seq[Any](format.raw/*34.58*/("""
                    """),format.raw/*35.21*/("""<p align="center" class="sucesso">
                        """),_display_(/*36.26*/mensagem),format.raw/*36.34*/("""
                    """),format.raw/*37.21*/("""</p>
                        <hr>
                    <p>
                        <a type="button" href="/login" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color--primary">"""),_display_(/*40.168*/Messages("login")),format.raw/*40.185*/("""</a>
                    </p>
                    """)))}),format.raw/*42.22*/("""
                    """),_display_(/*43.22*/if(tipoMensagem.equals("Invalido"))/*43.57*/{_display_(Seq[Any](format.raw/*43.58*/("""
                    """),format.raw/*44.21*/("""<p align="center" class="erro">
                        """),_display_(/*45.26*/mensagem),format.raw/*45.34*/("""
                    """),format.raw/*46.21*/("""</p>
                    """)))}),format.raw/*47.22*/("""
                    """),_display_(/*48.22*/if(tipoMensagem.equals("Erro"))/*48.53*/{_display_(Seq[Any](format.raw/*48.54*/("""
                    """),format.raw/*49.21*/("""<p align="center" class="erro">
                        """),_display_(/*50.26*/mensagem),format.raw/*50.34*/("""
                    """),format.raw/*51.21*/("""</p>
                    """)))}),format.raw/*52.22*/("""

                """),format.raw/*54.17*/("""</div>
                """),format.raw/*55.84*/("""

                """),format.raw/*57.27*/("""
                """),format.raw/*58.17*/("""<div class="mdl-card__menu">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.Application.index),format.raw/*59.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*67.95*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(mensagem:String,tipoMensagem:String,usuarioNome:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)(tipoMensagem)(usuarioNome)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => (tipoMensagem) => (usuarioNome) => apply(mensagem)(tipoMensagem)(usuarioNome)

  def ref: this.type = this

}


}

/**/
object confirma extends confirma_Scope0.confirma
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/info/confirma.scala.html
                  HASH: 602d32fa53273e839be08ef5a31da818da873edc
                  MATRIX: 780->1|933->59|960->60|1228->302|1242->308|1302->347|1621->639|1636->645|1733->720|1812->772|1827->778|1899->828|1941->843|1983->864|2012->865|2042->868|2098->903|2468->1246|2510->1267|2645->1375|2688->1409|2727->1410|2776->1431|2863->1491|2892->1499|2921->1500|2953->1505|2985->1516|3024->1528|3084->1566|3359->1813|3398->1830|3480->1881|3529->1903|3573->1938|3612->1939|3661->1960|3748->2020|3777->2028|3826->2049|4079->2274|4118->2291|4200->2342|4249->2364|4293->2399|4332->2400|4381->2421|4465->2478|4494->2486|4543->2507|4600->2533|4649->2555|4689->2586|4728->2587|4777->2608|4861->2665|4890->2673|4939->2694|4996->2720|5042->2738|5093->2828|5139->2856|5184->2873|5270->2932|5285->2938|5324->2956|5619->3224|5634->3230|5725->3300
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|51->20|51->20|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|62->31|62->31|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|71->40|71->40|73->42|74->43|74->43|74->43|75->44|76->45|76->45|77->46|78->47|79->48|79->48|79->48|80->49|81->50|81->50|82->51|83->52|85->54|86->55|88->57|89->58|90->59|90->59|90->59|98->67|98->67|98->67
                  -- GENERATED --
              */
          