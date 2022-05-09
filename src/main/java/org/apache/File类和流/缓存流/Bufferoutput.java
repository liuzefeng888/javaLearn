package org.apache.File类和流.缓存流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
字节缓冲输出流
BufferedOutputstream
writer();
 */

public class Bufferoutput {
    public static void bufferoutput(String path,String s,boolean isAppend) throws IOException {
        FileOutputStream fos=new FileOutputStream(path,isAppend);
        BufferedOutputStream bos=new BufferedOutputStream(fos);//创建对象
        byte[] bytes = s.getBytes();
        bos.write(bytes);//调用方法
        bos.flush();
        bos.close();
        fos.close();

    }
}
