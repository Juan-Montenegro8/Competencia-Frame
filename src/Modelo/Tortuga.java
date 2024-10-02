package Modelo;



public class Tortuga extends Thread{

    @Override
    public void run() {
        
        int vuelta=1;
        System.out.println("comienza la tortuga"); 
        while (vuelta<=7){
            
            try {
                Thread.sleep(2000);
                System.out.println("la tortuga pasa por la vuelta "+vuelta);
                vuelta++;
                
            } catch (InterruptedException ex) {
            
                System.out.println("la tortuga le dio el corona virus y die");
                
            }
            
        }
        System.out.println("La tortuga termino");
    }
    
    
    
}
