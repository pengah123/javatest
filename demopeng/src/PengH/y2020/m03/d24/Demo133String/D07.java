package PengH.y2020.m03.d24.Demo133String;

import java.util.Scanner;

/*键盘输入一个字符串，统计其中各种字符出现的次数
* 种类有大写字母，小写字母，数字，其他*/
public class D07 {
    public static void main(String[] args) {
        int big=0,small=0,num=0,oth=0;
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String str=sca.nextLine();
        System.out.println(str);
        count(str);
    }
    public static void count(String str){
        int big=0,small=0,num=0,oth=0;
        char[] c=str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]<=90&&c[i]>=65)
                big++;
            else if(c[i]<=122&&c[i]>=97)
                small++;
            else if(c[i]<=57&&c[i]>=48)
                num++;
            else oth++;
        }
        System.out.println("大写字母的个数为："+big);
        System.out.println("小写字母的个数为："+small);
        System.out.println("数字的个数为："+num);
        System.out.println("其他字符的个数为："+oth);
    }
}
