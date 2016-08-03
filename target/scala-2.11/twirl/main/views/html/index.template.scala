
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username : String)(privilegio : Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<!--
  Material Design Lite
  Copyright 2015 Google Inc. All rights reserved.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this naoApagar except in compliance with the License.
  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License
-->
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>"""),_display_(/*25.13*/Messages("app.title")),format.raw/*25.34*/("""</title>

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href=""""),_display_(/*29.45*/routes/*29.51*/.Assets.versioned("images/favicon.png")),format.raw/*29.90*/("""">

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content=""""),_display_(/*33.66*/Messages("app.title")),format.raw/*33.87*/("""">
    <meta name="apple-mobile-web-app-title" content=""""),_display_(/*34.55*/Messages("app.title")),format.raw/*34.76*/("""">
    <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*35.53*/routes/*35.59*/.Assets.versioned("images/favicon.png")),format.raw/*35.98*/("""">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <!--<meta name="msapplication-TileImage" content="images/touch/ms-touch-icon-144x144-precomposed.png">-->
    <meta name="msapplication-TileColor" content="#3372DF">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*41.55*/routes/*41.61*/.Assets.versioned("images/favicon.png")),format.raw/*41.100*/("""">

    <!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->
    <!--
    <link rel="canonical" href="http://www.example.com/">
    -->

    """),format.raw/*48.46*/("""
    """),format.raw/*49.5*/("""<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    """),format.raw/*52.29*/("""
    """),format.raw/*53.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*53.50*/routes/*53.56*/.Assets.versioned("bower_components/material-design-lite/material.css")),format.raw/*53.127*/("""">

    """),format.raw/*55.28*/("""
    """),format.raw/*56.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*56.50*/routes/*56.56*/.Assets.versioned("bower_components/angular-loading-bar/src/loading-bar.css")),format.raw/*56.133*/("""">

    """),format.raw/*58.23*/("""
    """),format.raw/*59.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*59.50*/routes/*59.56*/.Assets.versioned("bower_components/angular-toastr/dist/angular-toastr.css")),format.raw/*59.132*/("""">

    """),format.raw/*61.23*/("""
    """),format.raw/*62.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*62.50*/routes/*62.56*/.Assets.versioned("bower_components/angular-motion/dist/angular-motion.css")),format.raw/*62.132*/("""">

    """),format.raw/*64.26*/("""
    """),format.raw/*65.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*65.50*/routes/*65.56*/.Assets.versioned("bower_components/ng-dialog/css/ngDialog.css")),format.raw/*65.120*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*66.50*/routes/*66.56*/.Assets.versioned("bower_components/ng-dialog/css/ngDialog-theme-default.css")),format.raw/*66.134*/("""">

    """),format.raw/*68.18*/("""
    """),format.raw/*69.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*69.50*/routes/*69.56*/.Assets.versioned("bower_components/lightbox2/dist/css/lightbox.css")),format.raw/*69.125*/("""">

    """),format.raw/*71.28*/("""
    """),format.raw/*72.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*72.50*/routes/*72.56*/.Assets.versioned("stylesheets/templatemdl.css")),format.raw/*72.104*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*73.50*/routes/*73.56*/.Assets.versioned("stylesheets/stylebiblioteca.css")),format.raw/*73.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*74.50*/routes/*74.56*/.Assets.versioned("stylesheets/styleartigo.css")),format.raw/*74.104*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*75.50*/routes/*75.56*/.Assets.versioned("stylesheets/cartao.css")),format.raw/*75.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*76.50*/routes/*76.56*/.Assets.versioned("stylesheets/video.css")),format.raw/*76.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*77.50*/routes/*77.56*/.Assets.versioned("stylesheets/tabela.css")),format.raw/*77.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*78.50*/routes/*78.56*/.Assets.versioned("stylesheets/evento.css")),format.raw/*78.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*79.50*/routes/*79.56*/.Assets.versioned("stylesheets/foto.css")),format.raw/*79.97*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*80.50*/routes/*80.56*/.Assets.versioned("stylesheets/home.css")),format.raw/*80.97*/("""">
</head>
<body ng-app="architectplay">
<div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
    <header ng-controller="topmenu" class="demo-header mdl-layout__header mdl-color--deep-orange-cibiogas mdl-color-text--white">
        <div class="mdl-layout__header-row">
            <span class="esconde-celular">
                <a class="mdl-navigation__link mdl-layout-title" href="/architectplay-1.0-SNAPSHOT/#/">"""),_display_(/*87.105*/Messages("app.title")),format.raw/*87.126*/("""</a>
            </span>
            <div class="mdl-layout-spacer"></div>
                """),format.raw/*90.34*/("""
                """),format.raw/*91.17*/("""<nav class="top-navigation mdl-navigation">
                    <a ng-class=""""),format.raw/*92.34*/("""{"""),format.raw/*92.35*/("""activetop: $route.current.activetab == 'home'"""),format.raw/*92.80*/("""}"""),format.raw/*92.81*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/"><i class="mdl-color--text-white material-icons" role="presentation">home</i> """),_display_(/*92.228*/Messages("menu.1")),format.raw/*92.246*/("""</a>
                    <a ng-class=""""),format.raw/*93.34*/("""{"""),format.raw/*93.35*/("""activetop: $route.current.activetab == 'cursos'"""),format.raw/*93.82*/("""}"""),format.raw/*93.83*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/cursos"><i class="mdl-color--text-white material-icons" role="presentation">school</i> """),_display_(/*93.238*/Messages("menu.2")),format.raw/*93.256*/("""</a>
                    <a ng-class=""""),format.raw/*94.34*/("""{"""),format.raw/*94.35*/("""activetop: $route.current.activetab == 'eventos'"""),format.raw/*94.83*/("""}"""),format.raw/*94.84*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/eventos"><i class="mdl-color--text-white material-icons" role="presentation">event</i> """),_display_(/*94.239*/Messages("menu.biogas.9")),format.raw/*94.264*/("""</a>
                </nav>
                <nav class="mdl-navigation-link">
                    """),_display_(/*97.22*/if(!username)/*97.35*/ {_display_(Seq[Any](format.raw/*97.37*/("""
                        """),format.raw/*98.25*/("""<a href=""""),_display_(/*98.35*/routes/*98.41*/.LoginController.telaLogin),format.raw/*98.67*/("""" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-color-text--white">"""),_display_(/*98.146*/Messages("menu.16")),format.raw/*98.165*/("""</a>
                    """)))}),format.raw/*99.22*/("""

                    """),_display_(/*101.22*/if(username)/*101.34*/ {_display_(Seq[Any](format.raw/*101.36*/("""
                        """),format.raw/*102.25*/("""<button class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon" id="hdrbtn">
                            <i class="material-icons">more_vert</i>
                        </button>

                        <ul class="mdl-menu mdl-js-menu mdl-js-ripple-effect mdl-menu--bottom-right" for="hdrbtn">

                            """),_display_(/*108.30*/if(username)/*108.42*/ {_display_(Seq[Any](format.raw/*108.44*/("""
                                """),format.raw/*109.33*/("""<a class="mdl-menu__item mdl-menu__item--full-bleed-divider mdl-color--deep-orange-cibiogas-text">"""),_display_(/*109.132*/username),format.raw/*109.140*/("""</a>
                                <a href="/#/usuario/perfil" class="mdl-menu__item mdl-menu__item--full-bleed-divider">"""),_display_(/*110.120*/Messages("menu.14")),format.raw/*110.139*/("""</a>
                            """)))}),format.raw/*111.30*/("""

                            """),_display_(/*113.30*/if(username)/*113.42*/ {_display_(Seq[Any](format.raw/*113.44*/("""
                                """),format.raw/*114.33*/("""<a type="reset" href=""""),_display_(/*114.56*/routes/*114.62*/.LoginController.logout),format.raw/*114.85*/("""" class="mdl-menu__item">"""),_display_(/*114.111*/Messages("menu.15")),format.raw/*114.130*/("""</a>
                            """)))}),format.raw/*115.30*/("""

                        """),format.raw/*117.25*/("""</ul>
                </nav>
                """)))}),format.raw/*119.18*/("""
        """),format.raw/*120.9*/("""</div>
    </header>

    """),format.raw/*123.20*/("""
    """),format.raw/*124.5*/("""<div ng-controller="drawer" class="demo-drawer mdl-layout__drawer examples">
            <header class="demo-drawer-header">
                <a href="/architectplay-1.0-SNAPSHOT/#/"><img src=""""),_display_(/*126.69*/routes/*126.75*/.Assets.versioned("images/CIBiogas_logo.png")),format.raw/*126.120*/(""""></a>
            </header>
        <nav class="demo-navigation mdl-navigation mdl-color--white">
            """),_display_(/*129.14*/if(username)/*129.26*/{_display_(Seq[Any](format.raw/*129.27*/("""
                """),format.raw/*130.17*/("""<a ng-class=""""),format.raw/*130.30*/("""{"""),format.raw/*130.31*/("""active: $route.current.activetab == 'artigos'"""),format.raw/*130.76*/("""}"""),format.raw/*130.77*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/artigos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">book</i>"""),_display_(/*130.245*/Messages("menu.4")),format.raw/*130.263*/("""</a>
                <a ng-class=""""),format.raw/*131.30*/("""{"""),format.raw/*131.31*/("""active: $route.current.activetab == 'videos'"""),format.raw/*131.75*/("""}"""),format.raw/*131.76*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/videos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">video_library</i>"""),_display_(/*131.252*/Messages("menu.6")),format.raw/*131.270*/("""</a>
                <a ng-class=""""),format.raw/*132.30*/("""{"""),format.raw/*132.31*/("""active: $route.current.activetab == 'fotos'"""),format.raw/*132.74*/("""}"""),format.raw/*132.75*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/fotos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">photo_camera</i>"""),_display_(/*132.249*/Messages("menu.7")),format.raw/*132.267*/("""</a>
                <div class="separador"></div>
            """)))}),format.raw/*134.14*/("""
            """),format.raw/*135.13*/("""<a ng-class=""""),format.raw/*135.26*/("""{"""),format.raw/*135.27*/("""active: $route.current.activetab == 'noticias'"""),format.raw/*135.73*/("""}"""),format.raw/*135.74*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/noticias"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">public</i>"""),_display_(/*135.245*/Messages("menu.biogas.10")),format.raw/*135.271*/("""</a>
            <a ng-class=""""),format.raw/*136.26*/("""{"""),format.raw/*136.27*/("""active: $route.current.activetab == 'publicacoes'"""),format.raw/*136.76*/("""}"""),format.raw/*136.77*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/publicacoes"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">language</i>"""),_display_(/*136.253*/Messages("menu.biogas.11")),format.raw/*136.279*/("""</a>
            <a ng-class=""""),format.raw/*137.26*/("""{"""),format.raw/*137.27*/("""active: $route.current.activetab == 'sobre'"""),format.raw/*137.70*/("""}"""),format.raw/*137.71*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/biogas/sobre"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">ev_station</i>"""),_display_(/*137.250*/Messages("menu.biogas.2")),format.raw/*137.275*/("""</a>
            <a ng-class=""""),format.raw/*138.26*/("""{"""),format.raw/*138.27*/("""active: $route.current.activetab == 'casos'"""),format.raw/*138.70*/("""}"""),format.raw/*138.71*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/casos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">extension</i>"""),_display_(/*138.242*/Messages("menu.biogas.3")),format.raw/*138.267*/("""</a>
            <a ng-class=""""),format.raw/*139.26*/("""{"""),format.raw/*139.27*/("""active: $route.current.activetab == 'ped'"""),format.raw/*139.68*/("""}"""),format.raw/*139.69*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/ped"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">explore</i>"""),_display_(/*139.236*/Messages("menu.biogas.5")),format.raw/*139.261*/("""</a>
            <div class="separador"></div>
            <a ng-class=""""),format.raw/*141.26*/("""{"""),format.raw/*141.27*/("""active: $route.current.activetab == 'marcos'"""),format.raw/*141.71*/("""}"""),format.raw/*141.72*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/marcos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">account_balance</i>"""),_display_(/*141.250*/Messages("menu.biogas.6")),format.raw/*141.275*/("""</a>
            <a ng-class=""""),format.raw/*142.26*/("""{"""),format.raw/*142.27*/("""active: $route.current.activetab == 'aspectos'"""),format.raw/*142.73*/("""}"""),format.raw/*142.74*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/aspectos"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">monetization_on</i>"""),_display_(/*142.254*/Messages("menu.biogas.7")),format.raw/*142.279*/("""</a>
            <a ng-class=""""),format.raw/*143.26*/("""{"""),format.raw/*143.27*/("""active: $route.current.activetab == 'registros'"""),format.raw/*143.74*/("""}"""),format.raw/*143.75*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/registros"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">map</i>"""),_display_(/*143.244*/Messages("menu.biogas.8")),format.raw/*143.269*/("""</a>
            <a ng-class=""""),format.raw/*144.26*/("""{"""),format.raw/*144.27*/("""active: $route.current.activetab == 'ferramentas'"""),format.raw/*144.76*/("""}"""),format.raw/*144.77*/("""" class="mdl-navigation__link" href="/architectplay-1.0-SNAPSHOT/#/ferramentas"><i class="mdl-color--deep-orange-cibiogas-text material-icons" role="presentation">build</i>"""),_display_(/*144.250*/Messages("menu.biogas.4")),format.raw/*144.275*/("""</a>

            """),_display_(/*146.14*/if(username)/*146.26*/{_display_(Seq[Any](format.raw/*146.27*/("""
                """),_display_(/*147.18*/if(privilegio == 1)/*147.37*/{_display_(Seq[Any](format.raw/*147.38*/("""
                    """),format.raw/*148.21*/("""<div class="separador"></div>
                    <span class="mdl-navigation__link">"""),_display_(/*149.57*/Messages("menu.12")),format.raw/*149.76*/("""</span>
                    <a class="mdl-navigation__link" href=""""),_display_(/*150.60*/routes/*150.66*/.AdminController.inicio),format.raw/*150.89*/(""""><i class="mdl-color-text--blue-grey-500 material-icons" role="presentation">collections_bookmark</i>"""),_display_(/*150.192*/Messages("menu.13")),format.raw/*150.211*/("""</a>
                """)))}),format.raw/*151.18*/("""
            """)))}),format.raw/*152.14*/("""

            """),format.raw/*154.13*/("""<div class="mdl-layout-spacer"></div>
        </nav>
    </div>

    """),format.raw/*158.52*/("""
    """),format.raw/*159.5*/("""<main class="mdl-layout__content mdl-color--grey-100">
        <div ng-view="">

        </div>
        <footer class="mdl-mini-footer mdl-color--grey-200">
            <div class="mdl-mini-footer__left-section">
                <ul class="mdl-mini-footer__link-list">
                    <li><a class="mdl-color-text--grey-500" href="/architectplay-1.0-SNAPSHOT/#/">&copy; 2016 - """),_display_(/*166.114*/Messages("app.title")),format.raw/*166.135*/("""</a></li>
                    <li><a class="mdl-color-text--grey-500" href="https://cibiogas.org" target="_blank">CIBiogás</a></li>
                    <li><a class="mdl-color-text--grey-500" href="/architectplay-1.0-SNAPSHOT/#/direitos">"""),_display_(/*168.108*/Messages("menu.10")),format.raw/*168.127*/("""</a></li>
                </ul>
            </div>
            <div class="mdl-mini-footer__right-section">
                <ul class="mdl-mini-footer__link-list">
                    <li><a class="mdl-color-text--grey-500" href="https://www.facebook.com/cibiogas" target="_blank">Facebook</a></li>
                    <li><a class="mdl-color-text--grey-500" href="https://www.youtube.com/channel/UCEuoR_lr7wqdQYcPSoPZnng/feed" target="_blank">Youtube</a></li>
                    <li><a class="mdl-color-text--grey-500" href="https://www.linkedin.com/company/cibiog%C3%A1s-er" target="_blank">Linkedin</a></li>
                </ul>
            </div>
        </footer>
    </main>

</div>

    """),format.raw/*183.59*/("""
"""),format.raw/*184.1*/("""<script src=""""),_display_(/*184.15*/routes/*184.21*/.Application.jsMessages()),format.raw/*184.46*/("""" type="text/javascript"></script>

    """),format.raw/*186.31*/("""
"""),format.raw/*187.1*/("""<script src=""""),_display_(/*187.15*/routes/*187.21*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*187.80*/("""" type="text/javascript"></script>

    """),format.raw/*189.15*/("""
"""),format.raw/*190.1*/("""<script src=""""),_display_(/*190.15*/routes/*190.21*/.Assets.versioned("bower_components/lodash/lodash.js")),format.raw/*190.75*/("""" type="text/javascript"></script>

    """),format.raw/*192.16*/("""
"""),format.raw/*193.1*/("""<script src=""""),_display_(/*193.15*/routes/*193.21*/.Assets.versioned("bower_components/angular/angular.js")),format.raw/*193.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*194.15*/routes/*194.21*/.Assets.versioned("bower_components/angular-route/angular-route.js")),format.raw/*194.89*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*195.15*/routes/*195.21*/.Assets.versioned("bower_components/angular-resource/angular-resource.js")),format.raw/*195.95*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*196.15*/routes/*196.21*/.Assets.versioned("bower_components/angular-aria/angular-aria.js")),format.raw/*196.87*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*197.15*/routes/*197.21*/.Assets.versioned("bower_components/angular-animate/angular-animate.js")),format.raw/*197.93*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*198.15*/routes/*198.21*/.Assets.versioned("bower_components/angular-sanitize/angular-sanitize.js")),format.raw/*198.95*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*199.15*/routes/*199.21*/.Assets.versioned("bower_components/angular-simple-logger/dist/angular-simple-logger.js")),format.raw/*199.110*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*200.15*/routes/*200.21*/.Assets.versioned("bower_components/angular-google-maps/dist/angular-google-maps.js")),format.raw/*200.106*/("""" type="text/javascript"></script>

    """),format.raw/*202.24*/("""
"""),format.raw/*203.1*/("""<script src=""""),_display_(/*203.15*/routes/*203.21*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*203.91*/("""" type="text/javascript"></script>

    """),format.raw/*205.28*/("""
"""),format.raw/*206.1*/("""<script src=""""),_display_(/*206.15*/routes/*206.21*/.Assets.versioned("bower_components/angular-loading-bar/src/loading-bar.js")),format.raw/*206.97*/("""" type="text/javascript"></script>

    """),format.raw/*208.23*/("""
"""),format.raw/*209.1*/("""<script src=""""),_display_(/*209.15*/routes/*209.21*/.Assets.versioned("bower_components/angular-toastr/dist/angular-toastr.tpls.js")),format.raw/*209.101*/("""" type="text/javascript"></script>

    """),format.raw/*211.18*/("""
"""),format.raw/*212.1*/("""<script src=""""),_display_(/*212.15*/routes/*212.21*/.Assets.versioned("bower_components/ng-dialog/js/ngDialog.js")),format.raw/*212.83*/("""" type="text/javascript"></script>

    """),format.raw/*214.18*/("""
"""),format.raw/*215.1*/("""<script src=""""),_display_(/*215.15*/routes/*215.21*/.Assets.versioned("bower_components/moment/moment.js")),format.raw/*215.75*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*216.15*/routes/*216.21*/.Assets.versioned("bower_components/moment/locale/pt-br.js")),format.raw/*216.81*/("""" type="text/javascript"></script>

    """),format.raw/*218.18*/("""
"""),format.raw/*219.1*/("""<script src=""""),_display_(/*219.15*/routes/*219.21*/.Assets.versioned("bower_components/lightbox2/dist/js/lightbox.js")),format.raw/*219.88*/("""" type="text/javascript"></script>

    """),format.raw/*221.40*/("""
"""),format.raw/*222.1*/("""<script src="https://www.youtube.com/iframe_api" type="text/javascript"></script>

    """),format.raw/*224.30*/("""
"""),format.raw/*225.1*/("""<script src=""""),_display_(/*225.15*/routes/*225.21*/.Assets.versioned("bower_components/angular-youtube-mb/src/angular-youtube-embed.js")),format.raw/*225.106*/("""" type="text/javascript"></script>

    """),format.raw/*227.26*/("""
"""),format.raw/*228.1*/("""<script src=""""),_display_(/*228.15*/routes/*228.21*/.Assets.versioned("app/app.js")),format.raw/*228.52*/("""" type="text/javascript"></script>

    """),format.raw/*230.71*/("""
"""),format.raw/*231.1*/("""<script src=""""),_display_(/*231.15*/routes/*231.21*/.Assets.versioned("app/services/address.service.js")),format.raw/*231.73*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*232.15*/routes/*232.21*/.Assets.versioned("app/services/baseurl.service.js")),format.raw/*232.73*/("""" type="text/javascript"></script>

    """),format.raw/*234.20*/("""
"""),format.raw/*235.1*/("""<script src=""""),_display_(/*235.15*/routes/*235.21*/.Assets.versioned("app/controllers/drawer.controller.js")),format.raw/*235.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*236.15*/routes/*236.21*/.Assets.versioned("app/controllers/topmenu.controller.js")),format.raw/*236.79*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*237.15*/routes/*237.21*/.Assets.versioned("app/controllers/home.controller.js")),format.raw/*237.76*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*238.15*/routes/*238.21*/.Assets.versioned("app/controllers/menu.controller.js")),format.raw/*238.76*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*239.15*/routes/*239.21*/.Assets.versioned("app/controllers/usuario.controller.js")),format.raw/*239.79*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*240.15*/routes/*240.21*/.Assets.versioned("app/controllers/livro.controller.js")),format.raw/*240.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*241.15*/routes/*241.21*/.Assets.versioned("app/controllers/curso.controller.js")),format.raw/*241.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*242.15*/routes/*242.21*/.Assets.versioned("app/controllers/artigo.controller.js")),format.raw/*242.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*243.15*/routes/*243.21*/.Assets.versioned("app/controllers/video.controller.js")),format.raw/*243.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*244.15*/routes/*244.21*/.Assets.versioned("app/controllers/foto.controller.js")),format.raw/*244.76*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*245.15*/routes/*245.21*/.Assets.versioned("app/controllers/direito.controller.js")),format.raw/*245.79*/("""" type="text/javascript"></script>


    """),format.raw/*248.27*/("""
"""),format.raw/*249.1*/("""<script src=""""),_display_(/*249.15*/routes/*249.21*/.Assets.versioned("app/controllers/sobre.controller.js")),format.raw/*249.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*250.15*/routes/*250.21*/.Assets.versioned("app/controllers/casos.controller.js")),format.raw/*250.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*251.15*/routes/*251.21*/.Assets.versioned("app/controllers/ferramentas.controller.js")),format.raw/*251.83*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*252.15*/routes/*252.21*/.Assets.versioned("app/controllers/ped.controller.js")),format.raw/*252.75*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*253.15*/routes/*253.21*/.Assets.versioned("app/controllers/marcos.controller.js")),format.raw/*253.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*254.15*/routes/*254.21*/.Assets.versioned("app/controllers/aspectos.controller.js")),format.raw/*254.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*255.15*/routes/*255.21*/.Assets.versioned("app/controllers/registros.controller.js")),format.raw/*255.81*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*256.15*/routes/*256.21*/.Assets.versioned("app/controllers/evento.controller.js")),format.raw/*256.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*257.15*/routes/*257.21*/.Assets.versioned("app/controllers/noticia.controller.js")),format.raw/*257.79*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*258.15*/routes/*258.21*/.Assets.versioned("app/controllers/publicacao.controller.js")),format.raw/*258.82*/("""" type="text/javascript"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(username:String,privilegio:Integer): play.twirl.api.HtmlFormat.Appendable = apply(username)(privilegio)

  def f:((String) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (username) => (privilegio) => apply(username)(privilegio)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Aug 03 13:03:32 BRT 2016
                  SOURCE: /home/haroldo/projetos/architectplay/app/views/index.scala.html
                  HASH: f19aa119908771e98c5b76cd8158d55d9a71abdb
                  MATRIX: 753->1|889->42|916->43|1774->874|1816->895|2005->1057|2020->1063|2080->1102|2286->1281|2328->1302|2412->1359|2454->1380|2536->1435|2551->1441|2611->1480|2922->1764|2937->1770|2998->1809|3296->2120|3328->2125|3597->2390|3629->2395|3701->2440|3716->2446|3809->2517|3845->2548|3877->2553|3949->2598|3964->2604|4063->2681|4099->2707|4131->2712|4203->2757|4218->2763|4316->2839|4352->2865|4384->2870|4456->2915|4471->2921|4569->2997|4605->3026|4637->3031|4709->3076|4724->3082|4810->3146|4889->3198|4904->3204|5004->3282|5040->3303|5072->3308|5144->3353|5159->3359|5250->3428|5286->3459|5318->3464|5390->3509|5405->3515|5475->3563|5554->3615|5569->3621|5643->3673|5722->3725|5737->3731|5807->3779|5886->3831|5901->3837|5965->3880|6044->3932|6059->3938|6122->3980|6201->4032|6216->4038|6280->4081|6359->4133|6374->4139|6438->4182|6517->4234|6532->4240|6594->4281|6673->4333|6688->4339|6750->4380|7242->4844|7285->4865|7404->4973|7449->4990|7554->5067|7583->5068|7656->5113|7685->5114|7860->5261|7900->5279|7966->5317|7995->5318|8070->5365|8099->5366|8282->5521|8322->5539|8388->5577|8417->5578|8493->5626|8522->5627|8705->5782|8752->5807|8878->5906|8900->5919|8940->5921|8993->5946|9030->5956|9045->5962|9092->5988|9199->6067|9240->6086|9297->6112|9348->6135|9370->6147|9411->6149|9465->6174|9833->6514|9855->6526|9896->6528|9958->6561|10086->6660|10117->6668|10270->6792|10312->6811|10378->6845|10437->6876|10459->6888|10500->6890|10562->6923|10613->6946|10629->6952|10674->6975|10729->7001|10771->7020|10837->7054|10892->7080|10970->7126|11007->7135|11062->7176|11095->7181|11316->7374|11332->7380|11400->7425|11540->7537|11562->7549|11602->7550|11648->7567|11690->7580|11720->7581|11794->7626|11824->7627|12021->7795|12062->7813|12125->7847|12155->7848|12228->7892|12258->7893|12463->8069|12504->8087|12567->8121|12597->8122|12669->8165|12699->8166|12902->8340|12943->8358|13039->8422|13081->8435|13123->8448|13153->8449|13228->8495|13258->8496|13458->8667|13507->8693|13566->8723|13596->8724|13674->8773|13704->8774|13909->8950|13958->8976|14017->9006|14047->9007|14119->9050|14149->9051|14357->9230|14405->9255|14464->9285|14494->9286|14566->9329|14596->9330|14796->9501|14844->9526|14903->9556|14933->9557|15003->9598|15033->9599|15229->9766|15277->9791|15378->9863|15408->9864|15481->9908|15511->9909|15718->10087|15766->10112|15825->10142|15855->10143|15930->10189|15960->10190|16169->10370|16217->10395|16276->10425|16306->10426|16382->10473|16412->10474|16610->10643|16658->10668|16717->10698|16747->10699|16825->10748|16855->10749|17057->10922|17105->10947|17152->10966|17174->10978|17214->10979|17260->10997|17289->11016|17329->11017|17379->11038|17493->11124|17534->11143|17629->11210|17645->11216|17690->11239|17822->11342|17864->11361|17918->11383|17964->11397|18007->11411|18105->11527|18138->11532|18549->11914|18593->11935|18861->12174|18903->12193|19628->12943|19657->12944|19699->12958|19715->12964|19762->12989|19831->13055|19860->13056|19902->13070|19918->13076|19999->13135|20068->13185|20097->13186|20139->13200|20155->13206|20231->13260|20300->13311|20329->13312|20371->13326|20387->13332|20465->13388|20542->13437|20558->13443|20648->13511|20725->13560|20741->13566|20837->13640|20914->13689|20930->13695|21018->13761|21095->13810|21111->13816|21205->13888|21282->13937|21298->13943|21394->14017|21471->14066|21487->14072|21599->14161|21676->14210|21692->14216|21800->14301|21869->14360|21898->14361|21940->14375|21956->14381|22048->14451|22117->14514|22146->14515|22188->14529|22204->14535|22302->14611|22371->14669|22400->14670|22442->14684|22458->14690|22561->14770|22630->14823|22659->14824|22701->14838|22717->14844|22801->14906|22870->14959|22899->14960|22941->14974|22957->14980|23033->15034|23110->15083|23126->15089|23208->15149|23277->15202|23306->15203|23348->15217|23364->15223|23453->15290|23522->15365|23551->15366|23667->15478|23696->15479|23738->15493|23754->15499|23862->15584|23931->15645|23960->15646|24002->15660|24018->15666|24071->15697|24140->15803|24169->15804|24211->15818|24227->15824|24301->15876|24378->15925|24394->15931|24468->15983|24537->16038|24566->16039|24608->16053|24624->16059|24703->16116|24780->16165|24796->16171|24876->16229|24953->16278|24969->16284|25046->16339|25123->16388|25139->16394|25216->16449|25293->16498|25309->16504|25389->16562|25466->16611|25482->16617|25560->16673|25637->16722|25653->16728|25731->16784|25808->16833|25824->16839|25903->16896|25980->16945|25996->16951|26074->17007|26151->17056|26167->17062|26244->17117|26321->17166|26337->17172|26417->17230|26487->17293|26516->17294|26558->17308|26574->17314|26652->17370|26729->17419|26745->17425|26823->17481|26900->17530|26916->17536|27000->17598|27077->17647|27093->17653|27169->17707|27246->17756|27262->17762|27341->17819|27418->17868|27434->17874|27515->17933|27592->17982|27608->17988|27690->18048|27767->18097|27783->18103|27862->18160|27939->18209|27955->18215|28035->18273|28112->18322|28128->18328|28211->18389
                  LINES: 27->1|32->1|33->2|56->25|56->25|60->29|60->29|60->29|64->33|64->33|65->34|65->34|66->35|66->35|66->35|72->41|72->41|72->41|79->48|80->49|83->52|84->53|84->53|84->53|84->53|86->55|87->56|87->56|87->56|87->56|89->58|90->59|90->59|90->59|90->59|92->61|93->62|93->62|93->62|93->62|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|99->68|100->69|100->69|100->69|100->69|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|118->87|118->87|121->90|122->91|123->92|123->92|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|128->97|128->97|128->97|129->98|129->98|129->98|129->98|129->98|129->98|130->99|132->101|132->101|132->101|133->102|139->108|139->108|139->108|140->109|140->109|140->109|141->110|141->110|142->111|144->113|144->113|144->113|145->114|145->114|145->114|145->114|145->114|145->114|146->115|148->117|150->119|151->120|154->123|155->124|157->126|157->126|157->126|160->129|160->129|160->129|161->130|161->130|161->130|161->130|161->130|161->130|161->130|162->131|162->131|162->131|162->131|162->131|162->131|163->132|163->132|163->132|163->132|163->132|163->132|165->134|166->135|166->135|166->135|166->135|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|167->136|168->137|168->137|168->137|168->137|168->137|168->137|169->138|169->138|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|170->139|170->139|172->141|172->141|172->141|172->141|172->141|172->141|173->142|173->142|173->142|173->142|173->142|173->142|174->143|174->143|174->143|174->143|174->143|174->143|175->144|175->144|175->144|175->144|175->144|175->144|177->146|177->146|177->146|178->147|178->147|178->147|179->148|180->149|180->149|181->150|181->150|181->150|181->150|181->150|182->151|183->152|185->154|189->158|190->159|197->166|197->166|199->168|199->168|214->183|215->184|215->184|215->184|215->184|217->186|218->187|218->187|218->187|218->187|220->189|221->190|221->190|221->190|221->190|223->192|224->193|224->193|224->193|224->193|225->194|225->194|225->194|226->195|226->195|226->195|227->196|227->196|227->196|228->197|228->197|228->197|229->198|229->198|229->198|230->199|230->199|230->199|231->200|231->200|231->200|233->202|234->203|234->203|234->203|234->203|236->205|237->206|237->206|237->206|237->206|239->208|240->209|240->209|240->209|240->209|242->211|243->212|243->212|243->212|243->212|245->214|246->215|246->215|246->215|246->215|247->216|247->216|247->216|249->218|250->219|250->219|250->219|250->219|252->221|253->222|255->224|256->225|256->225|256->225|256->225|258->227|259->228|259->228|259->228|259->228|261->230|262->231|262->231|262->231|262->231|263->232|263->232|263->232|265->234|266->235|266->235|266->235|266->235|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238|270->239|270->239|270->239|271->240|271->240|271->240|272->241|272->241|272->241|273->242|273->242|273->242|274->243|274->243|274->243|275->244|275->244|275->244|276->245|276->245|276->245|279->248|280->249|280->249|280->249|280->249|281->250|281->250|281->250|282->251|282->251|282->251|283->252|283->252|283->252|284->253|284->253|284->253|285->254|285->254|285->254|286->255|286->255|286->255|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258
                  -- GENERATED --
              */
          