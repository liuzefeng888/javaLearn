package org.apache.数组.二维数组;
import java.util.Arrays;

public class Shuzu {
    public static void main(String[] args) {
        int[][] b={{1,2},{2,3},{4,5}};
        int[][] d=new int[5][];//最高维度一定要写长度
        //遍历1
        for(int i=0;i<b.length;i++){
            System.out.print("[");
            for(int j=0;j<b[i].length;j++){
                if(j==b[i].length-1){
                    System.out.print(b[i][b[i].length-1]+"]");
                }else{
                    System.out.print(b[i][j]+",");
                }
            }
            System.out.println();
        }
        //该遍历同遍历1  只是把一维的换了
        for(int i=0;i<b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
        //遍历2
        for(int[] arr:b){
            System.out.println(Arrays.toString(arr));
        }

        //赋值  1
        int[][] a=new int[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=(int)(Math.random()*100);
            }
        }

        //赋值  2
        int[][] c=new int[10][10];
        for (int[] arr:c) {
            for (int j = 0; j <arr.length; j++) {
                arr[j]=(int)(Math.random()*100);
            }
        }



    }
}
