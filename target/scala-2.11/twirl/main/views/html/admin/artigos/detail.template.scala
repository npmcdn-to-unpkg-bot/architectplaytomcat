
package views.html.admin.artigos

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Artigo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artigo: Artigo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Artigo")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Artigo
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.ArtigoController.telaLista),format.raw/*14.72*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.ArtigoController.telaEditar(artigo.getId)),format.raw/*15.87*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Título</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*24.69*/artigo/*24.75*/.getTitulo),format.raw/*24.85*/("""</p>
                    </div>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Resumo</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*28.69*/artigo/*28.75*/.getResumo),format.raw/*28.85*/("""</p>
                    </div>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Cadastro</label>
                        <p type="date" class="display-block margin-left-027em">"""),_display_(/*32.81*/artigo/*32.87*/.getDataCadastro.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*32.137*/("""</p>
                    </div>
                    """),_display_(/*34.22*/if(artigo.getDataAlteracao != null)/*34.57*/{_display_(Seq[Any](format.raw/*34.58*/("""
                        """),format.raw/*35.25*/("""<div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Data/Hora de Alteração</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*37.73*/artigo/*37.79*/.getDataAlteracao.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*37.130*/("""</p>
                        </div>
                    """)))}),format.raw/*39.22*/("""
            """),format.raw/*40.13*/("""</div>
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
                    <p class="text-center">Deseja remover o artigo <b>""""),_display_(/*51.73*/artigo/*51.79*/.getTitulo),format.raw/*51.89*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                    """),_display_(/*54.22*/form(routes.ArtigoController.remover(artigo.getId))/*54.73*/ {_display_(Seq[Any](format.raw/*54.75*/("""
                        """),format.raw/*55.25*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*61.2*/("""

"""),format.raw/*63.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*64.41*/("""{"""),format.raw/*64.42*/("""
        """),format.raw/*65.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*66.49*/("""{"""),format.raw/*66.50*/("""
            """),format.raw/*67.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*67.75*/("""{"""),format.raw/*67.76*/("""
                """),format.raw/*68.17*/("""inputs[i].disabled = true;
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""";
</script>"""))
      }
    }
  }

  def render(artigo:Artigo): play.twirl.api.HtmlFormat.Appendable = apply(artigo)

  def f:((Artigo) => play.twirl.api.HtmlFormat.Appendable) = (artigo) => apply(artigo)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/artigos/detail.scala.html
                  HASH: 8f61e2232f3517b03b8c2c50118de7d7a9608613
                  MATRIX: 761->1|887->17|915->36|942->38|954->43|1015->96|1054->98|1085->103|1615->606|1630->612|1678->639|1761->695|1776->701|1839->743|2381->1258|2396->1264|2427->1274|2700->1520|2715->1526|2746->1536|3046->1809|3061->1815|3133->1865|3213->1918|3257->1953|3296->1954|3349->1979|3594->2197|3609->2203|3682->2254|3770->2311|3811->2324|4443->2929|4458->2935|4489->2945|4614->3043|4674->3094|4714->3096|4767->3121|4881->3204|4926->3221|5056->3321|5085->3323|5185->3395|5214->3396|5250->3405|5379->3506|5408->3507|5449->3520|5539->3582|5568->3583|5613->3600|5680->3639|5709->3640|5745->3649|5774->3650|5806->3655|5834->3656
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|64->34|64->34|64->34|65->35|67->37|67->37|67->37|69->39|70->40|81->51|81->51|81->51|84->54|84->54|84->54|85->55|86->56|87->57|91->61|93->63|94->64|94->64|95->65|96->66|96->66|97->67|97->67|97->67|98->68|99->69|99->69|100->70|100->70|101->71|101->71
                  -- GENERATED --
              */
          