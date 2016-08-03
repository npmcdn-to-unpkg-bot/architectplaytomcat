
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sobre_Scope0 {
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

class sobre extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(versaoDoPlay : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Sobre a Biblioteca Digital")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Biblioteca Digital</div>
            <div class="panel-body">
                <a class="btn btn-success">
                    Versão 1.0</a>
                <hr>
                <p>
                    <b>Ferramentas para desenvolvimento utilizadas:</b>
                </p>
                <ul>
                    <li>  <a class="btn btn-xs btn-success">
                        Play Framework """),_display_(/*16.41*/versaoDoPlay),format.raw/*16.53*/("""</a>
                    <li>  Postgresql
                    <li>  Java8
                    <li>  AngularJS
                    <li>  IntelliJ IDEA
                </ul>
                <p><b>Desenvolvido para os navegadores:</b></p>
                <ul>
                    <li> Firefox
                    <li> Chrome
                    <li> Microsoft Edge
                </ul>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(versaoDoPlay:String): play.twirl.api.HtmlFormat.Appendable = apply(versaoDoPlay)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (versaoDoPlay) => apply(versaoDoPlay)

  def ref: this.type = this

}


}

/**/
object sobre extends sobre_Scope0.sobre
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/sobre.scala.html
                  HASH: 131e84abbfa5e0f798a19ad70f1430600c59b3be
                  MATRIX: 751->1|869->24|897->27|909->32|963->78|1002->80|1033->85|1561->586|1594->598
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|47->16|47->16
                  -- GENERATED --
              */
          