package org.apache.集合.Set;
import java.util.HashSet;
import java.util.Iterator;

/*
HashSet的方法演示

HashSet存储自定义类型对象,自定义类中要重写hashcold和equlas、toString方法，以保证存入set集合中的元素不重复

add(Object o);添加元素、
remove(Object o):删除某个元素
clear();清空所有元素
contains(Object o);判断是否包含某个元素
isEmpty();集合是否为空
size();获取集合的长度
toArray();将集合转成一个数组
iterator（）；返回迭代器的实现类对象
addAll();添加一个集合
 */
public class HashSet1 {

    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(123);
        set.add("hello");
        set.add('a');
        set.add(12.5);
        set.add(new HashSet());
        set.remove(123);
        //增强for遍历
        for (Object o : set) {
            System.out.println(o);
       }
       //迭代器遍历
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
