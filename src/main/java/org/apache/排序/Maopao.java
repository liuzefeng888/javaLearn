package org.apache.排序;
import java.util.Arrays;

/*
冒号排序
比较相邻的元素。如果第一个比第二个大，就交换它们两个；
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
针对所有的元素重复以上的步骤，除了最后一个；
重复步骤1~3，直到排序完成。
升序的演示，降序只需改变交换条件a[j]<a[j+1]
 */
public class Maopao {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<a.length-1;i++){//控制比较的轮数a.length-1轮
            boolean flag=true;//没有发生交换
            for(int j=0;j<a.length-1-i;j++){//控制每轮比较的次数a.length-1-i次
                if(a[j]>a[j+1]){
                    //不满足顺序的条件
                    //交换值，大的值排在后，小的值排在前
                    int tep=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tep;
                    flag=false;
                }
            }System.out.println(Arrays.toString(a));
            if(flag){
                System.out.println("经过第"+(i+1)+"轮排序，数组已经有序");
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
