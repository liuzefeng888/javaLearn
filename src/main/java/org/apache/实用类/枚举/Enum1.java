package org.apache.实用类.枚举;
/*
枚举:是由一组固定的常量组成的类型
 */
public enum Enum1 {
   男,女;//枚举中的值可以近似看作静态常量,类名调用


    private int genderId;//普通变量

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public void say(){//普通方法
        System.out.println("性别："+this);
    }
    public static void speak(Enum1 g){//静态方法
        System.out.println("性别"+g);
    }
    static {//静态代码块
        System.out.println("静态代码块");
    }










}
