
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profissao_Scope0 {
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

class profissao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-4 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-3">
        <input type="text"
            class="form-control"
            id=""""),_display_(/*8.18*/field/*8.23*/.id),format.raw/*8.26*/(""""
            name=""""),_display_(/*9.20*/field/*9.25*/.name),format.raw/*9.30*/(""""
            value=""""),_display_(/*10.21*/field/*10.26*/.value.getOrElse("")),format.raw/*10.46*/(""""
            placeholder=""""),_display_(/*11.27*/placeholder),format.raw/*11.38*/(""""/>
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
object profissao extends profissao_Scope0.profissao
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/profissao.scala.html
                  HASH: 15634483c27da3e6f1d5f9a0115a748a92ad807f
                  MATRIX: 803->1|977->80|1005->82|1055->106|1082->125|1121->127|1161->137|1233->183|1258->188|1397->301|1410->306|1433->309|1480->330|1493->335|1518->340|1567->362|1581->367|1622->387|1677->415|1709->426|1774->464|1839->508
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|43->12|43->12
                  -- GENERATED --
              */
          