package Ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Contacto implements Comparable <Contacto>{

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

    public int compareTo (Contacto otroNombre){
        return this.nombre.compareToIgnoreCase(otroNombre.nombre);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) && Objects.equals(telefono, contacto.telefono) && Objects.equals(email, contacto.email) && Objects.equals(fechaNacimiento, contacto.fechaNacimiento);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono, email, fechaNacimiento);
    }

    //ToString
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}


