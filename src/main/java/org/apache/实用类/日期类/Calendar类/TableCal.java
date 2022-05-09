package org.apache.实用类.日期类.Calendar类;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Calendar类 ：抽象类
  1）静态方法
     getInstance（）;获取日历对象
  2）成员方法
     get（）；获取特定于日历的值
     set（）；将给定的日历字段设置为给定值
     add（）；将给定的日历增加或减少指定的时间量
     gettime（）；将日历转换为日期

SimpleDateFormat类 继承DateFormat类
  1）构造方法
     SimpleDateFormat（）;传递默认的模式
     SimpleDateFormat（"yyyy-MM-dd HH:mm:ss"）;传递指定的模式
  2）成员方法
     format（）；按照指定的模式把Date日期格式化为符合模式的字符串
     parse（）；把符合模式的字符串解析为Date日期
     getCalendar（）；获取与此日期/时间格式对象关联的日历对象
 */
public class TableCal {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//指定日期模式 ss.SSS.后面为毫秒
        String time=sdf.format(d);//date日期转成指定模式
        System.out.println(time);
        Date date = sdf.parse("2021-09-11 00:00:00");//从字符串型转成Date型 都要和Pattern定义的格式保持一致
        System.out.println(date);
        System.out.println("********************************");

        Calendar c=sdf.getCalendar();
        Date dt = c.getTime();
        System.out.println(dt);

        Calendar in = Calendar.getInstance();
        System.out.println(in.get(Calendar.DAY_OF_MONTH));
        in.set(Calendar.DAY_OF_MONTH,18);
        System.out.println(in.get(Calendar.DAY_OF_MONTH));
        in.add(Calendar.DAY_OF_MONTH,-10);
        System.out.println(in.get(Calendar.DAY_OF_MONTH));
    }
}
