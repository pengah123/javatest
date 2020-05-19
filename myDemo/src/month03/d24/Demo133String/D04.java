package month03.d24.Demo133String;
//字符串截取
//[begin,end),左闭右开
//字符串转换
public class D04 {
    public static void main(String[] args) {
        String str1="Helloworld";
        String str2=str1.substring(5);
//
        System.out.println("源字符串："+str1);
        System.out.println("截取之后的字符串："+str2);

//转为数组
        char[] chars=str1.toCharArray();
        System.out.println(chars[0]);

//        转为byte
        byte[] bytes=str1.getBytes();
        System.out.println(bytes[0]);

//        替换
        String str3=str1.replace("l","#");
        System.out.println(str3);


    }
}
