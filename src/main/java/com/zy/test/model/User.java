package com.zy.test.model;

import java.time.Instant;
import java.util.Random;

/**
 * @author: zy
 * @date: 2020/9/25 下午3:28
 * @description:
 */
public class User {
    public static String getString(String s){
        String returnStr = "";
        try{
            for(int i = s.length(); i > 0 ; i--){
                for(int j = 0; j + i <= s.length() ; j++){
                    String sub = s.substring(j,j+i);

                    StringBuffer sb1 = new StringBuffer(sub);

                    StringBuffer parseSb = sb1.reverse();
                    String parse = parseSb.toString();

                    if(sub.equals(parse)){
                        returnStr = sub;
                        throw new Exception();
                    }
                }
            }
        }catch (Exception e){
            System.out.println("找到回文字符串!");
        }
        return returnStr;
    }
//
    public static void main(String[] args) {
        Random r= new Random();
        int ii = r.nextInt(106);
        System.out.println(ii);
        System.out.println(Instant.now());
    }



}

