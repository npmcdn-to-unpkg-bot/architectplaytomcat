
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logout_Scope0 {
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

class logout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <title>Biblioteca - desconectado</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">Biblioteca Digital
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.Application.index),format.raw/*18.59*/("""" class="pull-right">Início</a>
                    </div>
                    <div class="panel-body">
                        <p class="mensagem alert alert-warning text-center">Usuário desconectado!</p>
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
object logout extends logout_Scope0.logout
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/info/logout.scala.html
                  HASH: 5bfb327692438e5a52462f325c617a2c96417d62
                  MATRIX: 844->0|1114->244|1128->250|1188->289|1266->341|1280->347|1371->417|1449->469|1463->475|1530->521|1866->830|1881->836|1920->854|2413->1320|2428->1326|2508->1385|2588->1438|2603->1444|2692->1512
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|49->18|49->18|49->18|62->31|62->31|62->31|63->32|63->32|63->32
                  -- GENERATED --
              */
          