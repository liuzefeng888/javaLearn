package org.apache.File类和流.二进制流;
import java.io.*;

/*

二进制流
DataInputStream
read();
DataOutputStream
write();
 */
public class Data {
    public static void copy(String from,String to) throws IOException {
        FileInputStream fis=new FileInputStream(from);
        DataInputStream dis=new DataInputStream(fis);//创建字节输入流对象
        FileOutputStream fos=new FileOutputStream(to);
        DataOutputStream dos=new DataOutputStream(fos);

        String s = dis.readUTF();
        byte[] b=new byte[fis.available()];//相当于中介
        dis.read(b);
        dos.write(b);
        dos.writeUTF(s);
//        int tmp;
//        while((tmp=dis.read())!=-1){
//            dos.write(tmp);
//        }
        dos.close();
        fos.close();
        dis.close();
        fis.close();

    }
}
