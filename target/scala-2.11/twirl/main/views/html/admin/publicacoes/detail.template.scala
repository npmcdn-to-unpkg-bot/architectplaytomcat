
package views.html.admin.publicacoes

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Publicacao,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(publicacao: Publicacao):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe da Publicação")/*5.64*/ {_display_(Seq[Any](format.raw/*5.66*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe da Publicação
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.PublicacaoController.telaLista),format.raw/*14.76*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.PublicacaoController.telaEditar(publicacao.getId)),format.raw/*15.95*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Título</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/publicacao/*24.75*/.getTitulo),format.raw/*24.85*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Descrição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/publicacao/*28.75*/.getResumo),format.raw/*28.85*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">URL</label>
                    <p><a target="_blank" href=""""),_display_(/*32.50*/publicacao/*32.60*/.getUrl),format.raw/*32.67*/("""" class="display-block margin-left-027em">"""),_display_(/*32.110*/publicacao/*32.120*/.getUrl),format.raw/*32.127*/("""</a></p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data/Hora de Cadastro</label>
                    <p type="date" class="display-block margin-left-027em">"""),_display_(/*36.77*/publicacao/*36.87*/.getDataCadastro.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*36.137*/("""</p>
                </div>
                """),_display_(/*38.18*/if(publicacao.getDataAlteracao != null)/*38.57*/{_display_(Seq[Any](format.raw/*38.58*/("""
                    """),format.raw/*39.21*/("""<div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Alteração</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*41.69*/publicacao/*41.79*/.getDataAlteracao.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*41.130*/("""</p>
                    </div>
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</div>
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
                    <p class="text-center">Deseja remover a publicação <b>""""),_display_(/*55.77*/publicacao/*55.87*/.getTitulo),format.raw/*55.97*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                """),_display_(/*58.18*/form(routes.PublicacaoController.remover(publicacao.getId))/*58.77*/ {_display_(Seq[Any](format.raw/*58.79*/("""
                    """),format.raw/*59.21*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
    """)))}),format.raw/*65.6*/("""

"""),format.raw/*67.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*68.41*/("""{"""),format.raw/*68.42*/("""
        """),format.raw/*69.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*70.49*/("""{"""),format.raw/*70.50*/("""
            """),format.raw/*71.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*71.75*/("""{"""),format.raw/*71.76*/("""
                """),format.raw/*72.17*/("""inputs[i].disabled = true;
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""";
</script>"""))
      }
    }
  }

  def render(publicacao:Publicacao): play.twirl.api.HtmlFormat.Appendable = apply(publicacao)

  def f:((Publicacao) => play.twirl.api.HtmlFormat.Appendable) = (publicacao) => apply(publicacao)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/publicacoes/detail.scala.html
                  HASH: 0a1e7c5664976cb18ce5d4a2f9557ddb67696c90
                  MATRIX: 769->1|903->25|931->44|958->46|970->51|1035->108|1074->110|1105->115|1639->622|1654->628|1706->659|1789->715|1804->721|1875->771|2405->1274|2424->1284|2455->1294|2715->1527|2734->1537|2765->1547|3004->1759|3023->1769|3051->1776|3122->1819|3142->1829|3171->1836|3459->2097|3478->2107|3550->2157|3622->2202|3670->2241|3709->2242|3758->2263|3995->2473|4014->2483|4087->2534|4167->2583|4208->2596|4844->3205|4863->3215|4894->3225|5015->3319|5083->3378|5123->3380|5172->3401|5286->3484|5331->3501|5465->3605|5494->3607|5594->3679|5623->3680|5659->3689|5788->3790|5817->3791|5858->3804|5948->3866|5977->3867|6022->3884|6089->3923|6118->3924|6154->3933|6183->3934|6215->3939|6243->3940
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|62->32|62->32|62->32|66->36|66->36|66->36|68->38|68->38|68->38|69->39|71->41|71->41|71->41|73->43|74->44|85->55|85->55|85->55|88->58|88->58|88->58|89->59|90->60|91->61|95->65|97->67|98->68|98->68|99->69|100->70|100->70|101->71|101->71|101->71|102->72|103->73|103->73|104->74|104->74|105->75|105->75
                  -- GENERATED --
              */
          