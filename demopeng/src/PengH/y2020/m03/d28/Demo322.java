package PengH.y2020.m03.d28;

public class Demo322 {
    public static void main(String[] args) {
        baozi bz=new baozi();
        Thread pro=new productor(bz);
        pro.start();
        Thread eat=new eater(bz);
        eat.start();
    }
}
