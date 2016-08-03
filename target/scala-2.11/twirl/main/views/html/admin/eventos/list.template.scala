
package views.html.admin.eventos

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Evento],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(eventos: List[Evento])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Eventos")/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-9">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Eventos
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.EventoController.telaNovo),format.raw/*7.59*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Nome</th>
                            <th>Data de Início</th>
                            <th>Data de Término</th>
                            <th>Site</th>
                            <th>Local</th>
                        </tr>
                        """),_display_(/*19.26*/for(evento <- eventos) yield /*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
                            """),format.raw/*20.29*/("""<tr>
                                <td><a href=""""),_display_(/*21.47*/routes/*21.53*/.EventoController.telaDetalhe(evento.getId)),format.raw/*21.96*/("""">"""),_display_(/*21.99*/evento/*21.105*/.getNome),format.raw/*21.113*/("""</a></td>
                                <td>"""),_display_(/*22.38*/evento/*22.44*/.getDataInicio.format("dd MMMM yyyy")),format.raw/*22.81*/("""</td>
                                <td>"""),_display_(/*23.38*/evento/*23.44*/.getDataFim.format("dd MMMM yyyy")),format.raw/*23.78*/("""</td>
                                <td>"""),_display_(/*24.38*/evento/*24.44*/.getSite),format.raw/*24.52*/("""</td>
                                <td>"""),_display_(/*25.38*/evento/*25.44*/.getLocal),format.raw/*25.53*/("""</td>
                            </tr>
                        """)))}),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(eventos:List[Evento],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(eventos)(mensagem)

  def f:((List[Evento]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (eventos) => (mensagem) => apply(eventos)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/eventos/list.scala.html
                  HASH: 251049a56a7af12ba4b665ed667542c0425bf89a
                  MATRIX: 770->1|907->43|935->46|947->51|998->94|1037->96|1068->101|1241->248|1255->254|1301->280|1851->803|1889->825|1929->827|1986->856|2064->907|2079->913|2143->956|2173->959|2189->965|2219->973|2293->1020|2308->1026|2366->1063|2436->1106|2451->1112|2506->1146|2576->1189|2591->1195|2620->1203|2690->1246|2705->1252|2735->1261|2831->1326|2880->1347
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28
                  -- GENERATED --
              */
          