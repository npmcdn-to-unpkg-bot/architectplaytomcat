
package views.html.admin.artigos

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreenchido:DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Cadastro de Artigo")/*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Cadastro de Artigo</div>
            <div class="panel-body">
                """),_display_(/*10.18*/form(routes.ArtigoController.inserir, 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "formPreenchido")/*10.144*/ {_display_(Seq[Any](format.raw/*10.146*/("""

                """),_display_(/*12.18*/if(formPreenchido.hasGlobalErrors)/*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
                """),format.raw/*13.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        <p class="alert alert-danger text-center">"""),_display_(/*16.68*/formPreenchido/*16.82*/.globalError.message),format.raw/*16.102*/("""</p>
                    </div>
                </div>
                """)))}),format.raw/*19.18*/("""

                """),format.raw/*21.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        """),_display_(/*24.26*/inputText(formPreenchido("titulo"),
                            'class -> "form-control",
                            'placeholder -> "Insira o título",
                            '_label -> "Título:",
                            '_help -> "")),format.raw/*28.42*/("""

                        """),_display_(/*30.26*/textarea(formPreenchido("resumo"),
                            'class -> "form-control",
                            'placeholder -> "Insira o resumo",
                            '_label -> "Resumo:",
                            'rows -> 4,
                            '_help -> "")),format.raw/*35.42*/("""

                        """),_display_(/*37.26*/inputFile(formPreenchido("arquivo"),
                            'class -> "form-control",
                            '_label -> "Arquivo:",
                            '_help -> "")),format.raw/*40.42*/("""
                    """),format.raw/*41.21*/("""</div>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-3 control-label"></label>
                    <div class="col-md-6">
                        <input class="btn btn-success" type="submit" id="btnSubmit" value="Cadastrar"/>
                        <a href=""""),_display_(/*49.35*/routes/*49.41*/.ArtigoController.telaLista),format.raw/*49.68*/("""" class="btn btn-default" type="button">Cancelar</a>
                    </div>
                </div>
                """)))}),format.raw/*52.18*/("""
            """),format.raw/*53.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*56.2*/("""

"""),format.raw/*58.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*59.41*/("""{"""),format.raw/*59.42*/("""
        """),format.raw/*60.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*61.49*/("""{"""),format.raw/*61.50*/("""
            """),format.raw/*62.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*62.75*/("""{"""),format.raw/*62.76*/("""
                """),format.raw/*63.17*/("""inputs[i].disabled = true;
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""";
</script>"""))
      }
    }
  }

  def render(formPreenchido:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formPreenchido)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formPreenchido) => apply(formPreenchido)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/artigos/create.scala.html
                  HASH: 291e2200745f1458b416b16c19d31c4c65ec975f
                  MATRIX: 766->1|904->29|932->48|959->50|971->55|1017->93|1056->95|1087->100|1297->283|1433->409|1474->411|1520->430|1563->464|1603->466|1648->483|1877->685|1900->699|1942->719|2045->791|2091->809|2278->969|2543->1213|2597->1240|2901->1523|2955->1550|3159->1733|3208->1754|3587->2106|3602->2112|3650->2139|3801->2259|3842->2272|3906->2306|3935->2308|4035->2380|4064->2381|4100->2390|4229->2491|4258->2492|4299->2505|4389->2567|4418->2568|4463->2585|4530->2624|4559->2625|4595->2634|4624->2635|4656->2640|4684->2641
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|40->10|40->10|40->10|42->12|42->12|42->12|43->13|46->16|46->16|46->16|49->19|51->21|54->24|58->28|60->30|65->35|67->37|70->40|71->41|79->49|79->49|79->49|82->52|83->53|86->56|88->58|89->59|89->59|90->60|91->61|91->61|92->62|92->62|92->62|93->63|94->64|94->64|95->65|95->65|96->66|96->66
                  -- GENERATED --
              */
          