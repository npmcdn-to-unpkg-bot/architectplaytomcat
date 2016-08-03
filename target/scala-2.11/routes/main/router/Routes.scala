
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/architectplay/conf/routes
// @DATE:Wed Aug 03 12:58:38 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_13: controllers.Application,
  // @LINE:11
  AdminController_0: controllers.AdminController,
  // @LINE:14
  LoginController_12: controllers.LoginController,
  // @LINE:23
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:38
  ArtigoController_14: controllers.ArtigoController,
  // @LINE:52
  LivroController_1: controllers.LivroController,
  // @LINE:65
  EventoController_9: controllers.EventoController,
  // @LINE:77
  CursoController_6: controllers.CursoController,
  // @LINE:89
  VideoController_8: controllers.VideoController,
  // @LINE:101
  PublicacaoController_11: controllers.PublicacaoController,
  // @LINE:113
  NoticiaController_5: controllers.NoticiaController,
  // @LINE:128
  SenhaController_7: controllers.SenhaController,
  // @LINE:135
  ContatoController_2: controllers.ContatoController,
  // @LINE:142
  InscricaoController_4: controllers.InscricaoController,
  // @LINE:148
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_13: controllers.Application,
    // @LINE:11
    AdminController_0: controllers.AdminController,
    // @LINE:14
    LoginController_12: controllers.LoginController,
    // @LINE:23
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:38
    ArtigoController_14: controllers.ArtigoController,
    // @LINE:52
    LivroController_1: controllers.LivroController,
    // @LINE:65
    EventoController_9: controllers.EventoController,
    // @LINE:77
    CursoController_6: controllers.CursoController,
    // @LINE:89
    VideoController_8: controllers.VideoController,
    // @LINE:101
    PublicacaoController_11: controllers.PublicacaoController,
    // @LINE:113
    NoticiaController_5: controllers.NoticiaController,
    // @LINE:128
    SenhaController_7: controllers.SenhaController,
    // @LINE:135
    ContatoController_2: controllers.ContatoController,
    // @LINE:142
    InscricaoController_4: controllers.InscricaoController,
    // @LINE:148
    Assets_10: controllers.Assets
  ) = this(errorHandler, Application_13, AdminController_0, LoginController_12, UsuarioController_3, ArtigoController_14, LivroController_1, EventoController_9, CursoController_6, VideoController_8, PublicacaoController_11, NoticiaController_5, SenhaController_7, ContatoController_2, InscricaoController_4, Assets_10, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_13, AdminController_0, LoginController_12, UsuarioController_3, ArtigoController_14, LivroController_1, EventoController_9, CursoController_6, VideoController_8, PublicacaoController_11, NoticiaController_5, SenhaController_7, ContatoController_2, InscricaoController_4, Assets_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sobre""", """controllers.Application.sobre()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages.js""", """controllers.Application.jsMessages()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminController.inicio()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.telaLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autenticado""", """controllers.LoginController.telaAutenticado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saiu""", """controllers.LoginController.telaLogout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autenticar""", """controllers.LoginController.autenticar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastro""", """controllers.UsuarioController.telaCadastro()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/editar/$id<[^/]+>""", """controllers.UsuarioController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/cadastrado""", """controllers.UsuarioController.telaCadastrado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/detalhe/$id<[^/]+>""", """controllers.UsuarioController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/lista/todos""", """controllers.UsuarioController.telaLista()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.UsuarioController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/editar/$id<[^/]+>""", """controllers.UsuarioController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/$id<[^/]+>""", """controllers.UsuarioController.buscaPorId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """current""", """controllers.UsuarioController.autenticado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/filtro/$filtro<[^/]+>""", """controllers.UsuarioController.filtra(filtro:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/$id<[^/]+>/remover""", """controllers.UsuarioController.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/novo/""", """controllers.ArtigoController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/editar/$id<[^/]+>""", """controllers.ArtigoController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/detalhe/$id<[^/]+>""", """controllers.ArtigoController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/lista/todos""", """controllers.ArtigoController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigos""", """controllers.ArtigoController.buscaTodos()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/pdf/$titulo<[^/]+>""", """controllers.ArtigoController.pdf(titulo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigos/filtro/$filtro<[^/]+>""", """controllers.ArtigoController.filtra(filtro:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo""", """controllers.ArtigoController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/$id<[^/]+>/remover""", """controllers.ArtigoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artigo/editar/$id<[^/]+>""", """controllers.ArtigoController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/novo/""", """controllers.LivroController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/detalhe/$id<[^/]+>""", """controllers.LivroController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/editar/$id<[^/]+>""", """controllers.LivroController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/lista/todos""", """controllers.LivroController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livros""", """controllers.LivroController.buscaTodos()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/pdf/$titulo<[^/]+>""", """controllers.LivroController.pdf(titulo:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro""", """controllers.LivroController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/$id<[^/]+>/remover""", """controllers.LivroController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livro/editar/$id<[^/]+>""", """controllers.LivroController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/novo/""", """controllers.EventoController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/detalhe/$id<[^/]+>""", """controllers.EventoController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/editar/$id<[^/]+>""", """controllers.EventoController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/lista/todos""", """controllers.EventoController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventos""", """controllers.EventoController.buscaTodos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento""", """controllers.EventoController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/$id<[^/]+>/remover""", """controllers.EventoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """evento/editar/$id<[^/]+>""", """controllers.EventoController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/novo/""", """controllers.CursoController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/detalhe/$id<[^/]+>""", """controllers.CursoController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/editar/$id<[^/]+>""", """controllers.CursoController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/lista/todos""", """controllers.CursoController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cursos""", """controllers.CursoController.buscaTodos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso""", """controllers.CursoController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/$id<[^/]+>/remover""", """controllers.CursoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curso/editar/$id<[^/]+>""", """controllers.CursoController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/novo/""", """controllers.VideoController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/detalhe/$id<[^/]+>""", """controllers.VideoController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/editar/$id<[^/]+>""", """controllers.VideoController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/lista/todos""", """controllers.VideoController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """videos""", """controllers.VideoController.buscaTodos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video""", """controllers.VideoController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/$id<[^/]+>/remover""", """controllers.VideoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """video/editar/$id<[^/]+>""", """controllers.VideoController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/novo/""", """controllers.PublicacaoController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/detalhe/$id<[^/]+>""", """controllers.PublicacaoController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/editar/$id<[^/]+>""", """controllers.PublicacaoController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/lista/todos""", """controllers.PublicacaoController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacoes""", """controllers.PublicacaoController.buscaTodos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao""", """controllers.PublicacaoController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/$id<[^/]+>/remover""", """controllers.PublicacaoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publicacao/editar/$id<[^/]+>""", """controllers.PublicacaoController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/novo/""", """controllers.NoticiaController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/detalhe/$id<[^/]+>""", """controllers.NoticiaController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/editar/$id<[^/]+>""", """controllers.NoticiaController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/lista/todos""", """controllers.NoticiaController.telaLista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticias""", """controllers.NoticiaController.buscaTodos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia""", """controllers.NoticiaController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/$id<[^/]+>/remover""", """controllers.NoticiaController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noticia/editar/$id<[^/]+>""", """controllers.NoticiaController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirma/$confirmaToken<[^/]+>""", """controllers.UsuarioController.confirma(confirmaToken:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/senha""", """controllers.SenhaController.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.SenhaController.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.SenhaController.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contatos""", """controllers.ContatoController.buscaTodos()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contatos/filtro/$filtro<[^/]+>""", """controllers.ContatoController.filtra(filtro:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contato/$id<[^/]+>""", """controllers.ContatoController.buscaPorId(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contato/$id<[^/]+>""", """controllers.ContatoController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contato""", """controllers.ContatoController.inserir()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscricao""", """controllers.InscricaoController.telaInscricao(id:Long ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscricao""", """controllers.InscricaoController.inserir(id:Long ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_13.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Application""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_sobre1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sobre")))
  )
  private[this] lazy val controllers_Application_sobre1_invoker = createInvoker(
    Application_13.sobre(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sobre",
      Nil,
      "GET",
      """""",
      this.prefix + """sobre"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_jsMessages2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages.js")))
  )
  private[this] lazy val controllers_Application_jsMessages2_invoker = createInvoker(
    Application_13.jsMessages(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsMessages",
      Nil,
      "GET",
      """""",
      this.prefix + """messages.js"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AdminController_inicio3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_inicio3_invoker = createInvoker(
    AdminController_0.inicio(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "inicio",
      Nil,
      "GET",
      """ Admin""",
      this.prefix + """admin"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_telaLogin4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_telaLogin4_invoker = createInvoker(
    LoginController_12.telaLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "telaLogin",
      Nil,
      "GET",
      """ Login Telas""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_telaAutenticado5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autenticado")))
  )
  private[this] lazy val controllers_LoginController_telaAutenticado5_invoker = createInvoker(
    LoginController_12.telaAutenticado(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "telaAutenticado",
      Nil,
      "GET",
      """""",
      this.prefix + """autenticado"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_telaLogout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saiu")))
  )
  private[this] lazy val controllers_LoginController_telaLogout6_invoker = createInvoker(
    LoginController_12.telaLogout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "telaLogout",
      Nil,
      "GET",
      """""",
      this.prefix + """saiu"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout7_invoker = createInvoker(
    LoginController_12.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """ Login Servicos""",
      this.prefix + """logout"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_autenticar8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autenticar")))
  )
  private[this] lazy val controllers_LoginController_autenticar8_invoker = createInvoker(
    LoginController_12.autenticar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "autenticar",
      Nil,
      "POST",
      """""",
      this.prefix + """autenticar"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UsuarioController_telaCadastro9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastro")))
  )
  private[this] lazy val controllers_UsuarioController_telaCadastro9_invoker = createInvoker(
    UsuarioController_3.telaCadastro(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaCadastro",
      Nil,
      "GET",
      """ Usuario telas""",
      this.prefix + """cadastro"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UsuarioController_telaEditar10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_telaEditar10_invoker = createInvoker(
    UsuarioController_3.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/editar/$id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UsuarioController_telaCadastrado11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/cadastrado")))
  )
  private[this] lazy val controllers_UsuarioController_telaCadastrado11_invoker = createInvoker(
    UsuarioController_3.telaCadastrado(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaCadastrado",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/cadastrado"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UsuarioController_telaDetalhe12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_telaDetalhe12_invoker = createInvoker(
    UsuarioController_3.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UsuarioController_telaLista13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/lista/todos")))
  )
  private[this] lazy val controllers_UsuarioController_telaLista13_invoker = createInvoker(
    UsuarioController_3.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/lista/todos"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UsuarioController_inserir14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_UsuarioController_inserir14_invoker = createInvoker(
    UsuarioController_3.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "inserir",
      Nil,
      "POST",
      """ Usuario Servicos""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UsuarioController_editar15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_editar15_invoker = createInvoker(
    UsuarioController_3.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """usuario/editar/$id<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_UsuarioController_buscaPorId16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_buscaPorId16_invoker = createInvoker(
    UsuarioController_3.buscaPorId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "buscaPorId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/$id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UsuarioController_autenticado17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("current")))
  )
  private[this] lazy val controllers_UsuarioController_autenticado17_invoker = createInvoker(
    UsuarioController_3.autenticado(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "autenticado",
      Nil,
      "GET",
      """""",
      this.prefix + """current"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_UsuarioController_filtra18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/filtro/"), DynamicPart("filtro", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_filtra18_invoker = createInvoker(
    UsuarioController_3.filtra(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "filtra",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """usuarios/filtro/$filtro<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UsuarioController_remover19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_UsuarioController_remover19_invoker = createInvoker(
    UsuarioController_3.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """usuario/$id<[^/]+>/remover"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ArtigoController_telaNovo20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/novo/")))
  )
  private[this] lazy val controllers_ArtigoController_telaNovo20_invoker = createInvoker(
    ArtigoController_14.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "telaNovo",
      Nil,
      "GET",
      """ Artigo Telas""",
      this.prefix + """artigo/novo/"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ArtigoController_telaEditar21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtigoController_telaEditar21_invoker = createInvoker(
    ArtigoController_14.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """artigo/editar/$id<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ArtigoController_telaDetalhe22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtigoController_telaDetalhe22_invoker = createInvoker(
    ArtigoController_14.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """artigo/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ArtigoController_telaLista23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/lista/todos")))
  )
  private[this] lazy val controllers_ArtigoController_telaLista23_invoker = createInvoker(
    ArtigoController_14.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """artigo/lista/todos"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ArtigoController_buscaTodos24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigos")))
  )
  private[this] lazy val controllers_ArtigoController_buscaTodos24_invoker = createInvoker(
    ArtigoController_14.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Artigo Servicos""",
      this.prefix + """artigos"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ArtigoController_pdf25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/pdf/"), DynamicPart("titulo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtigoController_pdf25_invoker = createInvoker(
    ArtigoController_14.pdf(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "pdf",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """artigo/pdf/$titulo<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ArtigoController_filtra26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigos/filtro/"), DynamicPart("filtro", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtigoController_filtra26_invoker = createInvoker(
    ArtigoController_14.filtra(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "filtra",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """artigos/filtro/$filtro<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ArtigoController_inserir27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo")))
  )
  private[this] lazy val controllers_ArtigoController_inserir27_invoker = createInvoker(
    ArtigoController_14.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """artigo"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ArtigoController_remover28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_ArtigoController_remover28_invoker = createInvoker(
    ArtigoController_14.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """artigo/$id<[^/]+>/remover"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ArtigoController_editar29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artigo/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtigoController_editar29_invoker = createInvoker(
    ArtigoController_14.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtigoController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """artigo/editar/$id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_LivroController_telaNovo30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/novo/")))
  )
  private[this] lazy val controllers_LivroController_telaNovo30_invoker = createInvoker(
    LivroController_1.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "telaNovo",
      Nil,
      "GET",
      """ Livro Telas""",
      this.prefix + """livro/novo/"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_LivroController_telaDetalhe31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_telaDetalhe31_invoker = createInvoker(
    LivroController_1.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """livro/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_LivroController_telaEditar32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_telaEditar32_invoker = createInvoker(
    LivroController_1.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """livro/editar/$id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_LivroController_telaLista33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/lista/todos")))
  )
  private[this] lazy val controllers_LivroController_telaLista33_invoker = createInvoker(
    LivroController_1.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """livro/lista/todos"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_LivroController_buscaTodos34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livros")))
  )
  private[this] lazy val controllers_LivroController_buscaTodos34_invoker = createInvoker(
    LivroController_1.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "buscaTodos",
      Nil,
      "GET",
      """ Livro Servicos""",
      this.prefix + """livros"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_LivroController_pdf35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/pdf/"), DynamicPart("titulo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_pdf35_invoker = createInvoker(
    LivroController_1.pdf(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "pdf",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """livro/pdf/$titulo<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_LivroController_inserir36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro")))
  )
  private[this] lazy val controllers_LivroController_inserir36_invoker = createInvoker(
    LivroController_1.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """livro"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_LivroController_remover37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_LivroController_remover37_invoker = createInvoker(
    LivroController_1.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """livro/$id<[^/]+>/remover"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_LivroController_editar38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livro/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LivroController_editar38_invoker = createInvoker(
    LivroController_1.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LivroController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """livro/editar/$id<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_EventoController_telaNovo39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/novo/")))
  )
  private[this] lazy val controllers_EventoController_telaNovo39_invoker = createInvoker(
    EventoController_9.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "telaNovo",
      Nil,
      "GET",
      """ Evento Telas""",
      this.prefix + """evento/novo/"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_EventoController_telaDetalhe40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EventoController_telaDetalhe40_invoker = createInvoker(
    EventoController_9.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """evento/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_EventoController_telaEditar41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EventoController_telaEditar41_invoker = createInvoker(
    EventoController_9.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """evento/editar/$id<[^/]+>"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_EventoController_telaLista42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/lista/todos")))
  )
  private[this] lazy val controllers_EventoController_telaLista42_invoker = createInvoker(
    EventoController_9.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """evento/lista/todos"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_EventoController_buscaTodos43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventos")))
  )
  private[this] lazy val controllers_EventoController_buscaTodos43_invoker = createInvoker(
    EventoController_9.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Evento Servicos""",
      this.prefix + """eventos"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_EventoController_inserir44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento")))
  )
  private[this] lazy val controllers_EventoController_inserir44_invoker = createInvoker(
    EventoController_9.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """evento"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_EventoController_remover45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_EventoController_remover45_invoker = createInvoker(
    EventoController_9.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """evento/$id<[^/]+>/remover"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_EventoController_editar46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("evento/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EventoController_editar46_invoker = createInvoker(
    EventoController_9.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventoController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """evento/editar/$id<[^/]+>"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_CursoController_telaNovo47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/novo/")))
  )
  private[this] lazy val controllers_CursoController_telaNovo47_invoker = createInvoker(
    CursoController_6.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "telaNovo",
      Nil,
      "GET",
      """ Curso Telas""",
      this.prefix + """curso/novo/"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_CursoController_telaDetalhe48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CursoController_telaDetalhe48_invoker = createInvoker(
    CursoController_6.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """curso/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_CursoController_telaEditar49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CursoController_telaEditar49_invoker = createInvoker(
    CursoController_6.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """curso/editar/$id<[^/]+>"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_CursoController_telaLista50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/lista/todos")))
  )
  private[this] lazy val controllers_CursoController_telaLista50_invoker = createInvoker(
    CursoController_6.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """curso/lista/todos"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_CursoController_buscaTodos51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cursos")))
  )
  private[this] lazy val controllers_CursoController_buscaTodos51_invoker = createInvoker(
    CursoController_6.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Evento Servicos""",
      this.prefix + """cursos"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_CursoController_inserir52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso")))
  )
  private[this] lazy val controllers_CursoController_inserir52_invoker = createInvoker(
    CursoController_6.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """curso"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_CursoController_remover53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_CursoController_remover53_invoker = createInvoker(
    CursoController_6.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """curso/$id<[^/]+>/remover"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_CursoController_editar54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curso/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CursoController_editar54_invoker = createInvoker(
    CursoController_6.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CursoController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """curso/editar/$id<[^/]+>"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_VideoController_telaNovo55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/novo/")))
  )
  private[this] lazy val controllers_VideoController_telaNovo55_invoker = createInvoker(
    VideoController_8.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "telaNovo",
      Nil,
      "GET",
      """ Video Telas""",
      this.prefix + """video/novo/"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_VideoController_telaDetalhe56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VideoController_telaDetalhe56_invoker = createInvoker(
    VideoController_8.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """video/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_VideoController_telaEditar57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VideoController_telaEditar57_invoker = createInvoker(
    VideoController_8.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """video/editar/$id<[^/]+>"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_VideoController_telaLista58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/lista/todos")))
  )
  private[this] lazy val controllers_VideoController_telaLista58_invoker = createInvoker(
    VideoController_8.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """video/lista/todos"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_VideoController_buscaTodos59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("videos")))
  )
  private[this] lazy val controllers_VideoController_buscaTodos59_invoker = createInvoker(
    VideoController_8.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Video Servicos""",
      this.prefix + """videos"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_VideoController_inserir60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video")))
  )
  private[this] lazy val controllers_VideoController_inserir60_invoker = createInvoker(
    VideoController_8.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """video"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_VideoController_remover61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_VideoController_remover61_invoker = createInvoker(
    VideoController_8.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """video/$id<[^/]+>/remover"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_VideoController_editar62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("video/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VideoController_editar62_invoker = createInvoker(
    VideoController_8.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VideoController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """video/editar/$id<[^/]+>"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_PublicacaoController_telaNovo63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/novo/")))
  )
  private[this] lazy val controllers_PublicacaoController_telaNovo63_invoker = createInvoker(
    PublicacaoController_11.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "telaNovo",
      Nil,
      "GET",
      """ Publicacoes Telas""",
      this.prefix + """publicacao/novo/"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_PublicacaoController_telaDetalhe64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PublicacaoController_telaDetalhe64_invoker = createInvoker(
    PublicacaoController_11.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """publicacao/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_PublicacaoController_telaEditar65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PublicacaoController_telaEditar65_invoker = createInvoker(
    PublicacaoController_11.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """publicacao/editar/$id<[^/]+>"""
    )
  )

  // @LINE:104
  private[this] lazy val controllers_PublicacaoController_telaLista66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/lista/todos")))
  )
  private[this] lazy val controllers_PublicacaoController_telaLista66_invoker = createInvoker(
    PublicacaoController_11.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """publicacao/lista/todos"""
    )
  )

  // @LINE:107
  private[this] lazy val controllers_PublicacaoController_buscaTodos67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacoes")))
  )
  private[this] lazy val controllers_PublicacaoController_buscaTodos67_invoker = createInvoker(
    PublicacaoController_11.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Publicacoes Servicos""",
      this.prefix + """publicacoes"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_PublicacaoController_inserir68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao")))
  )
  private[this] lazy val controllers_PublicacaoController_inserir68_invoker = createInvoker(
    PublicacaoController_11.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """publicacao"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_PublicacaoController_remover69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_PublicacaoController_remover69_invoker = createInvoker(
    PublicacaoController_11.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """publicacao/$id<[^/]+>/remover"""
    )
  )

  // @LINE:110
  private[this] lazy val controllers_PublicacaoController_editar70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publicacao/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PublicacaoController_editar70_invoker = createInvoker(
    PublicacaoController_11.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicacaoController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """publicacao/editar/$id<[^/]+>"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_NoticiaController_telaNovo71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/novo/")))
  )
  private[this] lazy val controllers_NoticiaController_telaNovo71_invoker = createInvoker(
    NoticiaController_5.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "telaNovo",
      Nil,
      "GET",
      """ Noticias Telas""",
      this.prefix + """noticia/novo/"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_NoticiaController_telaDetalhe72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoticiaController_telaDetalhe72_invoker = createInvoker(
    NoticiaController_5.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """noticia/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_NoticiaController_telaEditar73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoticiaController_telaEditar73_invoker = createInvoker(
    NoticiaController_5.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """noticia/editar/$id<[^/]+>"""
    )
  )

  // @LINE:116
  private[this] lazy val controllers_NoticiaController_telaLista74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/lista/todos")))
  )
  private[this] lazy val controllers_NoticiaController_telaLista74_invoker = createInvoker(
    NoticiaController_5.telaLista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "telaLista",
      Nil,
      "GET",
      """""",
      this.prefix + """noticia/lista/todos"""
    )
  )

  // @LINE:119
  private[this] lazy val controllers_NoticiaController_buscaTodos75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticias")))
  )
  private[this] lazy val controllers_NoticiaController_buscaTodos75_invoker = createInvoker(
    NoticiaController_5.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "buscaTodos",
      Nil,
      "GET",
      """ Noticia Servicos""",
      this.prefix + """noticias"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_NoticiaController_inserir76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia")))
  )
  private[this] lazy val controllers_NoticiaController_inserir76_invoker = createInvoker(
    NoticiaController_5.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """noticia"""
    )
  )

  // @LINE:121
  private[this] lazy val controllers_NoticiaController_remover77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_NoticiaController_remover77_invoker = createInvoker(
    NoticiaController_5.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """noticia/$id<[^/]+>/remover"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_NoticiaController_editar78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noticia/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoticiaController_editar78_invoker = createInvoker(
    NoticiaController_5.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoticiaController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """noticia/editar/$id<[^/]+>"""
    )
  )

  // @LINE:125
  private[this] lazy val controllers_UsuarioController_confirma79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirma/"), DynamicPart("confirmaToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirma79_invoker = createInvoker(
    UsuarioController_3.confirma(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirma",
      Seq(classOf[String]),
      "GET",
      """ Acessado quando o usuario confirma o registro""",
      this.prefix + """confirma/$confirmaToken<[^/]+>"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_SenhaController_runPassword80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/senha")))
  )
  private[this] lazy val controllers_SenhaController_runPassword80_invoker = createInvoker(
    SenhaController_7.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "runPassword",
      Nil,
      "POST",
      """ Senha""",
      this.prefix + """reset/senha"""
    )
  )

  // @LINE:131
  private[this] lazy val controllers_SenhaController_reset81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SenhaController_reset81_invoker = createInvoker(
    SenhaController_7.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Reseta a senha""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:132
  private[this] lazy val controllers_SenhaController_runReset82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SenhaController_runReset82_invoker = createInvoker(
    SenhaController_7.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:135
  private[this] lazy val controllers_ContatoController_buscaTodos83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contatos")))
  )
  private[this] lazy val controllers_ContatoController_buscaTodos83_invoker = createInvoker(
    ContatoController_2.buscaTodos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContatoController",
      "buscaTodos",
      Nil,
      "GET",
      """ Contato""",
      this.prefix + """contatos"""
    )
  )

  // @LINE:136
  private[this] lazy val controllers_ContatoController_filtra84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contatos/filtro/"), DynamicPart("filtro", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContatoController_filtra84_invoker = createInvoker(
    ContatoController_2.filtra(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContatoController",
      "filtra",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """contatos/filtro/$filtro<[^/]+>"""
    )
  )

  // @LINE:137
  private[this] lazy val controllers_ContatoController_buscaPorId85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contato/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContatoController_buscaPorId85_invoker = createInvoker(
    ContatoController_2.buscaPorId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContatoController",
      "buscaPorId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """contato/$id<[^/]+>"""
    )
  )

  // @LINE:138
  private[this] lazy val controllers_ContatoController_remover86_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contato/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContatoController_remover86_invoker = createInvoker(
    ContatoController_2.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContatoController",
      "remover",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """contato/$id<[^/]+>"""
    )
  )

  // @LINE:139
  private[this] lazy val controllers_ContatoController_inserir87_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contato")))
  )
  private[this] lazy val controllers_ContatoController_inserir87_invoker = createInvoker(
    ContatoController_2.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContatoController",
      "inserir",
      Nil,
      "POST",
      """""",
      this.prefix + """contato"""
    )
  )

  // @LINE:142
  private[this] lazy val controllers_InscricaoController_telaInscricao88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inscricao")))
  )
  private[this] lazy val controllers_InscricaoController_telaInscricao88_invoker = createInvoker(
    InscricaoController_4.telaInscricao(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InscricaoController",
      "telaInscricao",
      Seq(classOf[Long]),
      "GET",
      """ Inscricao Tela""",
      this.prefix + """inscricao"""
    )
  )

  // @LINE:145
  private[this] lazy val controllers_InscricaoController_inserir89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inscricao")))
  )
  private[this] lazy val controllers_InscricaoController_inserir89_invoker = createInvoker(
    InscricaoController_4.inserir(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InscricaoController",
      "inserir",
      Seq(classOf[Long]),
      "POST",
      """ Inscricao Servicos""",
      this.prefix + """inscricao"""
    )
  )

  // @LINE:148
  private[this] lazy val controllers_Assets_versioned90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned90_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_13.index())
      }
  
    // @LINE:7
    case controllers_Application_sobre1_route(params) =>
      call { 
        controllers_Application_sobre1_invoker.call(Application_13.sobre())
      }
  
    // @LINE:8
    case controllers_Application_jsMessages2_route(params) =>
      call { 
        controllers_Application_jsMessages2_invoker.call(Application_13.jsMessages())
      }
  
    // @LINE:11
    case controllers_AdminController_inicio3_route(params) =>
      call { 
        controllers_AdminController_inicio3_invoker.call(AdminController_0.inicio())
      }
  
    // @LINE:14
    case controllers_LoginController_telaLogin4_route(params) =>
      call { 
        controllers_LoginController_telaLogin4_invoker.call(LoginController_12.telaLogin())
      }
  
    // @LINE:15
    case controllers_LoginController_telaAutenticado5_route(params) =>
      call { 
        controllers_LoginController_telaAutenticado5_invoker.call(LoginController_12.telaAutenticado())
      }
  
    // @LINE:16
    case controllers_LoginController_telaLogout6_route(params) =>
      call { 
        controllers_LoginController_telaLogout6_invoker.call(LoginController_12.telaLogout())
      }
  
    // @LINE:19
    case controllers_LoginController_logout7_route(params) =>
      call { 
        controllers_LoginController_logout7_invoker.call(LoginController_12.logout())
      }
  
    // @LINE:20
    case controllers_LoginController_autenticar8_route(params) =>
      call { 
        controllers_LoginController_autenticar8_invoker.call(LoginController_12.autenticar())
      }
  
    // @LINE:23
    case controllers_UsuarioController_telaCadastro9_route(params) =>
      call { 
        controllers_UsuarioController_telaCadastro9_invoker.call(UsuarioController_3.telaCadastro())
      }
  
    // @LINE:24
    case controllers_UsuarioController_telaEditar10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_telaEditar10_invoker.call(UsuarioController_3.telaEditar(id))
      }
  
    // @LINE:25
    case controllers_UsuarioController_telaCadastrado11_route(params) =>
      call { 
        controllers_UsuarioController_telaCadastrado11_invoker.call(UsuarioController_3.telaCadastrado())
      }
  
    // @LINE:26
    case controllers_UsuarioController_telaDetalhe12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_telaDetalhe12_invoker.call(UsuarioController_3.telaDetalhe(id))
      }
  
    // @LINE:27
    case controllers_UsuarioController_telaLista13_route(params) =>
      call { 
        controllers_UsuarioController_telaLista13_invoker.call(UsuarioController_3.telaLista())
      }
  
    // @LINE:30
    case controllers_UsuarioController_inserir14_route(params) =>
      call { 
        controllers_UsuarioController_inserir14_invoker.call(UsuarioController_3.inserir())
      }
  
    // @LINE:31
    case controllers_UsuarioController_editar15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_editar15_invoker.call(UsuarioController_3.editar(id))
      }
  
    // @LINE:32
    case controllers_UsuarioController_buscaPorId16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_buscaPorId16_invoker.call(UsuarioController_3.buscaPorId(id))
      }
  
    // @LINE:33
    case controllers_UsuarioController_autenticado17_route(params) =>
      call { 
        controllers_UsuarioController_autenticado17_invoker.call(UsuarioController_3.autenticado())
      }
  
    // @LINE:34
    case controllers_UsuarioController_filtra18_route(params) =>
      call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_UsuarioController_filtra18_invoker.call(UsuarioController_3.filtra(filtro))
      }
  
    // @LINE:35
    case controllers_UsuarioController_remover19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_remover19_invoker.call(UsuarioController_3.remover(id))
      }
  
    // @LINE:38
    case controllers_ArtigoController_telaNovo20_route(params) =>
      call { 
        controllers_ArtigoController_telaNovo20_invoker.call(ArtigoController_14.telaNovo())
      }
  
    // @LINE:39
    case controllers_ArtigoController_telaEditar21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArtigoController_telaEditar21_invoker.call(ArtigoController_14.telaEditar(id))
      }
  
    // @LINE:40
    case controllers_ArtigoController_telaDetalhe22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArtigoController_telaDetalhe22_invoker.call(ArtigoController_14.telaDetalhe(id))
      }
  
    // @LINE:41
    case controllers_ArtigoController_telaLista23_route(params) =>
      call { 
        controllers_ArtigoController_telaLista23_invoker.call(ArtigoController_14.telaLista())
      }
  
    // @LINE:44
    case controllers_ArtigoController_buscaTodos24_route(params) =>
      call { 
        controllers_ArtigoController_buscaTodos24_invoker.call(ArtigoController_14.buscaTodos())
      }
  
    // @LINE:45
    case controllers_ArtigoController_pdf25_route(params) =>
      call(params.fromPath[String]("titulo", None)) { (titulo) =>
        controllers_ArtigoController_pdf25_invoker.call(ArtigoController_14.pdf(titulo))
      }
  
    // @LINE:46
    case controllers_ArtigoController_filtra26_route(params) =>
      call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_ArtigoController_filtra26_invoker.call(ArtigoController_14.filtra(filtro))
      }
  
    // @LINE:47
    case controllers_ArtigoController_inserir27_route(params) =>
      call { 
        controllers_ArtigoController_inserir27_invoker.call(ArtigoController_14.inserir())
      }
  
    // @LINE:48
    case controllers_ArtigoController_remover28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArtigoController_remover28_invoker.call(ArtigoController_14.remover(id))
      }
  
    // @LINE:49
    case controllers_ArtigoController_editar29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArtigoController_editar29_invoker.call(ArtigoController_14.editar(id))
      }
  
    // @LINE:52
    case controllers_LivroController_telaNovo30_route(params) =>
      call { 
        controllers_LivroController_telaNovo30_invoker.call(LivroController_1.telaNovo())
      }
  
    // @LINE:53
    case controllers_LivroController_telaDetalhe31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_telaDetalhe31_invoker.call(LivroController_1.telaDetalhe(id))
      }
  
    // @LINE:54
    case controllers_LivroController_telaEditar32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_telaEditar32_invoker.call(LivroController_1.telaEditar(id))
      }
  
    // @LINE:55
    case controllers_LivroController_telaLista33_route(params) =>
      call { 
        controllers_LivroController_telaLista33_invoker.call(LivroController_1.telaLista())
      }
  
    // @LINE:58
    case controllers_LivroController_buscaTodos34_route(params) =>
      call { 
        controllers_LivroController_buscaTodos34_invoker.call(LivroController_1.buscaTodos())
      }
  
    // @LINE:59
    case controllers_LivroController_pdf35_route(params) =>
      call(params.fromPath[String]("titulo", None)) { (titulo) =>
        controllers_LivroController_pdf35_invoker.call(LivroController_1.pdf(titulo))
      }
  
    // @LINE:60
    case controllers_LivroController_inserir36_route(params) =>
      call { 
        controllers_LivroController_inserir36_invoker.call(LivroController_1.inserir())
      }
  
    // @LINE:61
    case controllers_LivroController_remover37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_remover37_invoker.call(LivroController_1.remover(id))
      }
  
    // @LINE:62
    case controllers_LivroController_editar38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LivroController_editar38_invoker.call(LivroController_1.editar(id))
      }
  
    // @LINE:65
    case controllers_EventoController_telaNovo39_route(params) =>
      call { 
        controllers_EventoController_telaNovo39_invoker.call(EventoController_9.telaNovo())
      }
  
    // @LINE:66
    case controllers_EventoController_telaDetalhe40_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EventoController_telaDetalhe40_invoker.call(EventoController_9.telaDetalhe(id))
      }
  
    // @LINE:67
    case controllers_EventoController_telaEditar41_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EventoController_telaEditar41_invoker.call(EventoController_9.telaEditar(id))
      }
  
    // @LINE:68
    case controllers_EventoController_telaLista42_route(params) =>
      call { 
        controllers_EventoController_telaLista42_invoker.call(EventoController_9.telaLista())
      }
  
    // @LINE:71
    case controllers_EventoController_buscaTodos43_route(params) =>
      call { 
        controllers_EventoController_buscaTodos43_invoker.call(EventoController_9.buscaTodos())
      }
  
    // @LINE:72
    case controllers_EventoController_inserir44_route(params) =>
      call { 
        controllers_EventoController_inserir44_invoker.call(EventoController_9.inserir())
      }
  
    // @LINE:73
    case controllers_EventoController_remover45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EventoController_remover45_invoker.call(EventoController_9.remover(id))
      }
  
    // @LINE:74
    case controllers_EventoController_editar46_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EventoController_editar46_invoker.call(EventoController_9.editar(id))
      }
  
    // @LINE:77
    case controllers_CursoController_telaNovo47_route(params) =>
      call { 
        controllers_CursoController_telaNovo47_invoker.call(CursoController_6.telaNovo())
      }
  
    // @LINE:78
    case controllers_CursoController_telaDetalhe48_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CursoController_telaDetalhe48_invoker.call(CursoController_6.telaDetalhe(id))
      }
  
    // @LINE:79
    case controllers_CursoController_telaEditar49_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CursoController_telaEditar49_invoker.call(CursoController_6.telaEditar(id))
      }
  
    // @LINE:80
    case controllers_CursoController_telaLista50_route(params) =>
      call { 
        controllers_CursoController_telaLista50_invoker.call(CursoController_6.telaLista())
      }
  
    // @LINE:83
    case controllers_CursoController_buscaTodos51_route(params) =>
      call { 
        controllers_CursoController_buscaTodos51_invoker.call(CursoController_6.buscaTodos())
      }
  
    // @LINE:84
    case controllers_CursoController_inserir52_route(params) =>
      call { 
        controllers_CursoController_inserir52_invoker.call(CursoController_6.inserir())
      }
  
    // @LINE:85
    case controllers_CursoController_remover53_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CursoController_remover53_invoker.call(CursoController_6.remover(id))
      }
  
    // @LINE:86
    case controllers_CursoController_editar54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CursoController_editar54_invoker.call(CursoController_6.editar(id))
      }
  
    // @LINE:89
    case controllers_VideoController_telaNovo55_route(params) =>
      call { 
        controllers_VideoController_telaNovo55_invoker.call(VideoController_8.telaNovo())
      }
  
    // @LINE:90
    case controllers_VideoController_telaDetalhe56_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VideoController_telaDetalhe56_invoker.call(VideoController_8.telaDetalhe(id))
      }
  
    // @LINE:91
    case controllers_VideoController_telaEditar57_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VideoController_telaEditar57_invoker.call(VideoController_8.telaEditar(id))
      }
  
    // @LINE:92
    case controllers_VideoController_telaLista58_route(params) =>
      call { 
        controllers_VideoController_telaLista58_invoker.call(VideoController_8.telaLista())
      }
  
    // @LINE:95
    case controllers_VideoController_buscaTodos59_route(params) =>
      call { 
        controllers_VideoController_buscaTodos59_invoker.call(VideoController_8.buscaTodos())
      }
  
    // @LINE:96
    case controllers_VideoController_inserir60_route(params) =>
      call { 
        controllers_VideoController_inserir60_invoker.call(VideoController_8.inserir())
      }
  
    // @LINE:97
    case controllers_VideoController_remover61_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VideoController_remover61_invoker.call(VideoController_8.remover(id))
      }
  
    // @LINE:98
    case controllers_VideoController_editar62_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VideoController_editar62_invoker.call(VideoController_8.editar(id))
      }
  
    // @LINE:101
    case controllers_PublicacaoController_telaNovo63_route(params) =>
      call { 
        controllers_PublicacaoController_telaNovo63_invoker.call(PublicacaoController_11.telaNovo())
      }
  
    // @LINE:102
    case controllers_PublicacaoController_telaDetalhe64_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PublicacaoController_telaDetalhe64_invoker.call(PublicacaoController_11.telaDetalhe(id))
      }
  
    // @LINE:103
    case controllers_PublicacaoController_telaEditar65_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PublicacaoController_telaEditar65_invoker.call(PublicacaoController_11.telaEditar(id))
      }
  
    // @LINE:104
    case controllers_PublicacaoController_telaLista66_route(params) =>
      call { 
        controllers_PublicacaoController_telaLista66_invoker.call(PublicacaoController_11.telaLista())
      }
  
    // @LINE:107
    case controllers_PublicacaoController_buscaTodos67_route(params) =>
      call { 
        controllers_PublicacaoController_buscaTodos67_invoker.call(PublicacaoController_11.buscaTodos())
      }
  
    // @LINE:108
    case controllers_PublicacaoController_inserir68_route(params) =>
      call { 
        controllers_PublicacaoController_inserir68_invoker.call(PublicacaoController_11.inserir())
      }
  
    // @LINE:109
    case controllers_PublicacaoController_remover69_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PublicacaoController_remover69_invoker.call(PublicacaoController_11.remover(id))
      }
  
    // @LINE:110
    case controllers_PublicacaoController_editar70_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PublicacaoController_editar70_invoker.call(PublicacaoController_11.editar(id))
      }
  
    // @LINE:113
    case controllers_NoticiaController_telaNovo71_route(params) =>
      call { 
        controllers_NoticiaController_telaNovo71_invoker.call(NoticiaController_5.telaNovo())
      }
  
    // @LINE:114
    case controllers_NoticiaController_telaDetalhe72_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoticiaController_telaDetalhe72_invoker.call(NoticiaController_5.telaDetalhe(id))
      }
  
    // @LINE:115
    case controllers_NoticiaController_telaEditar73_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoticiaController_telaEditar73_invoker.call(NoticiaController_5.telaEditar(id))
      }
  
    // @LINE:116
    case controllers_NoticiaController_telaLista74_route(params) =>
      call { 
        controllers_NoticiaController_telaLista74_invoker.call(NoticiaController_5.telaLista())
      }
  
    // @LINE:119
    case controllers_NoticiaController_buscaTodos75_route(params) =>
      call { 
        controllers_NoticiaController_buscaTodos75_invoker.call(NoticiaController_5.buscaTodos())
      }
  
    // @LINE:120
    case controllers_NoticiaController_inserir76_route(params) =>
      call { 
        controllers_NoticiaController_inserir76_invoker.call(NoticiaController_5.inserir())
      }
  
    // @LINE:121
    case controllers_NoticiaController_remover77_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoticiaController_remover77_invoker.call(NoticiaController_5.remover(id))
      }
  
    // @LINE:122
    case controllers_NoticiaController_editar78_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoticiaController_editar78_invoker.call(NoticiaController_5.editar(id))
      }
  
    // @LINE:125
    case controllers_UsuarioController_confirma79_route(params) =>
      call(params.fromPath[String]("confirmaToken", None)) { (confirmaToken) =>
        controllers_UsuarioController_confirma79_invoker.call(UsuarioController_3.confirma(confirmaToken))
      }
  
    // @LINE:128
    case controllers_SenhaController_runPassword80_route(params) =>
      call { 
        controllers_SenhaController_runPassword80_invoker.call(SenhaController_7.runPassword())
      }
  
    // @LINE:131
    case controllers_SenhaController_reset81_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_SenhaController_reset81_invoker.call(SenhaController_7.reset(token))
      }
  
    // @LINE:132
    case controllers_SenhaController_runReset82_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_SenhaController_runReset82_invoker.call(SenhaController_7.runReset(token))
      }
  
    // @LINE:135
    case controllers_ContatoController_buscaTodos83_route(params) =>
      call { 
        controllers_ContatoController_buscaTodos83_invoker.call(ContatoController_2.buscaTodos())
      }
  
    // @LINE:136
    case controllers_ContatoController_filtra84_route(params) =>
      call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_ContatoController_filtra84_invoker.call(ContatoController_2.filtra(filtro))
      }
  
    // @LINE:137
    case controllers_ContatoController_buscaPorId85_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ContatoController_buscaPorId85_invoker.call(ContatoController_2.buscaPorId(id))
      }
  
    // @LINE:138
    case controllers_ContatoController_remover86_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ContatoController_remover86_invoker.call(ContatoController_2.remover(id))
      }
  
    // @LINE:139
    case controllers_ContatoController_inserir87_route(params) =>
      call { 
        controllers_ContatoController_inserir87_invoker.call(ContatoController_2.inserir())
      }
  
    // @LINE:142
    case controllers_InscricaoController_telaInscricao88_route(params) =>
      call(params.fromQuery[Long]("id", Some(0))) { (id) =>
        controllers_InscricaoController_telaInscricao88_invoker.call(InscricaoController_4.telaInscricao(id))
      }
  
    // @LINE:145
    case controllers_InscricaoController_inserir89_route(params) =>
      call(params.fromQuery[Long]("id", Some(0))) { (id) =>
        controllers_InscricaoController_inserir89_invoker.call(InscricaoController_4.inserir(id))
      }
  
    // @LINE:148
    case controllers_Assets_versioned90_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned90_invoker.call(Assets_10.versioned(path, file))
      }
  }
}