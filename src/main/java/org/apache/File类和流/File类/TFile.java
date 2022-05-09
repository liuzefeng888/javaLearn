package org.apache.File类和流.File类;
import java.io.File;
import java.io.IOException;

/*
File类方法演示
 */
public class TFile {
    public static void main(String[] args) throws IOException {
        //构造方法
        File file=new File("a.txt");//创建对象需要指定文件路径
        File f1=new File("C:/","a.txt");//父路径和子路径
        File f2=new File("C:/");
        File f3=new File(f2,"a.txt");
        //成员方法
        file.createNewFile();//创建新文件
        file.mkdirs();//递归创建文件夹
        file.mkdir();//创建单个文件夹
        file.delete();//删除
        file.deleteOnExit();//退出程序时删除
        file.exists();//路径是否存在
        file.getAbsoluteFile();//返回此对象表示的文件的绝对路径名
        file.getPath();//返回写入的路径，写的什么路径就返回什么路径
        file.getName();//路径结尾的部分，文件名或文件夹名
        file.length();//文件大小
        file.getParent();//父级路径，使用相对路径时可能不能正确获取
        File parentFile = file.getParentFile();//父级路径的File对象
        file.isFile();//是否是文件
        file.isDirectory();//是否是文件夹
        file.list();//获取目录下所有的文件和目录
        File[] files = file.listFiles();//获取目录下的所有文件或目录
        File f=new File("b.txt");
        file.renameTo(f);//改名
        //文件的是否执行、读、写
        file.canExecute();
        file.canRead();
        file.canWrite();
    }
}
