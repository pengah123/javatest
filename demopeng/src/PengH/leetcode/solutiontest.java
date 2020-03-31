package PengH.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class solutiontest {
    @Test
    public void test912() {
        Solution912 s = new Solution912();
        int[] nums = {5,1,1,2,0,0};

        long pre=System.currentTimeMillis();

        int[] result = s.sortArray5(nums);

        long cur=System.currentTimeMillis();

        System.out.println(Arrays.toString(result));

        System.out.println(cur-pre+"毫秒");
    }


}
