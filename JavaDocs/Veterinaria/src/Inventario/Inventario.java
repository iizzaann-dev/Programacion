package Inventario;

import Mascotas.*;

public class Inventario {
	
	private Mascotas [] almacen;
	
	public Inventario (int numMascotas) {
		
		this.almacen = new Mascotas [numMascotas];
		
		
	}
	
	public void recorrerAlmacen () {		//Tambien hay que tratar las excepciones poorque no extiende de otra clase
		
		for (int i = 0; i < almacen.length; i++) {
			System.out.printf("Tipo: %s, Nombre: %s \n", almacen[i].getClass().getSimpleName(), almacen[i].getNombre());
		}
	}
	
	public void mostrarDatos (String nombre){
		
		for (int i = 0; i < almacen.length; i++) {
			if (nombre.equals(almacen[i].getNombre())) {
				System.out.printf("%s", almacen[i].muestra());
			}

		}
	}
	
	public void mostrarTodosDatos (String nombre){
			
			for (int i = 0; i < almacen.length; i++) {
					System.out.printf("%s", almacen[i].muestra());
			}
		}
	
	/*public void insertarAnimal (Mascotas insertar) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i] == null) {
				almacen[i] = new Mascotas (insertar);
			}
		}
	}*/
	
	/*
	 * switch (tipoMascota) {
            case "Perro":
                System.out.println("Has elegido un perro.");
                break;
            case "Gato":
                System.out.println("Has elegido un gato.");
                break;
            case "Loro":
                System.out.println("Has elegido un loro.");
                break;
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }
	 */
	
	
	
}
