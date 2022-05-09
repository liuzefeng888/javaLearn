package org.apache.实用类.math;
/*
     abs（）;获取绝对值
     ceil（）;向上取整
     floor（）;向下取整
     round（）;四舍五入
     random（）;[0.0,1.0)间的随机数
     PI 圆周率
 */
public class Tmath {
    public static void main(String[] args) {
        double a = Math.abs(-12.5);
        System.out.println(a);
        System.out.println("-----------------");
        int i = (int) (Math.random()*10);
        System.out.println(i);
        System.out.println("-----------------");
        int max = Math.max(1, 2);
        System.out.println(max);
        System.out.println("------------------");
        double c = Math.ceil(12.1);
        System.out.println(c);
        System.out.println("------------------");
    }
}
