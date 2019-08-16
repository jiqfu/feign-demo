package com.hand.feigndemo.infra.feign;

import com.hand.feigndemo.infra.feign.fallback.EurekaClientRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * description
 * </p>
 *
 * @author fu.ji@hand-china.com 2019/08/16 14:25
 */
@FeignClient(value = "eureka-client", fallback = EurekaClientRemoteServiceImpl.class)
public interface EurekaClientRemoteService {

    @GetMapping("/v1/info")
    String queryInfo(@RequestParam(name = "name", defaultValue = "ming") String name);
}
