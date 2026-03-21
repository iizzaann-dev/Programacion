package Mobiliario.asiento;

import Mobiliario.Ajustable;
import Mobiliario.Mueble;

public class Sillon extends Asiento implements Ajustable {
    
	public static final int POS_BAJADO = 0;
	public static final int POS_ARRIBA = 1;
	
	private int posicionPies;
	
    public Sillon (int min_plazas, String tapiceria, String color, String descripcion, double precio) {
        super(Asiento.min_plazas, tapiceria, color, descripcion, precio);
        
        this.posicionPies = POS_BAJADO;
    }
    
   public int obtenerPosicion() {
	   int algo = 0;
	   return algo;
   };
   public void subirPosicion(int nuevaPosicion) {
	   
   }
   public void bajarPosicion(int nuevaPosicion) {
	   int algo = 0;
   }
    
}
