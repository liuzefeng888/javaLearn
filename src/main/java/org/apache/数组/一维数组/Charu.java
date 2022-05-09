package org.apache.数组.一维数组;
import java.util.Arrays;
import java.util.Scanner;

/*
按顺序插入数值
 */
public class Charu {
    public static void main(String[] args) {
        int[] a={98,85,67,52,34};//降序数组
        int[] b=new int[a.length+1];//数组扩容
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num=sc.nextInt();
        //从后向前比较
        for(int i=b.length-2;i>=0;i--){
            if(num>b[i]){
                b[i+1]=b[i];
            }else{
                b[i+1]=num;
                break;
            }
            if(i==0){
                b[0]=num;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
