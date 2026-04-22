package Principal.operArrayList;

import Principal.Comparadores.ComparadorGrupo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
        ArrayList<Alumnos> listaAuxiliar = new ArrayList<>();
        FileWriter apartado3 = new FileWriter("apartado3.txt");
        File notas2 = new File("Utilidades/Notas/notas2.txt");
        File notas1 = new File("Utilidades/Notas/notas1.txt");          //Declaramos un objeto File con ruta relativa
        Scanner teclado = new Scanner(notas1);                                   //Abrimos el scanner leyendo el archivo, no con System.in





        //Apartado 1
        try {

            escribirArrayList(teclado, listaAlumnos);

            listaAlumnos.sort(new ComparadorGrupo());

            for (Alumnos alumno : listaAlumnos) {
                apartado3.write(alumno.toString() + "\n");
            }


        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se encontró el archivo.");
        } catch (IOException e2) {
            throw new IOException("Error al escribir archivos.");
        }



        //Apartado 2
        System.out.println("El número de registros que contiene es: " + listaAlumnos.size());

        for (Alumnos i : listaAlumnos) {
            System.out.println("");
            System.out.println(i);
        }

        //Apartado 4
        Alumnos alumno1 = new Alumnos("1º ESO D", "Rosario", "López Muro", 3, 3, 4, 4, 3);
        listaAlumnos.add(alumno1);
        listaAlumnos.sort(new ComparadorGrupo());


        //Apartado 5
        Alumnos alumno2 = new Alumnos("1º ESO B", "Alba", "Duarte Durán", 2, 3, 4, 1, 3);

        double media = listaAlumnos.size() / 2.00;
        int parteEntera = (int) media;
        double decimal = media - parteEntera;
        int mediaEntera = 0;


        if (decimal >= 0.5) {
            mediaEntera = parteEntera + 1;
        } else if (decimal < 0.5) {
            mediaEntera = parteEntera;
        }

        listaAlumnos.add(mediaEntera, alumno2);
        listaAlumnos.sort(new ComparadorGrupo());

        System.out.println("");
        System.out.println("Apartado 6:");

        //Apartado 6

        System.out.println("La posicion de la última insercion es: " + mediaEntera );

        //Apartado 7
        teclado = new Scanner(notas2);
        try {
            escribirArrayList(teclado, listaAuxiliar);

            listaAlumnos.addAll(listaAuxiliar);

            listaAlumnos.sort(new ComparadorGrupo());

            for (Alumnos alumno : listaAuxiliar) {
                apartado3.write(alumno.toString() + "\n");
            }

            apartado3.close();


        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se ha encontrado el archivo.");
        } catch (IOException e2){
            throw new IOException(e2);
        }

        System.out.println("");


        //Apartado 8

        System.out.println("Apartado8: ");
        String nombre = "Cordero Benítez, Alejandro";

        busquedaAlumnos(listaAlumnos, nombre);

        System.out.println("");

        //Apartado 9

        System.out.println("Apartado 9:");
        nombre = "Fernández Villalón, Carlos";

        busquedaAlumnos(listaAlumnos, nombre);
        //nombre = "Fernández Villalón, Carlos";

        System.out.println("");

        //Apartado 10

        System.out.println("Apartado 10: ");

        String datosAlumno = "";
        for (int i = 0; i < listaAlumnos.size(); i++){
            if ((mediaEntera + 1) == i){
                datosAlumno = listaAlumnos.get(i).toString();       //Para guardar en la variable datosAlumno, los datos del alumno que se encuentra en la posicion = i
            }
        }

        System.out.println(listaAlumnos.get(mediaEntera + 1).toString());

        listaAlumnos.remove(mediaEntera + 1);

        System.out.println(datosAlumno);

        //Se puede hacer el apartado 10 de ambas formas, uno antes, y otro despues de borrar los valores


        System.out.println("");

        //Apartado 11
        System.out.println("Apartado 11: ");

        //listaAlumnos.subList(0, 10).clear();         Mediante metodos de la clase ArrayList, se eliminan los 10 primeros registros del documento

        for (int i = 0; i < 10; i ++){
            listaAlumnos.remove(0);
        }


        //Apartado 12
        System.out.println("Apartado 12: ");

        for (int i = 0; i < listaAlumnos.size(); i++){

            //listaAlumnos.removeIf(a -> a.getNotaMatematicas() == 2);      Es una expresion lambda, es lo equivalente al codigo de abajo

            if (listaAlumnos.get(i).getNotaMatematicas() == 2){
                listaAlumnos.remove(i);
                i--;
            }
        }


        //Apartado 13
        System.out.println("Apartado 13: ");

        int matematicas = 0, fisica = 0, quimica = 0, lengua = 0, ingles = 0, mediaIndividual = 0;
        for(Alumnos i : listaAlumnos){
            matematicas = i.getNotaMatematicas();
            fisica = i.getFisica();
            quimica = i.getQuimica();
            lengua = i.getLengua();
            ingles = i.getIngles();

            mediaIndividual = (matematicas + fisica + quimica + lengua + ingles) / 5;

            System.out.printf("Para el alumno %s %s, la nota media es %d.\n", i.getNombre(), i.getApellido(), mediaIndividual);
        }
    }





    public static void escribirArrayList(Scanner teclado, ArrayList<Alumnos> listaAlumnos) {

        while (teclado.hasNextLine()) {                                           //Mientras haya más líneas en el archivo el bucle se repite

            String linea = teclado.nextLine();                                   //Leemos la linea y la guardamos en el String linea

            String[] partes = linea.split(";");

            String grupo = partes[0];

            String[] nombreCompleto = partes[1].split(",");
            String nombre = nombreCompleto[1].trim();               //Usamos trim() para que cuando en el apartado 8 buscquemos a un alumno, elimine los espacios y evitamos que nos de error
            String apellido = nombreCompleto[0].trim();

            int matematicas = Integer.parseInt(partes[2]);
            int lengua = Integer.parseInt(partes[3]);
            int fisica = Integer.parseInt(partes[4]);
            int quimica = Integer.parseInt(partes[5]);
            int ingles = Integer.parseInt(partes[6]);

            Alumnos alumno = new Alumnos(grupo, nombre, apellido,
                    matematicas, lengua, fisica, quimica, ingles);

            listaAlumnos.add(alumno);
        }

        teclado.close();
    }

    public static void busquedaAlumnos(ArrayList<Alumnos> listaAlumnos, String nombre){

        boolean encontrado = false;


        for (Alumnos i : listaAlumnos){

            String nombreCompleto = i.getApellido() + ", " + i.getNombre();

            if (nombreCompleto.equals(nombre)){
                System.out.println(i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al alumno.");
        }
    }
}



/*
Esta bien pero hay que usar los metodos del arraylist

//Apartado 8: Buscar Cordero Benítez, Alejandro

        Iterator<Alumnos> nuevoIterador = listaAlumnos.iterator();          //Creamos un iterator para recorrer la lista

        while(nuevoIterador.hasNext() && !algo){
            Alumnos actual = nuevoIterador.next();
            String nombreCompleto = actual.getApellido() + ", " + actual.getNombre();

            if(nombreCompleto.equals(nombre)){
                System.out.println(actual);
                algo = true;
            }
        }

        if (!algo){
            System.out.println("No se encontro al alumno, por lo tanto, tampoco se pueden mostrar sus datos.");

        }
 */