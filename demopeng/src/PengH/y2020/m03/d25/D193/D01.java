package PengH.y2020.m03.d25.D193;

public class D01 {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.LaptopOn();
        USB usb =new Mouse();
        laptop.useDevice(usb);
        laptop.LaptopOff();

    }
/*
    synchronized(锁对象){
    可能出现问题的代码
    }
* */


}
