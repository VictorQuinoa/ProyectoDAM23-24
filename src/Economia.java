import java.util.HashMap;
import java.util.Map;

public class Economia {

    private static HashMap<String , Integer > ficha = new HashMap<String, Integer>();
    private int pago = 0;


    public void nombreFicha(){
        ficha.put("Negra",1);
        ficha.put("Roja",5);
        ficha.put("Amarilla",10);
        ficha.put("Verde",20);
        ficha.put("Azul",50);
        ficha.put("Morado",100);
        ficha.put("Marron",500);
        ficha.put("Purpura",1000);
        ficha.put("Pastel",5000);
    }

    public void cambio(){

    }

}
