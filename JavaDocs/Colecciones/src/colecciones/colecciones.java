package colecciones;

import java.util.*;

public class colecciones {
    public static void main(String[] args) {

        // =========================
        // 🔹 ARRAYLIST
        // =========================
        // Lista dinámica basada en array
        // Rápida para acceder por índice (get)
        ArrayList<String> list = new ArrayList<>();

        list.add("Ana");                 // añade elemento
        list.add("Luis");
        list.add("Carlos");

        list.get(0);                     // obtiene por índice
        list.set(0, "Pedro");            // modifica elemento
        list.remove("Luis");             // elimina por valor
        list.size();                     // tamaño
        list.contains("Carlos");         // buscar elemento

        // 🔸 ITERATOR (FUNCIONAMIENTO)
        // Sirve para recorrer colecciones sin usar índices
        // Muy útil para eliminar elementos de forma segura
        Iterator<String> it = list.iterator(); // crear iterator

        while (it.hasNext()) { // comprueba si hay siguiente elemento

            String nombre = it.next(); // devuelve el siguiente elemento
                                       // y avanza internamente

            System.out.println("Iterator ArrayList: " + nombre);

            // eliminar de forma segura durante el recorrido
            if (nombre.equals("Carlos")) {
                it.remove(); // elimina el último elemento devuelto por next()
            }
        }

        // ⚠️ IMPORTANTE:
        // NO hacer list.remove() dentro del bucle → error ConcurrentModificationException


        // =========================
        // 🔹 LINKEDLIST
        // =========================
        // Lista enlazada → mejor para inserciones/eliminaciones
        LinkedList<String> linked = new LinkedList<>();

        linked.add("Uno");
        linked.addFirst("Cero");         // añade al inicio
        linked.addLast("Dos");           // añade al final

        linked.getFirst();               // primer elemento
        linked.getLast();                // último elemento

        linked.removeFirst();            // elimina primero
        linked.removeLast();             // elimina último

        linked.push("X");                // como pila (stack)
        linked.pop();                    // saca elemento

        // Iterator también funciona igual aquí
        Iterator<String> it2 = linked.iterator();
        while (it2.hasNext()) {
            String val = it2.next();
            System.out.println("Iterator LinkedList: " + val);
        }


        // =========================
        // 🔹 HASHSET
        // =========================
        // No permite duplicados, sin orden
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("A"); // duplicado → no se añade

        set.remove("B");                 // elimina
        set.contains("A");               // buscar

        // No tiene índices → Iterator es clave aquí
        Iterator<String> it3 = set.iterator();
        while (it3.hasNext()) {
            String s = it3.next();
            System.out.println("Iterator HashSet: " + s);
        }


        // =========================
        // 🔹 LINKEDHASHSET
        // =========================
        // Igual que HashSet pero mantiene orden de inserción
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Uno");
        linkedSet.add("Dos");
        linkedSet.add("Tres");

        Iterator<String> it4 = linkedSet.iterator();
        while (it4.hasNext()) {
            System.out.println("Iterator LinkedHashSet: " + it4.next());
        }


        // =========================
        // 🔹 TREESET
        // =========================
        // Ordena automáticamente (árbol)
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(5);
        tree.add(1);
        tree.add(3);

        tree.first();                    // menor
        tree.last();                     // mayor
        tree.higher(3);                 // siguiente mayor
        tree.lower(3);                  // siguiente menor

        Iterator<Integer> it5 = tree.iterator();
        while (it5.hasNext()) {
            System.out.println("Iterator TreeSet: " + it5.next());
        }


        // =========================
        // 🔹 HASHMAP
        // =========================
        // Estructura clave → valor
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ana", 25);
        map.put("Luis", 30);

        map.get("Ana");                  // obtener valor
        map.containsKey("Luis");         // buscar clave
        map.containsValue(30);           // buscar valor

        // 🔸 ITERATOR EN MAP
        // No se usa directamente sobre map, sino sobre entrySet()

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();

        while (itMap.hasNext()) {

            Map.Entry<String, Integer> entry = itMap.next();

            String clave = entry.getKey();   // clave
            int valor = entry.getValue();    // valor

            System.out.println("Iterator Map: " + clave + " -> " + valor);

            // también se puede eliminar de forma segura
            if (clave.equals("Luis")) {
                itMap.remove();
            }
        }


        // =========================
        // 🔹 RESUMEN ITERATOR
        // =========================
        /*
         Iterator tiene 3 métodos clave:

         - hasNext() → devuelve true si hay más elementos
         - next() → devuelve el siguiente y avanza
         - remove() → elimina el último elemento devuelto por next()

         FUNCIONAMIENTO:
         Es como un puntero interno que recorre la colección.

         IMPORTANTE:
         ✔ Usar remove() del iterator para eliminar
         ❌ No usar collection.remove() dentro del bucle
        */
    }
}