package Learn.Day223.Demo02;

public class Computer {

    public void powerOn(){
        System.out.println("开机");
    }
    public void powerOff(){
        System.out.println("关机");
    }
    public void useDevice(Usb usb){
        usb.open();
        usb.close();
    }

}
