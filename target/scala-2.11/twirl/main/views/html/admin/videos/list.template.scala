
package views.html.admin.videos

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Video],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(videos: List[Video])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Vídeos")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-12">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Vídeos
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.VideoController.telaNovo),format.raw/*7.58*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Título</th>
                            <th>Descrição</th>
                            <th>Url</th>
                        </tr>
                        """),_display_(/*17.26*/for(video <- videos) yield /*17.46*/ {_display_(Seq[Any](format.raw/*17.48*/("""
                            """),format.raw/*18.29*/("""<tr>
                                <td><a href=""""),_display_(/*19.47*/routes/*19.53*/.VideoController.telaDetalhe(video.getId)),format.raw/*19.94*/("""">"""),_display_(/*19.97*/video/*19.102*/.getTitulo),format.raw/*19.112*/("""</a></td>
                                <td>"""),_display_(/*20.38*/video/*20.43*/.getDescricao),format.raw/*20.56*/("""</td>
                                <td>"""),_display_(/*21.38*/video/*21.43*/.getUrl),format.raw/*21.50*/("""</td>
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

  def render(videos:List[Video],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(videos)(mensagem)

  def f:((List[Video]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (videos) => (mensagem) => apply(videos)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/videos/list.scala.html
                  HASH: 6df01054774291286453fc7a78f38f2e7512b6bd
                  MATRIX: 768->1|903->41|931->44|943->49|993->91|1032->93|1063->98|1236->245|1250->251|1295->276|1745->699|1781->719|1821->721|1878->750|1956->801|1971->807|2033->848|2063->851|2078->856|2110->866|2184->913|2198->918|2232->931|2302->974|2316->979|2344->986|2440->1051|2489->1072
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|48->17|48->17|48->17|49->18|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24
                  -- GENERATED --
              */
          