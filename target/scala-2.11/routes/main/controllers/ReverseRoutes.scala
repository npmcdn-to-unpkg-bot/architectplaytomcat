
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/architectplay/conf/routes
// @DATE:Wed Aug 03 12:58:38 BRT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:148
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:148
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def inicio(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
  }

  // @LINE:101
  class ReversePublicacaoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publicacao/novo/")
    }
  
    // @LINE:107
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publicacoes")
    }
  
    // @LINE:103
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publicacao/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:109
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publicacao/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:104
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publicacao/lista/todos")
    }
  
    // @LINE:108
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publicacao")
    }
  
    // @LINE:110
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publicacao/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:102
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publicacao/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:128
  class ReverseSenhaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:132
    def runReset(token:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:131
    def reset(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:128
    def runPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset/senha")
    }
  
  }

  // @LINE:142
  class ReverseInscricaoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:142
    def telaInscricao(id:Long = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "inscricao" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:145
    def inserir(id:Long = 0): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "inscricao" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
  }

  // @LINE:38
  class ReverseArtigoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigo/novo/")
    }
  
    // @LINE:46
    def filtra(filtro:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigos/filtro/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
    }
  
    // @LINE:44
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigos")
    }
  
    // @LINE:39
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigo/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:48
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "artigo/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:41
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigo/lista/todos")
    }
  
    // @LINE:45
    def pdf(titulo:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigo/pdf/" + implicitly[PathBindable[String]].unbind("titulo", dynamicString(titulo)))
    }
  
    // @LINE:47
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "artigo")
    }
  
    // @LINE:49
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "artigo/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:40
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "artigo/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:65
  class ReverseEventoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "evento/novo/")
    }
  
    // @LINE:71
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "eventos")
    }
  
    // @LINE:67
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "evento/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:73
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "evento/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:68
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "evento/lista/todos")
    }
  
    // @LINE:72
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "evento")
    }
  
    // @LINE:74
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "evento/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:66
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "evento/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:52
  class ReverseLivroController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livro/novo/")
    }
  
    // @LINE:58
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livros")
    }
  
    // @LINE:54
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livro/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:61
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "livro/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:55
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livro/lista/todos")
    }
  
    // @LINE:59
    def pdf(titulo:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livro/pdf/" + implicitly[PathBindable[String]].unbind("titulo", dynamicString(titulo)))
    }
  
    // @LINE:60
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "livro")
    }
  
    // @LINE:62
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "livro/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:53
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "livro/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:135
  class ReverseContatoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def filtra(filtro:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contatos/filtro/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
    }
  
    // @LINE:135
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contatos")
    }
  
    // @LINE:138
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "contato/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:139
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "contato")
    }
  
    // @LINE:137
    def buscaPorId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contato/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def telaLogout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "saiu")
    }
  
    // @LINE:14
    def telaLogin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def telaAutenticado(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "autenticado")
    }
  
    // @LINE:19
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def autenticar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "autenticar")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def sobre(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sobre")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def jsMessages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messages.js")
    }
  
  }

  // @LINE:89
  class ReverseVideoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:89
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "video/novo/")
    }
  
    // @LINE:95
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "videos")
    }
  
    // @LINE:91
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "video/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:97
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "video/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:92
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "video/lista/todos")
    }
  
    // @LINE:96
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "video")
    }
  
    // @LINE:98
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "video/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:90
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "video/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:113
  class ReverseNoticiaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noticia/novo/")
    }
  
    // @LINE:119
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noticias")
    }
  
    // @LINE:115
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noticia/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:121
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "noticia/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:116
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noticia/lista/todos")
    }
  
    // @LINE:120
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "noticia")
    }
  
    // @LINE:122
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "noticia/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:114
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noticia/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:23
  class ReverseUsuarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def filtra(filtro:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/filtro/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
    }
  
    // @LINE:24
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:27
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/lista/todos")
    }
  
    // @LINE:33
    def autenticado(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "current")
    }
  
    // @LINE:25
    def telaCadastrado(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/cadastrado")
    }
  
    // @LINE:30
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario")
    }
  
    // @LINE:125
    def confirma(confirmaToken:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confirma/" + implicitly[PathBindable[String]].unbind("confirmaToken", dynamicString(confirmaToken)))
    }
  
    // @LINE:31
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def buscaPorId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def telaCadastro(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cadastro")
    }
  
    // @LINE:26
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:77
  class ReverseCursoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "curso/novo/")
    }
  
    // @LINE:83
    def buscaTodos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cursos")
    }
  
    // @LINE:79
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "curso/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:85
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "curso/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:80
    def telaLista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "curso/lista/todos")
    }
  
    // @LINE:84
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "curso")
    }
  
    // @LINE:86
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "curso/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:78
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "curso/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }


}