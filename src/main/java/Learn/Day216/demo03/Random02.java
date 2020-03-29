package Learn.Day216.demo03;

import java.util.Random;
import java.util.Scanner;

public class Random02 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        Boolean is=true;
        int i=0;
        while(is){
            int num = r.nextInt(100)+1;//[1,100
            System.out.println(num);
            i++;
            if(num==x){
                is=false;
            }
        }
        System.out.println("第"+i+"次猜出来的2");
    }
}
