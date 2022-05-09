package org.apache.File类和流.缓存流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
字符缓存输入流
BufferedReader
readline();读取一行数据
 */
public class Bufferread {
    public static String readBuffer(String path) throws IOException {
        FileReader fr=new FileReader(path);//
        BufferedReader br=new BufferedReader(fr);//创建对象
        StringBuilder sb=new StringBuilder();
        String tmp;
        while((tmp=br.readLine())!=null){//readline方法调用
            sb.append(tmp+"\r\n");
        }
        br.close();
        fr.close();
        return  sb.toString();
    }
}
