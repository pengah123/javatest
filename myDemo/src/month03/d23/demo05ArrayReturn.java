package month03.d23;

public class demo05ArrayReturn {
    public static void main(String[] args) {
        int a=1;
        int b=2,c=3;
        int [] result=calculate(a,b,c);
        System.out.println("总和："+result[0]);
        System.out.println("平均数："+result[1]);
    }
    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int [] array={sum,avg};
        return array;
    }
}
