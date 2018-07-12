package com.study.eurekazuul.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * BestAvailableRule
 *
 * @author sunyueqiao
 * @date 2018/7/12 9:04
 */
@Configuration
public class BestAvailableRule {
    @Bean
    public IRule ribbonRule() {
        return new com.netflix.loadbalancer.BestAvailableRule();
    }
}
