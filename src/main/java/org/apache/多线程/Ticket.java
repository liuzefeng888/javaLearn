package org.apache.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
同步锁synchronized
第一种解决方法：同步代码块
第二种解决方法：同步方法
第三种解决方法：lock：1.创建ReentrantLock对象2.出现问题的代码前调用lock获取锁3.出现问题的代码后调用unlock释放锁
 */
public class Ticket implements Runnable {
    int num = 40;
    int n = 0;
    Lock l=new ReentrantLock();//1.创建ReentrantLock对象
    @Override
    public void run() {
        while (num > 0) {//线程进入while循环中，挣锁对象
//            l.lock();//2.出现问题的代码前调用lock获取锁
//            buyTicket();
            synchronized (this) {//第一种解决方法：同步代码块
                num--;
                n++;
                if(num<0)
                    return;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":抢到第" + n +
                        "张票，剩余：" + num);
            }
//            l.unlock();//3.出现问题的代码后调用unlock释放锁
        }
    }

    public synchronized void buyTicket() {//第二种解决方法：同步方法
        num--;
        n++;
        if(num<0)
          return;
        System.out.println(Thread.currentThread().getName() + ":抢到第" + n +
                "张票，剩余：" + num);
    }

    public void ticket1(){}


    public static void main(String[] args) {
        Ticket tt=new Ticket();
        Thread t1=new Thread(tt,"携程");
        Thread t2=new Thread(tt,"12306");
        Thread t3=new Thread(tt,"途牛");
        t1.start();
        t2.start();
        t3.start();
    }
}
