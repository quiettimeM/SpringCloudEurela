package com.quiet.ribbon_server1.serviceImpl;

import com.quiet.ribbon_server1.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    //启动类中注入了此模板，并且开启了负载均衡功能
    @Autowired
    RestTemplate restTemplate;

    //程序名替代服务地址，ribbon会根据服务名自动选择服务实例
    @Override
    public String getCompany(String id) {
        String company = restTemplate
                .getForObject("http://company-server/company/get?id=" + id, String.class);
        return company;
    }
}
