package month03.d24.Demo133String;
//共享字符串
public class D02 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] charArray={'a','b','c'};
        String str3=new String(charArray);

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str3==str2);//false
    }
}
