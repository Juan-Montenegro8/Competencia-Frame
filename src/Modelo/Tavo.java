package Modelo;

public class Tavo implements Runnable{
    
        @Override
    public void run() {
    
        int vuelta=1;
        System.out.println("tavo comienza");
        while (vuelta<=7) {            
            
            try {
                Thread.sleep(1000);
                System.out.println("TAVO VA POR LA VUELTA "+vuelta);
                vuelta++;
            } catch (InterruptedException ex) {
                
                System.out.println("fue a comprar cilantro");
                
            }
            
        }
        System.out.println("tavo termino");
    }
        
    
    
}
