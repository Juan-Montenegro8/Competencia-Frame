package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conejo implements Runnable{

    @Override
    public void run() {
    
        int vuelta=1;
        System.out.println("el conejo comienza");
        while (vuelta<=7) {            
            
            try {
                Thread.sleep(500);
                System.out.println("EL CONEJO VA POR LA VUELTA "+vuelta);
                vuelta++;
            } catch (InterruptedException ex) {
                
                System.out.println("se escapo con sol");
                
            }
            
        }
        System.out.println("conejo termino");
    }
    
}
