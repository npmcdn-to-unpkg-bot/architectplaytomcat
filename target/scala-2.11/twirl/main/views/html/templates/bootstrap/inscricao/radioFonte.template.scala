
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object radioFonte_Scope0 {
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

class radioFonte extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", buttonNameList: List[String], help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-4 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div id=""""),_display_(/*5.15*/(field.id + "s")),format.raw/*5.31*/("""" class="col-sm-8" >
        """),_display_(/*6.10*/for(buttonName <- buttonNameList) yield /*6.43*/ {_display_(Seq[Any](format.raw/*6.45*/("""
            """),format.raw/*7.13*/("""<div class="radio">
                <label>
                    <input
                    type="radio"
                    name=""""),_display_(/*11.28*/field/*11.33*/.name),format.raw/*11.38*/(""""
                    id=""""),_display_(/*12.26*/buttonName),format.raw/*12.36*/(""""
                    value=""""),_display_(/*13.29*/buttonName),format.raw/*13.39*/(""""
                    """),_display_(/*14.22*/if(buttonName == field.value.getOrElse(""))/*14.65*/ {_display_(Seq[Any](format.raw/*14.67*/("""checked""")))}),format.raw/*14.75*/(""" """),format.raw/*14.76*/("""/>
                    """),_display_(/*15.22*/buttonName),format.raw/*15.32*/("""
                """),format.raw/*16.17*/("""</label>
            </div>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""<div class="col-sm-6">
            <input disabled name="observacoes" class="form-control"/>
        </div>
        <div class="col-sm-7">
            <span class="help-block">"""),_display_(/*23.39*/{field.error.map { error => error.message }}),format.raw/*23.83*/("""</span>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,buttonNameList:List[String],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,buttonNameList,help)

  def f:((Field,String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,buttonNameList,help) => apply(field,label,buttonNameList,help)

  def ref: this.type = this

}


}

/**/
object radioFonte extends radioFonte_Scope0.radioFonte
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/radioFonte.scala.html
                  HASH: a74d908deb0d2b79637d2b9eb62d6cac5acfce07
                  MATRIX: 811->1|989->84|1017->86|1067->110|1094->129|1133->131|1173->141|1250->192|1263->197|1286->200|1315->203|1340->208|1389->231|1425->247|1481->277|1529->310|1568->312|1608->325|1766->456|1780->461|1806->466|1860->493|1891->503|1948->533|1979->543|2029->566|2081->609|2121->611|2160->619|2189->620|2240->644|2271->654|2316->671|2384->708|2420->717|2624->894|2689->938
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|42->11|42->11|42->11|43->12|43->12|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|47->16|49->18|50->19|54->23|54->23
                  -- GENERATED --
              */
          