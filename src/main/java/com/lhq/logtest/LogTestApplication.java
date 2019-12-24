package com.lhq.logtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogTestApplication {

    public static void main(String[] args) {
        //这里我们打印的功能是 INFO WARN ERROR。对于debug是不打印日志的。也不会进行保存的
        //我们可以指定自己的logging.config 来配置config的路径，可以配置在service服务的环境变量里面
        //参考链接  https://www.jianshu.com/p/f67c721eea1b 。如果想深入了解，可以参考这个网址
        //因为配置了这个配置文件之后，打印的日志就变成了黑白。自己试验的%clr无效。所以这个打印还是在测试环境和生产在配置吧。本地就别配置了
        SpringApplication.run(LogTestApplication.class, args);
        while (true) {
            log.info("这是自己手动打印的日志信息");
        }
    }

}
