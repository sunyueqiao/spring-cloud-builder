package com.study.eurekaclient.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DefaultController
 *
 * @author sunyueqiao
 * @date 2018/6/8 14:36
 */
@RestController
@RequestMapping("/")
public class DefaultController {
    @GetMapping("/")
    public String defaultAction(){
        return "eureka-client";
    }
}
