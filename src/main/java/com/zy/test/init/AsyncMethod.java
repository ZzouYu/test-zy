package com.zy.test.init;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: zy
 * @date: 2020/9/29 上午10:32
 * @description:
 */
@Component
public class AsyncMethod {
    @Async("asyncReleaseServiceExecutor")
    public  void asycTask(){
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName);
    }
}
