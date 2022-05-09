package org.apache.代码块;

public class Static extends StaticFu{
    static{
        System.out.println("执行子类中的静态代码块");
    }
    {
        System.out.println("执行子类中的非静态代码块");
    }
    public Static(){
        System.out.println("执行子类构造方法");
    }

    public static void main(String[] args) {
        System.out.println("main函数");
        new Static();


    }
}
