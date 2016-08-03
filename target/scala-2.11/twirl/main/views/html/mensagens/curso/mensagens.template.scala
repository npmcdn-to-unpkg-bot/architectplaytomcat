
package views.html.mensagens.curso

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
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.CursoController.telaLista),format.raw/*19.71*/("""" class="pull-right">Lista de Cursos</a>
                        </div>
                        <div class="panel-body">
                            """),_display_(/*22.30*/if(tipoMensagem.equals("Sucesso"))/*22.64*/{_display_(Seq[Any](format.raw/*22.65*/("""
                                """),format.raw/*23.33*/("""<p class="mensagem alert alert-success text-center">
                                """),_display_(/*24.34*/mensagem),format.raw/*24.42*/("""
                                """),format.raw/*25.33*/("""</p>
                            """)))}),format.raw/*26.30*/("""
                            """),_display_(/*27.30*/if(tipoMensagem.equals("Erro"))/*27.61*/{_display_(Seq[Any](format.raw/*27.62*/("""
                                """),format.raw/*28.33*/("""<p class="mensagem alert alert-danger text-center">
                                """),_display_(/*29.34*/mensagem),format.raw/*29.42*/("""
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
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/curso/mensagens.scala.html
                  HASH: 590ea927cecbf6fe3c051d828445a90fbd5ca629
                  MATRIX: 776->1|909->39|936->40|1226->304|1240->310|1300->349|1382->405|1396->411|1487->481|1570->537|1585->543|1653->589|2022->931|2037->937|2084->963|2261->1113|2304->1147|2343->1148|2404->1181|2517->1267|2546->1275|2607->1308|2672->1342|2729->1372|2769->1403|2808->1404|2869->1437|2981->1522|3010->1530|3071->1563|3136->1597|3189->1622|3488->1894|3503->1900|3583->1959|3667->2016|3682->2022|3771->2090
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|62->31|63->32|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          