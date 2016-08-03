
package views.html.admin.eventos

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.EventoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, eventoForm: play.data.Form[views.validators.EventoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Evento")/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Evento</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.EventoController.editar(id), 'class -> "form-horizontal", 'id -> "eventoForm")/*11.104*/ {_display_(Seq[Any](format.raw/*11.106*/("""

                """),_display_(/*13.18*/if(eventoForm.hasGlobalErrors)/*13.48*/ {_display_(Seq[Any](format.raw/*13.50*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/eventoForm/*17.82*/.globalError.message),format.raw/*17.102*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- nome -->
                """),_display_(/*23.18*/texto(eventoForm("nome"),
                    label = "Nome:",
                    placeholder = "Insira o Nome")),format.raw/*25.51*/("""

                    """),format.raw/*27.21*/("""<!-- Data Inicio -->
                """),_display_(/*28.18*/datetimePickerDataInicio(eventoForm("dataInicio"),
                    label = "Data de Início:",
                    placeholder = "Insira a data")),format.raw/*30.51*/("""

                    """),format.raw/*32.21*/("""<!-- Data Fim -->
                """),_display_(/*33.18*/datetimePickerDataFim(eventoForm("dataFim"),
                    label = "Data de Término:",
                    placeholder = "Insira a data de término")),format.raw/*35.62*/("""

                    """),format.raw/*37.21*/("""<!-- Site -->
                """),_display_(/*38.18*/texto(eventoForm("site"),
                    label = "Site:",
                    placeholder = "Insira o Site")),format.raw/*40.51*/("""

                    """),format.raw/*42.21*/("""<!-- Local -->
                """),_display_(/*43.18*/texto(eventoForm("local"),
                    label = "Local:",
                    placeholder = "Insira o Local")),format.raw/*45.52*/("""

                    """),format.raw/*47.21*/("""<!-- Local -->
                """),_display_(/*48.18*/texto(eventoForm("instituicao"),
                    label = "Instituição:",
                    placeholder = "Insira a Instituição Organizadora")),format.raw/*50.71*/("""

                    """),format.raw/*52.21*/("""<!-- Button -->
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*56.73*/routes/*56.79*/.EventoController.telaLista),format.raw/*56.106*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*59.14*/("""
            """),format.raw/*60.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""<script type="text/javascript">
        $(function () """),format.raw/*66.23*/("""{"""),format.raw/*66.24*/("""
            """),format.raw/*67.13*/("""$('#dataInicio').datetimepicker("""),format.raw/*67.45*/("""{"""),format.raw/*67.46*/("""
                """),format.raw/*68.17*/("""format: 'YYYY-MM-DD'
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/(""");
            $('#dataFim').datetimepicker("""),format.raw/*70.42*/("""{"""),format.raw/*70.43*/("""
                """),format.raw/*71.17*/("""format: 'YYYY-MM-DD',
                useCurrent: false //Important! See issue #1075
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/(""");
            $("#dataInicio").on("dp.change", function (e) """),format.raw/*74.59*/("""{"""),format.raw/*74.60*/("""
                """),format.raw/*75.17*/("""$('#dataFim').data("DateTimePicker").minDate(e.date);
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/(""");
            $("#dataFim").on("dp.change", function (e) """),format.raw/*77.56*/("""{"""),format.raw/*77.57*/("""
                """),format.raw/*78.17*/("""$('#dataInicio').data("DateTimePicker").maxDate(e.date);
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/(""");
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""");
</script>"""))
      }
    }
  }

  def render(id:Long,eventoForm:play.data.Form[views.validators.EventoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,eventoForm)

  def f:((Long,play.data.Form[views.validators.EventoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,eventoForm) => apply(id,eventoForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/eventos/edit.scala.html
                  HASH: be1911f078da85ac3127f7ef02b5247877c1d1b1
                  MATRIX: 803->1|1013->72|1041->121|1068->123|1080->128|1121->161|1160->163|1191->168|1392->342|1492->432|1533->434|1579->453|1618->483|1658->485|1707->506|1948->720|1967->730|2009->750|2120->830|2170->852|2228->883|2362->996|2412->1018|2477->1056|2646->1204|2696->1226|2758->1261|2933->1415|2983->1437|3041->1468|3175->1581|3225->1603|3284->1635|3421->1751|3471->1773|3530->1805|3698->1952|3748->1974|4065->2264|4080->2270|4129->2297|4238->2375|4279->2388|4343->2422|4372->2424|4454->2478|4483->2479|4524->2492|4584->2524|4613->2525|4658->2542|4719->2575|4748->2576|4820->2620|4849->2621|4894->2638|5019->2735|5048->2736|5137->2797|5166->2798|5211->2815|5305->2881|5334->2882|5420->2940|5449->2941|5494->2958|5591->3027|5620->3028|5658->3039|5687->3040
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|75->45|77->47|78->48|80->50|82->52|86->56|86->56|86->56|89->59|90->60|93->63|95->65|96->66|96->66|97->67|97->67|97->67|98->68|99->69|99->69|100->70|100->70|101->71|103->73|103->73|104->74|104->74|105->75|106->76|106->76|107->77|107->77|108->78|109->79|109->79|110->80|110->80
                  -- GENERATED --
              */
          