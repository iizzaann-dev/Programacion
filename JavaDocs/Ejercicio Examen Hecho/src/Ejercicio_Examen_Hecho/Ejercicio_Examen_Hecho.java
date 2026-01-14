package Ejercicio_Examen_Hecho;

import java.util.Scanner;

public class Ejercicio_Examen_Hecho {

	

	Scanner teclado = new Scanner(System.in);

			

			static String[] municipios = {"Almeria", "Roquetas", "ElEjido"};

		    static int[] dias = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};



		    static int[][] nacimientos = {

		            {3, 2, 4, 5, 6, 2, 1, 3, 4, 2, 1, 3, 2, 4, 5, 6},

		            {1, 3, 2, 4, 5, 6, 4, 2, 3, 1, 2, 4, 5, 3, 2, 1},

		            {2, 4, 3, 1, 2, 3, 5, 6, 4, 3, 2, 1, 2, 3, 4, 5}

		    };



		    public static void main(String[] args) {



		        mostrarDiaMasNacimientosPorMunicipio();

		        mostrarMunicipioMasNacimientosPorDia();

		        mostrarDiaMasNacimientosTotal();

		        consultarNacimiento();

		    }



		    // A

		    static void mostrarDiaMasNacimientosPorMunicipio() {

		        for (int i = 0; i < municipios.length; i++) {

		            int max = nacimientos[i][0];

		            int dia = dias[0];



		            for (int j = 1; j < dias.length; j++) {

		                if (nacimientos[i][j] > max) {

		                    max = nacimientos[i][j];

		                    dia = dias[j];

		                }

		            }



		            System.out.println("En " + municipios[i] + " el día con más nacimientos fue: " + dia);

		        }

		    }



		    // B

		    static void mostrarMunicipioMasNacimientosPorDia() {

		        for (int j = 0; j < dias.length; j++) {

		            int max = nacimientos[0][j];

		            String municipio = municipios[0];



		            for (int i = 1; i < municipios.length; i++) {

		                if (nacimientos[i][j] > max) {

		                    max = nacimientos[i][j];

		                    municipio = municipios[i];

		                }

		            }



		            System.out.println("El día " + dias[j] + " hubo más nacimientos en " + municipio);

		        }

		    }



		    // C

		    static void mostrarDiaMasNacimientosTotal() {

		        int maxTotal = 0;

		        int diaMax = 0;



		        for (int j = 0; j < dias.length; j++) {

		            int suma = 0;



		            for (int i = 0; i < municipios.length; i++) {

		                suma += nacimientos[i][j];

		            }



		            if (suma > maxTotal) {

		                maxTotal = suma;

		                diaMax = dias[j];

		            }

		        }



		        System.out.println("El día con más nacimientos en total fue: " + diaMax);

		    }



		    // D

		    static void consultarNacimiento() {

		        Scanner sc = new Scanner(System.in);



		        System.out.print("Introduce un día: ");

		        int dia = sc.nextInt();

		        sc.nextLine();



		        System.out.print("Introduce un municipio: ");

		        String municipio = sc.nextLine();



		        int posDia = -1;

		        int posMunicipio = -1;



		        for (int i = 0; i < dias.length; i++) {

		            if (dias[i] == dia) posDia = i;

		        }



		        for (int i = 0; i < municipios.length; i++) {

		            if (municipios[i].equalsIgnoreCase(municipio)) posMunicipio = i;

		        }



		        if (posDia != -1 && posMunicipio != -1 && nacimientos[posMunicipio][posDia] > 0) {

		            System.out.println("Sí hubo nacimientos ese día.");

		        } else {

		            System.out.println("No hubo nacimientos ese día.");

		        }



		       

		    }

		

}
