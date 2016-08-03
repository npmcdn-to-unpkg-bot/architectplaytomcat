
package views.html.admin.livros

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.LivroFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, livroForm: play.data.Form[views.validators.LivroFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Livro")/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""
"""),format.raw/*7.1*/("""<div class="col-sm-6">
    <div class="panel panel-default">
        <div class="panel-heading">Editar Livro</div>
        <div class="panel-body">
            """),_display_(/*11.14*/form(routes.LivroController.editar(id), 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "livroForm")/*11.137*/ {_display_(Seq[Any](format.raw/*11.139*/("""

            """),_display_(/*13.14*/if(livroForm.hasGlobalErrors)/*13.43*/ {_display_(Seq[Any](format.raw/*13.45*/("""
                """),format.raw/*14.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        <p class="alert alert-danger text-center">"""),_display_(/*17.68*/livroForm/*17.77*/.globalError.message),format.raw/*17.97*/("""</p>
                    </div>
                </div>
            """)))}),format.raw/*20.14*/("""

            """),format.raw/*22.13*/("""<!-- Título -->
            """),_display_(/*23.14*/texto(livroForm("titulo"),
            label = "Título:",
            placeholder = "Insira o Título")),format.raw/*25.45*/("""

            """),format.raw/*27.13*/("""<!-- Subtítulo -->
            """),_display_(/*28.14*/texto(livroForm("subTitulo"),
            label = "Subtítulo:",
            placeholder = "Insira o Subtítulo")),format.raw/*30.48*/("""

            """),format.raw/*32.13*/("""<!-- Autores -->
            """),_display_(/*33.14*/texto(livroForm("autores"),
            label = "Autores:",
            placeholder = "Insira o Autor")),format.raw/*35.44*/("""

            """),format.raw/*37.13*/("""<!-- Editora -->
            """),_display_(/*38.14*/texto(livroForm("editora"),
            label = "Editora:",
            placeholder = "Insira a Editora")),format.raw/*40.46*/("""

            """),format.raw/*42.13*/("""<!-- ISBN -->
            """),_display_(/*43.14*/texto(livroForm("isbn"),
            label = "ISBN:",
            placeholder = "Insira o ISBN")),format.raw/*45.43*/("""

            """),format.raw/*47.13*/("""<!-- Páginas -->
            """),_display_(/*48.14*/numero(livroForm("paginas"),
            label = "Páginas:",
            placeholder = "Insira a quantidade de páginas")),format.raw/*50.60*/("""

            """),format.raw/*52.13*/("""<!-- Ano -->
            """),_display_(/*53.14*/numero(livroForm("ano"),
            label = "Ano:",
            placeholder = "Insira o ano")),format.raw/*55.42*/("""

            """),format.raw/*57.13*/("""<!-- Edição -->
            """),_display_(/*58.14*/numero(livroForm("edicao"),
            label = "Edição:",
            placeholder = "Insira a edição")),format.raw/*60.45*/("""

            """),format.raw/*62.13*/("""<!-- Arquivo -->
            """),_display_(/*63.14*/arquivo(livroForm("arquivo"),
            label = "Enviar:")),format.raw/*64.31*/("""

            """),format.raw/*66.13*/("""<!-- Button -->
            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-12">
                    <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                    <a class="btn btn-default" type="button" href=""""),_display_(/*70.69*/routes/*70.75*/.LivroController.telaLista),format.raw/*70.101*/("""">Cancelar</a>
                </div>
            </div>
            """)))}),format.raw/*73.14*/("""
        """),format.raw/*74.9*/("""</div>
    </div>
</div>

""")))}),format.raw/*78.2*/("""

"""),format.raw/*80.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
        """),format.raw/*82.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*83.49*/("""{"""),format.raw/*83.50*/("""
            """),format.raw/*84.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*84.75*/("""{"""),format.raw/*84.76*/("""
                """),format.raw/*85.17*/("""inputs[i].disabled = true;
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""";
</script>"""))
      }
    }
  }

  def render(id:Long,livroForm:play.data.Form[views.validators.LivroFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,livroForm)

  def f:((Long,play.data.Form[views.validators.LivroFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,livroForm) => apply(id,livroForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/livros/edit.scala.html
                  HASH: 5526a2d7b7c9f99f6794287e2207674b44bef197
                  MATRIX: 801->1|1009->70|1037->119|1064->121|1076->126|1116->158|1155->160|1182->161|1370->322|1503->445|1544->447|1586->462|1624->491|1664->493|1709->510|1938->712|1956->721|1997->741|2096->809|2138->823|2194->852|2317->954|2359->968|2418->1000|2550->1111|2592->1125|2649->1155|2773->1258|2815->1272|2872->1302|2998->1407|3040->1421|3094->1448|3211->1544|3253->1558|3310->1588|3451->1708|3493->1722|3546->1748|3661->1842|3703->1856|3759->1885|3883->1988|3925->2002|3982->2032|4063->2092|4105->2106|4406->2380|4421->2386|4469->2412|4570->2482|4606->2491|4663->2518|4692->2520|4792->2592|4821->2593|4857->2602|4986->2703|5015->2704|5056->2717|5146->2779|5175->2780|5220->2797|5287->2836|5316->2837|5352->2846|5381->2847|5413->2852|5441->2853
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|75->45|77->47|78->48|80->50|82->52|83->53|85->55|87->57|88->58|90->60|92->62|93->63|94->64|96->66|100->70|100->70|100->70|103->73|104->74|108->78|110->80|111->81|111->81|112->82|113->83|113->83|114->84|114->84|114->84|115->85|116->86|116->86|117->87|117->87|118->88|118->88
                  -- GENERATED --
              */
          