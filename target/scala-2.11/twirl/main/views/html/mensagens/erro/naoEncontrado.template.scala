
package views.html.mensagens.erro

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object naoEncontrado_Scope0 {
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

class naoEncontrado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(titulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.126*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*10.102*/("""">
    <title>"""),_display_(/*11.13*/Messages("app.title")),format.raw/*11.34*/(""" """),format.raw/*11.35*/("""- """),_display_(/*11.38*/Messages("app.error.found")),format.raw/*11.65*/("""</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">"""),_display_(/*18.49*/Messages("app.title")),format.raw/*18.70*/("""
                        """),format.raw/*19.25*/("""<a href=""""),_display_(/*19.35*/routes/*19.41*/.Application.index),format.raw/*19.59*/("""" class="pull-right">"""),_display_(/*19.81*/Messages("menu.1")),format.raw/*19.99*/("""</a>
                    </div>
                    <div class="panel-body">
                        <p class="mensagem alert alert-danger text-center">"""),_display_(/*22.77*/Messages("app.404")),format.raw/*22.96*/(""" """),format.raw/*22.97*/("""-> <b>""""),_display_(/*22.105*/titulo),format.raw/*22.111*/(""""</b></p>
                    </div>
                    <div class="panel-footer">
                        <p class="text-center">&copy; 2016 CIBiogás</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*32.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*33.93*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(titulo:String): play.twirl.api.HtmlFormat.Appendable = apply(titulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (titulo) => apply(titulo)

  def ref: this.type = this

}


}

/**/
object naoEncontrado extends naoEncontrado_Scope0.naoEncontrado
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:38 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/mensagens/erro/naoEncontrado.scala.html
                  HASH: 4e309509a6a96debeb68a8045fc90aeb9d83f2c7
                  MATRIX: 776->1|887->17|914->18|1184->262|1198->268|1258->307|1336->359|1350->365|1441->435|1520->487|1535->493|1603->539|1645->554|1687->575|1716->576|1746->579|1794->606|2039->824|2081->845|2134->870|2171->880|2186->886|2225->904|2274->926|2313->944|2493->1097|2533->1116|2562->1117|2598->1125|2626->1131|2923->1401|2938->1407|3018->1466|3098->1519|3113->1525|3202->1593
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|53->22|53->22|53->22|53->22|53->22|63->32|63->32|63->32|64->33|64->33|64->33
                  -- GENERATED --
              */
          