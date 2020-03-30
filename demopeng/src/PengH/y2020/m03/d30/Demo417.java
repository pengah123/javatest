package PengH.y2020.m03.d30;

import java.util.function.Supplier;

public class Demo417 {
    public static void main(String[] args) {
        int[] arr={100,0,35,-39,47};
       int maxualue= getMax(()->{
           int max=arr[0];
            for (int i : arr) {
                if (i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(maxualue);
    }
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
