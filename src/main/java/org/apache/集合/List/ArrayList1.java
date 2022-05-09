package org.apache.集合.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
Collection:所有集合类的基础接口，定义了标准（数据存放的标准）存放的数据都是无序的可重复的（没有顺序要求，也没有去重要求）
List:Collection的子接口，有索引，存储的数据都是有序的（插入顺序）可重复的
Set：Collection的子接口，存储的数据都是无序的不可重复的
ArrayList 底层是可变数组、默认初始长度为10，增删慢，改查快


add(Object o);添加元素、
remove(Object o):删除某个元素
clear();清空所有元素
contains(Object o);判断是否包含某个元素
isEmpty();集合是否为空
size();获取集合的长度
toArray();将集合转成一个数组
iterator（）；返回迭代器的实现类对象
add(int index,Object o);指定位置添加元素
get(int index);返回指定位置的元素
remove(int index);移除指定位置的元素
set(int index,Object o);替换指定位置上的元素
addAll();添加一个集合
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);//增加
        l.add("asd");
        l.add(12.5);
        l.add(new ArrayList1());
        System.out.println(l.get(0));//查找
        if (l.contains(12.5)) {
            l.remove(12.5);//删
        }
        Object[] objects = l.toArray();
        l.set(0, "hello");//改
        System.out.println(l);
        //第一种遍历
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        //第二种遍历方式
        for (Object o : l) {
            System.out.println(o);
        }
        //第三种遍历
        Iterator itr=l.iterator();//获取集合迭代器
        while(itr.hasNext()){//迭代器遍历方式
            System.out.println(itr.next());
        }
    }
}
