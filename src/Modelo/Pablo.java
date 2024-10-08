package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Pablo extends Thread{

    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
    
        System.out.println("Pablo comienza");
        
        scheduler.scheduleAtFixedRate(() ->{
            try {
                if(vuelta<=7){
                    System.out.println("pablo a por la vuelta" +vuelta);
                    vuelta++;
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error "+e.getMessage());
            }
            
        }, 0, 1700, TimeUnit.MICROSECONDS);
        
        System.out.println("pablo llega");
    }
    
    
    
}
