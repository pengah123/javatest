package PengH.y2020.m03.d23;

public class demo03ArrayMax {
    public static void main(String[] args) {
        int[] array={54,39,68,37,45,13};
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("最大值"+max);
    }
}
