package Learn.Day329.Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 斗地主
 * 有序
 * 1、准备牌
 * 2、洗牌
 * 3、发牌
 * 4、排序
 * 5、看牌
 */


public class DouDiZhu {
    public static void main(String[] args) {
        //1、准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义2个集合存储数字和花色
        List<String> colors = List.of("♥", "♠", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大小王放入存储集合中
        //定义一个牌的索引
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历，组合牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(pokerIndex);
//        System.out.println(poker);
        //2、洗牌
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);
        //3、发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        /*System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(diPai);*/
        show("player01",poker,player01);
        show("player02",poker,player02);
        show("player03",poker,player03);
        show("dipai",poker,diPai);

    }
    public static void show(String name,HashMap<Integer,String> poker,ArrayList<Integer> pokerIndex){
        System.out.print("玩家姓名："+name+"  ");
        for (Integer index : pokerIndex) {
            String value = poker.get(index);
            System.out.print(value+"   ");
        }
        System.out.println(name+"的发牌完成");
    }

}
