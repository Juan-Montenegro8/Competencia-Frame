package Modelo;

public class JuanJose extends Thread{
    
    @Override
    public void run() {
        
        int vuelta=1;
        System.out.println("comienza JJ"); 
        while (vuelta<=7){
            
            try {
                Thread.sleep(1500);
                System.out.println("JJ pasa por la vuelta "+vuelta);
                vuelta++;
                
            } catch (InterruptedException ex) {
            
                System.out.println("lo dejo el bus");
                
            }
            
        }
        System.out.println("JJ termino");
    }
    
}
