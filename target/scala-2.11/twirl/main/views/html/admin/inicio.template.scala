
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inicio_Scope0 {
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

class inicio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Biblioteca - Administração")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""

  """),format.raw/*5.3*/("""<div class="col-lg-6">
    <div class="jumbotron">
      <h1>Início</h1>
      <p>Bem vindo: """),_display_(/*8.22*/username),format.raw/*8.30*/("""</p>
      <p>Administração de Materiais da Biblioteca Digital</p>
      <p><a class="btn btn-primary btn-lg" href="" role="button">Mais informações</a></p>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object inicio extends inicio_Scope0.inicio
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/inicio.scala.html
                  HASH: cc7d6c8945d2780cdc3e407bd585b9a20f6117ba
                  MATRIX: 753->1|866->19|894->22|906->27|960->73|999->75|1029->79|1149->173|1177->181
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|39->8|39->8
                  -- GENERATED --
              */
          