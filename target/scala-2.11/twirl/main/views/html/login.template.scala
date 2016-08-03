
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioForm:DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.mdl._

Seq[Any](format.raw/*1.27*/("""

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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/login.css")),format.raw/*16.102*/("""">
        <title>"""),_display_(/*17.17*/Messages("app.title")),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""- """),_display_(/*17.42*/Messages("login.page.title")),format.raw/*17.70*/("""</title>
    </head>
<body>
    <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
        <main class="mdl-layout__content">
            <div class="mdl-card mdl-shadow--6dp">
                <div class="mdl-card__title mdl-color-text--white mdl-color--deep-orange-cibiogas">
                    <h2 class="mdl-card__title-text">"""),_display_(/*24.55*/Messages("app.title")),format.raw/*24.76*/("""</h2>
                </div>
                """),_display_(/*26.18*/form(routes.LoginController.autenticar)/*26.57*/ {_display_(Seq[Any](format.raw/*26.59*/("""
                """),format.raw/*27.17*/("""<div class="mdl-card__supporting-text">

                    """),_display_(/*29.22*/if(usuarioForm.hasGlobalErrors)/*29.53*/ {_display_(Seq[Any](format.raw/*29.55*/("""
                        """),format.raw/*30.25*/("""<p align="center" class="login-message">"""),_display_(/*30.66*/usuarioForm/*30.77*/.globalError.message),format.raw/*30.97*/("""</p>
                    """)))}),format.raw/*31.22*/("""

                    """),format.raw/*33.21*/("""<!-- Email -->
                    """),_display_(/*34.22*/templates/*34.31*/.mdl.texto(usuarioForm("email"), Messages("login.username"))),format.raw/*34.91*/("""

                    """),format.raw/*36.21*/("""<!-- Senha -->
                    """),_display_(/*37.22*/templates/*37.31*/.mdl.senha(usuarioForm("senha"), Messages("login.password"))),format.raw/*37.91*/("""

                """),format.raw/*39.17*/("""</div>
                <div class="mdl-card__actions mdl-card--border">
                    <input class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color--primary" type="submit" id="btnSubmit" value=""""),_display_(/*41.176*/Messages("login")),format.raw/*41.193*/(""""/>
                    <a type="button" href="/cadastro" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">"""),_display_(/*42.130*/Messages("login.register")),format.raw/*42.156*/("""</a>
                </div>
                """)))}),format.raw/*44.18*/("""
                """),format.raw/*45.17*/("""<div class="mdl-card__menu">
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.Application.index),format.raw/*46.55*/("""" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*54.95*/("""" type="text/javascript"></script>

    <script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*57.45*/("""{"""),format.raw/*57.46*/("""
            """),format.raw/*58.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*59.53*/("""{"""),format.raw/*59.54*/("""
                """),format.raw/*60.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*60.79*/("""{"""),format.raw/*60.80*/("""
                    """),format.raw/*61.21*/("""inputs[i].disabled = true;
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""";
    </script>

</body>
</html>"""))
      }
    }
  }

  def render(usuarioForm:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm) => apply(usuarioForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/login.scala.html
                  HASH: 378af70bc6675c6921d6d5442b16010fc49a48a2
                  MATRIX: 750->1|908->26|936->69|1341->447|1356->453|1417->492|1748->796|1763->802|1860->877|1943->933|1958->939|2022->981|2068->1000|2110->1021|2139->1022|2169->1025|2218->1053|2584->1392|2626->1413|2699->1459|2747->1498|2787->1500|2832->1517|2921->1579|2961->1610|3001->1612|3054->1637|3122->1678|3142->1689|3183->1709|3240->1735|3290->1757|3353->1793|3371->1802|3452->1862|3502->1884|3565->1920|3583->1929|3664->1989|3710->2007|3985->2254|4024->2271|4185->2404|4233->2430|4309->2475|4354->2492|4440->2551|4455->2557|4494->2575|4789->2843|4804->2849|4895->2919|5039->3035|5068->3036|5109->3049|5242->3154|5271->3155|5316->3172|5406->3234|5435->3235|5484->3256|5555->3299|5584->3300|5625->3313|5654->3314|5690->3323|5719->3324
                  LINES: 27->1|33->1|35->5|42->12|42->12|42->12|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|54->24|54->24|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|60->30|60->30|60->30|61->31|63->33|64->34|64->34|64->34|66->36|67->37|67->37|67->37|69->39|71->41|71->41|72->42|72->42|74->44|75->45|76->46|76->46|76->46|84->54|84->54|84->54|87->57|87->57|88->58|89->59|89->59|90->60|90->60|90->60|91->61|92->62|92->62|93->63|93->63|94->64|94->64
                  -- GENERATED --
              */
          