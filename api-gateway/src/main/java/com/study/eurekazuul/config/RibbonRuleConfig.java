package com.study.eurekazuul.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Random
 *
 * @author sunyueqiao
 * @date 2018/7/12 9:01
 */
@Configuration
@RibbonClient(name = "eureka-client", configuration = BestAvailableRule.class)
public class RibbonRuleConfig {
}