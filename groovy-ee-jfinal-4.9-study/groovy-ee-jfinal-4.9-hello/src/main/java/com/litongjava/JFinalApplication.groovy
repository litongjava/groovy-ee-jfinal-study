package com.litongjava

import com.jfinal.server.undertow.UndertowServer
import com.litongjava.config.AppConfig

import lombok.extern.slf4j.Slf4j

/**
 * @author create by ping-e-lee on 2021年7月15日 上午3:03:59 
 * @version 1.0 
 * @desc
 */
@Slf4j
class JFinalApplication {
  static void main(args) {
    long start = System.currentTimeMillis();
    // 创建server
    UndertowServer.create(AppConfig.class,"undertow.properties").start()
    long end = System.currentTimeMillis()
    String message = (end - start) + "ms"
    System.out.println(message);
    //Groovy:Apparent variable 'log' was found in a static scope but doesn't refer to a local variable, static field or class.
    //log.info(message)
  }
}
