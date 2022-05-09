package org.apache.排序;
import java.util.Arrays;

//选择排序
// 优点每轮比较只会进行一次交换
public class Xuanze {
    public static void main(String[] args) {
        //从当前位置向后比较   找出最小值，与该位置进行交换 核心思想是找最小值
        int[] a=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
        }



        for (int i = 0; i < a.length-1; i++) {
            int min=a[i];//先定一个基准值为最小值
            int p=i;//记录当前基准值为最小值的下标
            for(int j=i+1;j<a.length;j++){//基准值与基准值后面比较找最小值
                if(a[j]<min){
                    min=a[j];
                    p=j;
                }
            }
            //交换
            a[p]=a[i];//将最小值换成基准值
            a[i]=min;//将基准值换成最小值
        }
        System.out.println(Arrays.toString(a));
    }
}
