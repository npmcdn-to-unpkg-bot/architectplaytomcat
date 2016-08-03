
package views.html.admin.publicacoes

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.PublicacaoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, publicacaoForm: play.data.Form[views.validators.PublicacaoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Publicação")/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Publicação</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.PublicacaoController.editar(id), 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "publicacaoForm")/*11.147*/ {_display_(Seq[Any](format.raw/*11.149*/("""

                """),_display_(/*13.18*/if(publicacaoForm.hasGlobalErrors)/*13.52*/ {_display_(Seq[Any](format.raw/*13.54*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/publicacaoForm/*17.86*/.globalError.message),format.raw/*17.106*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- titulo -->
                """),_display_(/*23.18*/texto(publicacaoForm("titulo"),
                    label = "Título:",
                    placeholder = "Insira o título")),format.raw/*25.53*/("""

                    """),format.raw/*27.21*/("""<!-- resumo -->
                """),_display_(/*28.18*/textoarea(publicacaoForm("resumo"),
                    label = "Resumo:",
                    placeholder = "Insira o resumo")),format.raw/*30.53*/("""

                    """),format.raw/*32.21*/("""<!-- Site -->
                """),_display_(/*33.18*/texto(publicacaoForm("url"),
                    label = "Url:",
                    placeholder = "Insira o endereço eletrônico")),format.raw/*35.66*/("""

                    """),format.raw/*37.21*/("""<!-- Arquivo -->
                """),_display_(/*38.18*/arquivo(publicacaoForm("arquivo"),
                    label = "Capa:")),format.raw/*39.37*/("""

                    """),format.raw/*41.21*/("""<!-- Button -->
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*45.73*/routes/*45.79*/.PublicacaoController.telaLista),format.raw/*45.110*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*52.2*/("""

"""),format.raw/*54.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*55.41*/("""{"""),format.raw/*55.42*/("""
        """),format.raw/*56.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*57.49*/("""{"""),format.raw/*57.50*/("""
            """),format.raw/*58.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*58.75*/("""{"""),format.raw/*58.76*/("""
                """),format.raw/*59.17*/("""inputs[i].disabled = true;
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""";
</script>"""))
      }
    }
  }

  def render(id:Long,publicacaoForm:play.data.Form[views.validators.PublicacaoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,publicacaoForm)

  def f:((Long,play.data.Form[views.validators.PublicacaoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,publicacaoForm) => apply(id,publicacaoForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/publicacoes/edit.scala.html
                  HASH: 79b72eb0f29b452266578d6f0923564ae15aefa9
                  MATRIX: 811->1|1029->80|1057->129|1084->131|1096->136|1141->173|1180->175|1211->180|1416->358|1559->491|1600->493|1646->512|1689->546|1729->548|1778->569|2019->783|2042->797|2084->817|2195->897|2245->919|2305->952|2449->1075|2499->1097|2559->1130|2707->1257|2757->1279|2815->1310|2966->1440|3016->1462|3077->1496|3169->1567|3219->1589|3536->1879|3551->1885|3604->1916|3713->1994|3754->2007|3818->2041|3847->2043|3947->2115|3976->2116|4012->2125|4141->2226|4170->2227|4211->2240|4301->2302|4330->2303|4375->2320|4442->2359|4471->2360|4507->2369|4536->2370|4568->2375|4596->2376
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|69->39|71->41|75->45|75->45|75->45|78->48|79->49|82->52|84->54|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|90->60|90->60|91->61|91->61|92->62|92->62
                  -- GENERATED --
              */
          