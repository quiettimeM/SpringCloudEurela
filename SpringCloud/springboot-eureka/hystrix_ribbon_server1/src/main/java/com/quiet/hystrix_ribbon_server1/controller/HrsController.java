package com.quiet.hystrix_ribbon_server1.controller;

import com.quiet.hystrix_ribbon_server1.service.HrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hrs")
public class HrsController {

    @Autowired
    private HrsService hrsService;

    @GetMapping(value = "getCompany")
    public String getCompany(String id){
        String company = hrsService.getCompany(id);
        System.out.println(company);
        return company;
    }
}
