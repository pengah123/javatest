package PengH.y2020.m03.d23.Demo121;

import java.util.Random;
import java.util.Scanner;

//猜数字
public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (guess != num) {
            if (guess < num) {
                System.out.println("太小了，请重试：");
            } else {
                System.out.println("太大了，请重试：");
            }

            guess = sc.nextInt();
        }

        System.out.println("猜对了，恭喜你！");
    }

}
