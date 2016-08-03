
package views.html.admin.noticias

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Noticia,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noticia: Noticia):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe da Notícia")/*5.61*/ {_display_(Seq[Any](format.raw/*5.63*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe da Notícia
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.NoticiaController.telaLista),format.raw/*14.73*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.NoticiaController.telaEditar(noticia.getId)),format.raw/*15.89*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Título</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/noticia/*24.72*/.getTitulo),format.raw/*24.82*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Descrição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/noticia/*28.72*/.getResumo),format.raw/*28.82*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">URL</label>
                    <p><a target="_blank" href=""""),_display_(/*32.50*/noticia/*32.57*/.getUrl),format.raw/*32.64*/("""" class="display-block margin-left-027em">"""),_display_(/*32.107*/noticia/*32.114*/.getUrl),format.raw/*32.121*/("""</a></p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data/Hora de Cadastro</label>
                    <p type="date" class="display-block margin-left-027em">"""),_display_(/*36.77*/noticia/*36.84*/.getDataCadastro.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*36.134*/("""</p>
                </div>
                """),_display_(/*38.18*/if(noticia.getDataAlteracao != null)/*38.54*/{_display_(Seq[Any](format.raw/*38.55*/("""
                    """),format.raw/*39.21*/("""<div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Alteração</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*41.69*/noticia/*41.76*/.getDataAlteracao.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*41.127*/("""</p>
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
                    <p class="text-center">Deseja remover a notícia <b>""""),_display_(/*55.74*/noticia/*55.81*/.getTitulo),format.raw/*55.91*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                """),_display_(/*58.18*/form(routes.NoticiaController.remover(noticia.getId))/*58.71*/ {_display_(Seq[Any](format.raw/*58.73*/("""
                    """),format.raw/*59.21*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*65.2*/("""

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

  def render(noticia:Noticia): play.twirl.api.HtmlFormat.Appendable = apply(noticia)

  def f:((Noticia) => play.twirl.api.HtmlFormat.Appendable) = (noticia) => apply(noticia)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/noticias/detail.scala.html
                  HASH: 7ae477301561eda9cd3a7076af75106fd8377ada
                  MATRIX: 763->1|891->19|919->38|946->40|958->45|1020->99|1059->101|1090->106|1621->610|1636->616|1685->644|1768->700|1783->706|1848->750|2378->1253|2394->1260|2425->1270|2685->1503|2701->1510|2732->1520|2971->1732|2987->1739|3015->1746|3086->1789|3103->1796|3132->1803|3420->2064|3436->2071|3508->2121|3580->2166|3625->2202|3664->2203|3713->2224|3950->2434|3966->2441|4039->2492|4119->2541|4160->2554|4793->3160|4809->3167|4840->3177|4961->3271|5023->3324|5063->3326|5112->3347|5226->3430|5271->3447|5401->3547|5430->3549|5530->3621|5559->3622|5595->3631|5724->3732|5753->3733|5794->3746|5884->3808|5913->3809|5958->3826|6025->3865|6054->3866|6090->3875|6119->3876|6151->3881|6179->3882
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|62->32|62->32|62->32|66->36|66->36|66->36|68->38|68->38|68->38|69->39|71->41|71->41|71->41|73->43|74->44|85->55|85->55|85->55|88->58|88->58|88->58|89->59|90->60|91->61|95->65|97->67|98->68|98->68|99->69|100->70|100->70|101->71|101->71|101->71|102->72|103->73|103->73|104->74|104->74|105->75|105->75
                  -- GENERATED --
              */
          