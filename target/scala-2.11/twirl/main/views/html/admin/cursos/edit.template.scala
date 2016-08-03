
package views.html.admin.cursos

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.CursoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, cursoForm: play.data.Form[views.validators.CursoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Curso")/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Curso</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.CursoController.editar(id), 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "cursoForm")/*11.137*/ {_display_(Seq[Any](format.raw/*11.139*/("""

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

                    """),format.raw/*46.21*/("""<!-- Button -->
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*50.73*/routes/*50.79*/.CursoController.telaLista),format.raw/*50.105*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*53.14*/("""
            """),format.raw/*54.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*57.2*/("""

"""),format.raw/*59.1*/("""<script type="text/javascript">
        $(function () """),format.raw/*60.23*/("""{"""),format.raw/*60.24*/("""
            """),format.raw/*61.13*/("""$('#dataInicio').datetimepicker("""),format.raw/*61.45*/("""{"""),format.raw/*61.46*/("""
                """),format.raw/*62.17*/("""format: 'YYYY-MM-DD'
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/(""");
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""");
</script>"""))
      }
    }
  }

  def render(id:Long,cursoForm:play.data.Form[views.validators.CursoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,cursoForm)

  def f:((Long,play.data.Form[views.validators.CursoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,cursoForm) => apply(id,cursoForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/cursos/edit.scala.html
                  HASH: 6b7217089f2f56405e1297d1106c77cdbe0b6f3b
                  MATRIX: 801->1|1009->70|1037->119|1064->121|1076->126|1116->158|1155->160|1186->165|1386->338|1519->461|1560->463|1606->482|1644->511|1684->513|1733->534|1974->748|1992->757|2034->777|2145->857|2195->879|2253->910|2386->1022|2436->1044|2499->1080|2651->1211|2701->1233|2766->1271|2934->1418|2984->1440|3042->1471|3175->1583|3225->1605|3286->1639|3373->1705|3423->1727|3740->2017|3755->2023|3803->2049|3912->2127|3953->2140|4017->2174|4046->2176|4128->2230|4157->2231|4198->2244|4258->2276|4287->2277|4332->2294|4393->2327|4422->2328|4460->2339|4489->2340
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|74->44|76->46|80->50|80->50|80->50|83->53|84->54|87->57|89->59|90->60|90->60|91->61|91->61|91->61|92->62|93->63|93->63|94->64|94->64
                  -- GENERATED --
              */
          