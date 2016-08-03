
package views.html.admin.cursos

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.CursoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cursoForm: play.data.Form[views.validators.CursoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Curso")/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Curso</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.CursoController.inserir, 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "cursoForm")/*11.134*/ {_display_(Seq[Any](format.raw/*11.136*/("""

                """),_display_(/*13.18*/if(cursoForm.hasGlobalErrors)/*13.47*/ {_display_(Seq[Any](format.raw/*13.49*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/cursoForm/*17.81*/.globalError.message),format.raw/*17.101*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- nome -->
                """),_display_(/*23.18*/texto(cursoForm("nome"),
                    label = "Nome:",
                    placeholder = "Insira o Nome")),format.raw/*25.51*/("""

                    """),format.raw/*27.21*/("""<!-- descricao -->
                """),_display_(/*28.18*/textoarea(cursoForm("descricao"),
                    label = "Descrição:",
                    placeholder = "Insira a descrição")),format.raw/*30.56*/("""

                    """),format.raw/*32.21*/("""<!-- Data Inicio -->
                """),_display_(/*33.18*/datetimePickerDataInicio(cursoForm("dataInicio"),
                    label = "Data de Início:",
                    placeholder = "Insira a data")),format.raw/*35.51*/("""

                    """),format.raw/*37.21*/("""<!-- Site -->
                """),_display_(/*38.18*/texto(cursoForm("site"),
                    label = "Site:",
                    placeholder = "Insira o Site")),format.raw/*40.51*/("""

                    """),format.raw/*42.21*/("""<!-- Arquivo -->
                """),_display_(/*43.18*/arquivo(cursoForm("arquivo"),
                    label = "Capa:")),format.raw/*44.37*/("""


                """),format.raw/*47.17*/("""<div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*50.73*/routes/*50.79*/.CursoController.telaLista()),format.raw/*50.107*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*53.14*/("""
            """),format.raw/*54.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*58.2*/("""

"""),format.raw/*60.1*/("""<script type="text/javascript">
        $(function () """),format.raw/*61.23*/("""{"""),format.raw/*61.24*/("""
            """),format.raw/*62.13*/("""$('#dataInicio').datetimepicker("""),format.raw/*62.45*/("""{"""),format.raw/*62.46*/("""
                """),format.raw/*63.17*/("""format: 'YYYY-MM-DD'
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/(""");
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""");
</script>"""))
      }
    }
  }

  def render(cursoForm:play.data.Form[views.validators.CursoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(cursoForm)

  def f:((play.data.Form[views.validators.CursoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (cursoForm) => apply(cursoForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/cursos/create.scala.html
                  HASH: e38130af79da5d4d42b4ff00d5ee78a889b7a1ad
                  MATRIX: 800->1|998->60|1026->109|1053->111|1065->116|1110->153|1149->155|1180->160|1385->338|1515->458|1556->460|1602->479|1640->508|1680->510|1729->531|1970->745|1988->754|2030->774|2141->854|2191->876|2249->907|2382->1019|2432->1041|2495->1077|2647->1208|2697->1230|2762->1268|2930->1415|2980->1437|3038->1468|3171->1580|3221->1602|3282->1636|3369->1702|3416->1721|3704->1982|3719->1988|3769->2016|3878->2094|3919->2107|3984->2142|4013->2144|4095->2198|4124->2199|4165->2212|4225->2244|4254->2245|4299->2262|4360->2295|4389->2296|4427->2307|4456->2308
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|74->44|77->47|80->50|80->50|80->50|83->53|84->54|88->58|90->60|91->61|91->61|92->62|92->62|92->62|93->63|94->64|94->64|95->65|95->65
                  -- GENERATED --
              */
          