package org.apache.File类和流.对象流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
字节对象输入流
ObjectInputStream，反序列化
readObject();
 */
public class ObjectInput {
    public static void objectInput(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o = ois.readObject();
        //强转调用子类中的方法
        Student s=(Student)o;
        ois.close();
        fis.close();
        System.out.println(o);
        System.out.println(s.getName()+" "+s.getAddress());
    }
}
