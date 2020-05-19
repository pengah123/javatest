package month03.d24.Demo133String;

//定义一个方法，把数组{1，2，3}按照指定的格式拼接成一个字符串
//{word1#word2#word3}
public class D06 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println("s:" + s);
    }

    public static String arrayToString(int[] c) {
        String s = new String("[");
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1)
                s += "word" + c[i] + "]";
            else
                s += "word" + c[i] + "#";
        }
        return s;
    }
}
