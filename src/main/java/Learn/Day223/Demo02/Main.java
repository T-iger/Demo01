package Learn.Day223.Demo02;

public class Main {

    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

        Mouse mouse=new Mouse();

//      向上转型
        Usb usb=mouse;

        computer.useDevice(usb);

    }
}
