package com.quiet.company_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CompanyServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServer1Application.class, args);
    }

}
