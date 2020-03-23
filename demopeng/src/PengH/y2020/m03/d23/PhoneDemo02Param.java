package PengH.y2020.m03.d23;

public class PhoneDemo02Param {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=9999.0;
        one.color="玫瑰金";

        method(one);

    }
    public static void  method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
