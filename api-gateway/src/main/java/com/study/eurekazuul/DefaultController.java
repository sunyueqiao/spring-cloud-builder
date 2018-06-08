package com.study.eurekazuul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * DefaultController
 *
 * @author sunyueqiao
 * @date 2018/6/8 15:19
 */
@RestController
@RequestMapping("/")
public class DefaultController {
    @GetMapping("/info")
    public String info() {
        HashMap<String, String> map = new HashMap<>();
        map.put("说明：", "基于zuul实现的网关服务");
        return map.toString();
    }
}
