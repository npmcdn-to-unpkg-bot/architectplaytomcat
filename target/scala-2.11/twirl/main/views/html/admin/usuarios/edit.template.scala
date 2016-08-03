
package views.html.admin.usuarios

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, usuarioForm: play.data.Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.admin.main("Editar Usuário")/*5.41*/ {_display_(Seq[Any](format.raw/*5.43*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-6">
        <div class="panel panel-default">
            <div class="panel-heading">Editar Usuário</div>
            <div class="panel-body">
                """),_display_(/*10.18*/form(routes.UsuarioController.editar(id), 'class -> "form-horizontal", 'id -> "usuarioForm")/*10.110*/ {_display_(Seq[Any](format.raw/*10.112*/("""

                """),_display_(/*12.18*/if(usuarioForm.hasGlobalErrors)/*12.49*/ {_display_(Seq[Any](format.raw/*12.51*/("""
                    """),format.raw/*13.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-6">
                            <p class="alert alert-danger text-center">
                                """),_display_(/*17.34*/usuarioForm/*17.45*/.globalError.message),format.raw/*17.65*/("""
                            """),format.raw/*18.29*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*21.18*/("""

                """),format.raw/*23.17*/("""<div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        """),_display_(/*26.26*/inputText(usuarioForm("nome"), 'class -> "form-control", 'placeholder -> "Insira o nome", '_label -> "Nome:", 'size -> 60, '_help -> "")),format.raw/*26.162*/("""
                    """),format.raw/*27.21*/("""</div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        """),_display_(/*33.26*/inputText(usuarioForm("email"), 'class -> "form-control", 'placeholder -> "Insira o email", '_label -> "Email:", 'size -> 40, '_help -> "")),format.raw/*33.165*/("""
                    """),format.raw/*34.21*/("""</div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-6">
                        """),_display_(/*40.26*/inputPassword(usuarioForm("senha"), 'class -> "form-control", '_label -> "Senha:", 'size -> 60, '_help -> "")),format.raw/*40.135*/("""
                    """),format.raw/*41.21*/("""</div>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-3 control-label"></label>
                    <div class="col-md-6">
                        <input class="btn btn-primary" type="submit" id="btnSubmit" value="Editar"/>
                        <a href=""""),_display_(/*49.35*/routes/*49.41*/.UsuarioController.telaLista),format.raw/*49.69*/("""" class="btn btn-default" type="button">Cancelar</a>
                    </div>
                </div>
                """)))}),format.raw/*52.18*/("""
            """),format.raw/*53.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*56.2*/("""
"""),format.raw/*57.1*/("""<script type="text/javascript">
    window.onbeforeunload = function () """),format.raw/*58.41*/("""{"""),format.raw/*58.42*/("""
        """),format.raw/*59.9*/("""var inputs = document.getElementsByTagName("INPUT");
        for (var i = 0; i < inputs.length; i++) """),format.raw/*60.49*/("""{"""),format.raw/*60.50*/("""
            """),format.raw/*61.13*/("""if (inputs[i].type == "button" || inputs[i].type == "submit") """),format.raw/*61.75*/("""{"""),format.raw/*61.76*/("""
                """),format.raw/*62.17*/("""inputs[i].disabled = true;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/(""";
</script>"""))
      }
    }
  }

  def render(id:Long,usuarioForm:play.data.Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(id,usuarioForm)

  def f:((Long,play.data.Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (id,usuarioForm) => apply(id,usuarioForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/usuarios/edit.scala.html
                  HASH: 59170c693afe30db502f48ae041b9e1c05c835a2
                  MATRIX: 780->1|938->49|966->68|993->70|1005->75|1047->109|1086->111|1117->116|1323->295|1425->387|1466->389|1512->408|1552->439|1592->441|1641->462|1915->709|1935->720|1976->740|2033->769|2144->849|2190->867|2377->1027|2535->1163|2584->1184|2818->1391|2979->1530|3028->1551|3262->1758|3393->1867|3442->1888|3818->2237|3833->2243|3882->2271|4033->2391|4074->2404|4138->2438|4166->2439|4266->2511|4295->2512|4331->2521|4460->2622|4489->2623|4530->2636|4620->2698|4649->2699|4694->2716|4761->2755|4790->2756|4826->2765|4855->2766|4887->2771|4915->2772
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|40->10|40->10|40->10|42->12|42->12|42->12|43->13|47->17|47->17|47->17|48->18|51->21|53->23|56->26|56->26|57->27|63->33|63->33|64->34|70->40|70->40|71->41|79->49|79->49|79->49|82->52|83->53|86->56|87->57|88->58|88->58|89->59|90->60|90->60|91->61|91->61|91->61|92->62|93->63|93->63|94->64|94->64|95->65|95->65
                  -- GENERATED --
              */
          