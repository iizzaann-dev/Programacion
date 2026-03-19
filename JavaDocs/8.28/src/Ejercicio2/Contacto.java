package Ejercicio2;

import java.time.LocalDate;

public class Contacto {

    //Atributos el objeto
    public String nombre;
    public String telefono;
    public String email;
    public LocalDate fechaNacimiento;

    public Contacto (String nombre, String telefono, String email, LocalDate fechaNacimiento) throws IllegalArgumentException{

        if (nombre.isBlank()){
            throw new IllegalArgumentException("No se puede dejar el nombre vacio.");
        }

        if(nombre.isEmpty()){
            throw new IllegalArgumentException("No se puede dejar el valor del nombre vacio.");
        }

        if (telefono.length() < 9){
        throw new IllegalArgumentException("El número de teléfono debe tener 9 dígitos.");
        }

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Email inválido");
        }

        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;


    }

    //Getters


    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
