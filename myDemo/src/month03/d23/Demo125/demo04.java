package month03.d23.Demo125;

import java.util.ArrayList;
import java.util.Random;

/*
* 用一个大集合，存放20个随机数字
* 筛选其中的偶数元素，放到小集合中
* 要求使用自定义的方法来实现筛选*/
public class demo04 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(33) + 1);
        }
        temp=filter(list);
        System.out.print("原始集合为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println("");
        System.out.print("偶数集合为：");
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i)+"\t");
        }
    }
    public static ArrayList<Integer> filter(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        int num=0;
        for (int i = 0; i < list.size(); i++) {
            num=list.get(i);
            if(num%2==0){
                temp.add(list.get(i));
            }
        }
        return temp;
    }
}
