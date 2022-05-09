package org.apache.File类和流.字符流;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
字符流
read抽象类
Fileread子类
read();读取方法每次只读一个字节
 */
public class Tread {
    public static void read(String path) throws IOException {
        //第一种
        File f=new File(path);
        if (!f.exists()){
            throw new IOException("文件不存在");
        }
        FileReader fr=new FileReader(f);//创建对象
        StringBuilder sb=new StringBuilder();
        int tmp;
        while((tmp=fr.read())!=-1){//read方法调用
            sb.append((char)tmp);
        }
        fr.close();//关闭流
        System.out.println(sb.toString());
    }

    public static void readChar(String path) throws IOException {
        File f=new File(path);
        if (!f.exists()){
            throw new IOException("文件不存在");
        }
        FileReader fr = new FileReader(f);

        //第二种
        StringBuilder sb1=new StringBuilder();
        int length=1024;
        char[] chars=new char[length];
        int tmp=0;
        while((tmp=fr.read(chars))!=-1){
            sb1.append((char)tmp);
            //1
            chars=new char[length];//防止出现复写情况
            System.out.println(new String(chars,0,tmp));
        }
        fr.close();
        //2
        System.out.println(sb1.toString());
    }

}
