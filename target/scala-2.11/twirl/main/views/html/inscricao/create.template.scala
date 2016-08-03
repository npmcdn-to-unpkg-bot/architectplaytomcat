
package views.html.inscricao

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.data.Form[views.validators.InscricaoFormData],List[String],List[String],Map[String, Boolean],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(inscricaoForm: play.data.Form[views.validators.InscricaoFormData],
        escolaridades:List[String],
        generos:List[String],
        paises:Map[String,Boolean],
        modalidades:List[String],
        fontes:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*6.29*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*17.130*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/mensagens.css")),format.raw/*18.106*/("""">
        <title>Formulário de Inscrição</title>
    </head>
    <body>
        <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-heading">Formulário de Inscrição</div>
                        <div class="panel-body">

                            <h2 class="page-header">
                                <label class="col-sm-3 control-label"></label> Curso de Atualização em Energias do Biogás
                            </h2>

                            """),_display_(/*32.30*/form(routes.InscricaoController.inserir(), 'class -> "form-horizontal", 'id -> "inscricaoForm")/*32.125*/ {_display_(Seq[Any](format.raw/*32.127*/("""

                                """),_display_(/*34.34*/if(inscricaoForm.hasGlobalErrors)/*34.67*/ {_display_(Seq[Any](format.raw/*34.69*/("""
                                    """),format.raw/*35.37*/("""<div class="form-group">
                                        <label class="col-sm-3 control-label"></label>
                                        <div class="col-sm-6">
                                            <p class="alert alert-danger text-center">"""),_display_(/*38.88*/inscricaoForm/*38.101*/.globalError.message),format.raw/*38.121*/("""</p>
                                        </div>
                                    </div>
                                """)))}),format.raw/*41.34*/("""

                                """),format.raw/*43.41*/("""
                                """),_display_(/*44.34*/templates/*44.43*/.bootstrap.inscricao.nome(inscricaoForm("nome"),
                                    label = "Nome:",
                                    placeholder = "Insira o Nome")),format.raw/*46.67*/("""

                                """),format.raw/*48.49*/("""
                                """),_display_(/*49.34*/templates/*49.43*/.bootstrap.inscricao.radio(inscricaoForm("genero"),
                                    label = "Gênero:",
                                    buttonNameList = generos,
                                    help = "Selecione sua escolaridade. (required)")),format.raw/*52.85*/("""

                                """),format.raw/*54.55*/("""
                                """),_display_(/*55.34*/templates/*55.43*/.bootstrap.inscricao.data(inscricaoForm("dataNascimento"),
                                    label = "Data de Nascimento:",
                                    placeholder = "Insira a data de nascimento")),format.raw/*57.81*/("""

                                """),format.raw/*59.55*/("""
                                """),_display_(/*60.34*/templates/*60.43*/.bootstrap.inscricao.radio(inscricaoForm("escolaridade"),
                                    label = "Escolaridade:",
                                    buttonNameList = escolaridades,
                                    help = "Selecione sua escolaridade. (required)")),format.raw/*63.85*/("""

                                """),format.raw/*65.46*/("""
                                """),_display_(/*66.34*/templates/*66.43*/.bootstrap.inscricao.profissao(inscricaoForm("profissao"),
                                    label = "Profissão:",
                                    placeholder = "Insira a profissao")),format.raw/*68.72*/("""

                                """),format.raw/*70.48*/("""
                                """),_display_(/*71.34*/templates/*71.43*/.bootstrap.inscricao.instituicao(inscricaoForm("instituicao"),
                                    label = "Instituição:",
                                    placeholder = "Insira a instituição")),format.raw/*73.74*/("""

                                """),format.raw/*75.48*/("""
                                """),_display_(/*76.34*/templates/*76.43*/.bootstrap.inscricao.select(inscricaoForm("pais"),
                                    label = "País:",
                                    optionMap = paises,
                                    isMultiple = false)),format.raw/*79.56*/("""

                                """),format.raw/*81.43*/("""
                                """),_display_(/*82.34*/templates/*82.43*/.bootstrap.inscricao.estado(inscricaoForm("estado"),
                                    label = "Estado:",
                                    placeholder = "Insira o estado")),format.raw/*84.69*/("""

                                """),format.raw/*86.43*/("""
                                """),_display_(/*87.34*/templates/*87.43*/.bootstrap.inscricao.cidade(inscricaoForm("cidade"),
                                    label = "Cidade:",
                                    placeholder = "Insira a cidade")),format.raw/*89.69*/("""

                                """),format.raw/*91.45*/("""
                                """),_display_(/*92.34*/templates/*92.43*/.bootstrap.inscricao.telefone(inscricaoForm("telefone"),
                                    label = "Telefone:",
                                    placeholder = "Insira o telefone")),format.raw/*94.71*/("""

                                """),format.raw/*96.40*/("""
                                """),_display_(/*97.34*/templates/*97.43*/.bootstrap.inscricao.cpf(inscricaoForm("cpf"),
                                    label = "CPF:",
                                    placeholder = "Insira o cpf")),format.raw/*99.66*/("""

                                """),format.raw/*101.42*/("""
                                """),_display_(/*102.34*/templates/*102.43*/.bootstrap.inscricao.email(inscricaoForm("email"),
                                    label = "Email:",
                                    placeholder = "Insira o email")),format.raw/*104.68*/("""

                                """),format.raw/*106.53*/("""
                                """),_display_(/*107.34*/templates/*107.43*/.bootstrap.inscricao.radio(inscricaoForm("modalidade"),
                                    label = "Já estudou na modalidade EaD (Educação a Distância)?",
                                    buttonNameList = modalidades)),format.raw/*109.66*/("""

                                """),format.raw/*111.48*/("""
                                """),_display_(/*112.34*/templates/*112.43*/.bootstrap.inscricao.radioFonte(inscricaoForm("fonte"),
                                    label = "Por qual meio você soube de nosso Curso?",
                                    buttonNameList = fontes)),format.raw/*114.61*/("""

                                """),format.raw/*116.42*/("""
                                """),format.raw/*117.33*/("""<div class="form-group">
                                    <label class="col-md-4 control-label"></label>
                                    <div class="col-md-6">
                                        <input autocomplete="off" data-loading-text="Enviando..." class="btn btn-primary" type="submit" id="btnEnviar" value="Enviar"/>
                                    </div>
                                </div>

                            """)))}),format.raw/*124.30*/("""
                        """),format.raw/*125.25*/("""</div>
                    </div>
                    <footer class="footer">
                        <p class="text-center">&copy; 2016 Centro Internacional de Energias Renováveis - CIBiogás</p>
                    </footer>
                </div>
            </div>

        <script src=""""),_display_(/*133.23*/routes/*133.29*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*133.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*134.23*/routes/*134.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*134.97*/("""" type="text/javascript"></script>
        <script type="text/javascript">
            window.onload = function() """),format.raw/*136.40*/("""{"""),format.raw/*136.41*/("""
                """),format.raw/*137.17*/("""var inscricaoForm = document.getElementById("inscricaoForm");
                inscricaoForm.elements[0].focus();
                //inscricaoForm.nome.focus(); codigo alternativo ao anterior
            """),format.raw/*140.13*/("""}"""),format.raw/*140.14*/(""";
            $('#btnEnviar').on('click', function () """),format.raw/*141.53*/("""{"""),format.raw/*141.54*/("""
                """),format.raw/*142.17*/("""var $btn = $(this).button('loading');
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""");
        </script>
    </body>
</html>"""))
      }
    }
  }

  def render(inscricaoForm:play.data.Form[views.validators.InscricaoFormData],escolaridades:List[String],generos:List[String],paises:Map[String, Boolean],modalidades:List[String],fontes:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(inscricaoForm,escolaridades,generos,paises,modalidades,fontes)

  def f:((play.data.Form[views.validators.InscricaoFormData],List[String],List[String],Map[String, Boolean],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (inscricaoForm,escolaridades,generos,paises,modalidades,fontes) => apply(inscricaoForm,escolaridades,generos,paises,modalidades,fontes)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/inscricao/create.scala.html
                  HASH: 1ebb55a8ddc3c59a7e6986687337437d764aad3d
                  MATRIX: 874->1|1245->233|1274->282|1565->546|1580->552|1641->591|1724->647|1739->653|1831->723|1914->779|1929->785|1997->831|2602->1409|2707->1504|2748->1506|2810->1541|2852->1574|2892->1576|2957->1613|3246->1875|3269->1888|3311->1908|3470->2036|3532->2078|3593->2112|3611->2121|3800->2289|3862->2339|3923->2373|3941->2382|4215->2635|4277->2691|4338->2725|4356->2734|4583->2940|4645->2996|4706->3030|4724->3039|5016->3310|5078->3357|5139->3391|5157->3400|5366->3588|5428->3637|5489->3671|5507->3680|5724->3876|5786->3925|5847->3959|5865->3968|6101->4183|6163->4227|6224->4261|6242->4270|6439->4446|6501->4490|6562->4524|6580->4533|6777->4709|6839->4755|6900->4789|6918->4798|7123->4982|7185->5023|7246->5057|7264->5066|7449->5230|7512->5273|7574->5307|7593->5316|7787->5488|7850->5542|7912->5576|7931->5585|8174->5806|8237->5855|8299->5889|8318->5898|8544->6102|8607->6145|8669->6178|9148->6625|9202->6650|9521->6941|9537->6947|9618->7006|9703->7063|9719->7069|9809->7137|9952->7251|9982->7252|10028->7269|10259->7471|10289->7472|10372->7526|10402->7527|10448->7544|10527->7594|10557->7595
                  LINES: 27->1|38->6|40->10|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|62->32|62->32|62->32|64->34|64->34|64->34|65->35|68->38|68->38|68->38|71->41|73->43|74->44|74->44|76->46|78->48|79->49|79->49|82->52|84->54|85->55|85->55|87->57|89->59|90->60|90->60|93->63|95->65|96->66|96->66|98->68|100->70|101->71|101->71|103->73|105->75|106->76|106->76|109->79|111->81|112->82|112->82|114->84|116->86|117->87|117->87|119->89|121->91|122->92|122->92|124->94|126->96|127->97|127->97|129->99|131->101|132->102|132->102|134->104|136->106|137->107|137->107|139->109|141->111|142->112|142->112|144->114|146->116|147->117|154->124|155->125|163->133|163->133|163->133|164->134|164->134|164->134|166->136|166->136|167->137|170->140|170->140|171->141|171->141|172->142|173->143|173->143
                  -- GENERATED --
              */
          