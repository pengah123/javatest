package PengH.y2020.m04.d03;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr) {
        arr[0] = 200;
    }
}