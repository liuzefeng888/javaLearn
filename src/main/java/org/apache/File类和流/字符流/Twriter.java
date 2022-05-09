package org.apache.File类和流.字符流;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
字符流
writer抽象类
Filewriter子类
writer();写，添加,一个子符一个字符的添加
flush();可以在没有close的时候把流中以写入的内容推送到文件中
 */
public class Twriter {
    public static  void writeChar(String path,String s,boolean isAppend) throws IOException {
        File f=new File(path);
        if(f.getParentFile()!=null&&!f.getParentFile().exists()){
            f.getParentFile().mkdirs();
        }
        FileWriter fw=new FileWriter(f,isAppend);//创建对象
        for (int i = 0; i < s.length(); i++) {
            fw.write(s.charAt(i));
        }
        fw.flush();
        fw.close();
    }


    public static  void write(String path,String s,boolean isAppend) throws IOException {
        File f = new File(path);
        if (f.getParentFile()!=null&&!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        FileWriter fw = new FileWriter(f, isAppend);//1.创建对象
        fw.write(s);//2.调用方法
        fw.flush();//3.数据刷新到文件中
        fw.close();//4释放资源
    }

}
