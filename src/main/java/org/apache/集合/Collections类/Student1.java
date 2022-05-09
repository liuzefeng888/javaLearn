package org.apache.集合.Collections类;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int age;

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "、年龄：" + age ;
    }
    //重写排序规则

    @Override
    public int compareTo(Student1  o) {
        //自定义比较的规则，比较两个人的年龄（this，参数S）
//        if(this.getAge()>o.getAge()){
//            return 1;
//        }else if (this.getAge()<o.getAge()){
//            return -1;
//        }else
//            return 0;

        //类同于上面代码
//        return this.getAge()-o.getAge();//升序




//        if(o.getAge()>this.getAge()){
//            return 1;
//        }else if (o.getAge()<this.getAge()){
//            return  -1;
//        }else
//            return 0;
        //类同于上面代码
        return o.getAge()-this.getAge();//降序
    }


}
