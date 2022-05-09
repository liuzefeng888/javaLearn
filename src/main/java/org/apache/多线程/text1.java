package org.apache.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*

 */
public class text1 extends Thread {
    public text1(){}
    public text1(String name){
        super(name);
    }
    public static Object o=new Object();
     static int num=100;
     static int no=0;
     static Lock l=new ReentrantLock();
    @Override
    public void run() {
       while(num>0) {
          // buy();
          // synchronized (o){
           l.lock();
               num--;
               no++;
               if(num<0){
                   return;
               }
               System.out.println(Thread.currentThread().getName()+":抢到第" + no +
                        "张票，剩余：" + num);
      // }
           l.unlock();
       }

    }
    public static synchronized void buy(){
        num--;
        no++;
        if(num<=0){
            return;
        }
        System.out.println(Thread.currentThread().getName()+":抢到第" + no +
                "张票，剩余：" + num);
    }

    public static void main(String[] args) {

//        text1 t=new text1();
//        Thread t1=new Thread(t,"线程一");
//        Thread t2=new Thread(t,"线程2");
        text1 t1=new text1("1");
        text1 t2=new text1("2");
        t1.start();
        t2.start();
    }
}
