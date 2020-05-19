package month03.d23.Demo121;

import java.util.Random;

//取1——n期间的随机数字
public class Demo01 {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int num=r.nextInt(n)+1;
            System.out.println("随机数是："+num);
        }

    }
}
