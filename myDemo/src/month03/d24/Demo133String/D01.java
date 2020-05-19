package month03.d24.Demo133String;
//字符串的几种创建方式
public class D01 {
    public static void main(String[] args) {
        String str1=new String();
        System.out.println("three:"+str1);
//
        char[] charArray={'A','B'};
        String str2=new String(charArray);
        System.out.println("three:"+str2);
//
        byte[] bytrArray={44,38,99};
        String str3=new String(bytrArray);
        System.out.println("three:"+str3);
    }
}
