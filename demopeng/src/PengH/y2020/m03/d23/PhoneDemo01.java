package PengH.y2020.m03.d23;

public class PhoneDemo01 {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=9999.0;
        one.color="玫瑰金";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.call("乔布斯");
        one.sendMessage();

        Phone two=new Phone();
        two.brand="三星";
        two.price=6666.0;
        two.color="黑色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.call("欧巴");
        two.sendMessage();
    }
}
