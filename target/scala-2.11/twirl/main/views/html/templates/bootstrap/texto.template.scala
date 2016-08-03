
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object texto_Scope0 {
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

class texto extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-6">
        <input type="text"
               class="form-control"
               id=""""),_display_(/*8.21*/field/*8.26*/.id),format.raw/*8.29*/(""""
               name=""""),_display_(/*9.23*/field/*9.28*/.name),format.raw/*9.33*/(""""
               value=""""),_display_(/*10.24*/field/*10.29*/.value.getOrElse("")),format.raw/*10.49*/(""""
               placeholder=""""),_display_(/*11.30*/placeholder),format.raw/*11.41*/(""""/>
        <span class="help-block">"""),_display_(/*12.35*/{field.error.map { error => error.message }}),format.raw/*12.79*/("""</span>
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
object texto extends texto_Scope0.texto
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/texto.scala.html
                  HASH: fc504fa184d9305312eb7fa7cc118cc587fb5358
                  MATRIX: 785->1|959->80|987->82|1037->106|1064->125|1103->127|1143->137|1215->183|1240->188|1385->307|1398->312|1421->315|1471->339|1484->344|1509->349|1561->374|1575->379|1616->399|1674->430|1706->441|1771->479|1836->523
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|43->12|43->12
                  -- GENERATED --
              */
          