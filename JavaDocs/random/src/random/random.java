package random;

public class random {

}


/*

// Cuando nos piden generar un numero aleatorio entre un rango y con una condición

// de ser multiplo de X numero, existen 4 parametros comunes:



// El paso: el paso se refiere al numero multiplo que es la condicion

// Para conocer el paso, pienso, cuanto he de sumar a un numero valido, para conseguir el siguiente

// Si me pide un numero entre 1000 y 10000 multiplo de 50, este caso se da cada vez que sumo 50

// por ejemplo 1050 1100 1150... entonces el paso en este caso es 50



// Indice minimo: Este es dado al dividir el minimo entre el paso, y consiste en el numero de posibilidades

// de generación de un numero que cumple con las caracteristicas de ser su multiplo



// Indice maximo: Este es dado al dividir el maximo entre el paso y consistes en el numero de posibilidades

// de un numero que cumple con las caracteristicas de ser su multiplo



// Cantidad: Este es dado al restar indiciMax - indiceMin + 1,consiste en el total de posibilidades 

// de multiplos entre el numero menor y el numero mayor + 1 para evitar multiplicar por 0



// EJERCICIO AUTODIDACTA:

// Rellenar un array con valores entre 2000 y 5000 que sean multiplos de 1000



int paso = 1000;

int indiceMin = 2000 / paso;

int indiceMax = 5000 / paso;

int cantidad = indiceMax - indiceMin + 1;



// Para realizar la generacion de esto valores seria así:

// int a = paso * (indiceMin + (int)(Math.random() * cantidad));



for(int i = 0; i < matrizRandom.length; i++) {

	for(int f = 0; f < matrizRandom[i].length; f++) {

		matrizRandom[i][f] = paso * (indiceMin + (int)(Math.random() * cantidad));

		System.out.println(matrizRandom[i][f]);

	}

}

*/