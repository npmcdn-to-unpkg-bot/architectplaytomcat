
package views.html.templates.bootstrap

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
  def apply/*1.2*/(field: Field, label:String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
        <input
        type="password"
        class="form-control"
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        name=""""),_display_(/*10.16*/field/*10.21*/.name),format.raw/*10.26*/(""""
        value=""""),_display_(/*11.17*/field/*11.22*/.value.getOrElse("")),format.raw/*11.42*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/("""" />
        <span class="help-block">"""),_display_(/*13.35*/help),format.raw/*13.39*/("""</span>
        <span class="help-block">"""),_display_(/*14.35*/{field.error.map { error => error.message }}),format.raw/*14.79*/("""</span>
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
object senha extends senha_Scope0.senha
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/senha.scala.html
                  HASH: 451d36ea2e5a74e982307a32126065ba9b90bca1
                  MATRIX: 785->1|966->87|994->89|1044->113|1071->132|1110->134|1150->144|1222->190|1247->195|1391->313|1404->318|1427->321|1471->338|1485->343|1511->348|1556->366|1570->371|1611->391|1662->415|1694->426|1760->465|1785->469|1854->511|1919->555
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13|45->14|45->14
                  -- GENERATED --
              */
          