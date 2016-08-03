
package views.html.mensagens.inscricao

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
  def apply/*1.2*/(inscricaoTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.130*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.106*/("""">
        <title>Inscrição</title>
    </head>
    <body>
        <div class="row">
            <div class="container-fluid">
                <div class="mensagens">
                    <div class="panel panel-default">
                        <div class="panel-heading">Inscrição
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.InscricaoController.telaInscricao()),format.raw/*19.81*/("""" class="pull-right">Voltar</a>
                        </div>
                        <div class="panel-body">
                        """),_display_(/*22.26*/if(inscricaoTitulo == null)/*22.53*/ {_display_(Seq[Any](format.raw/*22.55*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Inscrição não encontrada!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">O candidato "<b>"""),_display_(/*25.98*/inscricaoTitulo),format.raw/*25.113*/("""</b>" foi cadastrado com sucesso!</p>
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

  def render(inscricaoTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(inscricaoTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (inscricaoTitulo) => apply(inscricaoTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/inscricao/cadastrado.scala.html
                  HASH: aef078c24203c6e8e746d4c28ea5f2948fcb35ee
                  MATRIX: 775->1|895->26|922->27|1212->291|1226->297|1286->336|1368->392|1382->398|1473->468|1556->524|1571->530|1639->576|1986->896|2001->902|2058->938|2222->1075|2258->1102|2298->1104|2355->1133|2480->1240|2493->1245|2532->1246|2589->1275|2685->1344|2722->1359|2816->1422|2869->1447|3168->1719|3183->1725|3263->1784|3347->1841|3362->1847|3451->1915
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          