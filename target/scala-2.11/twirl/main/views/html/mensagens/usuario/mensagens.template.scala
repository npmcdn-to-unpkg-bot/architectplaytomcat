
package views.html.mensagens.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mensagens_Scope0 {
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

class mensagens extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.126*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.102*/("""">
    <title>Biblioteca - confirmação</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">Biblioteca Digital
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.UsuarioController.telaLista),format.raw/*19.69*/("""" class="pull-right">Usuários</a>
                    </div>
                    <div class="panel-body">
                        """),_display_(/*22.26*/if(tipoMensagem.equals("Sucesso"))/*22.60*/{_display_(Seq[Any](format.raw/*22.61*/("""
                        """),format.raw/*23.25*/("""<p class="mensagem alert alert-success text-center">
                            """),_display_(/*24.30*/mensagem),format.raw/*24.38*/("""
                        """),format.raw/*25.25*/("""</p>
                        """)))}),format.raw/*26.26*/("""
                        """),_display_(/*27.26*/if(tipoMensagem.equals("Erro"))/*27.57*/{_display_(Seq[Any](format.raw/*27.58*/("""
                        """),format.raw/*28.25*/("""<p class="mensagem alert alert-danger text-center">
                            """),_display_(/*29.30*/mensagem),format.raw/*29.38*/("""
                        """),format.raw/*30.25*/("""</p>
                        """)))}),format.raw/*31.26*/("""
                    """),format.raw/*32.21*/("""</div>
                    <div class="panel-footer">
                        <p class="text-center">&copy; 2016 CIBiogás</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src=""""),_display_(/*41.19*/routes/*41.25*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*41.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*42.19*/routes/*42.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*42.93*/("""" type="text/javascript"></script>
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
object mensagens extends mensagens_Scope0.mensagens
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/usuario/mensagens.scala.html
                  HASH: f1ea049c4c1b2f55ffcab1f9625d8b67532ecc58
                  MATRIX: 778->1|911->39|938->40|1208->284|1222->290|1282->329|1360->381|1374->387|1465->457|1544->509|1559->515|1627->561|1962->869|1977->875|2026->903|2184->1034|2227->1068|2266->1069|2319->1094|2428->1176|2457->1184|2510->1209|2571->1239|2624->1265|2664->1296|2703->1297|2756->1322|2864->1403|2893->1411|2946->1436|3007->1466|3056->1487|3323->1727|3338->1733|3418->1792|3498->1845|3513->1851|3602->1919
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|62->31|63->32|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          