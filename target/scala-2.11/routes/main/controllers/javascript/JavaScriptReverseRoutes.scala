
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/architectplay/conf/routes
// @DATE:Wed Aug 03 12:58:38 BRT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:148
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:148
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def inicio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.inicio",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
  }

  // @LINE:101
  class ReversePublicacaoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/novo/"})
        }
      """
    )
  
    // @LINE:107
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacoes"})
        }
      """
    )
  
    // @LINE:103
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:109
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:104
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/lista/todos"})
        }
      """
    )
  
    // @LINE:108
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao"})
        }
      """
    )
  
    // @LINE:110
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:102
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicacaoController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publicacao/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:128
  class ReverseSenhaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:132
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.runReset",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:131
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.reset",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:128
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/senha"})
        }
      """
    )
  
  }

  // @LINE:142
  class ReverseInscricaoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:142
    def telaInscricao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.InscricaoController.telaInscricao",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscricao" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:145
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.InscricaoController.inserir",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "inscricao" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseArtigoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/novo/"})
        }
      """
    )
  
    // @LINE:46
    def filtra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.filtra",
      """
        function(filtro) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigos/filtro/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
        }
      """
    )
  
    // @LINE:44
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigos"})
        }
      """
    )
  
    // @LINE:39
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:48
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:41
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/lista/todos"})
        }
      """
    )
  
    // @LINE:45
    def pdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.pdf",
      """
        function(titulo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("titulo", encodeURIComponent(titulo))})
        }
      """
    )
  
    // @LINE:47
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo"})
        }
      """
    )
  
    // @LINE:49
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:40
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtigoController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artigo/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseEventoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/novo/"})
        }
      """
    )
  
    // @LINE:71
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventos"})
        }
      """
    )
  
    // @LINE:67
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:73
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:68
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/lista/todos"})
        }
      """
    )
  
    // @LINE:72
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evento"})
        }
      """
    )
  
    // @LINE:74
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:66
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventoController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "evento/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseLivroController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/novo/"})
        }
      """
    )
  
    // @LINE:58
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livros"})
        }
      """
    )
  
    // @LINE:54
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:61
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:55
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/lista/todos"})
        }
      """
    )
  
    // @LINE:59
    def pdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.pdf",
      """
        function(titulo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/pdf/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("titulo", encodeURIComponent(titulo))})
        }
      """
    )
  
    // @LINE:60
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro"})
        }
      """
    )
  
    // @LINE:62
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:53
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LivroController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "livro/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:135
  class ReverseContatoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def filtra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContatoController.filtra",
      """
        function(filtro) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contatos/filtro/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
        }
      """
    )
  
    // @LINE:135
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContatoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contatos"})
        }
      """
    )
  
    // @LINE:138
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContatoController.remover",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "contato/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:139
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContatoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contato"})
        }
      """
    )
  
    // @LINE:137
    def buscaPorId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContatoController.buscaPorId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contato/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def telaLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.telaLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saiu"})
        }
      """
    )
  
    // @LINE:14
    def telaLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.telaLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def telaAutenticado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.telaAutenticado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autenticado"})
        }
      """
    )
  
    // @LINE:19
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:20
    def autenticar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.autenticar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autenticar"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def sobre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sobre",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sobre"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def jsMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsMessages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages.js"})
        }
      """
    )
  
  }

  // @LINE:89
  class ReverseVideoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:89
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video/novo/"})
        }
      """
    )
  
    // @LINE:95
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos"})
        }
      """
    )
  
    // @LINE:91
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:97
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "video/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:92
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video/lista/todos"})
        }
      """
    )
  
    // @LINE:96
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "video"})
        }
      """
    )
  
    // @LINE:98
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "video/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:90
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VideoController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "video/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:113
  class ReverseNoticiaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/novo/"})
        }
      """
    )
  
    // @LINE:119
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noticias"})
        }
      """
    )
  
    // @LINE:115
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:121
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:116
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/lista/todos"})
        }
      """
    )
  
    // @LINE:120
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia"})
        }
      """
    )
  
    // @LINE:122
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:114
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoticiaController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noticia/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def filtra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.filtra",
      """
        function(filtro) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/filtro/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
        }
      """
    )
  
    // @LINE:24
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:35
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:27
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/lista/todos"})
        }
      """
    )
  
    // @LINE:33
    def autenticado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.autenticado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current"})
        }
      """
    )
  
    // @LINE:25
    def telaCadastrado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaCadastrado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/cadastrado"})
        }
      """
    )
  
    // @LINE:30
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
        }
      """
    )
  
    // @LINE:125
    def confirma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirma",
      """
        function(confirmaToken) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirma/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmaToken", encodeURIComponent(confirmaToken))})
        }
      """
    )
  
    // @LINE:31
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:32
    def buscaPorId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.buscaPorId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:23
    def telaCadastro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaCadastro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
        }
      """
    )
  
    // @LINE:26
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseCursoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/novo/"})
        }
      """
    )
  
    // @LINE:83
    def buscaTodos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.buscaTodos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cursos"})
        }
      """
    )
  
    // @LINE:79
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:85
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:80
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.telaLista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/lista/todos"})
        }
      """
    )
  
    // @LINE:84
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "curso"})
        }
      """
    )
  
    // @LINE:86
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:78
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CursoController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "curso/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }


}