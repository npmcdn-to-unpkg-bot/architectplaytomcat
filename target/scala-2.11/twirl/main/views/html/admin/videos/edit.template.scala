
package views.html.admin.videos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.VideoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, videoForm: play.data.Form[views.validators.VideoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Vídeo")/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Vídeo</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.VideoController.editar(id), 'class -> "form-horizontal", 'id -> "videoForm")/*11.102*/ {_display_(Seq[Any](format.raw/*11.104*/("""

                """),_display_(/*13.18*/if(videoForm.hasGlobalErrors)/*13.47*/ {_display_(Seq[Any](format.raw/*13.49*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/videoForm/*17.81*/.globalError.message),format.raw/*17.101*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- Título -->
                """),_display_(/*23.18*/texto(videoForm("titulo"),
                    label = "Título:",
                    placeholder = "Insira o Título")),format.raw/*25.53*/("""

                    """),format.raw/*27.21*/("""<!-- descricao -->
                """),_display_(/*28.18*/textoarea(videoForm("descricao"),
                    label = "Descrição:",
                    placeholder = "Insira a descrição")),format.raw/*30.56*/("""

                    """),format.raw/*32.21*/("""<!-- Url -->
                """),_display_(/*33.18*/texto(videoForm("url"),
                    label = "URL:",
                    placeholder = "Exemplo: https://www.youtube.com/watch?v=NauHixfoyuo")),format.raw/*35.90*/("""

                    """),format.raw/*37.21*/("""<!-- Button -->
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*41.73*/routes/*41.79*/.VideoController.telaLista),format.raw/*41.105*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*52.41*/("""{"""),format.raw/*52.42*/("""
        """),format.raw/*53.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*54.49*/("""{"""),format.raw/*54.50*/("""
            """),format.raw/*55.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*55.75*/("""{"""),format.raw/*55.76*/("""
                """),format.raw/*56.17*/("""inputs[i].disabled = true;
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/("""
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/(""";
</script>"""))
      }
    }
  }

  def render(id:Long,videoForm:play.data.Form[views.validators.VideoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,videoForm)

  def f:((Long,play.data.Form[views.validators.VideoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,videoForm) => apply(id,videoForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/videos/edit.scala.html
                  HASH: 612126ab876e79b5175ff48477a97ae78e66ab3d
                  MATRIX: 801->1|1009->70|1037->119|1064->121|1076->126|1116->158|1155->160|1186->165|1386->338|1484->426|1525->428|1571->447|1609->476|1649->478|1698->499|1939->713|1957->722|1999->742|2110->822|2160->844|2220->877|2359->995|2409->1017|2472->1053|2624->1184|2674->1206|2731->1236|2901->1385|2951->1407|3268->1697|3283->1703|3331->1729|3440->1807|3481->1820|3546->1855|3575->1857|3675->1929|3704->1930|3740->1939|3869->2040|3898->2041|3939->2054|4029->2116|4058->2117|4103->2134|4170->2173|4199->2174|4235->2183|4264->2184|4296->2189|4324->2190
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|71->41|71->41|71->41|74->44|75->45|79->49|81->51|82->52|82->52|83->53|84->54|84->54|85->55|85->55|85->55|86->56|87->57|87->57|88->58|88->58|89->59|89->59
                  -- GENERATED --
              */
          