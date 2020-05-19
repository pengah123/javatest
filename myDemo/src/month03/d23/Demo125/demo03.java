package month03.d23.Demo125;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

//定义一个以制定格式打印集合的方法，以ArrayList类型作为参数
//使用{}括起集合，使用@分隔每个元素
public class demo03 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }
        printarray(list);
    }
    public static void printarray(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+"@");
        }
        System.out.println(list.get(list.size()-1)+"}");
    }
}

