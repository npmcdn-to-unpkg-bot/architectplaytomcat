
package views.html.admin.eventos

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.EventoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(eventoForm: play.data.Form[views.validators.EventoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Evento")/*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Evento</div>
            <div class="panel-body">
                """),_display_(/*11.18*/form(routes.EventoController.inserir, 'class -> "form-horizontal", 'id -> "eventoForm")/*11.105*/ {_display_(Seq[Any](format.raw/*11.107*/("""

                    """),_display_(/*13.22*/if(eventoForm.hasGlobalErrors)/*13.52*/ {_display_(Seq[Any](format.raw/*13.54*/("""
                        """),format.raw/*14.25*/("""<div class="form-group">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-6">
                                <p class="alert alert-danger text-center">"""),_display_(/*17.76*/eventoForm/*17.86*/.globalError.message),format.raw/*17.106*/("""</p>
                            </div>
                        </div>
                    """)))}),format.raw/*20.22*/("""

                        """),format.raw/*22.25*/("""<!-- nome -->
                    """),_display_(/*23.22*/texto(eventoForm("nome"),
                        label = "Nome:",
                        placeholder = "Insira o Nome")),format.raw/*25.55*/("""

                        """),format.raw/*27.25*/("""<!-- Data Inicio -->
                    """),_display_(/*28.22*/datetimePickerDataInicio(eventoForm("dataInicio"),
                        label = "Data de Início:",
                        placeholder = "Insira a data")),format.raw/*30.55*/("""

                        """),format.raw/*32.25*/("""<!-- Data Fim -->
                    """),_display_(/*33.22*/datetimePickerDataFim(eventoForm("dataFim"),
                        label = "Data de Término:",
                        placeholder = "Insira a data de término")),format.raw/*35.66*/("""

                        """),format.raw/*37.25*/("""<!-- Site -->
                    """),_display_(/*38.22*/texto(eventoForm("site"),
                        label = "Site:",
                        placeholder = "Insira o Site")),format.raw/*40.55*/("""

                        """),format.raw/*42.25*/("""<!-- Local -->
                    """),_display_(/*43.22*/texto(eventoForm("local"),
                        label = "Local:",
                        placeholder = "Insira o Local")),format.raw/*45.56*/("""

                        """),format.raw/*47.25*/("""<!-- Local -->
                    """),_display_(/*48.22*/texto(eventoForm("instituicao"),
                        label = "Instituição:",
                        placeholder = "Insira a Instituição Organizadora")),format.raw/*50.75*/("""

                    """),format.raw/*52.21*/("""<div class="form-group">
                        <div class="col-sm-offset-3 col-sm-12">
                            <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                            <a class="btn btn-default" type="button" href=""""),_display_(/*55.77*/routes/*55.83*/.EventoController.telaLista()),format.raw/*55.112*/("""">Cancelar</a>
                        </div>
                    </div>
                """)))}),format.raw/*58.18*/("""
            """),format.raw/*59.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""<script type="text/javascript">
    $(function () """),format.raw/*66.19*/("""{"""),format.raw/*66.20*/("""
        """),format.raw/*67.9*/("""$('#dataInicio').datetimepicker("""),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
            """),format.raw/*68.13*/("""format: 'YYYY-MM-DD'
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""");
        $('#dataFim').datetimepicker("""),format.raw/*70.38*/("""{"""),format.raw/*70.39*/("""
            """),format.raw/*71.13*/("""format: 'YYYY-MM-DD',
            useCurrent: false //Important! See issue #1075
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/(""");
        $("#dataInicio").on("dp.change", function (e) """),format.raw/*74.55*/("""{"""),format.raw/*74.56*/("""
            """),format.raw/*75.13*/("""$('#dataFim').data("DateTimePicker").minDate(e.date);
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""");
        $("#dataFim").on("dp.change", function (e) """),format.raw/*77.52*/("""{"""),format.raw/*77.53*/("""
            """),format.raw/*78.13*/("""$('#dataInicio').data("DateTimePicker").maxDate(e.date);
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""");
</script>"""))
      }
    }
  }

  def render(eventoForm:play.data.Form[views.validators.EventoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(eventoForm)

  def f:((play.data.Form[views.validators.EventoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (eventoForm) => apply(eventoForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/eventos/create.scala.html
                  HASH: 918649e5c10b6d6e8f8d51dddaa4bd49e92b13eb
                  MATRIX: 802->1|1002->62|1030->111|1057->113|1069->118|1115->156|1154->158|1185->163|1395->346|1492->433|1533->435|1583->458|1622->488|1662->490|1715->515|1968->741|1987->751|2029->771|2152->863|2206->889|2268->924|2410->1045|2464->1071|2533->1113|2710->1269|2764->1295|2830->1334|3013->1496|3067->1522|3129->1557|3271->1678|3325->1704|3388->1740|3533->1864|3587->1890|3650->1926|3826->2081|3876->2103|4176->2376|4191->2382|4242->2411|4363->2501|4404->2514|4469->2549|4498->2551|4576->2601|4605->2602|4641->2611|4701->2643|4730->2644|4771->2657|4827->2686|4856->2687|4924->2727|4953->2728|4994->2741|5110->2830|5139->2831|5224->2888|5253->2889|5294->2902|5383->2964|5412->2965|5494->3019|5523->3020|5564->3033|5656->3098|5685->3099|5719->3106|5747->3107
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|75->45|77->47|78->48|80->50|82->52|85->55|85->55|85->55|88->58|89->59|93->63|95->65|96->66|96->66|97->67|97->67|97->67|98->68|99->69|99->69|100->70|100->70|101->71|103->73|103->73|104->74|104->74|105->75|106->76|106->76|107->77|107->77|108->78|109->79|109->79|110->80|110->80
                  -- GENERATED --
              */
          