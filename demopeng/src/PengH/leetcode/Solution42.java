package PengH.leetcode;

import java.util.Calendar;
import java.util.Stack;

/*����?n ���Ǹ�������ʾÿ�����Ϊ 1 �����ӵĸ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��



������������ [0,1,0,2,1,0,1,3,2,1,2,1] ��ʾ�ĸ߶�ͼ������������£����Խ� 6 ����λ����ˮ����ɫ���ֱ�ʾ��ˮ����?��л Marcos ���״�ͼ��

ʾ��:

����: [0,1,0,2,1,0,1,3,2,1,2,1]
���: 6
*/
public class Solution42 {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution42 sol = new Solution42();
        System.out.println(sol.trap(height));


    }
/*�����󣬳���ʱ������
    public int trap(int[] height) {
        int max = 0;
        for (int h : height) {
            max = max > h ? max : h;
        }
        int ans=0;
        for (int i = 1; i <=max; i++) {
            boolean isStart=false;
            int temp=0;
            for (int h : height) {
                if(isStart&&h<i){
                    temp++;
                }
                if(h>=i){
                    ans=ans+temp;
                    temp=0;
                    isStart=true;
                }
            }
        }
        return ans;
    }*/
    /*������*/
/*public int trap(int[] height) {
    int result=0;
    for (int i = 1; i < height.length-1; i++) {
        int left=max(height,0,i-1);
        int right=max(height,i+1,height.length-1);
        if(left>height[i]&&right>height[i]){
            result+=left<right? left-height[i]:right-height[i];
        }
    }
    return result;
}
public int max(int[] height, int i, int j){
    int max=0;
    for(int x=i;x<=j;x++){
        max=max>height[x]?max:height[x];
    }
    return max;
}*/

    /*��̬�滮��*/
/*public int trap(int[] height) {
    int result=0;
    int [] max_left=new int[height.length];
    int [] max_right=new int[height.length];
    for (int i = 1; i < height.length-1; i++) {
        max_left[i]=Math.max(max_left[i-1],height[i-1]);
    }
    for (int i = height.length-2; i >=0; i--) {
        max_right[i]=Math.max(max_right[i+1],height[i+1]);
    }
    for (int i = 1; i < height.length-1; i++) {
        int min=Math.min(max_left[i],max_right[i]);
        if(min>height[i])
            result+=min-height[i];
    }
    return result;
}*/
    /*ջ*/
    public int trap(int[] height) {
        int sum = 0;
        int current = 0;
        Stack<Integer> stack = new Stack<>();
        while (current < height.length) {
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            stack.push(current);
            current++;
        }
        return sum;
    }
}
