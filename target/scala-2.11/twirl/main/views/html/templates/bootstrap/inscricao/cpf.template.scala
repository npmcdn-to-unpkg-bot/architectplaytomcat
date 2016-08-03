
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cpf_Scope0 {
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

class cpf extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-4 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-2">
        <input type="text"
            maxlength="15"
            class="form-control"
            id=""""),_display_(/*9.18*/field/*9.23*/.id),format.raw/*9.26*/(""""
            name=""""),_display_(/*10.20*/field/*10.25*/.name),format.raw/*10.30*/(""""
            value=""""),_display_(/*11.21*/field/*11.26*/.value.getOrElse("")),format.raw/*11.46*/(""""
            placeholder=""""),_display_(/*12.27*/placeholder),format.raw/*12.38*/(""""/>
        <span class="help-block">"""),_display_(/*13.35*/{field.error.map { error => error.message }}),format.raw/*13.79*/("""</span>
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
object cpf extends cpf_Scope0.cpf
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/cpf.scala.html
                  HASH: d3c754578abc0f908c8e321c9950fbe51b0d613e
                  MATRIX: 791->1|965->80|993->82|1043->106|1070->125|1109->127|1149->137|1221->183|1246->188|1412->328|1425->333|1448->336|1496->357|1510->362|1536->367|1585->389|1599->394|1640->414|1695->442|1727->453|1792->491|1857->535
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          