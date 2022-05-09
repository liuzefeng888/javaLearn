package org.apache.实用类.String类;

import java.util.Scanner;
/*
string底层是一个不可变的数组，因此每次重新复制都会重新创建String对象
安全性非常高、效率相当低（不适合频繁改变的场景）
StringBuffer底层是可变数组，每次重新赋值或改变值的时候，不在重新创建对象，但可以根据实际长度重新创建数组
每个方法都有Synchronized关键字。线程安全（同步锁）
安全性比较高、效率比较高（多线程场景下用）
StringBuilder几乎与StringBuffer相同
不同点：每次少一个缓存数组、方法声明处没有同步锁synchronized
安全性最低、效率最高（单线程场景下用）

StringBuffer类
append（）；添加任意字符串
toString（）；将stringBuilder类转为string类（字符串）
reverse（）；反转字符串
insert(插入位置，插入内容);插入字符串
 */

public class StringBufferAndStringbuilder {
    public static void main(String[] args) {
        //每次改变字符串的值，都会新生成一个对象
        //如果频繁改变，堆内存压力非常大
        String a="acb";
        StringBuffer buffer=new StringBuffer(a);
        buffer.append(123);//拼接
        buffer.append("hello");
        System.out.println(buffer.toString());
        System.out.println("------------------------------");
        StringBuffer j = buffer.insert(1, "jakfjf");
        System.out.println(j);
        System.out.println("********************************");
        System.out.println("请输入一串字符");
        Scanner sc=new Scanner(System.in);
        StringBuffer b=new StringBuffer(sc.next());
        b.insert(3,",");
        b.insert(7,",");
        System.out.println(b);


    }
}
