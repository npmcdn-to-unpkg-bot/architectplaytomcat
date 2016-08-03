
package views.html.mensagens.publicacao

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
  def apply/*1.2*/(publicacaoTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
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
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.PublicacaoController.telaLista),format.raw/*19.76*/("""" class="pull-right">Lista de Publicações</a>
                        </div>
                        <div class="panel-body">
                        """),_display_(/*22.26*/if(publicacaoTitulo == null)/*22.54*/ {_display_(Seq[Any](format.raw/*22.56*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Publicação não encontrada!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">A publicação "<b>"""),_display_(/*25.99*/publicacaoTitulo),format.raw/*25.115*/("""</b>" cadastrado com sucesso!</p>
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

  def render(publicacaoTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(publicacaoTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (publicacaoTitulo) => apply(publicacaoTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/publicacao/cadastrado.scala.html
                  HASH: 3690d546b8a1ff8267915b35b9c755c0d4777dbb
                  MATRIX: 776->1|897->27|924->28|1214->292|1228->298|1288->337|1370->393|1384->399|1475->469|1558->525|1573->531|1641->577|2011->920|2026->926|2078->957|2256->1108|2293->1136|2333->1138|2390->1167|2516->1275|2529->1280|2568->1281|2625->1310|2722->1380|2760->1396|2850->1455|2903->1480|3202->1752|3217->1758|3297->1817|3381->1874|3396->1880|3485->1948
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          