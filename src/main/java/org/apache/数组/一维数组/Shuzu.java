package org.apache.数组.一维数组;

import java.util.Arrays;

//数组的定义与使用
public class Shuzu {
    public static void main(String[] args){
        //数组的定义与使用
        int[] a=new int[5];
        int[] b=new int[]{1,2,3,4,5};
        int[] c={1,2,3,4,5};
        System.out.println(a[0]);

        int[] arrays=new int[]{1,2,3,4,5};
        //第一种数组的遍历方式
        System.out.print("[");
        for(int i=0;i<arrays.length;i++) {
            if (i == arrays.length-1) {
                System.out.println(arrays[arrays.length-1]+"]");
            }else{
                System.out.print(arrays[i] + ",");
            }
        }
        //等同于第一种遍历方式
        System.out.println(Arrays.toString(arrays));
        //第二种遍历方式 一维数组不好用
        for(int k:arrays){  //int k=arrays[i]
            System.out.print(k+",");
        }

        //用随机数对数组赋值
        int[] d=new int[10];
        for(int j=0;j<d.length;j++){
            d[j]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(d));


        double sum=0;
        for(int i=0;i<d.length;i++){
            sum+=d[i];
        }
        double avg=sum/d.length;
        System.out.println(avg);

    }
}
