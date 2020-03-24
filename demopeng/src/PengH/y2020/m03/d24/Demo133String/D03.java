package PengH.y2020.m03.d24.Demo133String;


//字符串的常用方法
public class D03 {
    public static void main(String[] args) {
//        equal
        String str1="hellow";
        String str2="hellow";
        char[] charArray={'h','e','l','l','o','w'};
        String str3=new String(charArray);
//
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
//
        System.out.println(str3.equals("hellow"));//不推荐，因为可能出现str3为空报错
        System.out.println("hellow".equals(str1));//推荐使用这种

        System.out.println("java".equalsIgnoreCase("Java"));//忽略大小写

//        length()
        int len="ajdfiahngeiohge".length();

//        concat
        System.out.println("hellow".concat(",world"));

//          charAt()
        char ch="hellow".charAt(1);
        System.out.println("1号索引位置的字符："+ch);//e

//        indexOf
        int index=str1.indexOf("ell");
        System.out.println("第一次出现ell的位置是"+index);
    }
}
