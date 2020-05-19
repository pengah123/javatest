package month03.d27;

import java.util.*;

public class DemoPoker {
    public static void main(String[] args) {
        Map<Integer, String> poker = new HashMap<>();
        List<String> color = List.of("♠", "♥", "♦", "♣");
        List<String> nums = List.of("3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        List<Integer> index = new ArrayList<>();
        int x = 0;
        for (String num : nums) {
            for (String s : color) {
                index.add(x);
                poker.put(x, s + num);
                x++;
            }
        }
        index.add(x);
        poker.put(x++, "小王");
        index.add(x);
        poker.put(x++, "大王");
        Collections.shuffle(index);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < index.size(); i++) {
            Integer p = index.get(i);
            if (i > 50)
                dipai.add(p);
            else if (i % 3 == 0)
                list1.add(p);
            else if (i % 3 == 1)
                list2.add(p);
            else
                list3.add(p);
        }
        System.out.println("第一位玩家的牌是：");
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(poker.get(list1.get(i)) + "\t");
        }
        System.out.println("第二位玩家的牌是：");
        Collections.sort(list2);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(poker.get(list2.get(i)) + "\t");
        }
        System.out.println("第三位玩家的牌是：");
        Collections.sort(list3);
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(poker.get(list3.get(i)) + "\t");
        }
        System.out.println("底牌是：");
        Collections.sort(dipai);
        for (int i = 0; i < dipai.size(); i++) {
            System.out.print(poker.get(dipai.get(i)) + "\t");
        }
    }
}


