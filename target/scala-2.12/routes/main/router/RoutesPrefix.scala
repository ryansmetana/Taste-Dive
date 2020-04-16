// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/Play/ist411-tastedive-app-testing/conf/routes
// @DATE:Thu Apr 25 19:14:06 EDT 2019


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
