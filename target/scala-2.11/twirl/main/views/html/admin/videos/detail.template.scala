
package views.html.admin.videos

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Video,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(video: Video):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Vídeo")/*5.59*/ {_display_(Seq[Any](format.raw/*5.61*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Vídeo
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.VideoController.telaLista),format.raw/*14.71*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.VideoController.telaEditar(video.getId)),format.raw/*15.85*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Título</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/video/*24.70*/.getTitulo),format.raw/*24.80*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Descrição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/video/*28.70*/.getDescricao),format.raw/*28.83*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">URL</label>
                    <p><a target="_blank" href=""""),_display_(/*32.50*/video/*32.55*/.getUrl),format.raw/*32.62*/("""" class="display-block margin-left-027em">"""),_display_(/*32.105*/video/*32.110*/.getUrl),format.raw/*32.117*/("""</a></p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data/Hora de Cadastro</label>
                    <p type="date" class="display-block margin-left-027em">"""),_display_(/*36.77*/video/*36.82*/.getDataCadastro.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*36.132*/("""</p>
                </div>
                """),_display_(/*38.18*/if(video.getDataAlteracao != null)/*38.52*/{_display_(Seq[Any](format.raw/*38.53*/("""
                    """),format.raw/*39.21*/("""<div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Alteração</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*41.69*/video/*41.74*/.getDataAlteracao.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*41.125*/("""</p>
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
                    <p class="text-center">Deseja remover o vídeo <b>""""),_display_(/*55.72*/video/*55.77*/.getTitulo),format.raw/*55.87*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                """),_display_(/*58.18*/form(routes.VideoController.remover(video.getId))/*58.67*/ {_display_(Seq[Any](format.raw/*58.69*/("""
                    """),format.raw/*59.21*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*65.2*/("""

"""),format.raw/*67.1*/("""<script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*68.45*/("""{"""),format.raw/*68.46*/("""
            """),format.raw/*69.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*70.53*/("""{"""),format.raw/*70.54*/("""
                """),format.raw/*71.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*71.79*/("""{"""),format.raw/*71.80*/("""
                    """),format.raw/*72.21*/("""inputs[i].disabled = true;
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""";
</script>"""))
      }
    }
  }

  def render(video:Video): play.twirl.api.HtmlFormat.Appendable = apply(video)

  def f:((Video) => play.twirl.api.HtmlFormat.Appendable) = (video) => apply(video)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/videos/detail.scala.html
                  HASH: ec218880b119b310dfe48d64bae7694e300f4d30
                  MATRIX: 759->1|883->15|911->34|938->36|950->41|1010->93|1049->95|1080->100|1609->602|1624->608|1671->634|1754->690|1769->696|1830->736|2360->1239|2374->1244|2405->1254|2665->1487|2679->1492|2713->1505|2952->1717|2966->1722|2994->1729|3065->1772|3080->1777|3109->1784|3397->2045|3411->2050|3483->2100|3555->2145|3598->2179|3637->2180|3686->2201|3923->2411|3937->2416|4010->2467|4090->2516|4131->2529|4762->3133|4776->3138|4807->3148|4928->3242|4986->3291|5026->3293|5075->3314|5189->3397|5234->3414|5364->3514|5393->3516|5497->3592|5526->3593|5567->3606|5700->3711|5729->3712|5774->3729|5864->3791|5893->3792|5942->3813|6013->3856|6042->3857|6083->3870|6112->3871|6148->3880|6177->3881
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|62->32|62->32|62->32|66->36|66->36|66->36|68->38|68->38|68->38|69->39|71->41|71->41|71->41|73->43|74->44|85->55|85->55|85->55|88->58|88->58|88->58|89->59|90->60|91->61|95->65|97->67|98->68|98->68|99->69|100->70|100->70|101->71|101->71|101->71|102->72|103->73|103->73|104->74|104->74|105->75|105->75
                  -- GENERATED --
              */
          