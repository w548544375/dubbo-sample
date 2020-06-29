package com.weiguang.root.rpc.impl;

import com.weiguang.root.rpc.IRootApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0")
public class RootServiceImpl implements IRootApi {
    @Override
    public String CallRoot(String words) {
        return "This is a Response From RootService -> " + words;
    }

    @Override
    public String CallRootException(String exception) throws RuntimeException {
        if (null == exception || exception.length() < 2) {
            throw new RuntimeException(RootServiceImpl.class.getName() + "-->故意抛出来的异常");
        }
        String[] split = exception.split("-");
        return "没有异常 "+split[1];
    }
}
