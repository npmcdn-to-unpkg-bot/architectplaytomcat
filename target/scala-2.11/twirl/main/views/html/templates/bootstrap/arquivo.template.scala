
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object arquivo_Scope0 {
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

class arquivo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-6">
        <input type="file" name="arquivo" class="form-control" required>
        <span class="help-block">"""),_display_(/*7.35*/{field.error.map { error => error.message }}),format.raw/*7.79*/("""</span>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object arquivo extends arquivo_Scope0.arquivo
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/arquivo.scala.html
                  HASH: c3f31386459a79f91126c6b9dfb8c7577135a023
                  MATRIX: 789->1|963->80|991->82|1041->106|1068->125|1107->127|1147->137|1219->183|1244->188|1413->331|1477->375
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|38->7|38->7
                  -- GENERATED --
              */
          