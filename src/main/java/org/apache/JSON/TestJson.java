package org.apache.JSON;

import com.alibaba.fastjson.JSON;

/*
JSON
 */
public class TestJson {
    public static void main(String[] args) {
        Student s=new Student(1,"刘泽锋",18);
        String ss = JSON.toJSONString(s);
        System.out.println(ss);
        String str ="{\"id\":123,\"name\":\"王老五\",\"age\":18}";
        Student o = JSON.parseObject(str,Student.class);
        System.out.println(o);
        System.out.println(o.show());


    }
}
