package org.apache.File类和流.字节流;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节输出流
outputstream抽象类
FileOutputStream子类
write();写，添加,一个子符一个字符的添加
flush();可以在没有close的时候把流中以写入的内容推送到文件中
 */
public class Output {
    public static void write(String path,String s,boolean isAppend) throws IOException {
        File f=new File(path);
        if(!f.getParentFile().exists()){//父级文件夹是否存在
            f.getParentFile().mkdirs();//创建父级文件夹
        }
        FileOutputStream fos=new FileOutputStream(f,isAppend);//isAppend代表追加意思，true和false，true时追加
        if(s==null){//写入的字符串是否为空
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            fos.write(s.charAt(i));
        }
        fos.flush();
        fos.close();
    }

    public  static void writeByte(String path,String s,boolean isAppend) throws IOException {
        File f=new File(path);
        if(!f.getParentFile().exists()){
            f.getParentFile().mkdirs();
        }
        FileOutputStream fos=new FileOutputStream(f,isAppend);//1.创建对象
        if(s==null){
            return;
        }
        byte[] b=s.getBytes();
        fos.write(b);//2调用writer方法
        fos.flush();//可以在没有close的时候把流中以写入的内容推送到文件中
        fos.close();//3.写入时时候，不关闭是没有办法直接作用到文件上，除非程序结束
    }
}
