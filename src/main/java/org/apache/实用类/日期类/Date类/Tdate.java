package org.apache.实用类.日期类.Date类;
import java.util.Date;

/*
演示日期类型
Date（）;获得当前时间
Date（毫秒数）;传递毫秒值，把毫秒值转成日期
getTime（）;当前时间和格林威治时间的差值（毫秒数）,成员方法
 */
public class Tdate {
    public static void main(String[] args) {
        Date d=new Date();//当前时间
        System.out.println(d);//当前时间的UTC时间
        System.out.println("**************************");
        long time = d.getTime();//时间戳：当前时间和格林威治时间的差值
        System.out.println(time);
        System.out.println("--------------------------");
        time+=24*60*60*1000;
        Date tomorrow=new Date(time);
        System.out.println(tomorrow);
        System.out.println("**************************");
        Date a=new Date(1630000000000L);
        long at = a.getTime();
        long couns=Math.abs(at-time);
        System.out.println(couns/1000+"秒");
        System.out.println(couns/1000/60+"分钟");
        System.out.println(couns/1000/60/60+"小时");
        System.out.println(couns/1000/60/60/24+"天");
    }
}
