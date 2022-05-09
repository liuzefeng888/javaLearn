package org.apache.集合.Collections类;
import java.util.*;

/*
Collestions类对集合使用

addAll（list或set），往集合中添加一些元素

shuffle（list）：打乱顺序，集合顺序

srot(list):将集合元素按照默认规则排序，参数只能为list。使用前提，引用类型必须实现Comparable，
并重写接口中的compareTo定义排序的规则

srot(list<T> list, Comparator<? super T> comparator):将集合中元素按照指定规则排序
Comparator相当于找到了第三方裁判，比较两个，重写compare定义排序的规则
*/
public class collections1 {
    public static void main(String[] args) {
        //addAll方法
        List<String> list=new ArrayList<String>();
        Collections.addAll(list,"a","b","c","d");
        Set set=new HashSet();
        Collections.addAll(set,"1","2","3");
        System.out.println(list);
        //shuffle方法
        Collections.shuffle(list);
        System.out.println(list);
        //srot(list<> list)方法
        List<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,1,2,3,4);
        Collections.sort(list1);
        System.out.println(list1);


        List<String> list2=new ArrayList<>();
        Collections.addAll(list2,"a","b","c","d");
        Collections.sort(list2);
        System.out.println(list2);


        //srot(List list):自定义类实现Comparable，重写接口中的compareTo，定义排序的规则

        List<Student1> list3=new ArrayList<>();
        list3.add(new Student1("张三",12));
        list3.add(new Student1("李四",18));
        list3.add(new Student1("王五",19));
        list3.add(new Student1("赵六",15));
        Collections.sort(list3);
        System.out.println(list3);

        //srot(list<T> list, Comparator<? super T> comparator)方法

        List<Integer> list4=new ArrayList<>();
        Collections.addAll(list4,1,2,3,4);
        Collections.sort(list4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 01-02;//升序
                // return 02-01;//降序
            }
        });
        System.out.println(list4);


        //srot(list<T> list, Comparator<? super T> comparator),引用自定义类Student1类

        List<Student1> list5=new ArrayList<>();
        list5.add(new Student1("张三",12));
        list5.add(new Student1("李四",18));
        list5.add(new Student1("王五",19));
        list5.add(new Student1("赵六",15));
        list5.add(new Student1("王古",15));
        Collections.sort(list5, new Comparator<Student1>() {
            @Override

            public int compare(Student1 o1, Student1 o2) {
                int result =o1.getAge()-o2.getAge();//年龄大小排序
                if(result==0){//年龄相等时，按名字顺序排序
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list5);
    }

}
