
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*9.126*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.css")),format.raw/*10.127*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css")),format.raw/*11.166*/("""">
    <title>"""),_display_(/*12.13*/title),format.raw/*12.18*/("""</title>
</head>
<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*26.48*/routes/*26.54*/.AdminController.inicio),format.raw/*26.77*/(""""><span class="glyphicon glyphicon-home"></span> Materiais</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li """),_display_(/*32.26*/if(request.path.startsWith("/artigo"))/*32.64*/{_display_(Seq[Any](format.raw/*32.65*/(""" """),format.raw/*32.66*/("""class="active" """)))}),format.raw/*32.82*/(""">
                        <a href=""""),_display_(/*33.35*/routes/*33.41*/.ArtigoController.telaLista),format.raw/*33.68*/(""""><span class="glyphicon glyphicon-education"></span> Artigos</a></li>
                    <li """),_display_(/*34.26*/if(request.path.startsWith("/livro"))/*34.63*/{_display_(Seq[Any](format.raw/*34.64*/(""" """),format.raw/*34.65*/("""class="active" """)))}),format.raw/*34.81*/(""">
                        <a href=""""),_display_(/*35.35*/routes/*35.41*/.LivroController.telaLista),format.raw/*35.67*/(""""><span class="glyphicon glyphicon-book"></span> Livros</a></li>
                    <li """),_display_(/*36.26*/if(request.path.startsWith("/publicacao"))/*36.68*/{_display_(Seq[Any](format.raw/*36.69*/(""" """),format.raw/*36.70*/("""class="active" """)))}),format.raw/*36.86*/(""">
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.PublicacaoController.telaLista),format.raw/*37.72*/(""""><span class="fa fa-file-text"></span> Publicações</a></li>
                    <li """),_display_(/*38.26*/if(request.path.startsWith("/evento"))/*38.64*/{_display_(Seq[Any](format.raw/*38.65*/(""" """),format.raw/*38.66*/("""class="active" """)))}),format.raw/*38.82*/(""">
                        <a href=""""),_display_(/*39.35*/routes/*39.41*/.EventoController.telaLista),format.raw/*39.68*/(""""><span class="fa fa-calendar"></span> Eventos</a></li>
                    <li """),_display_(/*40.26*/if(request.path.startsWith("/curso"))/*40.63*/{_display_(Seq[Any](format.raw/*40.64*/(""" """),format.raw/*40.65*/("""class="active" """)))}),format.raw/*40.81*/(""">
                        <a href=""""),_display_(/*41.35*/routes/*41.41*/.CursoController.telaLista),format.raw/*41.67*/(""""><span class="fa fa-leaf"></span> Cursos</a></li>
                    <li """),_display_(/*42.26*/if(request.path.startsWith("/video"))/*42.63*/{_display_(Seq[Any](format.raw/*42.64*/(""" """),format.raw/*42.65*/("""class="active" """)))}),format.raw/*42.81*/(""">
                        <a href=""""),_display_(/*43.35*/routes/*43.41*/.VideoController.telaLista),format.raw/*43.67*/(""""><span class="fa fa-video-camera"></span> Vídeos</a></li>
                    <li """),_display_(/*44.26*/if(request.path.startsWith("/noticia"))/*44.65*/{_display_(Seq[Any](format.raw/*44.66*/(""" """),format.raw/*44.67*/("""class="active" """)))}),format.raw/*44.83*/(""">
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.NoticiaController.telaLista),format.raw/*45.69*/(""""><span class="fa fa-newspaper-o"></span> Notícias</a></li>
                    <li """),_display_(/*46.26*/if(request.path.startsWith("/usuario"))/*46.65*/{_display_(Seq[Any](format.raw/*46.66*/(""" """),format.raw/*46.67*/("""class="active" """)))}),format.raw/*46.83*/(""">
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.UsuarioController.telaLista),format.raw/*47.69*/(""""><span class="glyphicon glyphicon-user"></span> Usuários</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li></li>
                    <li """),_display_(/*51.26*/if(request.uri == "/sobre")/*51.53*/{_display_(Seq[Any](format.raw/*51.54*/(""" """),format.raw/*51.55*/("""class="active" """)))}),format.raw/*51.71*/(""" """),format.raw/*51.72*/("""class="dropdown">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Opções <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*54.43*/routes/*54.49*/.Application.index),format.raw/*54.67*/("""">Home</a></li>
                            <li """),_display_(/*55.34*/if(request.uri == "/sobre")/*55.61*/{_display_(Seq[Any](format.raw/*55.62*/(""" """),format.raw/*55.63*/("""class="active" """)))}),format.raw/*55.79*/("""><a href=""""),_display_(/*55.90*/routes/*55.96*/.Application.sobre),format.raw/*55.114*/("""">Sobre</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href=""""),_display_(/*57.43*/routes/*57.49*/.LoginController.logout),format.raw/*57.72*/("""">Sair</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="container-fluid">
        <div class="row">
            """),_display_(/*67.14*/content),format.raw/*67.21*/("""
        """),format.raw/*68.9*/("""</div>
    </div>

    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*71.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*72.93*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("bower_components/moment/moment.js")),format.raw/*73.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js")),format.raw/*74.137*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 12:58:39 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/admin/main.scala.html
                  HASH: 9aa6efda6ca7e1735ee78afa30144bc2989a2965
                  MATRIX: 754->1|879->31|906->32|1176->276|1190->282|1250->321|1328->373|1342->379|1433->449|1512->501|1527->507|1620->578|1699->630|1714->636|1846->746|1888->761|1914->766|2613->1438|2628->1444|2672->1467|3018->1786|3065->1824|3104->1825|3133->1826|3180->1842|3243->1878|3258->1884|3306->1911|3429->2007|3475->2044|3514->2045|3543->2046|3590->2062|3653->2098|3668->2104|3715->2130|3832->2220|3883->2262|3922->2263|3951->2264|3998->2280|4061->2316|4076->2322|4128->2353|4241->2439|4288->2477|4327->2478|4356->2479|4403->2495|4466->2531|4481->2537|4529->2564|4637->2645|4683->2682|4722->2683|4751->2684|4798->2700|4861->2736|4876->2742|4923->2768|5026->2844|5072->2881|5111->2882|5140->2883|5187->2899|5250->2935|5265->2941|5312->2967|5423->3051|5471->3090|5510->3091|5539->3092|5586->3108|5649->3144|5664->3150|5713->3178|5825->3263|5873->3302|5912->3303|5941->3304|5988->3320|6051->3356|6066->3362|6115->3390|6343->3591|6379->3618|6418->3619|6447->3620|6494->3636|6523->3637|6839->3926|6854->3932|6893->3950|6969->3999|7005->4026|7044->4027|7073->4028|7120->4044|7158->4055|7173->4061|7213->4079|7370->4209|7385->4215|7429->4238|7721->4503|7749->4510|7785->4519|7849->4556|7864->4562|7944->4621|8024->4674|8039->4680|8128->4748|8208->4801|8223->4807|8298->4861|8378->4914|8393->4920|8527->5032
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|57->26|57->26|57->26|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|82->51|82->51|82->51|82->51|82->51|82->51|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|88->57|88->57|88->57|98->67|98->67|99->68|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74
                  -- GENERATED --
              */
          