package org.apache.实用类.枚举;

public class Work1 {
    public enum Work{
        L1,L2,L3;
    }
    public  void run(Work work){
        switch(work){
            case L1:
                System.out.println("大数据开发工程师");
                break;
            case L2:
                System.out.println("大数据挖掘工程师");
                break;
            case L3:
                System.out.println("大数据架构师");
                break;
        }
    }

    public static void main(String[] args) {
        Work1 w=new Work1();
        w.run(Work.L1);
    }
}
