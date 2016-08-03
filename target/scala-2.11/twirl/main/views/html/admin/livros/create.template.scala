
package views.html.admin.livros

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[views.validators.LivroFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livroForm: play.data.Form[views.validators.LivroFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Livro")/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
    """),format.raw/*7.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Livro</div>
            <div class="panel-body">
                """),_display_(/*11.18*/form(routes.LivroController.inserir, 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "livroForm")/*11.138*/ {_display_(Seq[Any](format.raw/*11.140*/("""

                    """),_display_(/*13.22*/if(livroForm.hasGlobalErrors)/*13.51*/ {_display_(Seq[Any](format.raw/*13.53*/("""
                        """),format.raw/*14.25*/("""<div class="form-group">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-6">
                                <p class="alert alert-danger text-center">"""),_display_(/*17.76*/livroForm/*17.85*/.globalError.message),format.raw/*17.105*/("""</p>
                            </div>
                        </div>
                    """)))}),format.raw/*20.22*/("""

                    """),format.raw/*22.21*/("""<!-- Título -->
                    """),_display_(/*23.22*/texto(livroForm("titulo"),
                        label = "Título:",
                        placeholder = "Insira o Título")),format.raw/*25.57*/("""

                    """),format.raw/*27.21*/("""<!-- Subtítulo -->
                    """),_display_(/*28.22*/texto(livroForm("subTitulo"),
                        label = "Subtítulo:",
                        placeholder = "Insira o Subtítulo")),format.raw/*30.60*/("""

                    """),format.raw/*32.21*/("""<!-- Autores -->
                    """),_display_(/*33.22*/texto(livroForm("autores"),
                        label = "Autores:",
                        placeholder = "Insira o Autor")),format.raw/*35.56*/("""

                    """),format.raw/*37.21*/("""<!-- Editora -->
                    """),_display_(/*38.22*/texto(livroForm("editora"),
                        label = "Editora:",
                        placeholder = "Insira a Editora")),format.raw/*40.58*/("""

                    """),format.raw/*42.21*/("""<!-- ISBN -->
                    """),_display_(/*43.22*/texto(livroForm("isbn"),
                        label = "ISBN:",
                        placeholder = "Insira o ISBN")),format.raw/*45.55*/("""

                    """),format.raw/*47.21*/("""<!-- Páginas -->
                    """),_display_(/*48.22*/numero(livroForm("paginas"),
                        label = "Páginas:",
                        placeholder = "Insira a quantidade de páginas")),format.raw/*50.72*/("""

                    """),format.raw/*52.21*/("""<!-- Ano -->
                    """),_display_(/*53.22*/numero(livroForm("ano"),
                        label = "Ano:",
                        placeholder = "Insira o ano")),format.raw/*55.54*/("""

                    """),format.raw/*57.21*/("""<!-- Edição -->
                    """),_display_(/*58.22*/numero(livroForm("edicao"),
                    label = "Edição:",
                    placeholder = "Insira a edição")),format.raw/*60.53*/("""

                    """),format.raw/*62.21*/("""<!-- Arquivo -->
                    """),_display_(/*63.22*/arquivo(livroForm("arquivo"),
                    label = "Enviar:")),format.raw/*64.39*/("""

                    """),format.raw/*66.21*/("""<div class="form-group">
                        <div class="col-sm-offset-3 col-sm-12">
                            <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                            <a class="btn btn-default" type="button" href=""""),_display_(/*69.77*/routes/*69.83*/.LivroController.telaLista),format.raw/*69.109*/("""">Cancelar</a>
                        </div>
                    </div>
                """)))}),format.raw/*72.18*/("""
            """),format.raw/*73.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*77.2*/("""

"""),format.raw/*79.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*80.41*/("""{"""),format.raw/*80.42*/("""
        """),format.raw/*81.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*82.49*/("""{"""),format.raw/*82.50*/("""
            """),format.raw/*83.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*83.75*/("""{"""),format.raw/*83.76*/("""
                """),format.raw/*84.17*/("""inputs[i].disabled = true;
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/(""";
</script>"""))
      }
    }
  }

  def render(livroForm:play.data.Form[views.validators.LivroFormData]): play.twirl.api.HtmlFormat.Appendable = apply(livroForm)

  def f:((play.data.Form[views.validators.LivroFormData]) => play.twirl.api.HtmlFormat.Appendable) = (livroForm) => apply(livroForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/livros/create.scala.html
                  HASH: a72b4e41b9f3452900a27be863ad3f6eef0db73b
                  MATRIX: 800->1|998->60|1026->109|1053->111|1065->116|1110->153|1149->155|1180->160|1389->342|1519->462|1560->464|1610->487|1648->516|1688->518|1741->543|1994->769|2012->778|2054->798|2177->890|2227->912|2291->949|2438->1075|2488->1097|2555->1137|2711->1272|2761->1294|2826->1332|2974->1459|3024->1481|3089->1519|3239->1648|3289->1670|3351->1705|3492->1825|3542->1847|3607->1885|3772->2029|3822->2051|3883->2085|4022->2203|4072->2225|4136->2262|4276->2381|4326->2403|4391->2441|4480->2509|4530->2531|4830->2804|4845->2810|4893->2836|5014->2926|5055->2939|5120->2974|5149->2976|5249->3048|5278->3049|5314->3058|5443->3159|5472->3160|5513->3173|5603->3235|5632->3236|5677->3253|5744->3292|5773->3293|5809->3302|5838->3303|5870->3308|5898->3309
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|41->11|41->11|41->11|43->13|43->13|43->13|44->14|47->17|47->17|47->17|50->20|52->22|53->23|55->25|57->27|58->28|60->30|62->32|63->33|65->35|67->37|68->38|70->40|72->42|73->43|75->45|77->47|78->48|80->50|82->52|83->53|85->55|87->57|88->58|90->60|92->62|93->63|94->64|96->66|99->69|99->69|99->69|102->72|103->73|107->77|109->79|110->80|110->80|111->81|112->82|112->82|113->83|113->83|113->83|114->84|115->85|115->85|116->86|116->86|117->87|117->87
                  -- GENERATED --
              */
          