package org.apache.File类和流.缓存流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
字节缓冲输入流
BufferedInputstream
read();
 */
public class BufferInput {
    public static void BufferedInput(String path) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        BufferedInputStream br=new BufferedInputStream(fis);//创建对象
        StringBuilder sb=new StringBuilder();
        int tmp=0;
        while((tmp=br.read())!=-1){
            sb.append((char) tmp);
        }
//        byte[] b=new byte[br.available()];
//        br.read(b);
//        System.out.println(new String(b));


        br.close();
        fis.close();
        System.out.println(sb.toString());
    }

}
