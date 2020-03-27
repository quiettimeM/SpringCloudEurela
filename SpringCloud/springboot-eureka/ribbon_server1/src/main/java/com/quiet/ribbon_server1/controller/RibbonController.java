package com.quiet.ribbon_server1.controller;

import com.quiet.ribbon_server1.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mcm
 */
@RestController
//@RequestMapping(value = "ribbon")
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "getCompany")
    public String getCompany(String id){
        String company = ribbonService.getCompany(id);
        System.out.println(company);
        return company;
    }
}
