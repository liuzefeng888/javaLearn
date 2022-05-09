package org.apache.数组.一维数组;
import java.util.Arrays;

/*
数值求最值，数组元素取反
 */
public class Extremum {
    public static void main(String[] args) {
        int[] b = new int[10];
        for (int j = 0; j < b.length; j++) {//赋值
            b[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(b));//遍历
        int max=b[0];//选取基准值
        int min=b[0];
        for(int j=1;j<b.length;j++){
            if(max<b[j]){//比选取的基准值大
                max=b[j];//将其作为新的基准值
            }
            if(min>b[j]){//比选取的基准值小
                min=b[j];//将其作为新的基准值
            }
        }
        System.out.println(min+" "+max);


        //数组元素取反
//        int i=0;
//        int j=b.length-1;
        for(int i=0,j=b.length-1;i<j;i++,j--){
            int tmp=b[i];
            b[i]=b[j];
            b[j]=tmp;
        }
    }
}
