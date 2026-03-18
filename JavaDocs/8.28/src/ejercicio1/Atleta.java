/*
 * Descripción:
 * Nombre: Izan Rico Blanco
 * Fecha: 16/03/2026
 */


package ejercicio1;

import java.util.Comparator;

public class Atleta {
    public String nombre;
    public int edad;
    public double altura;


    public Atleta(String nombre, int edad, double altura) throws IllegalArgumentException{
        
        if(nombre.isBlank() || nombre.isEmpty()){
            throw new IllegalArgumentException("No se puede dejar el nombre vacio");
        }

        if (altura < 0){
            throw new IllegalArgumentException("No se puede establecer una altura negativa");
        }

        if (edad <= 0){
            throw new IllegalArgumentException("No se puede establecer una edad negativa o que sea 0");
        }   
        
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    public int getEdad() {
    	return edad;
    }
    
    public double getAltura () {
    	return altura;
    }
    
    public String getNombre () {
    	return nombre;
    }
    
    @Override
    public String toString() {
        return nombre + " - Edad: " + edad + " - Altura: " + String.format("%.2f", altura);
    }

}

