package month03.d23;

public class demo01ArrayLength {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        int[] arrayB={0,1,2,3};
        int len = arrayB.length;
        System.out.println("arrayB的数组长度是："+len);
        System.out.println("arrayA的原始数组长度是："+arrayA.length);
        arrayA=new int[5];
        System.out.println("更改后arrayA的数组长度是："+arrayA.length);
    }
}
