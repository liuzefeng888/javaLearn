package org.apache.集合.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map接口是一个双列结合，一个元素包含两个值（key,value）,key和value的数据类型可以相同，也可以不同,key是不重复的，value是可以重复的,key和value是一一对应的
Map接口中的方法
entrySet()；获取Entry{键值对}集合

HashMap集合底层是哈希表，是一个无序的集合
“linkedHashMap”集合继承HashMap集合，底层是哈希表+链表，是“有序”的集合

HashMap方法
put();将指定“键-值”对添加元素，key相同时会覆盖value
remove(key)根据key删除value
get()  根据key获取value
containsKey()是否包含指定的键
size();元素个数
keySet();获得key的集合
values（）；获取value的集合
 */
public class HashMap1 {
    public static void main(String[] args) {
        Map<String,String > map=new HashMap();
        map.put("CN","中华人民共和国");//put是增加元素的方法
        map.put("USA","美国");
        map.put("UK","英国");
        map.put("RU","俄罗斯");
        //key重复时会将value的值覆盖
        map.put("USA","123");//put也是修改元素的方法
        System.out.println(map);
        //get()   根据key获取value
        String uk = map.get("UK");
        System.out.println(uk);
        //remove()  根据key删除value
        String ru = map.remove("RU");
        System.out.println(ru);
        //containsKey() 是否包含指定的键
        boolean b = map.containsKey("CN");
        System.out.println(b);
        //size();元素个数
        int size = map.size();
        System.out.println(size);

        //map的遍历
        //entrySet()获取Entry集合
        Set<Map.Entry<String,String>> set=map.entrySet();//获取Entry集合,根据"Entry对象"中的getkey(),getvalue()获取键和值
        Iterator<Map.Entry<String,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> next = itr.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+""+value);
        }
        for (Map.Entry<String, String> m : set) {
            String key = m.getKey();
            String value = m.getValue();
            System.out.println(key+""+value);
        }

/*
        //keySet()，获取所有key的集合
        Set<String> set=map.keySet();//获取所有key的集合,根据key找对应的value
        //迭代器
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(map.get(itr.next()));
        }
        //增强for
        for (String o : set) {
            System.out.println(o);
            System.out.println(map.get(o));
        }
*/
    }
}
