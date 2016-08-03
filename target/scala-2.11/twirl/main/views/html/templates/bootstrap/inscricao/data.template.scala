
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object data_Scope0 {
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

class data extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-4 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-2">
        <div class="input-group date" id=""""),_display_(/*6.44*/field/*6.49*/.id),format.raw/*6.52*/("""">
            <input type="date" class="form-control" name=""""),_display_(/*7.60*/field/*7.65*/.name),format.raw/*7.70*/("""" placeholder=""""),_display_(/*7.86*/placeholder),format.raw/*7.97*/("""" value=""""),_display_(/*7.107*/field/*7.112*/.value.getOrElse("")),format.raw/*7.132*/(""""/>
            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
        </div>
        <span class="help-block">"""),_display_(/*10.35*/{field.error.map { error => error.message }}),format.raw/*10.79*/("""</span>
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
object data extends data_Scope0.data
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/data.scala.html
                  HASH: 1daf2b1e53a3827445e2e77fe9907c16229bfc2e
                  MATRIX: 793->1|967->80|995->82|1045->106|1072->125|1111->127|1151->137|1223->183|1248->188|1353->267|1366->272|1389->275|1477->337|1490->342|1515->347|1557->363|1588->374|1625->384|1639->389|1680->409|1862->564|1927->608
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|41->10|41->10
                  -- GENERATED --
              */
          