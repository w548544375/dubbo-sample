package com.weiguang.controller;

import com.weiguang.middle.rpc.IMiddleApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpc")
public class DubboController {

    @DubboReference(version = "1.0")
    IMiddleApi middleApi;

    @RequestMapping("call")
    public String Seed(@RequestParam String name) {
        return middleApi.MiddleCall(name);
    }

    @RequestMapping("exception")
    public String CallException(@RequestParam String name){
            return middleApi.MiddleCallException(name);

    }
}
