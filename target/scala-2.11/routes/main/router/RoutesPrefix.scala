
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/architectplay/conf/routes
// @DATE:Wed Aug 03 12:58:38 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
