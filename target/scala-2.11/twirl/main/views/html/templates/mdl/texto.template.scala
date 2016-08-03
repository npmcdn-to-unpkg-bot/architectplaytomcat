
package views.html.templates.mdl

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

"""),format.raw/*3.1*/("""<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
    <input class="mdl-textfield__input"
        maxlength="60"
        type="text"
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
object texto extends texto_Scope0.texto
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/templates/mdl/texto.scala.html
                  HASH: b69e08146ed466d4e01cc89b2b89caca8ecf692f
                  MATRIX: 779->1|953->80|981->82|1178->253|1191->258|1214->261|1257->278|1270->283|1295->288|1339->306|1352->311|1392->331|1469->381|1483->386|1509->391|1539->394|1565->399
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10
                  -- GENERATED --
              */
          