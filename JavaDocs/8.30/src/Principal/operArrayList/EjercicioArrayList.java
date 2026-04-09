package Principal.operArrayList;

import Principal.Comparadores.ComparadorGrupo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {

    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();


        try {

            //Apartado 1
            File notas1 = new File("Utilidades/Notas/notas1.txt");          //Declaramos un objeto File con ruta relativa

            Scanner teclado = new Scanner(notas1);                                   //Abrimos el scanner leyendo el archivo, no con System.in

            //Apartado 2
            System.out.println("El número de registros que contiene es: " + notas1.length());


            while (teclado.hasNextLine()){                                           //Mientras haya más líneas en el archivo el bucle se repite

                String linea = teclado.nextLine();                                   //Leemos la linea y la guardamos en el String linea

                String[] partes = linea.split(";");

                String grupo = partes[0];

                String[] nombreCompleto = partes[1].split(",");
                String nombre = nombreCompleto[1];
                String apellido = nombreCompleto[0];

                int matematicas = Integer.parseInt(partes[2]);
                int lengua = Integer.parseInt(partes[3]);
                int fisica = Integer.parseInt(partes[4]);
                int quimica = Integer.parseInt(partes[5]);
                int ingles = Integer.parseInt(partes[6]);

                Alumnos alumno = new Alumnos (grupo, nombre, apellido, matematicas, lengua, fisica, quimica, ingles) ;
                listaAlumnos.add(alumno);
            }

            teclado.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se encontró el archivo.");
        }

        listaAlumnos.sort(new ComparadorGrupo());

        for (Alumnos i : listaAlumnos){
            System.out.println("");
            System.out.println(i);
        }

    }
}
