package com.weiguang.middle.impl;

import com.weiguang.middle.rpc.IMiddleApi;
import com.weiguang.root.rpc.IRootApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0")
public class MiddleServiceImpl implements IMiddleApi {

    @DubboReference(version = "1.0")
    IRootApi rootApi;

    @Override
    public String MiddleCall(String para) {
        String res = rootApi.CallRoot(para);
        return "This is a Response from MiddleService" + para + " --> " + res;
    }

    @Override
    public String MiddleCallException(String para) throws RuntimeException{
        if (null == para) {
            throw new RuntimeException(MiddleServiceImpl.class.getName() + "-->故意抛出的异常");
        }
        String response = rootApi.CallRootException(para);
        return "middle 也没有异常 + " + response;
    }
}
