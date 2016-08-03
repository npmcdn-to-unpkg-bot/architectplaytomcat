
package views.html.admin.usuarios

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Administração - Detalhe do Usuário")/*5.61*/ {_display_(Seq[Any](format.raw/*5.63*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Detalhe do Usuário
                <div class="btn-group pull-right">
                    <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Opções <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(/*14.39*/routes/*14.45*/.UsuarioController.telaLista),format.raw/*14.73*/("""">Voltar</a></li>
                        <li><a href=""""),_display_(/*15.39*/routes/*15.45*/.UsuarioController.telaEditar(usuario.getId)),format.raw/*15.89*/("""">Editar</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                    </ul>
                </div>
            </div>
            <div class="panel-body">
                <form>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Nome</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*25.69*/usuario/*25.76*/.getNome),format.raw/*25.84*/("""</p>
                    </div>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Email</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*29.69*/usuario/*29.76*/.getEmail),format.raw/*29.85*/("""</p>
                    </div>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Confirmado</label>
                        """),_display_(/*33.26*/if(usuario.getValidado)/*33.49*/ {_display_(Seq[Any](format.raw/*33.51*/("""
                            """),format.raw/*34.29*/("""<p class="display-block margin-left-027em">Sim</p>
                        """)))}),format.raw/*35.26*/("""
                        """),_display_(/*36.26*/if(!usuario.getValidado)/*36.50*/ {_display_(Seq[Any](format.raw/*36.52*/("""
                            """),format.raw/*37.29*/("""<p class="display-block margin-left-027em">Não</p>
                        """)))}),format.raw/*38.26*/("""
                    """),format.raw/*39.21*/("""</div>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Cadastro</label>
                        <p type="date" class="display-block margin-left-027em">"""),_display_(/*42.81*/usuario/*42.88*/.getDataCadastro.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*42.138*/("""</p>
                    </div>
                    """),_display_(/*44.22*/if(usuario.getDataAlteracao != null)/*44.58*/{_display_(Seq[Any](format.raw/*44.59*/("""
                        """),format.raw/*45.25*/("""<div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Data/Hora de Alteração</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*47.73*/usuario/*47.80*/.getDataAlteracao.format("dd MMMM yyyy - hh:mm:ss")),format.raw/*47.131*/("""</p>
                        </div>
                    """)))}),format.raw/*49.22*/("""
                """),format.raw/*50.17*/("""</form>
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
                        <p class="text-center">Deseja remover o usuário <b>""""),_display_(/*61.78*/usuario/*61.85*/.getNome),format.raw/*61.93*/(""""</b>?</p>
                    </div>
                    <div class="modal-footer">
                        """),_display_(/*64.26*/form(routes.UsuarioController.remover(usuario.getId))/*64.79*/ {_display_(Seq[Any](format.raw/*64.81*/("""
                            """),format.raw/*65.29*/("""<input type="submit" value="Remover" class="btn btn-warning">
                        """)))}),format.raw/*66.26*/("""
                    """),format.raw/*67.21*/("""</div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/usuarios/detail.scala.html
                  HASH: deaaeea9a6b8947f538d3a684ad1900cf6cca5b6
                  MATRIX: 763->1|891->19|919->38|946->40|958->45|1020->99|1059->101|1090->106|1621->610|1636->616|1685->644|1768->700|1783->706|1848->750|2411->1286|2427->1293|2456->1301|2728->1546|2744->1553|2774->1562|3008->1769|3040->1792|3080->1794|3137->1823|3244->1899|3297->1925|3330->1949|3370->1951|3427->1980|3534->2056|3583->2077|3858->2325|3874->2332|3946->2382|4026->2435|4071->2471|4110->2472|4163->2497|4408->2715|4424->2722|4497->2773|4585->2830|4630->2847|5308->3498|5324->3505|5353->3513|5490->3623|5552->3676|5592->3678|5649->3707|5767->3794|5816->3815
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|55->25|55->25|55->25|59->29|59->29|59->29|63->33|63->33|63->33|64->34|65->35|66->36|66->36|66->36|67->37|68->38|69->39|72->42|72->42|72->42|74->44|74->44|74->44|75->45|77->47|77->47|77->47|79->49|80->50|91->61|91->61|91->61|94->64|94->64|94->64|95->65|96->66|97->67
                  -- GENERATED --
              */
          