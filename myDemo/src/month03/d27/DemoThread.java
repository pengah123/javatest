package month03.d27;

public class DemoThread {
    public static void main(String[] args) {
        MyThread my=new MyThread();
        my.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
