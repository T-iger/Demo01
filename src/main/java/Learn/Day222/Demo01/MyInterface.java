package Learn.Day222.Demo01;

/**
 * 在任意版本的java中，接口都能定义抽象方法
 * 格式
 * public abstract 返回值类型  方法名称（参数列表）
 * 注意事项
 * 1、接口当中的抽象方法，修饰符必须是两个固定的关键字 public abstract
 * 2、这两个关键字修饰符，可以选择性省略
 * 3、方法的三要素，可以随意定义。
 */

/**
 * 接口使用步骤
 * 1、接口不能直接使用，必须有一个 “实现类” 来实现接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *    //...........
 * }
 * 2、接口的实现类必须重写（实现）接口中所有的抽象方法。
 * 实现：去掉 abstract关键字，加上方法体大括号。
 * 3、创建实现类的对象，进行使用。
 */

public interface MyInterface {

    //定义抽象方法
    public abstract void abs();

    //默认方法

    public default void test(){
        System.out.println("1");
       // comm();
    }


  /*  private void comm(){
        System.out.println(1);
    }*/



}
