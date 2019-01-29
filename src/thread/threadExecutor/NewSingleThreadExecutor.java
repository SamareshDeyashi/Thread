package thread.threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
 
        Runnable task = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
 
        pool.execute(task);
 
        pool.shutdown();
    }
        
}
