package colecciones;

import java.util.*;

public class colecciones {
    public static void main(String[] args) {

        // =========================
        // 🔹 ARRAYLIST (MÁS MÉTODOS)
        // =========================
        ArrayList<String> list = new ArrayList<>();

        list.add("Ana");
        list.add("Luis");
        list.add("Carlos");

        list.get(0);
        list.set(0, "Pedro");
        list.remove("Luis");

        list.size();
        list.contains("Carlos");

        list.isEmpty();                 // comprobar si está vacío
        list.indexOf("Carlos");         // índice de un elemento
        list.lastIndexOf("Carlos");     // último índice
        list.clear();                   // eliminar todos los elementos

        list.addAll(Arrays.asList("A", "B", "C")); // añadir colección

        System.out.println(list.subList(0, 2));     // sublista


        // =========================
        // 🔹 LINKEDLIST (MÁS MÉTODOS)
        // =========================
        LinkedList<String> linked = new LinkedList<>();

        linked.add("Uno");
        linked.addFirst("Cero");
        linked.addLast("Dos");

        linked.getFirst();
        linked.getLast();

        linked.removeFirst();
        linked.removeLast();

        linked.push("X");
        linked.pop();

        linked.offer("Elemento");       // añade al final (como cola)
        linked.poll();                  // obtiene y elimina primero

        linked.peek();                  // obtiene sin eliminar
        linked.peekFirst();
        linked.peekLast();

        linked.element();               // obtiene primer elemento (error si vacío)

        linked.clear();                 // elimina todo


        // =========================
        // 🔹 HASHSET (MÁS MÉTODOS)
        // =========================
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("B");

        set.remove("B");
        set.contains("A");

        set.isEmpty();                  // vacío
        set.size();                     // tamaño
        set.clear();                    // vaciar

        set.addAll(Arrays.asList("X", "Y", "Z")); // añadir colección

        Object[] array = set.toArray(); // convertir a array

        set.retainAll(Arrays.asList("X")); // solo deja elementos comunes
        set.removeAll(Arrays.asList("X"));  // elimina elementos


        // =========================
        // 🔹 LINKEDHASHSET (MISMOS MÉTODOS QUE HASHSET)
        // =========================
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Uno");
        linkedSet.add("Dos");
        linkedSet.add("Tres");

        linkedSet.remove("Dos");
        linkedSet.size();
        linkedSet.clear();


        // =========================
        // 🔹 TREESET (MÁS MÉTODOS)
        // =========================
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(5);
        tree.add(1);
        tree.add(3);

        tree.first();
        tree.last();

        tree.higher(3);
        tree.lower(3);

        tree.ceiling(2);  // >= valor
        tree.floor(2);    // <= valor

        tree.pollFirst();  // obtiene y elimina el primero
        tree.pollLast();   // obtiene y elimina el último

        tree.subSet(1, 5); // sub conjunto

        tree.headSet(3);   // menor a 3
        tree.tailSet(3);   // mayor o igual a 3

        tree.clear();


        // =========================
        // 🔹 HASHMAP (MÁS MÉTODOS)
        // =========================
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ana", 25);
        map.put("Luis", 30);

        map.get("Ana");
        map.containsKey("Luis");
        map.containsValue(30);

        map.remove("Luis");             // eliminar por clave

        map.size();                     // tamaño
        map.isEmpty();                  // vacío
        map.clear();                    // vaciar

        map.putIfAbsent("Carlos", 40);  // solo añade si no existe

        map.replace("Ana", 26);         // reemplaza valor

        map.keySet();                   // conjunto de claves
        map.values();                   // colección de valores

        map.entrySet();                 // conjunto clave-valor


        // =========================
        // 🔹 ITERATOR (COMPLETO)
        // =========================
        ArrayList<String> demo = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Iterator<String> it = demo.iterator();

        while (it.hasNext()) {
            String val = it.next();

            if (val.equals("B")) {
                it.remove(); // elimina seguro
            }
        }


        // =========================
        // 🔹 RESUMEN GENERAL
        // =========================
        /*
        ARRAYLIST:
        - get, set, add, remove, size
        - indexOf, subList, clear, addAll

        LINKEDLIST:
        - addFirst, addLast, removeFirst, removeLast
        - push, pop, peek, poll

        HASHSET:
        - add, remove, contains, size, clear
        - no duplicados

        LINKEDHASHSET:
        - igual que HashSet + orden

        TREESET:
        - ordenado automáticamente
        - first, last, higher, lower, ceiling, floor

        HASHMAP:
        - put, get, remove
        - keySet, values, entrySet
        - putIfAbsent, replace

        ITERATOR:
        - hasNext
        - next
        - remove
        */
    }
}