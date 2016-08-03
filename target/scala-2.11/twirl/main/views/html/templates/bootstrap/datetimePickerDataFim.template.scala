
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object datetimePickerDataFim_Scope0 {
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

class datetimePickerDataFim extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-4">
        <div class="input-group date" id=""""),_display_(/*6.44*/field/*6.49*/.id),format.raw/*6.52*/("""">
            <input
                autocomplete="off"
                type="text"
                class="form-control"
                name="dataFim"
                placeholder=""""),_display_(/*12.31*/placeholder),format.raw/*12.42*/(""""
                value=""""),_display_(/*13.25*/field/*13.30*/.value.getOrElse("")),format.raw/*13.50*/(""""/>
            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
        </div>
        <span class="help-block">"""),_display_(/*16.35*/{field.error.map { error => error.message }}),format.raw/*16.79*/("""</span>
    </div>
</div>
"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object datetimePickerDataFim extends datetimePickerDataFim_Scope0.datetimePickerDataFim
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/datetimePickerDataFim.scala.html
                  HASH: f4ddc5448286dd4d6a6f859c6c3379f2bd3eea5b
                  MATRIX: 817->1|991->80|1019->82|1069->106|1096->125|1135->127|1175->137|1247->183|1272->188|1377->267|1390->272|1413->275|1623->458|1655->469|1708->495|1722->500|1763->520|1945->675|2010->719
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|37->6|37->6|37->6|43->12|43->12|44->13|44->13|44->13|47->16|47->16
                  -- GENERATED --
              */
          