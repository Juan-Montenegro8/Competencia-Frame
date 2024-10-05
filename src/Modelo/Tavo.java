package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Tavo implements Runnable{
    
    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        @Override
    public void run() {
    
        
        System.out.println("tavo comienza");
        scheduler.scheduleAtFixedRate(() ->{
            
            try {
                if(vuelta<=7){
                    System.out.println("Tavo va por la vuelta "+vuelta);
                    vuelta++;
                }else{
                    System.out.println("Tavo termino");
                    scheduler.shutdown();
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            
        }, 0, 1000, TimeUnit.MILLISECONDS);

        
    }
        
    
    
}
