package com.zy.test;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplicationTests {
    private final String s = "我是%s的规范化%s";

    @Test
    public void contextLoads() {
        String sss = String.format(s, "神","仙");
        System.out.println(sss);
    }

}
