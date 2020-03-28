package PengH.y2020.m03.d28;

//Lambda简化语法
public class Demo328 {
    public static void main(String[] args) {
        //原来的语法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个线程示例");
            }
        }).start();

        //Lambda语法
        new Thread(() -> {
            System.out.println("这是一个线程示例");
        }).start();
    }

}
