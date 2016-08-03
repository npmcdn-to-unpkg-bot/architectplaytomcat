
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textoarea_Scope0 {
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

class textoarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "4", label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-6">
        <textarea class="form-control"
        rows=""""),_display_(/*7.16*/rows),format.raw/*7.20*/(""""
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/field/*9.21*/.name),format.raw/*9.26*/(""""
        placeholder=""""),_display_(/*10.23*/placeholder),format.raw/*10.34*/("""">"""),_display_(/*10.37*/field/*10.42*/.value.getOrElse("")),format.raw/*10.62*/("""</textarea>
        <span class="help-block">"""),_display_(/*11.35*/{field.error.map { error => error.message }}),format.raw/*11.79*/("""</span>
    </div>
</div>
"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help) => apply(field,rows,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object textoarea extends textoarea_Scope0.textoarea
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/textoarea.scala.html
                  HASH: 049d9a105dcdd84ec82f63edd4d38c1e05f4d238
                  MATRIX: 800->1|995->100|1023->102|1073->126|1100->145|1139->147|1179->157|1251->203|1276->208|1392->298|1416->302|1457->317|1470->322|1493->325|1536->342|1549->347|1574->352|1625->376|1657->387|1687->390|1701->395|1742->415|1815->461|1880->505
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11
                  -- GENERATED --
              */
          