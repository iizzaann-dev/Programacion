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

        //Apartado 2
        System.out.println("El número de registros que contiene es: " + listaAlumnos.size());

        for (Alumnos i : listaAlumnos){
            System.out.println("");
            System.out.println(i);
        }

        //Apartado 4
        Alumnos alumno1 = new Alumnos("1º ESO D", "Rosario", "López Muro", 3, 3, 4, 4, 3);
        listaAlumnos.add(alumno1);
        listaAlumnos.sort(new ComparadorGrupo());


        //Apartado 5
        Alumnos alumno2 = new Alumnos("1º ESO B", "Alba", "Duarte Durán",2, 3, 4, 1, 3);

        double media = listaAlumnos.size() / 2.00;
        int parteEntera = (int) media;
        double decimal = media - parteEntera;
        int mediaEntera = 0;


        if (decimal >= 0.5){
            mediaEntera = parteEntera + 1;
        }else if (decimal < 0.5){
            mediaEntera = parteEntera;
        }

        listaAlumnos.add(mediaEntera, alumno2);
        listaAlumnos.sort(new ComparadorGrupo());

        //Apartado 6

    }
}
