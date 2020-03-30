package PengH.zijietiaodong;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("请输入第1行数据：");*/
        int n=sc.nextInt();
        int[] hobby=new int[n];
        /*System.out.println("请输入第2行数据：");*/
        for (int i=0;i<n;i++){
            hobby[i]=sc.nextInt();
        }
        /*System.out.println("请输入第3行数据");*/
        int q=sc.nextInt();
        int[][] querry =new int[q][3];
        for (int i = 0; i < q; i++) {
            /*System.out.println("请输入第"+(i+4) +"行数据");*/
            for (int i1 = 0; i1 < 3; i1++) {
                querry[i][i1]=sc.nextInt();
            }
        }
        List<Integer> result =new LinkedList<>();
        for (int[] ints : querry) {
            int ans=0;
            for (int i = ints[0]-1; i < ints[1]; i++) {
                if (hobby[i]==ints[2])
                    ans++;
            }
            result.add(ans);
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
