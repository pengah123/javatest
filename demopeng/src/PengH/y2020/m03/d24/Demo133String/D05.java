package PengH.y2020.m03.d24.Demo133String;
//分隔字符串的方法
//public String[] split(String regex)
public class D05 {
    public static void main(String[] args) {
        String s = "aa,bb,cc";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
