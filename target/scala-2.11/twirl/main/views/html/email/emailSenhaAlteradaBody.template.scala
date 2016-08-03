
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailSenhaAlteradaBody_Scope0 {
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

class emailSenhaAlteradaBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario : Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <p>"""),_display_(/*7.9*/Messages("app.hello")),format.raw/*7.30*/(""", """),_display_(/*7.33*/usuario/*7.40*/.getNome),format.raw/*7.48*/("""</p>
    <p>"""),_display_(/*8.9*/Messages("app.send.password.email.change.message")),format.raw/*8.59*/("""</p>
    <br>
    <p>"""),_display_(/*10.9*/Messages("app.best")),format.raw/*10.29*/(""",<br> """),_display_(/*10.36*/Messages("app.title")),format.raw/*10.57*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object emailSenhaAlteradaBody extends emailSenhaAlteradaBody_Scope0.emailSenhaAlteradaBody
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/email/emailSenhaAlteradaBody.scala.html
                  HASH: 87438e8ebe6855c9333018f97b5b2d8c4b61f7cf
                  MATRIX: 786->1|900->20|927->21|1016->85|1057->106|1086->109|1101->116|1129->124|1167->137|1237->187|1285->209|1326->229|1360->236|1402->257
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|38->7|38->7|39->8|39->8|41->10|41->10|41->10|41->10
                  -- GENERATED --
              */
          