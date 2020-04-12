package com.ding.log.server;

import com.ding.log.server.message.io.NettyServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class LogServerApplication {


    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LogServerApplication.class, args);
        log.info("LogServerApplication success");

        //启动服务端
        NettyServer nettyServer=new NettyServer();
        nettyServer.start();
    }
}
