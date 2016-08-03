
package views.html.admin.livros

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Livro,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livro: Livro):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Livro")/*5.59*/ {_display_(Seq[Any](format.raw/*5.61*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Livro
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.LivroController.telaLista),format.raw/*14.71*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.LivroController.telaEditar(livro.getId)),format.raw/*15.85*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Título</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/livro/*24.70*/.getTitulo),format.raw/*24.80*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Subtitulo</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/livro/*28.70*/.getSubTitulo),format.raw/*28.83*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Edição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*32.65*/livro/*32.70*/.getEdicao),format.raw/*32.80*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Páginas</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*36.65*/livro/*36.70*/.getPaginas),format.raw/*36.81*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Ano</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*40.65*/livro/*40.70*/.getAno),format.raw/*40.77*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">ISBN</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*44.65*/livro/*44.70*/.getIsbn),format.raw/*44.78*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Editora</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*48.65*/livro/*48.70*/.getEditora),format.raw/*48.81*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Autores</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*52.65*/livro/*52.70*/.getAutores),format.raw/*52.81*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data/Hora de Cadastro</label>
                    <p type="date" class="display-block margin-left-027em">"""),_display_(/*56.77*/livro/*56.82*/.getDataCadastro.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*56.132*/("""</p>
                </div>
                """),_display_(/*58.18*/if(livro.getDataAlteracao != null)/*58.52*/{_display_(Seq[Any](format.raw/*58.53*/("""
                    """),format.raw/*59.21*/("""<div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Alteração</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*61.69*/livro/*61.74*/.getDataAlteracao.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*61.125*/("""</p>
                    </div>
                """)))}),format.raw/*63.18*/("""
            """),format.raw/*64.13*/("""</div>
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
                    <p class="text-center">Deseja remover o livro <b>""""),_display_(/*75.72*/livro/*75.77*/.getTitulo),format.raw/*75.87*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                    """),_display_(/*78.22*/form(routes.LivroController.remover(livro.getId))/*78.71*/ {_display_(Seq[Any](format.raw/*78.73*/("""
                        """),format.raw/*79.25*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*80.22*/("""
                """),format.raw/*81.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*85.2*/("""

"""),format.raw/*87.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*88.41*/("""{"""),format.raw/*88.42*/("""
        """),format.raw/*89.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*90.49*/("""{"""),format.raw/*90.50*/("""
            """),format.raw/*91.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*91.75*/("""{"""),format.raw/*91.76*/("""
                """),format.raw/*92.17*/("""inputs[i].disabled = true;
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/(""";
</script>"""))
      }
    }
  }

  def render(livro:Livro): play.twirl.api.HtmlFormat.Appendable = apply(livro)

  def f:((Livro) => play.twirl.api.HtmlFormat.Appendable) = (livro) => apply(livro)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/livros/detail.scala.html
                  HASH: 87e64261501106fba9da9d5a49a61900248d34a2
                  MATRIX: 759->1|883->15|911->34|938->36|950->41|1010->93|1049->95|1080->100|1609->602|1624->608|1671->634|1754->690|1769->696|1830->736|2360->1239|2374->1244|2405->1254|2665->1487|2679->1492|2713->1505|2970->1735|2984->1740|3015->1750|3273->1981|3287->1986|3319->1997|3573->2224|3587->2229|3615->2236|3870->2464|3884->2469|3913->2477|4171->2708|4185->2713|4217->2724|4475->2955|4489->2960|4521->2971|4805->3228|4819->3233|4891->3283|4963->3328|5006->3362|5045->3363|5094->3384|5331->3594|5345->3599|5418->3650|5498->3699|5539->3712|6170->4316|6184->4321|6215->4331|6340->4429|6398->4478|6438->4480|6491->4505|6605->4588|6650->4605|6780->4705|6809->4707|6909->4779|6938->4780|6974->4789|7103->4890|7132->4891|7173->4904|7263->4966|7292->4967|7337->4984|7404->5023|7433->5024|7469->5033|7498->5034|7530->5039|7558->5040
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|66->36|66->36|66->36|70->40|70->40|70->40|74->44|74->44|74->44|78->48|78->48|78->48|82->52|82->52|82->52|86->56|86->56|86->56|88->58|88->58|88->58|89->59|91->61|91->61|91->61|93->63|94->64|105->75|105->75|105->75|108->78|108->78|108->78|109->79|110->80|111->81|115->85|117->87|118->88|118->88|119->89|120->90|120->90|121->91|121->91|121->91|122->92|123->93|123->93|124->94|124->94|125->95|125->95
                  -- GENERATED --
              */
          