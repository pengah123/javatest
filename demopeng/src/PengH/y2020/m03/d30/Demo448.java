package PengH.y2020.m03.d30;

public class Demo448 {
    public static int[] method(int i,ArrayBuilder ab){
        return ab.arraybuilder(i);
    }

    public static void main(String[] args) {
        int[] arr=method(10,(len)->{
            return new int[len];
        });
        int[] arr2=method(8,int[]::new);
        System.out.println(arr.length);
        System.out.println(arr2.length);
    }
}
