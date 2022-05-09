package org.apache.集合.List;
import java.util.LinkedList;

/*
LinkedList底层是note节点构成的双向链表，增删快，改查慢

addFrist();元素插入列表开头  push();
addLast();元素插入列表结尾
getFrist();返回第一个元素
getlast();返回最后一个元素
removefrist();移除第一个元素   pop();
removeLast();移除最后一个元素
isEmpty();集合是否为空
 */
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.add(123);
        l.add("asd");
        l.addLast(234);
        l.addFirst("ggg");
        l.add(1,"move");
        l.get(1);
        String s = l.toString();
        l.remove();
        System.out.println(l);
    }

}
