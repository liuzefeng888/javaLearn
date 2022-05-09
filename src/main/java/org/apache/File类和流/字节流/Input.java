package org.apache.File类和流.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
字节输入流
InputStream抽象类
FileInuptStream子类
read();读取方法每次只读一个字节
available();读取字节数目其实就是长度
 */
public class Input {
    public static void read(String path)throws IOException{
        File f=new File(path);
        if(!f.exists()){
            throw new IOException("文件不存在");
        }
        FileInputStream fis=new FileInputStream(f);//创建对象
        StringBuilder sb=new StringBuilder();
        int tmp=0;
        while((tmp=fis.read())!=-1){//调用read方法
            sb.append((char) tmp);//读取的字节存入StringBuilder
        }
        fis.close();//关闭
        System.out.println(sb.toString());
    }


    public static  void readByte(String path) throws IOException {
        File f=new File(path);
        if(!f.exists()){
            throw new IOException("文件不存在");
        }
        FileInputStream fis=new FileInputStream(f);//创建对象
        byte[] b= new byte[fis.available()];//创建字节数组
        fis.read(b);//读取的字节存入字节数组
        fis.close();
        System.out.println(new String(b));
    }
}
