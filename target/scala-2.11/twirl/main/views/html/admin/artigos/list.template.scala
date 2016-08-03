
package views.html.admin.artigos

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Artigo],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(artigos: List[Artigo])(mensagem : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Administração - Artigos")/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">Lista de Artigos
                <a href=""""),_display_(/*7.27*/routes/*7.33*/.ArtigoController.telaNovo),format.raw/*7.59*/("""" class="pull-right">Adicionar</a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <tr>
                            <th>Título</th>
                            <th>Resumo</th>
                        </tr>
                        """),_display_(/*16.26*/for(artigo <- artigos) yield /*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
                            """),format.raw/*17.29*/("""<tr>
                                <td><a href=""""),_display_(/*18.47*/routes/*18.53*/.ArtigoController.telaDetalhe(artigo.getId)),format.raw/*18.96*/("""">"""),_display_(/*18.99*/artigo/*18.105*/.getTitulo),format.raw/*18.115*/("""</a></td>
                                <td>"""),_display_(/*19.38*/artigo/*19.44*/.getResumo),format.raw/*19.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*21.26*/("""
                    """),format.raw/*22.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(artigos:List[Artigo],mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(artigos)(mensagem)

  def f:((List[Artigo]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (artigos) => (mensagem) => apply(artigos)(mensagem)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/artigos/list.scala.html
                  HASH: e921892f5419ab40fd05cb72648eb2d129f2386d
                  MATRIX: 770->1|907->43|935->46|947->51|998->94|1037->96|1068->101|1241->248|1255->254|1301->280|1707->659|1745->681|1785->683|1842->712|1920->763|1935->769|1999->812|2029->815|2045->821|2077->831|2151->878|2166->884|2197->894|2293->959|2342->980
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|47->16|47->16|47->16|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|52->21|53->22
                  -- GENERATED --
              */
          