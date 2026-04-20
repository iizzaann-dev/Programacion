package comparadores;

import java.util.*;

/*
========================================================
COMPARATOR (ORDEN PERSONALIZADO)
========================================================
Sirve para: definir cómo ordenar objetos externamente
Cómo funciona:
- No modifica la clase original
- Se pasa como argumento a sort()
- Permite múltiples criterios de ordenación
*/

class ComparatorExample {

    void methods() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);

        /*
        compare(a, b):
        - devuelve negativo → a < b
        - devuelve 0 → iguales
        - devuelve positivo → a > b
        */

        // Orden ascendente (forma clásica)
        Comparator<Integer> asc = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; // orden natural ascendente
            }
        };

        // Orden descendente
        Comparator<Integer> desc = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };

        // Usando lambda (más moderno)
        Comparator<Integer> lambdaAsc = (a, b) -> a - b;

        Comparator<Integer> lambdaDesc = (a, b) -> b - a;

        /*
        sort(Comparator):
        aplica el orden definido
        internamente usa TimSort (optimizado)
        */

        list.sort(asc);
        list.sort(desc);

        // También se puede usar Collections.sort
        Collections.sort(list, asc);
    }
}

/*
========================================================
COMPARATOR AVANZADO (OBJETOS)
========================================================
*/

class Persona {
    String nombre;
    int edad;

    Persona(String n, int e) {
        nombre = n;
        edad = e;
    }
}

class ComparatorObjetos {

    void methods() {

        ArrayList<Persona> list = new ArrayList<>();
        list.add(new Persona("Ana", 20));
        list.add(new Persona("Luis", 30));
        list.add(new Persona("Carlos", 25));

        /*
        Ordenar por edad
        */

        Comparator<Persona> porEdad = (p1, p2) -> p1.edad - p2.edad;

        /*
        Ordenar por nombre (orden alfabético)
        */

        Comparator<Persona> porNombre = (p1, p2) -> p1.nombre.compareTo(p2.nombre);

        list.sort(porEdad);
        list.sort(porNombre);
    }
}

/*
========================================================
COMPARABLE (ORDEN NATURAL)
========================================================
Sirve para: definir orden interno de la clase
Cómo funciona:
- Se implementa dentro de la clase
- Solo permite 1 forma de ordenación "natural"
- Se usa automáticamente en sort()
*/

class PersonaComparable implements Comparable<PersonaComparable> {

    String nombre;
    int edad;

    PersonaComparable(String n, int e) {
        nombre = n;
        edad = e;
    }

    /*
    compareTo(otro):
    - negativo → this < otro
    - 0 → iguales
    - positivo → this > otro
    */

    @Override
    public int compareTo(PersonaComparable o) {
        // orden natural por edad
        return this.edad - o.edad;
    }
}

class ComparableExample {

    void methods() {

        ArrayList<PersonaComparable> list = new ArrayList<>();

        list.add(new PersonaComparable("Ana", 20));
        list.add(new PersonaComparable("Luis", 30));
        list.add(new PersonaComparable("Carlos", 25));

        /*
        sort() usa automáticamente compareTo()
        */

        Collections.sort(list);
    }
}

/*
========================================================
DIFERENCIA CLAVE
========================================================

COMPARABLE:
- Está dentro de la clase
- Solo 1 orden posible
- Se usa con Collections.sort(list)

COMPARATOR:
- Está fuera de la clase
- Permite múltiples ordenaciones
- Se usa con list.sort(comparator)

*/

/*
========================================================
CÓMO FUNCIONA INTERNAMENTE EL ORDEN
========================================================

Java usa TimSort:
- mezcla MergeSort + InsertionSort
- muy eficiente en listas reales
- estable (no desordena iguales)

Flujo:
1. compara elementos usando compare / compareTo
2. decide orden
3. reorganiza lista
*/