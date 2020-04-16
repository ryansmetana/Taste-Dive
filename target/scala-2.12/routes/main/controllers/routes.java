// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/Play/ist411-tastedive-app-testing/conf/routes
// @DATE:Thu Apr 25 19:14:06 EDT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFavoritesController FavoritesController = new controllers.ReverseFavoritesController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFavoritesController FavoritesController = new controllers.javascript.ReverseFavoritesController(RoutesPrefix.byNamePrefix());
  }

}
