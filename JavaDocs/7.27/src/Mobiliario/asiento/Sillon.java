package Mobiliario.asiento;

import Mobiliario.Ajustable;
import Mobiliario.Mueble;

public class Sillon extends Asiento implements Ajustable {
    
    public Sillon (String descripcion, double precio) throws IllegalArgumentException {
        super(descripcion, precio);
    }

}
