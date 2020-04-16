// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/Play/ist411-tastedive-app-testing/conf/routes
// @DATE:Thu Apr 25 19:14:06 EDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def openNewUserPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.openNewUserPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newUser"})
        }
      """
    )
  
    // @LINE:21
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newUser"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def authenticateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.authenticateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseFavoritesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.changePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "security"})
        }
      """
    )
  
    // @LINE:13
    def getFavorites: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.getFavorites",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/default/favorites"})
        }
      """
    )
  
    // @LINE:15
    def removeFavorite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.removeFavorite",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/default/favorites"})
        }
      """
    )
  
    // @LINE:14
    def addFavorite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.addFavorite",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/default/favorites"})
        }
      """
    )
  
    // @LINE:24
    def openChangePasswordPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.openChangePasswordPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "security"})
        }
      """
    )
  
    // @LINE:16
    def getSearchResults: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.getSearchResults",
      """
        function(qString0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/default/search/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("qString", qString0))})
        }
      """
    )
  
    // @LINE:17
    def getFavoritesList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoritesController.getFavoritesList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/default/favoriteslist"})
        }
      """
    )
  
  }


}
