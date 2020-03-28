package PengH.y2020.m03.d28;

import java.util.Random;

public class productor extends Thread {
    baozi bz;

    public productor(baozi bz) {
        this.bz = bz;
    }

    Random r=new Random();

    @Override
    public void run() {

        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int count=r.nextInt(10);
                    if (count % 2 == 0) {
                        bz.pi = "冰皮";
                        bz.xian = "香菇馅";
                    } else {
                        bz.pi = "薄皮";
                        bz.xian = "牛肉馅";
                    }
                    System.out.println("包子铺正在生产" + bz.pi + bz.xian + "包子……");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("有包子了");
                    bz.flag = true;
                    bz.notify();
                }
            }
        }
    }
}

