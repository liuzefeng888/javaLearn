package org.apache.实用类.枚举;

public class Enum2 {
    public Enum1 sex;//枚举类型
    public void run(Enum1 s){
        System.out.println("性别为："+s);
    }

    public static void main(String[] args) {
        Enum2 t=new Enum2();
        t.sex= Enum1.男;//赋值
        Enum1 m = Enum1.男;//获取枚举对象
        System.out.println("---------------");
        m.say();
        System.out.println("---------------");
        Enum1.speak(m);
        System.out.println("---------------");
        Enum1 male = Enum1.valueOf("男");
        t.run(male);
        System.out.println("---------------");
        Enum1[] values = Enum1.values();//获取枚举数组
        for (Enum1 value : values) {
            System.out.println(value);
        }
        System.out.println("---------------");
        t.run(Enum1.男);
    }
}
