package com.zy.test.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import sun.lwawt.macosx.CSystemTray;

/**
 * @author: zy
 * @date: 2020/9/29 上午10:10
 * @description:
 */
@Component
public class TestThreadInit implements InitializingBean {
    @Autowired
    AsyncMethod asyncMethod;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("1");
        for (int i = 0; i < 20; i++) {
            asyncMethod.asycTask();
        }
    }


}
