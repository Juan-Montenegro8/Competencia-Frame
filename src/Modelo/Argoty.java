package Modelo;

public class Argoty implements Runnable{

    @Override
    public void run() {
        int vuelta=1;
        System.out.println("Argoty comienza");
        while (vuelta<=7) {            
            
            try {
                Thread.sleep(400);
                System.out.println("Argoty VA POR LA VUELTA "+vuelta);
                vuelta++;
            } catch (InterruptedException ex) {
                
                System.out.println("fue a comprar cilantro");
                
            }
            
        }
        System.out.println("Argoty termino");
    }
    
    
}
