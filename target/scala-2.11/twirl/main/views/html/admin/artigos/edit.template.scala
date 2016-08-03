
package views.html.admin.artigos

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[Artigo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, artigoForm: play.data.Form[Artigo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Editar Artigo")/*5.40*/ {_display_(Seq[Any](format.raw/*5.42*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Artigo</div>
            <div class="panel-body">
                """),_display_(/*10.18*/form(routes.ArtigoController.editar(id), 'enctype -> "multipart/form-data", 'class -> "form-horizontal", 'id -> "artigoForm")/*10.143*/ {_display_(Seq[Any](format.raw/*10.145*/("""

                """),_display_(/*12.18*/if(artigoForm.hasGlobalErrors)/*12.48*/ {_display_(Seq[Any](format.raw/*12.50*/("""
                """),format.raw/*13.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        <p class="alert alert-danger text-center">"""),_display_(/*16.68*/artigoForm/*16.78*/.globalError.message),format.raw/*16.98*/("""</p>
                    </div>
                </div>
                """)))}),format.raw/*19.18*/("""

                """),format.raw/*21.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        """),_display_(/*24.26*/inputText(artigoForm("titulo"),
                        'class -> "form-control",
                        'placeholder -> "Insira o título",
                        '_label -> "Título:",
                        '_help -> "")),format.raw/*28.38*/("""

                        """),_display_(/*30.26*/textarea(artigoForm("resumo"),
                        'class -> "form-control",
                        'placeholder -> "Insira o resumo",
                        '_label -> "Resumo:",
                        'rows -> 4,
                        '_help -> "")),format.raw/*35.38*/("""

                        """),_display_(/*37.26*/inputFile(artigoForm("arquivo"),
                        'class -> "form-control",
                        '_label -> "Resumo:",
                        '_help -> "")),format.raw/*40.38*/("""
                    """),format.raw/*41.21*/("""</div>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-3 control-label"></label>
                    <div class="col-md-6">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
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

  def render(id:Long,artigoForm:play.data.Form[Artigo]): play.twirl.api.HtmlFormat.Appendable = apply(id,artigoForm)

  def f:((Long,play.data.Form[Artigo]) => play.twirl.api.HtmlFormat.Appendable) = (id,artigoForm) => apply(id,artigoForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/artigos/edit.scala.html
                  HASH: 32d78fd4bf844ce45685335114fc58050bf7ab2a
                  MATRIX: 778->1|934->47|962->66|989->68|1001->73|1042->106|1081->108|1112->113|1317->291|1452->416|1493->418|1539->437|1578->467|1618->469|1663->486|1892->688|1911->698|1952->718|2055->790|2101->808|2288->968|2533->1192|2587->1219|2867->1478|2921->1505|3108->1671|3157->1692|3533->2041|3548->2047|3596->2074|3747->2194|3788->2207|3852->2241|3881->2243|3981->2315|4010->2316|4046->2325|4175->2426|4204->2427|4245->2440|4335->2502|4364->2503|4409->2520|4476->2559|4505->2560|4541->2569|4570->2570|4602->2575|4630->2576
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|40->10|40->10|40->10|42->12|42->12|42->12|43->13|46->16|46->16|46->16|49->19|51->21|54->24|58->28|60->30|65->35|67->37|70->40|71->41|79->49|79->49|79->49|82->52|83->53|86->56|88->58|89->59|89->59|90->60|91->61|91->61|92->62|92->62|92->62|93->63|94->64|94->64|95->65|95->65|96->66|96->66
                  -- GENERATED --
              */
          