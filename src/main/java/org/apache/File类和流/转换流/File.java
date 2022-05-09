package org.apache.File类和流.转换流;

import java.io.*;

/*
转换流
outputStreamWriter:字符流通向字节流的桥梁，（看得懂的变成看不懂的）
InputStrreamReader:字节流通向字符流的桥梁（看不懂的变成看得懂的）
 */
public class File {
    public static void fileW(String path,String s) throws IOException {
        FileOutputStream os=new FileOutputStream(path);
        OutputStreamWriter osw=new OutputStreamWriter(os,"utf-8");
        osw.write(s);
        osw.close();
        os.close();
    }
    public static void fileR(String path) throws IOException {
        //指定的编码表名称要和 文件的编码相同
        FileInputStream fis=new FileInputStream(path);
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");//fis编码和utf-8相同
        int tmp;
        while((tmp=isr.read())!=-1){
            System.out.println((char)tmp);
        }
        isr.close();
        fis.close();
    }
}
