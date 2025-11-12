package TodoExamen2;

import java.util.Scanner;

public class TodoExamen2 {

			public static void main(String[] args) {
				 Scanner teclado= new Scanner (System.in); // registrar lo que se pide por teclado 
				 
				 System.out.println(""); // mostrar lo que quieras por pantalla
				 // \t = espacio de tabulador
				 //\n salto de linea
				 // \f salto de pagina 
				 // - Operación unario de cambio de signo
				 // + suma 
				 // - resta
				 // * Multiplicación
				 // / División entera o real 
				 // % resto de la diviision entera
				 // ++ se va sumando uno tras otro 
				 // -- se va restando uno tras otro
				 // += cambia el valor del numero de antes SUMANDO el sigueinte
				 // -= cambia el valor del numero de antes RESTANDO el sigueinte
				 // *= cambia el valor del numero de antes MULTIPLICANDO el sigueinte
				 // /= cambia el valor del numero de antes DIVIDIENDO el sigueinte
				 // %= cambia el valor del numero de antes  SIENDO ESTE EL RESTO DE LA DIVIDIÓN el sigueinte
				 // == igual a 
				 // != distinto de 
				 // < o > mayor o menor que 
				 // <= o >= mayor o igual 0 menor o igual que 
				
				 
				 
				 // CONDICIONALES
				 int numero = 3;
			        if (numero > 5) {
			            System.out.println("El número es mayor que 5"); // estructura IF...ELSE asi se construye y se muestra 
			        } else {
			            System.out.println("El número es menor o igual que 5");
			        }
			       
			        int num=15;
			        if (num > 0) {
			            System.out.println("El número es positivo");

			            if (num > 10) {
			                System.out.println("Y además es mayor que 10");// estructura IF..ELSE(ANIDADO) MAS DE UNA CONDICIÓN 
			            } else {                                           // SIEMPRE HAY QUE PONER UN IF MENOS DE LAS OPCIONES QUE HAYA PK UNA ES ELSE  
			                System.out.println("Pero no es mayor que 10");
			            }
			           
			            
			            switch (numero) {   // Cuando tienes una sola variable y 
			                                 //quieres hacer acciones distintas según su valor.
			            case 0:
			                System.out.println ("cero");
			                break;
			            case 1:
			                System.out.println ("uno");
			                break;
			            case 2:
			                System.out.println ("dos");
			                break;
			            default:
			                System.out.println ("otro");
			        }
			            
			           // BUCLES
			           
			            
			         // Bucle while (repite mientras).
			            int contador = 1;     
			            while (contador <= 5) {
			                System.out.println("Contador: " + contador);
			                contador++; // Aumenta el valor para evitar un bucle infinito
			            }
			          //Bucle do-While (repite hasta).
			            int cont = 1; 
			            do {
			                System.out.println("Contador: " + cont);
			                cont++; // Aumenta el valor
			            } while (cont <= 5);
			          //Bucle for (repite para).
			            for (int i = 1; i <= 5; i++) {
			                System.out.println("Número: " + i);
			            }
			          //Bucle for/in (repite para cada).
			            String[] nombres = {"Ana", "Luis", "Carlos", "María"};

			            for (String nombre : nombres) {
			                System.out.println("Hola, " + nombre);
			            }
			            
			            // ARRAYS
			            
			            
			            //  ARRAY UNIDIMENSIONAL 
			            
			            // 1. Declaración de un array de enteros con 5 posiciones
			            int[] numeros = new int[5];

			            // 2. Inicialización de cada elemento del array
			            numeros[0] = 10;  // Primer elemento
			            numeros[1] = 20;  // Segundo elemento
			            numeros[2] = 30;  // Tercer elemento
			            numeros[3] = 40;  // Cuarto elemento
			            numeros[4] = 50;  // Quinto elemento

			            // 3. Recorrer el array para imprimir todos los valores
			            for (int i = 0; i < numeros.length; i++) {
			                System.out.println("Elemento en índice " + i + ": " + numeros[i]);
			            }
			            
			            // ARRAY UNIDIMENSIONAL PIDIENDO DATOS 
			            
			            System.out.print("Introduce el tamaño del array: ");
			            int tamaño = teclado.nextInt();  // Leemos cuántos elementos tendrá el array

			            int[] num1 = new int[tamaño];  // Declaramos e instanciamos el array con el tamaño indicado

			            // Le pedimos al usuario que introduzca los valores
			            System.out.println("Introduce " + tamaño + " números:");
			            for (int i = 0; i < tamaño; i++) {
			                System.out.print("Número para la posición " + i + ": ");
			                numeros[i] = teclado.nextInt();  // Leemos el i‑ésimo número y lo almacenamos en el array
			            } 
			            // ARRAY BIDIMENSIONAL
			            
			            // Mostramos los valores que el usuario introdujo
			            System.out.println("Has introducido los siguientes números:");
			            for (int i = 0; i < tamaño; i++) {
			                System.out.println("Elemento en índice " + i + " = " + numeros[i]);
			            }
			            // 1. Declaración e inicialización directa de un array 2D de enteros
			            //    Aquí creamos una “matriz” de 3 filas y 4 columnas con valores fijos
			            int[][] matriz = {
			                {10, 20, 30, 40},   // fila 0
			                {50, 60, 70, 80},   // fila 1
			                {90, 100, 110, 120} // fila 2
			            };

			            // 2. Recorrer la matriz usando bucles anidados para mostrar los valores
			            for (int fila = 0; fila < matriz.length; fila++) {
			                for (int col = 0; col < matriz[fila].length; col++) {
			                    System.out.print("matriz[" + fila + "][" + col + "] = " + matriz[fila][col] + "\t");
			                }
			                System.out.println();  // salto de línea al final de cada fila

			        }
			            // ARRAY BIDIMENSIONALES PIDIENDO DATOS 
			            
			            // Pedimos al usuario que indique cuántas filas y columnas tendrá la matriz
			            System.out.print("Introduce número de filas: ");
			            int filas = teclado.nextInt();

			            System.out.print("Introduce número de columnas: ");
			            int columnas = teclado.nextInt();

			            // Declaración del array 2D con el tamaño indicado por el usuario
			            int[][] matriz1 = new int[filas][columnas];

			            // Pedimos al usuario que introduzca los valores para cada posición
			            System.out.println("Introduce los valores de la matriz:");
			            for (int i = 0; i < filas; i++) {
			                for (int j = 0; j < columnas; j++) {
			                    System.out.print("Elemento [" + i + "][" + j + "]: ");
			                    matriz1[i][j] = teclado.nextInt();
			                }
			            }

			            // Mostramos los valores que el usuario ha introducido
			            System.out.println("La matriz introducida es:");
			            for (int i = 0; i < filas; i++) {
			                for (int j = 0; j < columnas; j++) {
			                    System.out.print(matriz1[i][j] + "\t");  // tabulación para formato de tabla
			                }
			                System.out.println();  // salto de línea después de cada fila
			            }
			            
			            
			            // IMPRIMIR EL NUEMRO MAYOR O MENOR DE UN ARRAY 
			            
			            int[] nu = {15, 42, 7, 89, 23}; // Array con datos
			            // Inicializamos mayor y menor con el primer elemento del array
			            int mayor = nu[0];
			            int menor = nu[0];

			            // Recorremos el array para comparar cada elemento
			            for (int i = 1; i < nu.length; i++) {
			                if (nu[i] > mayor) {
			                    mayor = nu[i];  // Actualizamos el mayor
			                }
			                if (nu[i] < menor) {
			                    menor = nu[i];  // Actualizamos el menor
			                }
			            }

			            // Mostramos los resultados
			            System.out.println("El número mayor es: " + mayor);
			            System.out.println("El número menor es: " + menor);
			        }
			        
			        // CADENA DE CARACTERES 
			        // representar la cadena e idealizarlo y unirla una detras de otra
			        String cad1= "¡Bien";
			        String cad2= "venido!";
			        String cad3= "ivan";
			        String cadResultado= cad1.concat(cad2);

			        System.out.print(cadResultado);
			    
			       cad1.compareTo(cad2); // comparar dos cadenas
			       
			       cad1.equals(cad2); // comparar dos cadenas.Retornará true si son iguales, y false si no lo son.
			       
			       cad1.compareToIgnoreCase(cad2); //funciona igual que el método compareTo(), pero ignora las mayúsculas y las minúsculas a la hora de hacer la comparación.
			       
			       cad1.equalsIgnoreCase(cad2);//El método equalsIgnoresCase() es igual que el método equals() pero sin tener en cuenta las minúsculas.
			       
			       
			       cad1.toLowerCase(); // las pone todaas en minuscula 
			       
			       cad1.toUpperCase();// las pone toda en mayuscula
			       
			       cad1.trim();//Genera una copia de la cadena eliminando los espacios en blanco anteriores y posteriores de la cadena.
			       
			       cad1.indexOf(cad2);//Si la cadena o carácter pasado por 
			       
			                          //argumento está contenida en la cadena invocante, retorna su posición
			       
			       cad1.contains(cad2);//Retornará true si la cadena pasada por argumento está contenida dentro de la cadena. 
			                           //En caso contrario retornará false.
			       
			       cad1.startsWith(cad2);//	Retornará true si la cadena comienza por la cadena pasada como argumento.
			                             //En caso contrario retornará false.
			       
			       cad1.endsWith(cad2);//Retornará true si la cadena acaba por la cadena pasada como argumento.
			                           //En caso contrario retornará false.
			       
			       cad1.replace(cad2,cad3);//Generará una copia de la cadena cad1, 
			                               //en la que se sustituirán todas las apariciones de cad2 por cad3. 
			}

	}


