
package views.html.admin.cursos

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Curso],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cursos: List[Curso])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Cursos")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-12">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Cursos
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.CursoController.telaNovo),format.raw/*7.58*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Nome</th>
                            <th>Descrição</th>
                            <th>Data de Início</th>
                            <th>Site</th>
                        </tr>
                        """),_display_(/*18.26*/for(curso <- cursos) yield /*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
                            """),format.raw/*19.29*/("""<tr>
                                <td><a href=""""),_display_(/*20.47*/routes/*20.53*/.CursoController.telaDetalhe(curso.getId)),format.raw/*20.94*/("""">"""),_display_(/*20.97*/curso/*20.102*/.getNome),format.raw/*20.110*/("""</a></td>
                                <td>"""),_display_(/*21.38*/curso/*21.43*/.getDescricao),format.raw/*21.56*/("""</td>
                                <td>"""),_display_(/*22.38*/curso/*22.43*/.getDataInicio.format("dd MMMM yyyy")),format.raw/*22.80*/("""</td>
                                <td>"""),_display_(/*23.38*/curso/*23.43*/.getSite),format.raw/*23.51*/("""</td>
                            </tr>
                        """)))}),format.raw/*25.26*/("""
                    """),format.raw/*26.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(cursos:List[Curso],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(cursos)(mensagem)

  def f:((List[Curso]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (cursos) => (mensagem) => apply(cursos)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/cursos/list.scala.html
                  HASH: 2cfa755ceba9f2ec822bdf763e40d124cabf1ca1
                  MATRIX: 768->1|903->41|931->44|943->49|993->91|1032->93|1063->98|1236->245|1250->251|1295->276|1796->750|1832->770|1872->772|1929->801|2007->852|2022->858|2084->899|2114->902|2129->907|2159->915|2233->962|2247->967|2281->980|2351->1023|2365->1028|2423->1065|2493->1108|2507->1113|2536->1121|2632->1186|2681->1207
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|57->26
                  -- GENERATED --
              */
          