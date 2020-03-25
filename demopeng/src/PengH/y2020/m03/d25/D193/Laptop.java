package PengH.y2020.m03.d25.D193;

public class Laptop {
    public void LaptopOn(){
        System.out.println("笔记本电脑开机");
    }
    public void LaptopOff(){
        System.out.println("笔记本电脑关机");
    }
    public void useDevice(USB usb){
        usb.DeviceOn();
        if(usb instanceof Mouse){
            ((Mouse) usb).clik();
        }
        if(usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }
        usb.DeviceOff();
    }
}
