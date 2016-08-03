
package views.html.admin.eventos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object detail_Scope0 {
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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Evento,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(evento: Evento):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Evento")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Evento
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.EventoController.telaLista),format.raw/*14.72*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.EventoController.telaEditar(evento.getId)),format.raw/*15.87*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Nome</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/evento/*24.71*/.getNome),format.raw/*24.79*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data de Início</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/evento/*28.71*/.getDataInicio.format("dd MMMM yyyy")),format.raw/*28.108*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data de Término</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*32.65*/evento/*32.71*/.getDataFim.format("dd MMMM yyyy")),format.raw/*32.105*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Site</label>
                    <p><a target="_blank" href=""""),_display_(/*36.50*/evento/*36.56*/.getSite),format.raw/*36.64*/("""" class="display-block margin-left-027em">"""),_display_(/*36.107*/evento/*36.113*/.getSite),format.raw/*36.121*/("""</a></p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Local</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*40.65*/evento/*40.71*/.getLocal),format.raw/*40.80*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Instituição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*44.65*/evento/*44.71*/.getInstituicao),format.raw/*44.86*/("""</p>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Biblioteca</h4>
                </div>
                <div class="modal-body">
                    <p class="text-center">Deseja remover o evento <b>""""),_display_(/*57.73*/evento/*57.79*/.getNome),format.raw/*57.87*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                """),_display_(/*60.18*/form(routes.EventoController.remover(evento.getId))/*60.69*/ {_display_(Seq[Any](format.raw/*60.71*/("""
                    """),format.raw/*61.21*/("""<input type="submit" value="Remover" class="btn btn-warning">
                """)))}),format.raw/*62.18*/("""
                """),format.raw/*63.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*67.2*/("""

"""),format.raw/*69.1*/("""<script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*70.45*/("""{"""),format.raw/*70.46*/("""
            """),format.raw/*71.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*72.53*/("""{"""),format.raw/*72.54*/("""
                """),format.raw/*73.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*73.79*/("""{"""),format.raw/*73.80*/("""
                    """),format.raw/*74.21*/("""inputs[i].disabled = true;
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/("""
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""";
</script>"""))
      }
    }
  }

  def render(evento:Evento): play.twirl.api.HtmlFormat.Appendable = apply(evento)

  def f:((Evento) => play.twirl.api.HtmlFormat.Appendable) = (evento) => apply(evento)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/eventos/detail.scala.html
                  HASH: d4143d5e4a56a05b40b79f8303e16895fbc5e136
                  MATRIX: 761->1|887->17|915->36|942->38|954->43|1015->96|1054->98|1085->103|1615->606|1630->612|1678->639|1761->695|1776->701|1839->743|2367->1244|2382->1250|2411->1258|2676->1496|2691->1502|2750->1539|3016->1778|3031->1784|3087->1818|3327->2031|3342->2037|3371->2045|3442->2088|3458->2094|3488->2102|3748->2335|3763->2341|3793->2350|4055->2585|4070->2591|4106->2606|4778->3251|4793->3257|4822->3265|4943->3359|5003->3410|5043->3412|5092->3433|5202->3512|5247->3529|5377->3629|5406->3631|5510->3707|5539->3708|5580->3721|5713->3826|5742->3827|5787->3844|5877->3906|5906->3907|5955->3928|6026->3971|6055->3972|6096->3985|6125->3986|6161->3995|6190->3996
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|66->36|66->36|66->36|66->36|66->36|66->36|70->40|70->40|70->40|74->44|74->44|74->44|87->57|87->57|87->57|90->60|90->60|90->60|91->61|92->62|93->63|97->67|99->69|100->70|100->70|101->71|102->72|102->72|103->73|103->73|103->73|104->74|105->75|105->75|106->76|106->76|107->77|107->77
                  -- GENERATED --
              */
          