package Rico;

import Rico.Entrada.*;

public class PrincipalVehiculo {
    public static void main(String[] args) {

    	boolean refri = false;
    	boolean itv = false;

        // 1. Crear camión 20tn
        Camion camion1 = new Camion (20);

        // 2. Calcular precio 3 días
        camion1.calcularPrecio(3);

        // 3. Crear furgoneta con volumen máx. y refrigerado
        int entradaVol = Entrada.entero(); 
        String entradaRefri = Entrada.cadena(); 
        if (entradaRefri.contains("true")) {
        	refri = true; 
        }else {
        	refri = false;
        }
        Furgoneta furgo1 = new Furgoneta (entradaVol, refri);

        // 4. Calcular precio 5 días
        furgo1.calcularPrecio(5);

        // 5. Modificar ITV camión
        camion1.setITV();

        // 6. Calcular precio 3 días
        camion1.calcularPrecio(3);

        // 7. Indica si la furgoneta tiene refrigeración
        furgo1.getRefrigeracion();

        // 8. Modifica el valor del precio por día de la furgoneta
        furgo1.setPrecioDia(200);

        // 9. Camión por método (el objeto debe ser creado por un método)
        String fechaMatri = Entrada.cadena();
        String ITV = Entrada.cadena();
        if (ITV == "true") {
        	itv = true;
        }else {
        	itv = false;
        }
        double precioDia = Entrada.real();
        double capacidadMaxima = Entrada.real();
        
    	
        // 10. Número total vehículos
        
    }
    
    /*public Camion generarCamion(String fechaMatri, boolean itv, double precioDia, double capacidadMaxima) {
    	
    	Camion resultado = new Camion (fechaMatri, itv);
    	
    	return resultado;
    }*/
    

    
}