package Clases;

import java.time.LocalDate;

public class PrincipalVehiculo {
	
    public static void main(String[] args) {

       

        // 1. Crear camión 20tn
        Camion camion1 = new Camion(20);
        System.out.println("Los valores del camión 1 son: " + camion1);


        // 2. Calcular precio 3 días
        System.out.println("El coste para 3 días del camión 1 es: " + camion1.calcularCoste(3));


        // 3. Crear furgoneta con volumen máx. y refrigerado
        
        double volMax = 0;
        String refrigerado = "";
        
        System.out.println("Ingresa el valor del volumen maximo de la furgoneta que vas a crear: ");
        volMax = Entrada.entero();
        
        System.out.println("Ingresa el valor de si la furgoneta va a ser refrigerada o no: ");
        refrigerado = Entrada.cadena();
        
        Furgoneta furgo1 = new Furgoneta(volMax, conversorBoleano(refrigerado));
        
        // 4. Calcular precio 5 días
        System.out.println("El precio para la furgoneta para 5 días es: " + furgo1.calcularCoste(5));

        // 5. Modificar ITV camión
        camion1.setITV(true);
        System.out.println("Los valores del camión son :" + camion1);


        // 6. Calcular precio 3 días
        System.out.println("El coste para 3 días del camión 1 es: " + camion1.calcularCoste(3));
        
        
        // 7. Indica si la furgoneta tiene refrigeración
        if(furgo1.getSistemaRefrigeracion() == true) {
        	System.out.println("La furgoneta tiene sistema de refrigeración.");
        }else {
        	System.out.println("La furgoneta no tiene sistema de refrigeración.");

        }
        
        // 8. Modifica el valor del precio por día de la furgoneta
        furgo1.setPrecioDia(200);
        System.out.println("Los valores de la furgoneta son: " + furgo1);


        // 9. Camión por método (el objeto debe ser vreado por un método
        
        double carga = Entrada.real();
        String matricula = Entrada.cadena();
        String ITV = Entrada.cadena();
        String fecha = Entrada.cadena();
        double precioDia = Entrada.real();
        LocalDate fechaMatriculacion = conversorFecha(fecha);
        boolean ITVbolean = conversorBoleano(ITV);
        
        Camion camion2 = crearCamion(carga, matricula, fechaMatriculacion, ITVbolean, precioDia);
    	
        System.out.println("Los datos del camion 2 son: " + camion2);

        // 10. Número total vehículos
        System.out.println("El numero total de vehiculos es: " + Vehiculos.getNumeroVehiculos());

    }
    
    
    public static Camion crearCamion (double capacidadCarga, String matricula, LocalDate fechaMatriculacion, boolean ITV,
			double precioDia) {
    	return new Camion(capacidadCarga, matricula, fechaMatriculacion, ITV,  precioDia);
    }
    
    public static boolean conversorBoleano(String condicion) {
    	
    	boolean resultado = false;
    	
    	if(condicion.equals("verdadero")) {
    		resultado = true;
    	}
    	
    	if(condicion.equalsIgnoreCase("falso")) {
    		resultado = false;
    	}
    	
    	return resultado;
    }
    
    
    public static LocalDate conversorFecha(String fechaMatricula) {
    	
    	LocalDate fecha = LocalDate.now();
    	
    	String[] partes = fechaMatricula.split("[-/]");    	
    	
    	for(int i = 0; i < partes.length; i++) {
    		partes[i].trim();
    	}
    	
    	String anio = partes[0];
    	String mes = partes[1];
    	String dia = partes[2];
    	
    	int anioInt = Integer.parseInt(anio);
    	int mesInt = Integer.parseInt(mes);
    	int diaInt = Integer.parseInt(dia);
    	
    	fecha = LocalDate.of(anioInt, mesInt, diaInt);
    	
    	return fecha;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}