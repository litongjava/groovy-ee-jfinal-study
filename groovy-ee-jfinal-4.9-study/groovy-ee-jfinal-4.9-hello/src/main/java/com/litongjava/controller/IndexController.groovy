package com.litongjava.controller

import com.jfinal.core.Controller
import com.jfinal.core.Path
import com.litongjava.utils.LogUtils

import groovy.util.logging.Slf4j

/**
 * @author create by ping-e-lee on 2021年7月15日 上午3:01:07 
 * @version 1.0 
 * @desc
 */
@Path("/")
@Slf4j
class IndexController extends Controller{
  void index() {
    renderText("Hello groovy")
  }
  void logClassName() {
    renderText(log.getClass().getName());
  }

  void thisClassName() {
    renderText(this.toString())
  }
  void thisClassLoader() {
    renderText(this.getClass().getClassLoader().toString())
  }

  void exception() throws Exception {
    try {
      throw new IllegalArgumentException("This is a test")
    } catch (Exception e) {
      //e.printStackTrace();
      log.error(LogUtils.getStackTraceInfo(e))
    }
    renderText("ok")
  }
}
