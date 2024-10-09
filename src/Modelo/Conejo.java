package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Conejo implements Runnable{

    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    
    @Override
    public void run() {
            
        System.out.println("el conejo comienza");

        scheduler.scheduleAtFixedRate(()->{
            if (vuelta<=7) {
                System.out.println("Conejo va por la vuelta "+vuelta);
                vuelta++;
            }
        }, 0, 500, TimeUnit.MILLISECONDS);
        
    }
    
}
