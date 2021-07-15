package com.litongjava.config

import com.jfinal.config.Constants
import com.jfinal.config.Handlers
import com.jfinal.config.Interceptors
import com.jfinal.config.JFinalConfig
import com.jfinal.config.Plugins
import com.jfinal.config.Routes
import com.jfinal.template.Engine

/**
 * @author create by ping-e-lee on 2021年7月15日 上午3:00:06 
 * @version 1.0 
 * @desc
 */
class AppConfig extends JFinalConfig{
  @Override
  void configConstant(Constants me) {
  }

  @Override
  void configRoute(Routes me) {
    me.scan("com.litongjava.controller.")
  }

  @Override
  void configEngine(Engine me) {
  }

  @Override
  void configPlugin(Plugins me) {
  }

  @Override
  void configInterceptor(Interceptors me) {
  }

  @Override
  void configHandler(Handlers me) {
  }
}
