package com.quiet.eureka_server2.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 新版本的spring-cloud2.0中： Spring Security默认开启了CSRF攻击防御
 CSRF会将微服务的注册也给过滤了，虽然不会影响注册中心，但是其他客户端是注册不了的
 解决方案:
 关闭csrf攻击:
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }

}
