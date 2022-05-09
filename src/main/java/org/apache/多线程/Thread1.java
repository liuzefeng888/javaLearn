package org.apache.多线程;
/*
Thread类
     1） 静态方法
        sleep（）;休眠、延时
        yield（）;礼让
        currentThread（）;返回对当前正在执行线程的对象的引用
     2） 成员方法
        interrupt（）;给当前线程标记一个线程可中断状态
        setpriority（）;优先级的更改，1-10级
        getname（）;获取当前线程名称
        setname（）;改名
        join();阻塞调用此方法的线程(calling thread)，直到该线程对象完成，此线程再继续；
               通常用于在main()主线程内，等待其它线程完成再结束main()主线程
 */
//第一种实现多线程的方法
public class Thread1 extends Thread{//1.继承Thread类
    public Thread1(){}
    public Thread1(String name) {//可以改线程名称
        super(name);
    }

    public void run(){//2.重写run方法
//        for (int i = 0; i <=10; i++) {
//            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
//        }
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"你好，来自线程"+Thread.currentThread().getName());
            if(i==5){
                System.out.println(Thread.currentThread().getName()+"线程礼让");
                Thread.yield();//礼让
            }
            if(i==7){
                this.interrupt();//给当前线程标记一个线程可中断状态
            }
        }
    }


    public static void main(String[] args) {

        new Thread1(){
            @Override
            public void run() {
                for (int i = 0; i <= 20; i++) {
                    System.out.println(i+"你好，来自线程"+Thread.currentThread().getName());
                    if(i==5){
                        System.out.println(Thread.currentThread().getName()+"线程礼让");
                        Thread.yield();//礼让
                    }
                    if(i==7){
                        this.interrupt();//给当前线程标记一个线程可中断状态
                    }
                }
            }
        }.start();

        Thread1 t3=new Thread1("1");
        Thread1 t1=new Thread1("2");//3.创建实现类对象
        Thread1 t2=new Thread1("3");
        t1.start();//4.开启run方法
        t2.start();
    }


}
