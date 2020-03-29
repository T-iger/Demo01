package Learn.Day224.Demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        //输出当前时间到1970.1.1的毫秒
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        //格式化Date
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String s = fmt.format(date);
        System.out.println(s);
        try {
            Date c = fmt.parse("2020-02-24 14-36-06");
            System.out.println(c);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
