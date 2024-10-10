package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JuanJose extends Thread{
    
    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        
        System.out.println("comienza JJ"); 

        scheduler.scheduleAtFixedRate(()->{
            if (vuelta<=7) {
                System.out.println("Juan Jose va por la vuelta "+vuelta);
                vuelta++;
            }
        }, 0, 1500, TimeUnit.MILLISECONDS);

       
        System.out.println("JJ termino");
    }
    
}
