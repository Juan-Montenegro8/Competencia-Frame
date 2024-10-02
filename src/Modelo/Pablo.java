package Modelo;


public class Pablo extends Thread{

    @Override
    public void run() {
    
        int vuelta =1;
        System.out.println("pablo alista la burra");
        while (vuelta<=7) {            
            
            try {
                Thread.sleep(1700);
                System.out.println("pablo va por la vuelta "+vuelta);
                vuelta++;
                
            } catch (InterruptedException ex) {
            
                System.out.println("pablo se quedo comprando weed y paila");
                
            }
            
        }
        System.out.println("pablo llega");
    }
    
    
    
}
