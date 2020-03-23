package PengH.y2020.m03.d23.Demo121;

import java.util.Random;
//int num=r.nextInt(3);表示在[0,3)范围
public class dRandom {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        System.out.println("随机数是："+num);
    }
}
