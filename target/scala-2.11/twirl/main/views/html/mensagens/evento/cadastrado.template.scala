
package views.html.mensagens.evento

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastrado_Scope0 {
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

class cadastrado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(eventoTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.130*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.106*/("""">
        <title>Biblioteca - cadastrado</title>
    </head>
    <body>
        <div class="row">
            <div class="container-fluid">
                <div class="mensagens">
                    <div class="panel panel-default">
                        <div class="panel-heading">Biblioteca Digital
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.EventoController.telaLista),format.raw/*19.72*/("""" class="pull-right">Lista de Eventos</a>
                        </div>
                        <div class="panel-body">
                        """),_display_(/*22.26*/if(eventoTitulo == null)/*22.50*/ {_display_(Seq[Any](format.raw/*22.52*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Evento não encontrado!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">Evento "<b>"""),_display_(/*25.93*/eventoTitulo),format.raw/*25.105*/("""</b>" cadastrado com sucesso!</p>
                        """)))}),format.raw/*26.26*/("""
                        """),format.raw/*27.25*/("""</div>
                        <div class="panel-footer">
                            <p class="text-center">&copy; 2016 CIBiogás</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*36.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*37.97*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(eventoTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(eventoTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (eventoTitulo) => apply(eventoTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/evento/cadastrado.scala.html
                  HASH: b1625e16b7125c1d4433ec5c0e502213bc20e447
                  MATRIX: 772->1|889->23|916->24|1206->288|1220->294|1280->333|1362->389|1376->395|1467->465|1550->521|1565->527|1633->573|2003->916|2018->922|2066->949|2240->1096|2273->1120|2313->1122|2370->1151|2492->1255|2505->1260|2544->1261|2601->1290|2692->1354|2726->1366|2816->1425|2869->1450|3168->1722|3183->1728|3263->1787|3347->1844|3362->1850|3451->1918
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          