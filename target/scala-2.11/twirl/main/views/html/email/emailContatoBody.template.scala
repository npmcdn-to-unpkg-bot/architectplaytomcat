
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailContatoBody_Scope0 {
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

class emailContatoBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Contato,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contato:Contato):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <h2>Contato</h2>
    <p>Nome: """),_display_(/*8.15*/contato/*8.22*/.getNome),format.raw/*8.30*/("""</p>
    <p>Email: """),_display_(/*9.16*/contato/*9.23*/.getEmail),format.raw/*9.32*/("""</p>
    <p>Assunto: """),_display_(/*10.18*/contato/*10.25*/.getAssunto),format.raw/*10.36*/("""</p>
    <p>Mensagem: """),_display_(/*11.19*/contato/*11.26*/.getMensagem),format.raw/*11.38*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(contato:Contato): play.twirl.api.HtmlFormat.Appendable = apply(contato)

  def f:((Contato) => play.twirl.api.HtmlFormat.Appendable) = (contato) => apply(contato)

  def ref: this.type = this

}


}

/**/
object emailContatoBody extends emailContatoBody_Scope0.emailContatoBody
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/email/emailContatoBody.scala.html
                  HASH: 73b7d2ab2e9a5b0861ccab80a01fc3e2b7c21f21
                  MATRIX: 774->1|886->18|913->19|1030->110|1045->117|1073->125|1119->145|1134->152|1163->161|1212->183|1228->190|1260->201|1310->224|1326->231|1359->243
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11
                  -- GENERATED --
              */
          