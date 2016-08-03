
package views.html.mensagens.erro

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object naoAutorizado_Scope0 {
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

class naoAutorizado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*8.126*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*9.102*/("""">
    <title>"""),_display_(/*10.13*/Messages("app.title")),format.raw/*10.34*/(""" """),format.raw/*10.35*/("""- """),_display_(/*10.38*/Messages("app.error.found")),format.raw/*10.65*/("""</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">"""),_display_(/*17.49*/Messages("app.title")),format.raw/*17.70*/("""
                        """),format.raw/*18.25*/("""<a href=""""),_display_(/*18.35*/routes/*18.41*/.Application.index),format.raw/*18.59*/("""" class="pull-right">"""),_display_(/*18.81*/Messages("menu.1")),format.raw/*18.99*/("""</a>
                    </div>
                    <div class="panel-body">
                        <p class="mensagem alert alert-danger text-center">"""),_display_(/*21.77*/Messages("app.error.found")),format.raw/*21.104*/("""</p>
                    </div>
                    <div class="panel-footer">
                        <p class="text-center">&copy; 2016 CIBiogás</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src=""""),_display_(/*31.19*/routes/*31.25*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*31.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*32.93*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object naoAutorizado extends naoAutorizado_Scope0.naoAutorizado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/erro/naoAutorizado.scala.html
                  HASH: 168aba498b9183960188e7f502e112180875d143
                  MATRIX: 858->0|1128->244|1142->250|1202->289|1280->341|1294->347|1385->417|1463->469|1477->475|1544->521|1586->536|1628->557|1657->558|1687->561|1735->588|1980->806|2022->827|2075->852|2112->862|2127->868|2166->886|2215->908|2254->926|2434->1079|2483->1106|2775->1371|2790->1377|2870->1436|2950->1489|2965->1495|3054->1563
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|52->21|52->21|62->31|62->31|62->31|63->32|63->32|63->32
                  -- GENERATED --
              */
          