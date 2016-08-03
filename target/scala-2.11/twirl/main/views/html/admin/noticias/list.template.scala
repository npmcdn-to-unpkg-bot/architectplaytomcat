
package views.html.admin.noticias

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Noticia],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noticias: List[Noticia])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Notícias")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Notícias
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.NoticiaController.telaNovo),format.raw/*7.60*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Título</th>
                            <th>Resumo</th>
                            <th>URL</th>
                        </tr>
                        """),_display_(/*17.26*/for(noticia <- noticias) yield /*17.50*/ {_display_(Seq[Any](format.raw/*17.52*/("""
                            """),format.raw/*18.29*/("""<tr>
                                <td><a href=""""),_display_(/*19.47*/routes/*19.53*/.NoticiaController.telaDetalhe(noticia.getId)),format.raw/*19.98*/("""">"""),_display_(/*19.101*/noticia/*19.108*/.getTitulo),format.raw/*19.118*/("""</a></td>
                                <td>"""),_display_(/*20.38*/noticia/*20.45*/.getResumo),format.raw/*20.55*/("""</td>
                                <td>"""),_display_(/*21.38*/noticia/*21.45*/.getUrl),format.raw/*21.52*/("""</td>
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

  def render(noticias:List[Noticia],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(noticias)(mensagem)

  def f:((List[Noticia]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (noticias) => (mensagem) => apply(noticias)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/noticias/list.scala.html
                  HASH: a4639b629323c206a02d048dcdc71009e5d61f3a
                  MATRIX: 772->1|911->45|939->48|951->53|1003->97|1042->99|1073->104|1247->252|1261->258|1308->285|1755->705|1795->729|1835->731|1892->760|1970->811|1985->817|2051->862|2082->865|2099->872|2131->882|2205->929|2221->936|2252->946|2322->989|2338->996|2366->1003|2462->1068|2511->1089
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|48->17|48->17|48->17|49->18|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24
                  -- GENERATED --
              */
          