package month04.d03;

public class Demo01 {
    public static void main(String[] args) {
// �������飬�洢3��Ԫ��
        int[] arr = new int[3];
//�����������и�ֵ
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
//���3�������ϵ�Ԫ��ֵ
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//�����������arr2����arr�ĵ�ַ��ֵ��arr2
        int[] arr2 = arr;
        arr2[1] = 9;
        System.out.println(arr[1]);
    }
}
