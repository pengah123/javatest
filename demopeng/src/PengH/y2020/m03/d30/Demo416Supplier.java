package PengH.y2020.m03.d30;

import java.util.function.Supplier;

public class Demo416Supplier {
    public static void main(String[] args) {
        String s=getString(()->{return "胡歌";});//重写Supplier中的get方法
    }
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
}
