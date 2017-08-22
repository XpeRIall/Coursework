
// @GENERATOR:play-routes-compiler
// @SOURCE:/root/Загрузки/ScalaJs_Weather_Report-master/server/conf/routes
// @DATE:Sat Apr 22 20:28:21 EEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWeatherController WeatherController = new controllers.ReverseWeatherController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWeatherController WeatherController = new controllers.javascript.ReverseWeatherController(RoutesPrefix.byNamePrefix());
  }

}
