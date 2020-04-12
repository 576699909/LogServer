package com.ding.log.server.controller;

 import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping(value = "/heartbeat")
public class HeartbeatController {
    @Value("${log.server.url:http://127.0.0.1:8080}")
    private String URL;

    @ResponseBody
    @RequestMapping(value = "/monitor")
    public String monitor() {
        return "success";
    }

}
