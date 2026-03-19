/*
Para hacer un email
Parte	        Significado

^	            inicio
[\w.-]+	        usuario
@	            separador
[\w.-]+	        dominio
\.	            punto
[a-zA-Z]{2,}	extensión
$	            final
 */

package Ejercicio2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        LinkedList <Contacto> agenda = new LinkedList();
        Scanner teclado = new Scanner(System.in);

        System.out.println(" 1) Ingresar contacto \n 2) Consultar un nombre para mostrar todos sus datos " +
                "\n 3) Mostrar todos los datos de los contactos ordenados por nombre \n 4) Mostrar todos los contactos nacidos en el año introducido.");

        String consultaNombre = "";

        //Creamos el linkedList con 30 contactos
        for (int i = 0; i < 30; i++){
            agenda.add(ingresarContacto());
        }

        int opcion = teclado.nextInt();
        if (opcion == 1){
            //Apartado A
            agenda.add(ingresarContacto());

        }else if (opcion == 2) {
            System.out.println("Ingresa el nombre del contacto del cual desea saber sus datos.");
            consultaNombre = teclado.nextLine();
            for (Contacto i : agenda){
                i.getNombre()
            }

        }


        //Apartado B

    }




    //Metodo que crea el contacto
    public static Contacto ingresarContacto (LinkedList agenda) {
        Contacto contactoGenerado = new Contacto(generarNombre(), generarTelefono(), generarEmail(), generarFechaNacimiento());


        return contactoGenerado;
    }


    //Metodo que nos genera el nombre
    public static String generarNombre () {
        String[] nombres = {
                "Carlos", "María", "Juan", "Lucía", "Pedro", "Ana",
                "Luis", "Sofía", "Miguel", "Carmen", "Javier", "Elena",
                "Diego", "Paula", "Fernando", "Laura", "Raúl", "Marta",
                "Alberto", "Sara"
        };

        int aleatorio = (int)(Math.random()) * 20;
        String nombre = nombres[aleatorio];

        return nombre;
    }



    //Metodo que crea el numero de telefono
    public static String generarTelefono () {
        int telefono = (int)(100000000 + Math.random() * 999999999);
        String telefonoString = String.format("%d", telefono);
        return telefonoString;
    }



    //Metodo que crea el email
    public static String generarEmail () {
        Random random = new Random();

        String usuario = "user" + random.nextInt(1000);
        String dominio = "gmail.com";

        return usuario + "@" + dominio;
    }



    //Metodo que crea la fecha de nacimiento
    public static LocalDate generarFechaNacimiento (){
        Random random = new Random();

        long diasMin = LocalDate.of(1970, 1, 1).toEpochDay();
        long diasMax = LocalDate.of(2007, 12, 31).toEpochDay();

        long diasAleatorios = diasMin + (long)(random.nextDouble() * (diasMax - diasMin));

        return LocalDate.ofEpochDay(diasAleatorios);
    }
}
