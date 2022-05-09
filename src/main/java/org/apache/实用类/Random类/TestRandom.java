package org.apache.实用类.Random类;
import java.util.Random;

/*
Random类：用来生成随机数字
1.创建对象
2.调用方法 对象名.nextInt();
3.随机某一范围可以调用有参数的：对象名.nextInt(参数);[0,参数）左闭右开
 */
public class TestRandom {
    public static void main(String[] args) {
        Random r=new Random();//伪随机创建对象
        int b = r.nextInt();//无范围随机数
        System.out.println(b);
        for (int i = 0; i < 100; i++) {
            int a=r.nextInt(10);//(int)(Math.random()*10)
            System.out.println(a);
        }

    }
}
