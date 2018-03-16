package org.lua.service.impl;

import org.lua.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author AMGuo
 * @Description
 * @date 2018/03/15 16:29
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
