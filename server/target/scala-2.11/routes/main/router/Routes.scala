
// @GENERATOR:play-routes-compiler
// @SOURCE:/root/Загрузки/ScalaJs_Weather_Report-master/server/conf/routes
// @DATE:Sat Apr 22 20:28:21 EEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  WeatherController_1: controllers.WeatherController,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    WeatherController_1: controllers.WeatherController,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, WeatherController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, WeatherController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.WeatherController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """weather/""" + "$" + """city<[^/]+>""", """controllers.WeatherController.ajaxCall(city:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_WeatherController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_WeatherController_index0_invoker = createInvoker(
    WeatherController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WeatherController",
      "index",
      Nil,
      "GET",
      """ A weather controller showing weather information system""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_WeatherController_ajaxCall1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("weather/"), DynamicPart("city", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WeatherController_ajaxCall1_invoker = createInvoker(
    WeatherController_1.ajaxCall(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WeatherController",
      "ajaxCall",
      Seq(classOf[String]),
      "GET",
      """ Refresh Weather Information""",
      this.prefix + """weather/""" + "$" + """city<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_WeatherController_index0_route(params) =>
      call { 
        controllers_WeatherController_index0_invoker.call(WeatherController_1.index)
      }
  
    // @LINE:9
    case controllers_WeatherController_ajaxCall1_route(params) =>
      call(params.fromPath[String]("city", None)) { (city) =>
        controllers_WeatherController_ajaxCall1_invoker.call(WeatherController_1.ajaxCall(city))
      }
  
    // @LINE:13
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
