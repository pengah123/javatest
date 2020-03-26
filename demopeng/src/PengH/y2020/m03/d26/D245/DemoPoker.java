package PengH.y2020.m03.d26.D245;

import java.util.ArrayList;
import java.util.Collections;

public class DemoPoker {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] nums = {"2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        poker.add("大王");
        poker.add("小王");
        for (int i = 0; i < colors.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                poker.add(colors[i] + nums[i1]);
            }
        }
        Collections.shuffle(poker);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i > 50)
                dipai.add(p);
            else if (i % 3 == 0)
                list1.add(p);
            else if (i % 3 == 1)
                list2.add(p);
            else
                list3.add(p);
        }
        //直接输出
        System.out.println("第一位玩家的牌是："+list1);

        System.out.println("第二位玩家的牌是："+list2);

        //遍历输出
        System.out.println("第三位玩家的牌是：");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i)+"\t");
        }
        System.out.println("\n底牌是：");
        for (int i = 0; i < dipai.size(); i++) {
            System.out.print(dipai.get(i)+"\t");
        }
    }
}
