package PengH.leetcode;

import java.util.Arrays;

/*字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
*/
public class Solutionm58 {
    public static void main(String[] args) {
        String s="abcdefg";
        Solutionm58 solu = new Solutionm58();
        System.out.println(solu.reverseLeftWords(s,2));
    }
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()).concat(s.substring(0,n));

    }
}
