package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JuanJose extends Thread{
    
    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        
        System.out.println("comienza Juan Jose"); 

        scheduler.scheduleAtFixedRate(()->{
            try {
                if (vuelta<=7) {
                    System.out.println("Juan Jose va por la vuelta "+vuelta);
                    vuelta++;
                }else{
                    System.out.println("Juna Jose termino");
                    scheduler.shutdown();
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            
        }, 0, 1500, TimeUnit.MILLISECONDS);

       
        
    }
    
}
