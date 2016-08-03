
package views.html.templates.bootstrap.inscricao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object radio_Scope0 {
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

class radio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

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
                        name=""""),_display_(/*11.32*/field/*11.37*/.name),format.raw/*11.42*/(""""
                        id=""""),_display_(/*12.30*/buttonName),format.raw/*12.40*/(""""
                        value=""""),_display_(/*13.33*/buttonName),format.raw/*13.43*/(""""
                        """),_display_(/*14.26*/if(buttonName == field.value.getOrElse(""))/*14.69*/ {_display_(Seq[Any](format.raw/*14.71*/("""checked""")))}),format.raw/*14.79*/(""" """),format.raw/*14.80*/("""/>
                        """),_display_(/*15.26*/buttonName),format.raw/*15.36*/("""
                """),format.raw/*16.17*/("""</label>
            </div>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""<span class="help-block">"""),_display_(/*19.35*/{field.error.map { error => error.message }}),format.raw/*19.79*/("""</span>
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
object radio extends radio_Scope0.radio
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/bootstrap/inscricao/radio.scala.html
                  HASH: b144aa3e1d1166b0d2aae75f12c9ce022041e065
                  MATRIX: 801->1|979->84|1007->86|1057->110|1084->129|1123->131|1163->141|1240->192|1253->197|1276->200|1305->203|1330->208|1379->231|1415->247|1471->277|1519->310|1558->312|1598->325|1764->464|1778->469|1804->474|1862->505|1893->515|1954->549|1985->559|2039->586|2091->629|2131->631|2170->639|2199->640|2254->668|2285->678|2330->695|2398->732|2434->741|2487->767|2552->811
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|42->11|42->11|42->11|43->12|43->12|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|47->16|49->18|50->19|50->19|50->19
                  -- GENERATED --
              */
          