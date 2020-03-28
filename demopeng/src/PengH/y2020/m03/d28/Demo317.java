package PengH.y2020.m03.d28;

public class Demo317 {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("顾客来了，我要买包子");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，开吃");
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    System.out.println("包子做好了，给你吃");
                    lock.notify();
                }
            }
        }.start();

    }

}
