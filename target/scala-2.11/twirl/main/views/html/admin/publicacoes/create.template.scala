
package views.html.admin.publicacoes

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.PublicacaoFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(publicacaoForm: play.data.Form[views.validators.PublicacaoFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Publicações")/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Publicações</div>
            <div class="panel-body">
            """),_display_(/*11.14*/form(routes.PublicacaoController.inserir, 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "publicacaoForm")/*11.144*/ {_display_(Seq[Any](format.raw/*11.146*/("""

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

                """),format.raw/*41.17*/("""<div class="form-group">
                    <div class="col-sm-offset-3 col-sm-12">
                        <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*44.73*/routes/*44.79*/.PublicacaoController.telaLista),format.raw/*44.110*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""</div>
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

  def render(publicacaoForm:play.data.Form[views.validators.PublicacaoFormData]): play.twirl.api.HtmlFormat.Appendable = apply(publicacaoForm)

  def f:((play.data.Form[views.validators.PublicacaoFormData]) => play.twirl.api.HtmlFormat.Appendable) = (publicacaoForm) => apply(publicacaoForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/publicacoes/create.scala.html
                  HASH: 2c44ce7ac429472ce53e1d4b0013d156b4bc3800
                  MATRIX: 810->1|1018->70|1046->119|1073->121|1085->126|1136->169|1175->171|1206->176|1417->360|1557->490|1598->492|1644->511|1687->545|1727->547|1776->568|2017->782|2040->796|2082->816|2193->896|2243->918|2303->951|2447->1074|2497->1096|2557->1129|2705->1256|2755->1278|2813->1309|2964->1439|3014->1461|3075->1495|3167->1566|3213->1584|3501->1845|3516->1851|3569->1882|3678->1960|3719->1973|3784->2008|3813->2010|3913->2082|3942->2083|3978->2092|4107->2193|4136->2194|4177->2207|4267->2269|4296->2270|4341->2287|4408->2326|4437->2327|4473->2336|4502->2337|4534->2342|4562->2343
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|69->39|71->41|74->44|74->44|74->44|77->47|78->48|82->52|84->54|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|90->60|90->60|91->61|91->61|92->62|92->62
                  -- GENERATED --
              */
          