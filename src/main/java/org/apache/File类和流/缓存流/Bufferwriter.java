package org.apache.File类和流.缓存流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
字符缓存输出流
Bufferedwriter
newline（）；写入一个行分隔符

 */
public class Bufferwriter {
    public static void writeBuffered(String path,String s,boolean isAppend) throws IOException {
        FileWriter fw=new FileWriter(path,isAppend);
        BufferedWriter bw=new BufferedWriter(fw);//创建对象
//        char[] chars = s.toCharArray();
//        bw.write(chars);
        bw.write(s);
        bw.close();
        fw.close();
    }
}
