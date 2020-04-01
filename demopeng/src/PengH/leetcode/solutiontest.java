package PengH.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class solutiontest {
    @Test
    public void test912() {
        Solution912 s = new Solution912();
        int[] sum={1,5,0,0,3};
        int[] result=s.sortArray6(sum);
        System.out.println(Arrays.toString(result));

    }


}
