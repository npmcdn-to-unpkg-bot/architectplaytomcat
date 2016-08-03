
package views.html.admin.noticias

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.NoticiaFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noticiaForm: play.data.Form[views.validators.NoticiaFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Notícias")/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Notícias</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.NoticiaController.inserir, 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "noticiaForm")/*11.138*/ {_display_(Seq[Any](format.raw/*11.140*/("""

                """),_display_(/*13.18*/if(noticiaForm.hasGlobalErrors)/*13.49*/ {_display_(Seq[Any](format.raw/*13.51*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/noticiaForm/*17.83*/.globalError.message),format.raw/*17.103*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- titulo -->
                """),_display_(/*23.18*/texto(noticiaForm("titulo"),
                    label = "Título:",
                    placeholder = "Insira o título")),format.raw/*25.53*/("""

                    """),format.raw/*27.21*/("""<!-- resumo -->
                """),_display_(/*28.18*/textoarea(noticiaForm("resumo"),
                    label = "Resumo:",
                    placeholder = "Insira o resumo")),format.raw/*30.53*/("""

                    """),format.raw/*32.21*/("""<!-- Site -->
                """),_display_(/*33.18*/texto(noticiaForm("url"),
                    label = "Url:",
                    placeholder = "Insira o endereço eletrônico")),format.raw/*35.66*/("""

                    """),format.raw/*37.21*/("""<!-- Arquivo -->
                """),_display_(/*38.18*/arquivo(noticiaForm("arquivo"),
                    label = "Capa:")),format.raw/*39.37*/("""

                """),format.raw/*41.17*/("""<div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*44.73*/routes/*44.79*/.NoticiaController.telaLista),format.raw/*44.107*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*52.2*/("""

"""),format.raw/*54.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*55.41*/("""{"""),format.raw/*55.42*/("""
        """),format.raw/*56.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*57.49*/("""{"""),format.raw/*57.50*/("""
            """),format.raw/*58.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*58.75*/("""{"""),format.raw/*58.76*/("""
                """),format.raw/*59.17*/("""inputs[i].disabled = true;
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""";
</script>"""))
      }
    }
  }

  def render(noticiaForm:play.data.Form[views.validators.NoticiaFormData]): play.twirl.api.HtmlFormat.Appendable = apply(noticiaForm)

  def f:((play.data.Form[views.validators.NoticiaFormData]) => play.twirl.api.HtmlFormat.Appendable) = (noticiaForm) => apply(noticiaForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/noticias/create.scala.html
                  HASH: ebd92db8faa880acb0b9797f2759c061f57a987b
                  MATRIX: 804->1|1006->64|1034->113|1061->115|1073->120|1121->160|1160->162|1191->167|1399->348|1533->472|1574->474|1620->493|1660->524|1700->526|1749->547|1990->761|2010->772|2052->792|2163->872|2213->894|2273->927|2414->1047|2464->1069|2524->1102|2669->1226|2719->1248|2777->1279|2925->1406|2975->1428|3036->1462|3125->1530|3171->1548|3459->1809|3474->1815|3524->1843|3633->1921|3674->1934|3739->1969|3768->1971|3868->2043|3897->2044|3933->2053|4062->2154|4091->2155|4132->2168|4222->2230|4251->2231|4296->2248|4363->2287|4392->2288|4428->2297|4457->2298|4489->2303|4517->2304
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|69->39|71->41|74->44|74->44|74->44|77->47|78->48|82->52|84->54|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|90->60|90->60|91->61|91->61|92->62|92->62
                  -- GENERATED --
              */
          