
package views.html.admin.noticias

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[views.validators.NoticiaFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, noticiaForm: play.data.Form[views.validators.NoticiaFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Notícias")/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Notícias</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.NoticiaController.editar(id), 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "noticiaForm")/*11.141*/ {_display_(Seq[Any](format.raw/*11.143*/("""

                """),_display_(/*13.18*/if(noticiaForm.hasGlobalErrors)/*13.49*/ {_display_(Seq[Any](format.raw/*13.51*/("""
                    """),format.raw/*14.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">"""),_display_(/*17.72*/noticiaForm/*17.83*/.globalError.message),format.raw/*17.103*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- titulo -->
                """),_display_(/*23.18*/texto(noticiaForm("titulo"),
                    label = "Título:",
                    placeholder = "Insira o título")),format.raw/*25.53*/("""

                    """),format.raw/*27.21*/("""<!-- resumo -->
                """),_display_(/*28.18*/textoarea(noticiaForm("resumo"),
                    label = "Resumo:",
                    placeholder = "Insira o resumo")),format.raw/*30.53*/("""

                    """),format.raw/*32.21*/("""<!-- Site -->
                """),_display_(/*33.18*/texto(noticiaForm("url"),
                    label = "Url:",
                    placeholder = "Insira o endereço eletrônico")),format.raw/*35.66*/("""

                    """),format.raw/*37.21*/("""<!-- Arquivo -->
                """),_display_(/*38.18*/arquivo(noticiaForm("arquivo"),
                    label = "Capa:")),format.raw/*39.37*/("""

                    """),format.raw/*41.21*/("""<!-- Button -->
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*45.73*/routes/*45.79*/.NoticiaController.telaLista),format.raw/*45.107*/("""">Cancelar</a>
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

  def render(id:Long,noticiaForm:play.data.Form[views.validators.NoticiaFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,noticiaForm)

  def f:((Long,play.data.Form[views.validators.NoticiaFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,noticiaForm) => apply(id,noticiaForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/noticias/edit.scala.html
                  HASH: 4e44ef671d677c7a9eb394aafa046a2572d4a029
                  MATRIX: 805->1|1017->74|1045->123|1072->125|1084->130|1127->165|1166->167|1197->172|1400->348|1537->475|1578->477|1624->496|1664->527|1704->529|1753->550|1994->764|2014->775|2056->795|2167->875|2217->897|2277->930|2418->1050|2468->1072|2528->1105|2673->1229|2723->1251|2781->1282|2929->1409|2979->1431|3040->1465|3129->1533|3179->1555|3496->1845|3511->1851|3561->1879|3670->1957|3711->1970|3775->2004|3804->2006|3904->2078|3933->2079|3969->2088|4098->2189|4127->2190|4168->2203|4258->2265|4287->2266|4332->2283|4399->2322|4428->2323|4464->2332|4493->2333|4525->2338|4553->2339
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|69->39|71->41|75->45|75->45|75->45|78->48|79->49|82->52|84->54|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|90->60|90->60|91->61|91->61|92->62|92->62
                  -- GENERATED --
              */
          