
package views.html.mensagens.artigo

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
    <title>Biblioteca - mensagens</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">Biblioteca Digital
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.ArtigoController.telaLista),format.raw/*19.68*/("""" class="pull-right">Lista de Artigos</a>
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
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/artigo/mensagens.scala.html
                  HASH: b03ef403259aa5131cd9d7bc5433faa78cdb7e02
                  MATRIX: 777->1|910->39|937->40|1207->284|1221->290|1281->329|1359->381|1373->387|1464->457|1543->509|1558->515|1626->561|1959->867|1974->873|2022->900|2188->1039|2231->1073|2270->1074|2323->1099|2432->1181|2461->1189|2514->1214|2575->1244|2628->1270|2668->1301|2707->1302|2760->1327|2868->1408|2897->1416|2950->1441|3011->1471|3060->1492|3327->1732|3342->1738|3422->1797|3502->1850|3517->1856|3606->1924
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|62->31|63->32|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          