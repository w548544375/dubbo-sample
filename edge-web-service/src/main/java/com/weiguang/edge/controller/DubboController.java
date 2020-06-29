package com.weiguang.edge.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpc")
public class DubboController {

//    @DubboReference
//    IMiddleApi middleApi;

    @RequestMapping("call")
    public String Seed(@RequestParam String name){
        return null;
    }

}
