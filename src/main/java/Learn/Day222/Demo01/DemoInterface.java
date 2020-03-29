package Learn.Day222.Demo01;

import Learn.Day222.Demo01.MyInterface;
import Learn.Day222.Demo01.MyInterfaceImpl;

public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceImpl a=new MyInterfaceImpl();
        a.test();
        //MyInterface.s(); //静态方法的调用


    }
}
