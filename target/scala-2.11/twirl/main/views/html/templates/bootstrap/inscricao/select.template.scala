
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object select_Scope0 {
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

class select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Map[String, Boolean],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", optionMap: Map[String, Boolean], isMultiple: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-4 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-3">
        <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="">Selecione um país</option>""")))}),format.raw/*11.85*/("""
        """),_display_(/*12.10*/for((optionName, isSelected) <- optionMap) yield /*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
            """),format.raw/*13.13*/("""<option id=""""),_display_(/*13.26*/optionName),format.raw/*13.36*/("""" value=""""),_display_(/*13.46*/optionName),format.raw/*13.56*/("""" """),_display_(/*13.59*/if(optionName == field.value.getOrElse(""))/*13.102*/ {_display_(Seq[Any](format.raw/*13.104*/("""selected""")))}),format.raw/*13.113*/(""">"""),_display_(/*13.115*/optionName),format.raw/*13.125*/("""</option>
        """)))}),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""</select>
        <span class="help-block">"""),_display_(/*16.35*/{field.error.map { error => error.message }}),format.raw/*16.79*/("""</span>
    </div>
</div>
"""))
      }
    }
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isMultiple:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple)

  def f:((Field,String,Map[String, Boolean],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple) => apply(field,label,optionMap,isMultiple)

  def ref: this.type = this

}


}

/**/
object select extends select_Scope0.select
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/select.scala.html
                  HASH: 80f918f9009656b38d1d67966a77e17a5b421db5
                  MATRIX: 812->1|995->89|1023->91|1073->115|1100->134|1139->136|1179->146|1256->197|1269->202|1292->205|1321->208|1346->213|1466->307|1479->312|1502->315|1545->332|1567->346|1597->349|1627->370|1639->375|1668->377|1681->382|1709->388|1747->399|1770->413|1810->415|1861->435|1899->446|1923->461|1963->463|2052->521|2089->531|2147->573|2187->575|2228->588|2268->601|2299->611|2336->621|2367->631|2397->634|2450->677|2491->679|2532->688|2562->690|2594->700|2644->719|2680->728|2751->772|2816->816
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|46->15|47->16|47->16
                  -- GENERATED --
              */
          