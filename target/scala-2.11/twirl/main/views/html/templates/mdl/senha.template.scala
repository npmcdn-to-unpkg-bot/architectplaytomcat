
package views.html.templates.mdl

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object senha_Scope0 {
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

class senha extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <input class="mdl-textfield__input"
        maxlength="60"
        type="password"
        id=""""),_display_(/*7.14*/field/*7.19*/.id),format.raw/*7.22*/(""""
        name=""""),_display_(/*8.16*/field/*8.21*/.name),format.raw/*8.26*/(""""
        value=""""),_display_(/*9.17*/field/*9.22*/.value.getOrElse("")),format.raw/*9.42*/(""""/>
    <label class="mdl-textfield__label" for=""""),_display_(/*10.47*/field/*10.52*/.name),format.raw/*10.57*/("""">"""),_display_(/*10.60*/label),format.raw/*10.65*/("""</label>
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
object senha extends senha_Scope0.senha
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/mdl/senha.scala.html
                  HASH: c007dd3a3b46eec8fa56d2ac69cc7eb7aa0d69e5
                  MATRIX: 779->1|953->80|981->82|1182->257|1195->262|1218->265|1261->282|1274->287|1299->292|1343->310|1356->315|1396->335|1473->385|1487->390|1513->395|1543->398|1569->403
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10
                  -- GENERATED --
              */
          