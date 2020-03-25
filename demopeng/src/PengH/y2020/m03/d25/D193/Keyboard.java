package PengH.y2020.m03.d25.D193;

public class Keyboard implements USB{
    @Override
    public void DeviceOn() {
        System.out.println("键盘开机");
    }

    @Override
    public void DeviceOff() {
        System.out.println("键盘关机");
    }
    public void type(){
        System.out.println("敲击键盘");
    }
}