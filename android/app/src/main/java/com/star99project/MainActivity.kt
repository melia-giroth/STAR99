package com.star99project;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled;
import com.facebook.react.defaults.DefaultReactActivityDelegate; 

 public class MainActivity extends ReactActivity() {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName(){
    return "Star99Project";
  }

  /**
   * Returns the instance of the [ReactActivityDelegate]. We use [DefaultReactActivityDelegate]
   * which allows you to enable New Architecture with a single boolean flags [fabricEnabled]
   */
  @Override
  protected ReactActivityDelegate createReactActivityDelegate () {
    return new DefaultReactActivityDelegate(
      this,
      getMainComponentName(),
      //if you opted-in for the New Architecture, we enable the Fabric Renderer
      DefaultNewArchitectureEntryPoint.getFabricEnabled(), //fabricEnabled
      //if you opted-in for the New Architecture, we enable Concurrent React (i.e. React 18).
      DefaultNewArchitectureEntryPoint.getConcurrentReactEnable() //concurrentRootEnabled
    )
  }
}
