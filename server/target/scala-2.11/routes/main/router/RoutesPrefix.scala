
// @GENERATOR:play-routes-compiler
// @SOURCE:/root/Загрузки/ScalaJs_Weather_Report-master/server/conf/routes
// @DATE:Sat Apr 22 20:28:21 EEST 2017


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
