package org.apache.实用类.包装类;
/*
*1）包装类有两种构造方法
    1>参数为基本数据类型： 基本数据类型转为包装类
    2>参数为字符串： 字符串转为包装类（Character没有参数为字符串的构造方法）
  2）特殊记忆的包装类
    int-->Integer  、char-->Character
  3）包装类常用方法
    1>xxxValue() 包装类转为基本数据类型
	2>toString() 基本数据类型转为字符串
    3>parseXXX() 字符串转为基本数据类型(Character没有)
	4>valueOf(参数) 参数为基本数据类型：基本数据类型转为包装类
	                参数为字符串： 字符串转为包装类（Character没有）
 */
public class Test1 {
    public static void main(String[] args) {
        //以integer为例
        //两种构造方法
        int num=1;
        Integer in=new Integer(num);//参数为基本数据类型
        System.out.println(in);
        System.out.println("-----------------");
        String sun="123";
        Integer inm=new Integer(sun);//参数为字符串
        System.out.println(inm);
        System.out.println("--------------------");
        //常用方法
        //xxxValue()
        Integer iun=new Integer(789);
        int i = iun.intValue();
        System.out.println(i);
        System.out.println("---------------");
        //valueOf()
        Integer it = Integer.valueOf(456);
        System.out.println(it);
        System.out.println("-------------------");
        //toString()
        String s = Integer.toString(689);
        System.out.println(s);
        System.out.println("--------------");
        //parsexxx()
        int d = Integer.parseInt("745");


    }

}
