
package views.html.senha

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object altera_Scope0 {
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

class altera extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.DynamicForm,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreenchido:play.data.DynamicForm, token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.mdl._

Seq[Any](format.raw/*1.55*/("""

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
        <title>"""),_display_(/*17.17*/Messages("app.title")),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""- """),_display_(/*17.42*/Messages("password.change.page.title")),format.raw/*17.80*/("""</title>
    </head>
<body>
    <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
        <main class="mdl-layout__content">
            <div class="mdl-card mdl-shadow--6dp">
                <div class="mdl-card__title mdl-color-text--white mdl-color--deep-orange-cibiogas">
                    <h2 class="mdl-card__title-text">"""),_display_(/*24.55*/Messages("app.title")),format.raw/*24.76*/("""</h2>
                </div>
                """),_display_(/*26.18*/form(controllers.routes.SenhaController.runReset(token))/*26.74*/ {_display_(Seq[Any](format.raw/*26.76*/("""
                """),format.raw/*27.17*/("""<div class="mdl-card__supporting-text">

                    """),_display_(/*29.22*/if(formPreenchido.hasGlobalErrors)/*29.56*/ {_display_(Seq[Any](format.raw/*29.58*/("""
                        """),format.raw/*30.25*/("""<p align="center" class="login-message">
                            <b>"""),_display_(/*31.33*/formPreenchido/*31.47*/.globalError.message),format.raw/*31.67*/("""</b>
                        </p>
                    """)))}),format.raw/*33.22*/("""

                    """),format.raw/*35.21*/("""<!-- Senha -->
                    """),_display_(/*36.22*/templates/*36.31*/.mdl.senha(formPreenchido("senha"), Messages("password.change"))),format.raw/*36.95*/("""

                    """),format.raw/*38.21*/("""<!-- Confirm senha -->
                    """),_display_(/*39.22*/templates/*39.31*/.mdl.senha(formPreenchido("confirm_senha"), Messages("password.confirm"))),format.raw/*39.104*/("""

                """),format.raw/*41.17*/("""</div>
                <div class="mdl-card__actions mdl-card--border">
                    <input class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color--primary" type="submit" id="btnSubmit" value=""""),_display_(/*43.176*/Messages("password.register")),format.raw/*43.205*/(""""/>
                </div>
                """)))}),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""<div class="mdl-card__menu">
                    <a href="/#/" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-color-text--white">home</i>
                    </a>
                </div>
            </div>
        </main>
    </div>

    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*55.95*/("""" type="text/javascript"></script>

    <script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*58.45*/("""{"""),format.raw/*58.46*/("""
            """),format.raw/*59.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*60.53*/("""{"""),format.raw/*60.54*/("""
                """),format.raw/*61.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*61.79*/("""{"""),format.raw/*61.80*/("""
                    """),format.raw/*62.21*/("""inputs[i].disabled = true;
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/("""
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""";
    </script>

</body>
</html>"""))
      }
    }
  }

  def render(formPreenchido:play.data.DynamicForm,token:String): play.twirl.api.HtmlFormat.Appendable = apply(formPreenchido,token)

  def f:((play.data.DynamicForm,String) => play.twirl.api.HtmlFormat.Appendable) = (formPreenchido,token) => apply(formPreenchido,token)

  def ref: this.type = this

}


}

/**/
object altera extends altera_Scope0.altera
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/senha/altera.scala.html
                  HASH: b3a7ff2cff6accbd26c64159ce12985e057bdd4c
                  MATRIX: 775->1|961->54|989->97|1394->475|1409->481|1470->520|1801->824|1816->830|1913->905|1996->961|2011->967|2075->1009|2121->1028|2163->1049|2192->1050|2222->1053|2281->1091|2647->1430|2689->1451|2762->1497|2827->1553|2867->1555|2912->1572|3001->1634|3044->1668|3084->1670|3137->1695|3237->1768|3260->1782|3301->1802|3387->1857|3437->1879|3500->1915|3518->1924|3603->1988|3653->2010|3724->2054|3742->2063|3837->2136|3883->2154|4158->2401|4209->2430|4284->2474|4329->2491|4685->2820|4700->2826|4791->2896|4935->3012|4964->3013|5005->3026|5138->3131|5167->3132|5212->3149|5302->3211|5331->3212|5380->3233|5451->3276|5480->3277|5521->3290|5550->3291|5586->3300|5615->3301
                  LINES: 27->1|33->1|35->5|42->12|42->12|42->12|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|54->24|54->24|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|61->31|61->31|61->31|63->33|65->35|66->36|66->36|66->36|68->38|69->39|69->39|69->39|71->41|73->43|73->43|75->45|76->46|85->55|85->55|85->55|88->58|88->58|89->59|90->60|90->60|91->61|91->61|91->61|92->62|93->63|93->63|94->64|94->64|95->65|95->65
                  -- GENERATED --
              */
          