package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class Tortuga extends Thread{

    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        
        System.out.println("comienza la tortuga"); 
        
        scheduler.scheduleWithFixedDelay(()->{
            
            try {
                if (vuelta<=7) {
                    System.out.println("la tortuga pasa por la vuelta "+vuelta);
                    vuelta++;
                }else{
                    System.out.println("Tortuga termino");
                    scheduler.shutdown();
                }    
            } catch (Exception e) {
                System.out.println("Ocurrio un error "+e.getMessage());
            }
            
        }, 0, 2000, TimeUnit.MILLISECONDS);
       
    }
    
    
    
}
