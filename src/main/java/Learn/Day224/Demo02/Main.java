package Learn.Day224.Demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *练习题，计算一个人已出生多少天
 * 解析：
 *      1、获取出生日期
 *      2、把字符串转化为Date格式
 *      3、利用getTime()把Date转化为毫秒
 *      4、获取当前时间
 *      5、计算当前时间到出生日期的毫秒
 *      6、把毫秒转化为Date
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的出生日期：yyyy-MM-dd HH-mm-ss");
        String birthday=sc.next();
        //转化格式为yyyy-MM-dd
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(birthday);
        Date date= simpleDateFormat.parse(birthday);
//      long time1 = date.getTime();
//      获取当前时间
        Date time = new Date();
        System.out.println(simpleDateFormat.format(time));
//        计算当前时间到出生年月日的毫秒差
        long l = time.getTime() - date.getTime();
//        输出多少天
        System.out.println(l/1000/60/60/24);
    }
}
