
package views.html.admin.livros

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Livro],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livros: List[Livro])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Livros")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Livros
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.LivroController.telaNovo),format.raw/*7.58*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Título</th>
                            <th>Subtítulo</th>
                            <th>Edição</th>
                            <th>ISBN</th>
                            <th>Autor</th>
                            <th>Editora</th>
                        </tr>
                        """),_display_(/*20.26*/for(livro <- livros) yield /*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
                            """),format.raw/*21.29*/("""<tr>
                                <td><a href=""""),_display_(/*22.47*/routes/*22.53*/.LivroController.telaDetalhe(livro.getId)),format.raw/*22.94*/("""">"""),_display_(/*22.97*/livro/*22.102*/.getTitulo),format.raw/*22.112*/("""</a></td>
                                <td>"""),_display_(/*23.38*/livro/*23.43*/.getSubTitulo),format.raw/*23.56*/("""</td>
                                <td>"""),_display_(/*24.38*/livro/*24.43*/.getEdicao),format.raw/*24.53*/("""</td>
                                <td>"""),_display_(/*25.38*/livro/*25.43*/.getIsbn),format.raw/*25.51*/("""</td>
                                <td>"""),_display_(/*26.38*/livro/*26.43*/.getAutores),format.raw/*26.54*/("""</td>
                                <td>"""),_display_(/*27.38*/livro/*27.43*/.getEditora),format.raw/*27.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(livros:List[Livro],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(livros)(mensagem)

  def f:((List[Livro]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (livros) => (mensagem) => apply(livros)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/livros/list.scala.html
                  HASH: 3855fceac655c1b6f63ac9970ec92d392f3627a4
                  MATRIX: 768->1|903->41|931->44|943->49|993->91|1032->93|1063->98|1235->244|1249->250|1294->275|1877->831|1913->851|1953->853|2010->882|2088->933|2103->939|2165->980|2195->983|2210->988|2242->998|2316->1045|2330->1050|2364->1063|2434->1106|2448->1111|2479->1121|2549->1164|2563->1169|2592->1177|2662->1220|2676->1225|2708->1236|2778->1279|2792->1284|2824->1295|2920->1360|2969->1381
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|51->20|51->20|51->20|52->21|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|60->29|61->30
                  -- GENERATED --
              */
          