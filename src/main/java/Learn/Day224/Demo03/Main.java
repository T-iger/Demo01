package Learn.Day224.Demo03;

import java.util.Calendar;

/**
 *    java.util.Calendar
 *   抽象类
 *
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.get(Calendar.YEAR));
    }

}
