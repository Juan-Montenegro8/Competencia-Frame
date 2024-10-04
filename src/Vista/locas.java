package Vista;
import Modelo.*;
public class locas {

    public static void main(String[] args) {
        
        Tortuga tortuga=new Tortuga();
        Pablo pablo=new Pablo();
        JuanJose juanJose=new JuanJose();
        Thread conejo =new Thread(new Conejo());
        Thread tavo =new Thread(new Tavo());
        Thread argoty =new Thread(new Argoty());
        
        tortuga.start();
        pablo.start();
        juanJose.start();
        conejo.start();
        tavo.start();
        argoty.start();
    }
    
}
