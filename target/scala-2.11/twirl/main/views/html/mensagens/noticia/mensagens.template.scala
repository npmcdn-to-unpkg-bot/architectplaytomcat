
package views.html.mensagens.noticia

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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.130*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.106*/("""">
        <title>Biblioteca - mensagens</title>
    </head>
    <body>
        <div class="row">
            <div class="container-fluid">
                <div class="mensagens">
                    <div class="panel panel-default">
                        <div class="panel-heading">Biblioteca Digital
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.NoticiaController.telaLista),format.raw/*19.73*/("""" class="pull-right">Lista de Notícias</a>
                        </div>
                        <div class="panel-body">
                            """),_display_(/*22.30*/if(tipoMensagem.equals("Sucesso"))/*22.64*/{_display_(Seq[Any](format.raw/*22.65*/("""
                                """),format.raw/*23.33*/("""<p class="mensagem alert alert-success text-center">
                                    """),_display_(/*24.38*/mensagem),format.raw/*24.46*/("""
                                """),format.raw/*25.33*/("""</p>
                            """)))}),format.raw/*26.30*/("""
                            """),_display_(/*27.30*/if(tipoMensagem.equals("Erro"))/*27.61*/{_display_(Seq[Any](format.raw/*27.62*/("""
                                """),format.raw/*28.33*/("""<p class="mensagem alert alert-danger text-center">
                                    """),_display_(/*29.38*/mensagem),format.raw/*29.46*/("""
                                """),format.raw/*30.33*/("""</p>
                            """)))}),format.raw/*31.30*/("""
                        """),format.raw/*32.25*/("""</div>
                        <div class="panel-footer">
                            <p class="text-center">&copy; 2016 CIBiogás</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src=""""),_display_(/*41.23*/routes/*41.29*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*41.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*42.97*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/noticia/mensagens.scala.html
                  HASH: ab7a3e21cb8dacc90b0948571d59c6710b7d7f80
                  MATRIX: 778->1|911->39|938->40|1228->304|1242->310|1302->349|1384->405|1398->411|1489->481|1572->537|1587->543|1655->589|2024->931|2039->937|2088->965|2267->1117|2310->1151|2349->1152|2410->1185|2527->1275|2556->1283|2617->1316|2682->1350|2739->1380|2779->1411|2818->1412|2879->1445|2995->1534|3024->1542|3085->1575|3150->1609|3203->1634|3502->1906|3517->1912|3597->1971|3681->2028|3696->2034|3785->2102
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|62->31|63->32|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          