
package views.html.mensagens.noticia

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
  def apply/*1.2*/(noticiaTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
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
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.NoticiaController.telaLista),format.raw/*19.73*/("""" class="pull-right">Lista de Notícias</a>
                        </div>
                        <div class="panel-body">
                        """),_display_(/*22.26*/if(noticiaTitulo == null)/*22.51*/ {_display_(Seq[Any](format.raw/*22.53*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Notícia não encontrada!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">A noticia "<b>"""),_display_(/*25.96*/noticiaTitulo),format.raw/*25.109*/("""</b>" cadastrada com sucesso!</p>
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

  def render(noticiaTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(noticiaTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (noticiaTitulo) => apply(noticiaTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/noticia/cadastrado.scala.html
                  HASH: e47ab791d3c8f4a6bb65dec8e23bc462aaf6ac34
                  MATRIX: 773->1|891->24|918->25|1208->289|1222->295|1282->334|1364->390|1378->396|1469->466|1552->522|1567->528|1635->574|2005->917|2020->923|2069->951|2244->1099|2278->1124|2318->1126|2375->1155|2498->1260|2511->1265|2550->1266|2607->1295|2701->1362|2736->1375|2826->1434|2879->1459|3178->1731|3193->1737|3273->1796|3357->1853|3372->1859|3461->1927
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          