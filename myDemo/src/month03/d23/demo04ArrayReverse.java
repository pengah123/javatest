package month03.d23;

public class demo04ArrayReverse {
    public static void main(String[] args) {
        int[] array={0,1,2,3,4,5,6,7,8};
        int left=0;
        int right=array.length-1;
        int p=0;
        while(right>left){
            p=array[left];
            array[left]=array[right];
            array[right]=p;
            left++;
            right--;
        }
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}
