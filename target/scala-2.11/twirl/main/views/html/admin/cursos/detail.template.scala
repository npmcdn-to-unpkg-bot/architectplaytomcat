
package views.html.admin.cursos

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Curso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(curso: Curso):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Curso")/*5.59*/ {_display_(Seq[Any](format.raw/*5.61*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Curso
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.CursoController.telaLista),format.raw/*14.71*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.CursoController.telaEditar(curso.getId)),format.raw/*15.85*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Nome</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*24.65*/curso/*24.70*/.getNome),format.raw/*24.78*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Descrição</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*28.65*/curso/*28.70*/.getDescricao),format.raw/*28.83*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Data de Início</label>
                    <p class="display-block margin-left-027em">"""),_display_(/*32.65*/curso/*32.70*/.getDataInicio.format("dd MMMM yyyy")),format.raw/*32.107*/("""</p>
                </div>
                <div class="item-form width-600 margin-bottom-15">
                    <label class="display-block strong">Site</label>
                    <p><a target="_blank" href=""""),_display_(/*36.50*/curso/*36.55*/.getSite),format.raw/*36.63*/("""" class="display-block margin-left-027em">"""),_display_(/*36.106*/curso/*36.111*/.getSite),format.raw/*36.119*/("""</a></p>
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
                    <p class="text-center">Deseja remover o curso <b>""""),_display_(/*49.72*/curso/*49.77*/.getNome),format.raw/*49.85*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                    """),_display_(/*52.22*/form(routes.CursoController.remover(curso.getId))/*52.71*/ {_display_(Seq[Any](format.raw/*52.73*/("""
                        """),format.raw/*53.25*/("""<input type="submit" value="Remover" class="btn btn-warning">
                    """)))}),format.raw/*54.22*/("""
                """),format.raw/*55.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""<script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*62.45*/("""{"""),format.raw/*62.46*/("""
            """),format.raw/*63.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*64.53*/("""{"""),format.raw/*64.54*/("""
                """),format.raw/*65.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*65.79*/("""{"""),format.raw/*65.80*/("""
                    """),format.raw/*66.21*/("""inputs[i].disabled = true;
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/("""
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""";
</script>"""))
      }
    }
  }

  def render(curso:Curso): play.twirl.api.HtmlFormat.Appendable = apply(curso)

  def f:((Curso) => play.twirl.api.HtmlFormat.Appendable) = (curso) => apply(curso)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/cursos/detail.scala.html
                  HASH: 3769c9d8caefb2ee3eaf0c96d5cd9e3c36eb92a5
                  MATRIX: 759->1|883->15|911->34|938->36|950->41|1010->93|1049->95|1080->100|1609->602|1624->608|1671->634|1754->690|1769->696|1830->736|2358->1237|2372->1242|2401->1250|2661->1483|2675->1488|2709->1501|2974->1739|2988->1744|3047->1781|3287->1994|3301->1999|3330->2007|3401->2050|3416->2055|3446->2063|4121->2711|4135->2716|4164->2724|4289->2822|4347->2871|4387->2873|4440->2898|4554->2981|4599->2998|4729->3098|4758->3100|4862->3176|4891->3177|4932->3190|5065->3295|5094->3296|5139->3313|5229->3375|5258->3376|5307->3397|5378->3440|5407->3441|5448->3454|5477->3455|5513->3464|5542->3465
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|54->24|54->24|54->24|58->28|58->28|58->28|62->32|62->32|62->32|66->36|66->36|66->36|66->36|66->36|66->36|79->49|79->49|79->49|82->52|82->52|82->52|83->53|84->54|85->55|89->59|91->61|92->62|92->62|93->63|94->64|94->64|95->65|95->65|95->65|96->66|97->67|97->67|98->68|98->68|99->69|99->69
                  -- GENERATED --
              */
          