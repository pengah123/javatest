package PengH.y2020.m03.d23;

public class Phone {
    String brand;
    double price;
    String color;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void  sendMessage(){
        System.out.println("群发短信");
    }
}