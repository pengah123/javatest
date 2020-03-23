package PengH.y2020.m03.d23.Demo125;

public class dArray {
    public static void main(String[] args) {
        Student[] array=new Student[3];
        Student one=new Student("ph",22);
        Student two=new Student("kk",18);
        Student three=new Student("Lisa",22);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0].getName());
    }
}
