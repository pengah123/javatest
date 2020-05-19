package month03.d28;

public class eater extends Thread {
    private baozi bz;

    public eater(baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("开始吃包子……");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃完了，包子真好吃");
                    bz.flag = false;
                    bz.notify();
                }
            }
        }
    }
}
