package Learn.Day216.demo03;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner stu=new Scanner(System.in);
        int  i=stu.nextInt();
        System.out.println(i);

        String string=stu.next();
        System.out.println("输入了字符串"+string);
    }
}
