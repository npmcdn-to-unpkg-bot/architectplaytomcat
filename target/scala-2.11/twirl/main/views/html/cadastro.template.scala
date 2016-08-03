
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastro_Scope0 {
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

class cadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreenchido:DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.mdl._

Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("bower_components/material-design-lite/material.min.css")),format.raw/*15.135*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/mdl/cadastro.css")),format.raw/*16.109*/("""">
        <title>"""),_display_(/*17.17*/Messages("app.title")),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""- """),_display_(/*17.42*/Messages("register.page.title")),format.raw/*17.73*/("""</title>
    </head>
<body>
    <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
        <main class="mdl-layout__content">
            <div class="mdl-card mdl-shadow--6dp">
                <div class="mdl-card__title mdl-color-text--white mdl-color--deep-orange-cibiogas">
                    <h2 class="mdl-card__title-text">"""),_display_(/*24.55*/Messages("app.title")),format.raw/*24.76*/("""</h2>
                </div>
                """),_display_(/*26.18*/form(routes.UsuarioController.inserir)/*26.56*/ {_display_(Seq[Any](format.raw/*26.58*/("""
                """),format.raw/*27.17*/("""<div class="mdl-card__supporting-text">

                    """),_display_(/*29.22*/if(formPreenchido.hasGlobalErrors)/*29.56*/ {_display_(Seq[Any](format.raw/*29.58*/("""
                    """),format.raw/*30.21*/("""<p align="center" class="login-message">
                        """),_display_(/*31.26*/formPreenchido/*31.40*/.globalError.message),format.raw/*31.60*/("""
                    """),format.raw/*32.21*/("""</p>
                    """)))}),format.raw/*33.22*/("""

                    """),format.raw/*35.21*/("""<!-- Nome -->
                    """),_display_(/*36.22*/templates/*36.31*/.mdl.texto(formPreenchido("nome"), Messages("register.username"))),format.raw/*36.96*/("""

                    """),format.raw/*38.21*/("""<!-- Email -->
                    """),_display_(/*39.22*/templates/*39.31*/.mdl.email(formPreenchido("email"), Messages("register.email"))),format.raw/*39.94*/("""

                    """),format.raw/*41.21*/("""<!-- Senha -->
                    """),_display_(/*42.22*/templates/*42.31*/.mdl.senha(formPreenchido("senha"), Messages("register.password"))),format.raw/*42.97*/("""

                    """),format.raw/*44.21*/("""<!-- Confirm senha -->
                    """),_display_(/*45.22*/templates/*45.31*/.mdl.senha(formPreenchido("confirm_senha"), Messages("register.confirm.password"))),format.raw/*45.113*/("""


                """),format.raw/*48.17*/("""</div>
                <div class="mdl-card__actions mdl-card--border">
                    <input class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color--primary" type="submit" id="btnSubmit" value=""""),_display_(/*50.176*/Messages("register")),format.raw/*50.196*/(""""/>
                </div>
                """)))}),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""<div class="mdl-card__menu">
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.Application.index),format.raw/*54.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>
    <script src=""""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*61.95*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(formPreenchido:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formPreenchido)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formPreenchido) => apply(formPreenchido)

  def ref: this.type = this

}


}

/**/
object cadastro extends cadastro_Scope0.cadastro
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/cadastro.scala.html
                  HASH: 01236bec64c494fa95f1dd66ffc96a4dde05124b
                  MATRIX: 756->1|917->29|945->72|1350->450|1365->456|1426->495|1757->799|1772->805|1869->880|1952->936|1967->942|2038->991|2084->1010|2126->1031|2155->1032|2185->1035|2237->1066|2603->1405|2645->1426|2718->1472|2765->1510|2805->1512|2850->1529|2939->1591|2982->1625|3022->1627|3071->1648|3164->1714|3187->1728|3228->1748|3277->1769|3334->1795|3384->1817|3446->1852|3464->1861|3550->1926|3600->1948|3663->1984|3681->1993|3765->2056|3815->2078|3878->2114|3896->2123|3983->2189|4033->2211|4104->2255|4122->2264|4226->2346|4273->2365|4548->2612|4590->2632|4665->2676|4710->2693|4796->2752|4811->2758|4850->2776|5144->3043|5159->3049|5250->3119
                  LINES: 27->1|33->1|35->5|42->12|42->12|42->12|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|54->24|54->24|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|61->31|61->31|61->31|62->32|63->33|65->35|66->36|66->36|66->36|68->38|69->39|69->39|69->39|71->41|72->42|72->42|72->42|74->44|75->45|75->45|75->45|78->48|80->50|80->50|82->52|83->53|84->54|84->54|84->54|91->61|91->61|91->61
                  -- GENERATED --
              */
          