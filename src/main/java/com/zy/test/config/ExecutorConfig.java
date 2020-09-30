package com.zy.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: zy
 * @date: 2020/9/29 上午9:59
 * @description:创建线程池
 */
@Configuration
public class ExecutorConfig {

    @Bean
    public Executor asyncReleaseServiceExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);//核心线程数
        executor.setMaxPoolSize(20);//最大线程数
        executor.setQueueCapacity(100);//队列中的最大数目
        executor.setThreadNamePrefix("zy-");
        executor.setKeepAliveSeconds(60);//线程空闲后的最大存活时间
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
