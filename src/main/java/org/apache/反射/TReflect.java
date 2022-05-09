package org.apache.反射;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TReflect <T>{
    //构造方法通用方法
    public T getInstance(Class<T> tClass,Object[] values,Class<T>...paramsClasses) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> cons = tClass.getDeclaredConstructor(paramsClasses);//获取构造器
        if(!cons.isAccessible()){
            cons.setAccessible(true);//强行获取执行权限
        }
        T t=cons.newInstance(values);//由构造器创建对应对象
        return t;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        //反射获取类的三种方式
        //1.从字符串输入来对应类型，灵活性太高，系统无法直接确定类型。用于配置文件
        Class<?> aClass = Class.forName("反射.Student");

//        Student stu=new Student();
//        //2.从对象类型来获取，可能会有子类引用父类类型的情况，因此范围比较确定
//        Class<? extends Student> aClass = stu.getClass();
//        String name1 = aClass.getName();
        //3.从类型来获取，确定的类型，范围固定不变，多用于参数的传递
        Class<Student> studentClass = Student.class;
        String name = studentClass.getName();
//        System.out.println(name1+"\n"+name);



        //获取无参构造
        Constructor<Student> constructor = studentClass.getConstructor();//获取构造器
        constructor.setAccessible(true);//强行获取执行权限
        Student student2 = studentClass.newInstance();//方法2：直接由反射获取的类对象创建相应对象，一般用这个
        Student student = constructor.newInstance();//方法1 由构造器创建对应对象
        System.out.println(student);
        //有参构造
        Constructor<Student> constructor1 = studentClass.getConstructor
                (int.class, String.class, String.class, int.class);//获取构造器
        constructor1.setAccessible(true);//强行获取执行权限
        Student student1 = constructor1.newInstance(1,"刘泽锋","kb15",19 );//由构造器创建对应对象
        System.out.println(student1);



        TReflect<Student> trs=new TReflect();
        Object[] o={1,"liuzefeng","kb15",19};
        Class[] classes={int.class, String.class, String.class, int.class};
        Student s = trs.getInstance(Student.class, o, classes);
        System.out.println(s);


        //获取所有public修饰的成员变量
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取由public修饰的单个成员变量
//        Field grade = studentClass.getField("grade");
//        Student stud=new Student();
//        grade.set(stud,"kb14");
//        System.out.println(stud.getGrade());

        //获取所有成员变量，与修饰符无关。
        s.age=19;
        s.name="王宝强";
        s.grade="娱乐圈";
        Field stuId = studentClass.getDeclaredField("stuId");
        stuId.setAccessible(true);//暴力反射，强行获取执行权限
        stuId.set(s,1);
        System.out.println(s);

        //获取所有成员方法
        s.setAge(18);
        s.setGrade("娱乐圈");
        s.setName("罗志祥");
        Method setStuId = studentClass.getDeclaredMethod("setStuId", int.class);
        setStuId.setAccessible(true);//暴力反射，强行获取执行权限
        setStuId.invoke(s,10);//赋值方法
        System.out.println(s);

    }
}
