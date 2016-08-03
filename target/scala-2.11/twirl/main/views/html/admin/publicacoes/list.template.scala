
package views.html.admin.publicacoes

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Publicacao],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(publicacoes: List[Publicacao])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Publicações")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-12">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Publicações
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.PublicacaoController.telaNovo),format.raw/*7.63*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Título</th>
                            <th>Resumo</th>
                            <th>URL</th>
                        </tr>
                        """),_display_(/*17.26*/for(publicacao <- publicacoes) yield /*17.56*/ {_display_(Seq[Any](format.raw/*17.58*/("""
                            """),format.raw/*18.29*/("""<tr>
                                <td><a href=""""),_display_(/*19.47*/routes/*19.53*/.PublicacaoController.telaDetalhe(publicacao.getId)),format.raw/*19.104*/("""">"""),_display_(/*19.107*/publicacao/*19.117*/.getTitulo),format.raw/*19.127*/("""</a></td>
                                <td>"""),_display_(/*20.38*/publicacao/*20.48*/.getResumo),format.raw/*20.58*/("""</td>
                                <td>"""),_display_(/*21.38*/publicacao/*21.48*/.getUrl),format.raw/*21.55*/("""</td>
                            </tr>
                        """)))}),format.raw/*23.26*/("""
                    """),format.raw/*24.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(publicacoes:List[Publicacao],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(publicacoes)(mensagem)

  def f:((List[Publicacao]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (publicacoes) => (mensagem) => apply(publicacoes)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/publicacoes/list.scala.html
                  HASH: 7ab5a34a1e962b68aa7bda135311a1abfd32cfbd
                  MATRIX: 778->1|923->51|951->54|963->59|1018->106|1057->108|1088->113|1266->265|1280->271|1330->301|1777->721|1823->751|1863->753|1920->782|1998->833|2013->839|2086->890|2117->893|2137->903|2169->913|2243->960|2262->970|2293->980|2363->1023|2382->1033|2410->1040|2506->1105|2555->1126
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|48->17|48->17|48->17|49->18|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24
                  -- GENERATED --
              */
          