
package views.html.admin.videos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.VideoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(videoForm: play.data.Form[views.validators.VideoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Vídeo")/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Vídeo</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.VideoController.inserir, 'class -> "form-horizontal", 'id -> "videoForm")/*11.99*/ {_display_(Seq[Any](format.raw/*11.101*/("""

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

                """),format.raw/*37.17*/("""<div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*40.73*/routes/*40.79*/.VideoController.telaLista),format.raw/*40.105*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""<script type="text/javascript">
        window.onbeforeunload = function () """),format.raw/*51.45*/("""{"""),format.raw/*51.46*/("""
            """),format.raw/*52.13*/("""var inputs = document.getElementsByTagName("INPUT");
            for (var i = 0; i < inputs.length; i++) """),format.raw/*53.53*/("""{"""),format.raw/*53.54*/("""
                """),format.raw/*54.17*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*54.79*/("""{"""),format.raw/*54.80*/("""
                    """),format.raw/*55.21*/("""inputs[i].disabled = true;
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/("""
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""";
</script>"""))
      }
    }
  }

  def render(videoForm:play.data.Form[views.validators.VideoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(videoForm)

  def f:((play.data.Form[views.validators.VideoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (videoForm) => apply(videoForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/videos/create.scala.html
                  HASH: 897a07a208fbe48b276aac2821db5fe44c5b3098
                  MATRIX: 800->1|998->60|1026->109|1053->111|1065->116|1110->153|1149->155|1180->160|1385->338|1479->423|1520->425|1566->444|1604->473|1644->475|1693->496|1934->710|1952->719|1994->739|2105->819|2155->841|2215->874|2354->992|2404->1014|2467->1050|2619->1181|2669->1203|2726->1233|2896->1382|2942->1400|3230->1661|3245->1667|3293->1693|3402->1771|3443->1784|3508->1819|3537->1821|3641->1897|3670->1898|3711->1911|3844->2016|3873->2017|3918->2034|4008->2096|4037->2097|4086->2118|4157->2161|4186->2162|4227->2175|4256->2176|4292->2185|4321->2186
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|70->40|70->40|70->40|73->43|74->44|78->48|80->50|81->51|81->51|82->52|83->53|83->53|84->54|84->54|84->54|85->55|86->56|86->56|87->57|87->57|88->58|88->58
                  -- GENERATED --
              */
          