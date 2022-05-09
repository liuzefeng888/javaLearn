package org.apache.实用类.String类;

import java.util.Arrays;

/*
String类型
equals();两者比较
equalsIgnoreCase();两者忽略英文大小写比较
length();长度
charAt(index);指定位置的字符
indexOf();字符首次出现的索引位置
concat(string);当前字符串和参数字符串拼接起来，返回一个新的字符串
subString();根据下标（左闭右开）向后截取一段
toCharArray();将当前字符串拆成字符数组
getBytes();获得当前字符串底层的字节数组
replace(被替换的字符串，替换的字符串);字符串替换
split();按照参数的规则。将字符串切分。特例用.不能切割需要用\\.才可以。
trim();字符串左右去空格
valueOf(数据类型); 该数据类型转为字符串
+"添加的字符"；拼接
 */
public class String1 {
    public static void main(String[] args) {
        System.out.println("----------------------");
        String n=new String();
        System.out.println(n);
        System.out.println("-----------------------");
        String yu=123+"";
        System.out.println(yu);
        System.out.println("--------------------");
        String s="asd";
        String i=s+"hjk";//拼接字符串
        System.out.println(i);
        System.out.println("--------------------");
        String d=new String("asg");
        System.out.println(d);
        System.out.println("------------------");
        char[] p={'a','d'};
        String g=new String(p);
        System.out.println(g);
        System.out.println("-----------------");
        String b="asd";
        String in="asd";
        System.out.println(in == b);
        System.out.println("--------------------");
        String s3 = String.valueOf(123);
        System.out.println(s3);
        System.out.println("----------------------");
        String a="2020-07-20";
        String[] split = a.split("-");//切分
        for (String s2 : split) {
            System.out.println(s2);
        }
        System.out.println("-----------------");
        System.out.println(a.length());//长度
        System.out.println(a.charAt(0));//下标找字符
        System.out.println(a.codePointAt(3));//阿希柯马值
        System.out.println(a.concat("日"));//拼接一个字符串
        byte[] h = a.getBytes();//获得一个字节数组
        System.out.println(Arrays.toString(h));
        char[] k = a.toCharArray();//转成一个char数组
        System.out.println(Arrays.toString(k));
        System.out.println(a.substring(4, 7));//截取一段
        System.out.println(a.trim());//左右去空格
    }
}
