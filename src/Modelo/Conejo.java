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
            try {
                if (vuelta<=7) {
                    System.out.println("Conejo va por la vuelta "+vuelta);
                    vuelta++;
                }else{
                    System.err.println("Conejo termino");    
                    scheduler.shutdown();
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error "+e.getMessage());
            }
        }, 0, 500, TimeUnit.MILLISECONDS);
        
    }
    
}
