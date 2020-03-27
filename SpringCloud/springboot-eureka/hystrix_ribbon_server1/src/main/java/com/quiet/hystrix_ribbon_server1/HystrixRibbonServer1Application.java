package com.quiet.hystrix_ribbon_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class HystrixRibbonServer1Application {

    /**
     *
     * @Bean ： 注入一个名为restTemplate的bean
     * @LoadBalanced ：表明这个 restTemplate 开启了负载均衡的功能
     *
     * */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){return new RestTemplate();}

    public static void main(String[] args) {
        SpringApplication.run(HystrixRibbonServer1Application.class, args);
    }

}
