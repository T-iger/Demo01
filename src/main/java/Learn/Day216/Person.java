package Learn.Day216;

import java.util.ArrayList;
/*
题目：群发红包
 */

public class Person {
    private String name;//姓名
    private double money;//余额

    public Person() {
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
