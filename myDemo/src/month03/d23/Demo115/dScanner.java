package month03.d23.Demo115;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class dScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
    }
}

