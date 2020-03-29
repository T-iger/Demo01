package Learn.Day223.Demo01;

public class Main {
    public static void main(String[] args) {

        //向上转型
        Animal a=new Cat();
        a.eat();

        //判断一下父类应用的animal本来是不是Cat
        if(a instanceof Cat){
            //向下转型（还原）
            Cat cat=(Cat)a;
            cat.main();
        }

    }
}
