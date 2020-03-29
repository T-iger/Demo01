package Learn.Day222.Demo01;

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
public class MyInterfaceImpl implements MyInterface {


    @Override
    public void abs() {

    }


    @Override
    public void test() {

    }
}
