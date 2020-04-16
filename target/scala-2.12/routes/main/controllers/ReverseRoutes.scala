// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/Play/ist411-tastedive-app-testing/conf/routes
// @DATE:Thu Apr 25 19:14:06 EDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def openNewUserPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newUser")
    }
  
    // @LINE:21
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "newUser")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def authenticateUser(): Call = {
      
      Call("POST", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseFavoritesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def changePassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "security")
    }
  
    // @LINE:13
    def getFavorites(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/default/favorites")
    }
  
    // @LINE:15
    def removeFavorite(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "users/default/favorites")
    }
  
    // @LINE:14
    def addFavorite(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users/default/favorites")
    }
  
    // @LINE:24
    def openChangePasswordPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "security")
    }
  
    // @LINE:16
    def getSearchResults(qString:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/default/search/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("qString", qString)))
    }
  
    // @LINE:17
    def getFavoritesList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/default/favoriteslist")
    }
  
  }


}
