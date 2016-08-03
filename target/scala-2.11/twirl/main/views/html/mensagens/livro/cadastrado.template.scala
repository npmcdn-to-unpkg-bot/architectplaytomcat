
package views.html.mensagens.livro

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
  def apply/*1.2*/(livroTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.126*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.102*/("""">
    <title>Biblioteca - cadastrado</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">Biblioteca Digital
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.LivroController.telaLista),format.raw/*19.67*/("""" class="pull-right">Lista de Livros</a>
                    </div>
                    <div class="panel-body">
                        """),_display_(/*22.26*/if(livroTitulo == null)/*22.49*/ {_display_(Seq[Any](format.raw/*22.51*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Livro não encontrado!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">Livro "<b>"""),_display_(/*25.92*/livroTitulo),format.raw/*25.103*/("""</b>" foi cadastrado com sucesso!</p>
                        """)))}),format.raw/*26.26*/("""
                    """),format.raw/*27.21*/("""</div>
                    <div class="panel-footer">
                        <p class="text-center">&copy; 2016 CIBiogás</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*36.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*37.19*/routes/*37.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*37.93*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(livroTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(livroTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (livroTitulo) => apply(livroTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/livro/cadastrado.scala.html
                  HASH: 2f712e1e85c588f8b5d6a26a9af4588edb78a32e
                  MATRIX: 771->1|887->22|914->23|1184->267|1198->273|1258->312|1336->364|1350->370|1441->440|1520->492|1535->498|1603->544|1937->851|1952->857|1999->883|2164->1021|2196->1044|2236->1046|2293->1075|2414->1178|2427->1183|2466->1184|2523->1213|2613->1276|2646->1287|2740->1350|2789->1371|3056->1611|3071->1617|3151->1676|3231->1729|3246->1735|3335->1803
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          