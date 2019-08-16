package com.hand.feigndemo.api.controller;

import com.hand.feigndemo.infra.feign.EurekaClientRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author fu.ji@hand-china.com 2019/08/16 14:28
 */
@RestController
@RequestMapping("/v1")
public class TestController {
    @Autowired
    private EurekaClientRemoteService eurekaClientRemoteService;

    @GetMapping("/feign")
    public String checkFeign() {
        return eurekaClientRemoteService.queryInfo("feign");
    }
}
