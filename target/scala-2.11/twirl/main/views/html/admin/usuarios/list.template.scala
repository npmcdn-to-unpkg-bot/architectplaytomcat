
package views.html.admin.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Usuario],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios: List[Usuario])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Usuários")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Usuários</div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Nome</th>
                            <th>Email</th>
                        </tr>
                        """),_display_(/*14.26*/for(usuario <- usuarios) yield /*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
                            """),format.raw/*15.29*/("""<tr>
                                <td><a href=""""),_display_(/*16.47*/routes/*16.53*/.UsuarioController.telaDetalhe(usuario.getId())),format.raw/*16.100*/("""">"""),_display_(/*16.103*/usuario/*16.110*/.getNome),format.raw/*16.118*/("""</a></td>
                                <td>"""),_display_(/*17.38*/usuario/*17.45*/.getEmail),format.raw/*17.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*19.26*/("""
                    """),format.raw/*20.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(usuarios:List[Usuario],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)(mensagem)

  def f:((List[Usuario]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => (mensagem) => apply(usuarios)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/usuarios/list.scala.html
                  HASH: 5714d95addf30c94a6410fdfc50f8fc48b157813
                  MATRIX: 772->1|911->45|939->48|951->53|1003->97|1042->99|1073->104|1550->554|1590->578|1630->580|1687->609|1765->660|1780->666|1849->713|1880->716|1897->723|1927->731|2001->778|2017->785|2047->794|2143->859|2192->880
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|45->14|45->14|45->14|46->15|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20
                  -- GENERATED --
              */
          