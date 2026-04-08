package Principal.operArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArrayList {

    public static void main(String[] args) throws FileNotFoundException {

        try {

            File notas1 = new File("Utilidades/Notas/notas1.txt");          //Declaramos un objeto File con ruta relativa
            Scanner teclado = new Scanner(notas1);                                   //Abrimos el scanner leyendo el archivo, no con System.in

            while (teclado.hasNextLine()){                                           //Mientras haya más líneas en el archivo el bucle se repite

                String linea = teclado.nextLine();                                   //Leemos la linea y la guardamos en el String linea

                String [] partes = linea.split(";");                           //Separar por ;

                String grupo = partes[0].trim();

                String [] nombreYprimNota = partes[1].split(",");   //Separamos el nombre de la primera nota

                String nombre = nombreYprimNota[0].trim();           //Obtenemos el nombre

                //Convertimos las notas a enteros
                int matematicas = Integer.parseInt(nombreYprimNota[1].trim());
                int lengua = Integer.parseInt(partes[2].trim());
                int fisica = Integer.parseInt(partes[3].trim());
                int quimica = Integer.parseInt(partes[4].trim());
                int ingles = Integer.parseInt(partes[5].trim());

                System.out.println(nombre + " (" + grupo + ")");    //Mostramos el resultado
            }

            teclado.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se encontró el archivo.");
        }

    }
}
