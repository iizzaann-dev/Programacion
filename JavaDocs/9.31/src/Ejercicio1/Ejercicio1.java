package Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    static void main(String[] args) {

        File dir = new File("../");
        Scanner teclado = new Scanner(dir);
        String rutaTeclado = "";

        System.out.print("Ingresa una ruta, para saber la información sobre ella: ");

        rutaTeclado = teclado.nextLine();
        teclado.nextLine();

        if(teclado.equals(" ") || teclado.equals("")){
            System.out.println("Muchas gracias por usar el programa.");
        }else{
            do {

                System.out.print("Ingresa otra ruta, para saber la información sobre ella: ");
                rutaTeclado = teclado.nextLine();
            }while(!rutaTeclado.isBlank());
        }


    }
}
