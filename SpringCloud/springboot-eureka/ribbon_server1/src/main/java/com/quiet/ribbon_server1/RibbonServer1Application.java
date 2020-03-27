package com.quiet.ribbon_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class RibbonServer1Application {

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
        SpringApplication.run(RibbonServer1Application.class, args);
    }

}
