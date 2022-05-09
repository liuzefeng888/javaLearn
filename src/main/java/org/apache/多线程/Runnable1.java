package org.apache.多线程;
//第二种实现多线程的方法
public class Runnable1 implements Runnable{//1.创建Runnable接口的实现类
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {//2.重写run方法
            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
            try {
                Thread.sleep(1000);//休眠，延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable1 t=new Runnable1();//3.创建实现类对象
        Thread t1=new Thread(t,"线程1");//4.创建Thread类对象，传递实现类对象
        Thread t2=new Thread(t,"线程2");
        t1.setPriority(10);//优先级的更改
        t2.setPriority(1);

        t1.start();//5.开启执行run方法
        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程运行");
            if(i==2){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
