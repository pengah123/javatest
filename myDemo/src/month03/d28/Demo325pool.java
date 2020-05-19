package month03.d28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo325pool {
    public static void main(String[] args) {
        ExecutorService exe =Executors.newFixedThreadPool(3);
        exe.submit(new productor(new baozi()));
        exe.shutdown();
    }
}
