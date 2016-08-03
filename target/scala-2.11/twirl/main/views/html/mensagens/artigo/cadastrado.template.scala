
package views.html.mensagens.artigo

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
  def apply/*1.2*/(artigoTitulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
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
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.ArtigoController.telaLista),format.raw/*19.68*/("""" class="pull-right">Lista de Artigos</a>
                    </div>
                    <div class="panel-body">
                        """),_display_(/*22.26*/if(artigoTitulo == null)/*22.50*/ {_display_(Seq[Any](format.raw/*22.52*/("""
                            """),format.raw/*23.29*/("""<p class="mensagem alert alert-danger text-center">Artigo não encontrado!</p>
                        """)))}/*24.27*/else/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""<p class="mensagem alert alert-success text-center">Artigo "<b>"""),_display_(/*25.93*/artigoTitulo),format.raw/*25.105*/("""</b>" cadastrado com sucesso!</p>
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

  def render(artigoTitulo:String): play.twirl.api.HtmlFormat.Appendable = apply(artigoTitulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (artigoTitulo) => apply(artigoTitulo)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/artigo/cadastrado.scala.html
                  HASH: b08bc44f44f69c0573a12b23adf2f93165272a84
                  MATRIX: 772->1|889->23|916->24|1186->268|1200->274|1260->313|1338->365|1352->371|1443->441|1522->493|1537->499|1605->545|1939->852|1954->858|2002->885|2168->1024|2201->1048|2241->1050|2298->1079|2420->1183|2433->1188|2472->1189|2529->1218|2620->1282|2654->1294|2744->1353|2793->1374|3060->1614|3075->1620|3155->1679|3235->1732|3250->1738|3339->1806
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19|50->19|50->19|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          