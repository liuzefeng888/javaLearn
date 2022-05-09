package org.apache.File类和流.对象流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
字节对象输出流
ObjectOutputStream,序列化流
writerObject();将指定对象写入ObjectOutputStream
 */
public class ObjectOutput {
    public static void object(String path,Student s,boolean isAppend) throws IOException {
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);//创建对象
        oos.writeObject(s);//调用方法
//        oos.writeObject(new Student(1,"刘泽锋","1998-1-9","山东","17562253242"));
        oos.flush();
        oos.close();
        fos.close();
    }

}
