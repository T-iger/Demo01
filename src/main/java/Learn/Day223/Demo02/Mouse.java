package Learn.Day223.Demo02;

public class Mouse  implements Usb{


    @Override
    public void open() {
        System.out.println("打开鼠标");
}

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }


}
