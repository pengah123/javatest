package PengH.y2020.m03.d30;

import java.util.function.Predicate;

public class Demo421test {
    public static boolean predicate(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s="abcde";
        boolean b=predicate(s,m-> m.length()>5);
        System.out.println(b);
    }
}
