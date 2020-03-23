package PengH.y2020.m03.d23.Demo125;
//随机生成6个1到33之间的随机数，添加到数组并遍历数组
import java.util.ArrayList;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33)+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
