
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailBody_Scope0 {
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

class emailBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario:Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <table bgcolor="#f58634" width="100%" border="0" cellspacing="0" cellpadding="0" style="min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px">
        <tbody>
            <tr>
                <td height="72px" colspan="3"></td>
            </tr>
            <tr>
                <td width="32px"></td>
                <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25">"""),_display_(/*14.130*/Messages("app.welcome.message")),format.raw/*14.161*/("""</td>
                <td width="32px"></td>
            </tr>
            <tr>
                <td height="18px" colspan="3"></td>
            </tr>
        </tbody>
    </table>
    <br>
    <table bgcolor="#FAFAFA" width="100%" border="0" cellspacing="0" cellpadding="0" style="min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px">
        <tbody>
            <tr height="16px"><td width="32px" rowspan="3"></td><td></td><td width="32px" rowspan="3"></td>
            </tr><tr><td>
                <table style="min-width:300px" border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                        <tr>
                            <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">"""),_display_(/*30.141*/Messages("app.hello")),format.raw/*30.162*/(""", """),_display_(/*30.165*/usuario/*30.172*/.getNome),format.raw/*30.180*/("""</td>
                        </tr>
                        <tr>
                            <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">
                                """),_display_(/*34.34*/Messages("app.send.register.email.message")),format.raw/*34.77*/("""
                                """),format.raw/*35.33*/("""<p>"""),_display_(/*35.37*/Messages("login")),format.raw/*35.54*/(""": <b>"""),_display_(/*35.60*/usuario/*35.67*/.getEmail),format.raw/*35.76*/("""</b></p>
                                <table border="0" cellspacing="0" cellpadding="0" style="margin-top:48px;margin-bottom:48px">
                                    <tbody>
                                        <tr>
                                            <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">
                                                <p>"""),_display_(/*40.53*/Messages("app.best")),format.raw/*40.73*/(""",<br> """),_display_(/*40.80*/Messages("app.title")),format.raw/*40.101*/("""</p>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                </table>
            </td>
            </tr>
        </tbody>
        <br>
    </table>
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
object emailBody extends emailBody_Scope0.emailBody
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/email/emailBody.scala.html
                  HASH: 5d101dc6026404a3590b92b6cdf5be2c5fc0f8c6
                  MATRIX: 760->1|872->18|899->19|1493->585|1546->616|2458->1500|2501->1521|2532->1524|2549->1531|2579->1539|2844->1777|2908->1820|2969->1853|3000->1857|3038->1874|3071->1880|3087->1887|3117->1896|3576->2328|3617->2348|3651->2355|3694->2376
                  LINES: 27->1|32->1|33->2|45->14|45->14|61->30|61->30|61->30|61->30|61->30|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|71->40|71->40|71->40|71->40
                  -- GENERATED --
              */
          