package ClaseBombilla;

public class Main_Bombilla {

	public static void main(String[] args) {

	    // Valores de clase inciales
	    System.out.printf ("Número de bombillas creadas hasta el momento: %d.\n", Bombilla.getBombillasCreadas());
	    System.out.printf ("Número de bombillas encendidas en este momento: %d.\n\n", Bombilla.getBombillasEncendidas());

	    // Declaración de variables
	    System.out.printf ("Declarando variables b1, b2, b3 de tipo referencia a objetos Bombilla.\n\n");
	    Bombilla b1, b2, b3;

	    // Creación y asignación del primer objeto
	    System.out.printf ("Creación de b1.\n");
	    b1= new Bombilla();
	    System.out.printf ("Estado de b1: %s\n\n", b1.getEstado());

	    // Creación y asignación del segundo objeto
	    System.out.printf ("Creación de b2.\n");
	    b2= new Bombilla(true);
	    System.out.printf ("Estado de b2: %s.\n\n", b2);

	    // Conmutar b2 cuatro veces
	    for (int i=0; i < 4; i++) {
	        System.out.printf ("Conmutando estado de b2.\n");
	        b2.conmutar();
	        System.out.printf ("Estado de b2: %s.\n\n", b2);
	    }

	    // Encender b2
	    try {
	        System.out.printf ("Encendiendo b2.\n");
	        b2.encender();
	    } catch (IllegalStateException ex) {
	        System.out.printf ("Error: %s.\n", ex.getMessage());
	    } finally {
	        System.out.printf ("Estado de b2: %s.\n\n", b2);            
	    }

	    // Encender b2 (error)
	    try {
	        System.out.printf ("Encendiendo b2.\n");
	        b2.encender();
	    } catch (IllegalStateException ex) {
	        System.out.printf ("Error: %s.\n", ex.getMessage());
	    } finally {
	        System.out.printf ("Estado de b2: %s.\n\n", b2);            
	    }

	    // Apagar b2
	    try {
	        System.out.printf ("Apagando b2.\n");
	        b2.apagar();
	    } catch (IllegalStateException ex) {
	        System.out.printf ("Error: %s.\n", ex.getMessage());
	    } finally {
	        System.out.printf ("Estado de b2: %s.\n\n", b2);            
	    }

	    // Encender b2
	    try {
	        System.out.printf ("Encendiendo b2.\n");
	        b2.encender();
	    } catch (IllegalStateException ex) {
	        System.out.printf ("Error: %s.\n", ex.getMessage());
	    } finally {
	        System.out.printf ("Estado de b2: %s.\n\n", b2);            
	    }

	    // Creación y asignación del tercer objeto
	    System.out.printf ("Creación de b3.\n");
	    b3= new Bombilla(true);
	    System.out.printf ("Estado de b3: %s.\n\n", b3);

	    // Valores de clase finales
	    System.out.printf ("Número de bombillas creadas hasta el momento: %d.\n", Bombilla.getBombillasCreadas());
	    System.out.printf ("Número de bombillas encendidas en este momento: %d.\n", Bombilla.getBombillasEncendidas());
	}    
}
