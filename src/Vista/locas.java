package Vista;
import Modelo.*;
public class locas {

    public static void main(String[] args) {
        
        Tortuga to=new Tortuga();
        Pablo pa=new Pablo();
        JuanJose ju=new JuanJose();
        Thread conejo =new Thread(new Conejo());
        Thread tavo =new Thread(new Tavo());
        Thread argo =new Thread(new Argoty());
        
        to.start();
        pa.start();
        ju.start();
        conejo.start();
        tavo.start();
        argo.start();
    }
    
}
