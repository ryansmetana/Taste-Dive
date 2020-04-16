// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/Play/ist411-tastedive-app-testing/conf/routes
// @DATE:Thu Apr 25 19:14:06 EDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_0: controllers.LoginController,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:13
  FavoritesController_2: controllers.FavoritesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_0: controllers.LoginController,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:13
    FavoritesController_2: controllers.FavoritesController
  ) = this(errorHandler, LoginController_0, Assets_1, FavoritesController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_0, Assets_1, FavoritesController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.index"""),
    ("""POST""", this.prefix, """controllers.LoginController.authenticateUser(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/default/favorites""", """controllers.FavoritesController.getFavorites(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/default/favorites""", """controllers.FavoritesController.addFavorite(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/default/favorites""", """controllers.FavoritesController.removeFavorite(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/default/search/""" + "$" + """qString<[^/]+>""", """controllers.FavoritesController.getSearchResults(qString:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/default/favoriteslist""", """controllers.FavoritesController.getFavoritesList(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUser""", """controllers.LoginController.openNewUserPage(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUser""", """controllers.LoginController.createUser(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """security""", """controllers.FavoritesController.openChangePasswordPage(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """security""", """controllers.FavoritesController.changePassword(request:Request)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_index0_invoker = createInvoker(
    LoginController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home Page/Login Page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_authenticateUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_authenticateUser1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.authenticateUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "authenticateUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FavoritesController_getFavorites3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/default/favorites")))
  )
  private[this] lazy val controllers_FavoritesController_getFavorites3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.getFavorites(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "getFavorites",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """users/default/favorites""",
      """ Filters/favorites/searches""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_FavoritesController_addFavorite4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/default/favorites")))
  )
  private[this] lazy val controllers_FavoritesController_addFavorite4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.addFavorite(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "addFavorite",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """users/default/favorites""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_FavoritesController_removeFavorite5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/default/favorites")))
  )
  private[this] lazy val controllers_FavoritesController_removeFavorite5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.removeFavorite(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "removeFavorite",
      Seq(classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """users/default/favorites""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FavoritesController_getSearchResults6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/default/search/"), DynamicPart("qString", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavoritesController_getSearchResults6_invoker = createInvoker(
    FavoritesController_2.getSearchResults(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "getSearchResults",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/default/search/""" + "$" + """qString<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FavoritesController_getFavoritesList7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/default/favoriteslist")))
  )
  private[this] lazy val controllers_FavoritesController_getFavoritesList7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.getFavoritesList(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "getFavoritesList",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """users/default/favoriteslist""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_openNewUserPage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUser")))
  )
  private[this] lazy val controllers_LoginController_openNewUserPage8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.openNewUserPage(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "openNewUserPage",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """newUser""",
      """ Users""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LoginController_createUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUser")))
  )
  private[this] lazy val controllers_LoginController_createUser9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LoginController_0.createUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "createUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """newUser""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_FavoritesController_openChangePasswordPage10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("security")))
  )
  private[this] lazy val controllers_FavoritesController_openChangePasswordPage10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.openChangePasswordPage(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "openChangePasswordPage",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """security""",
      """Change Password Page""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_FavoritesController_changePassword11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("security")))
  )
  private[this] lazy val controllers_FavoritesController_changePassword11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FavoritesController_2.changePassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoritesController",
      "changePassword",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """security""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_index0_route(params@_) =>
      call { 
        controllers_LoginController_index0_invoker.call(LoginController_0.index)
      }
  
    // @LINE:7
    case controllers_LoginController_authenticateUser1_route(params@_) =>
      call { 
        controllers_LoginController_authenticateUser1_invoker.call(
          req => LoginController_0.authenticateUser(req))
      }
  
    // @LINE:10
    case controllers_Assets_versioned2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_FavoritesController_getFavorites3_route(params@_) =>
      call { 
        controllers_FavoritesController_getFavorites3_invoker.call(
          req => FavoritesController_2.getFavorites(req))
      }
  
    // @LINE:14
    case controllers_FavoritesController_addFavorite4_route(params@_) =>
      call { 
        controllers_FavoritesController_addFavorite4_invoker.call(
          req => FavoritesController_2.addFavorite(req))
      }
  
    // @LINE:15
    case controllers_FavoritesController_removeFavorite5_route(params@_) =>
      call { 
        controllers_FavoritesController_removeFavorite5_invoker.call(
          req => FavoritesController_2.removeFavorite(req))
      }
  
    // @LINE:16
    case controllers_FavoritesController_getSearchResults6_route(params@_) =>
      call(params.fromPath[String]("qString", None)) { (qString) =>
        controllers_FavoritesController_getSearchResults6_invoker.call(FavoritesController_2.getSearchResults(qString))
      }
  
    // @LINE:17
    case controllers_FavoritesController_getFavoritesList7_route(params@_) =>
      call { 
        controllers_FavoritesController_getFavoritesList7_invoker.call(
          req => FavoritesController_2.getFavoritesList(req))
      }
  
    // @LINE:20
    case controllers_LoginController_openNewUserPage8_route(params@_) =>
      call { 
        controllers_LoginController_openNewUserPage8_invoker.call(
          req => LoginController_0.openNewUserPage(req))
      }
  
    // @LINE:21
    case controllers_LoginController_createUser9_route(params@_) =>
      call { 
        controllers_LoginController_createUser9_invoker.call(
          req => LoginController_0.createUser(req))
      }
  
    // @LINE:24
    case controllers_FavoritesController_openChangePasswordPage10_route(params@_) =>
      call { 
        controllers_FavoritesController_openChangePasswordPage10_invoker.call(
          req => FavoritesController_2.openChangePasswordPage(req))
      }
  
    // @LINE:25
    case controllers_FavoritesController_changePassword11_route(params@_) =>
      call { 
        controllers_FavoritesController_changePassword11_invoker.call(
          req => FavoritesController_2.changePassword(req))
      }
  }
}
