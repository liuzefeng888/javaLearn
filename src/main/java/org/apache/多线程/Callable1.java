package org.apache.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
第三种实现多线程的方法
 */
public class Callable1 implements Callable<String> {//1.创建Callable接口的实现类

    static int i;
    @Override
public String call() throws Exception {//2.重写call方法
    StringBuffer s=new StringBuffer();
    for ( i =1; i <=100; i++) {
        System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
        s.append(Thread.currentThread().getName()+"第"+i+"次运行\n");
    }
    return s.toString();
}

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> t=new Callable1();//3.创建实现类对象
        FutureTask<String> task1=new FutureTask(t);//4.
        FutureTask<String> task2=new FutureTask(t);
        Thread t1=new Thread(task1,"线程1");//5.
        Thread t2=new Thread(task2,"线程2");
        t1.start();//6.
        t2.start();

//        System.out.println(task1.get());
//        System.out.println(task2.get());


    }

}
