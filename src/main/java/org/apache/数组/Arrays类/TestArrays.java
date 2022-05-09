package org.apache.数组.Arrays类;

import java.util.Arrays;

/*
Arrays类提供操作数组的方法
sort(array); 对数组的元素进行升序排序
toString(array);将一个数组array转换成一个字符串
equals（）；比较两个数组的值是否相等
copyOf（array，length）；把数组array赋值成一个长度为length的新数组
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] a={1,9,3,8,5,6};
        int[] b={1,2,3,5,7,4,9};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(a, b));
        int[] c=Arrays.copyOf(a,10);
        for (int i : c) {
            System.out.print(i);
        }
    }
}
