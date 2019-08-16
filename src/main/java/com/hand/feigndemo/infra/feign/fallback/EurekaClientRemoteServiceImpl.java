package com.hand.feigndemo.infra.feign.fallback;

import com.hand.feigndemo.infra.feign.EurekaClientRemoteService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <p>
 * description
 * </p>
 *
 * @author fu.ji@hand-china.com 2019/08/16 15:31
 */
@Component
public class EurekaClientRemoteServiceImpl implements EurekaClientRemoteService {


    @Override
    public String queryInfo(String name) {
        return "sorry "+name;
    }
}
