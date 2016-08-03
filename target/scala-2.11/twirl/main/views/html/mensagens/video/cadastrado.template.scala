
package views.html.mensagens.video

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
  def apply/*1.2*/(videoTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
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
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.VideoController.telaLista),format.raw/*19.71*/("""" class="pull-right">Lista de Vídeos</a>
                        </div>
                        <div class="panel-body">
                        """),_display_(/*22.26*/if(videoTitulo == null)/*22.49*/ {_display_(Seq[Any](format.raw/*22.51*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Vídeo não encontrado!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">Vídeo "<b>"""),_display_(/*25.92*/videoTitulo),format.raw/*25.103*/("""</b>" foi cadastrado com sucesso!</p>
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

  def render(videoTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(videoTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (videoTitulo) => apply(videoTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/video/cadastrado.scala.html
                  HASH: c3a915565ca198c3963d3ca90a9cc9b452af7e8a
                  MATRIX: 771->1|887->22|914->23|1204->287|1218->293|1278->332|1360->388|1374->394|1465->464|1548->520|1563->526|1631->572|2001->915|2016->921|2063->947|2236->1093|2268->1116|2308->1118|2365->1147|2486->1250|2499->1255|2538->1256|2595->1285|2685->1348|2718->1359|2812->1422|2865->1447|3164->1719|3179->1725|3259->1784|3343->1841|3358->1847|3447->1915
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          