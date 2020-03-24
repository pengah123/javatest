package PengH.y2020.m03.d24.Demo148Arrays;

import java.util.Arrays;
//Arrays 对数组进行操作
public class D01 {
    public static void main(String[] args) {
        int[] intArray={32,65,33,78};
//        toString方法，将数组转为字符串
        String intStr= Arrays.toString(intArray);
        System.out.println(intStr);
//        sort方法，升序排序，可排字符串，如果是自定义类，则该类需要有comparable接口的支持
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
