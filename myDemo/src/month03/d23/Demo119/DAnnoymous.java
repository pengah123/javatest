package month03.d23.Demo119;

import java.util.Scanner;

public class DAnnoymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
//    匿名对象，只需要使用唯一的一次
        new Person().name = "赵又廷";

//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);
//        methodParam(new Scanner(System.in));
        int num = methodReturn().nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
