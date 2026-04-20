package metodosDeLasColecciones;

import java.util.*;

/*
========================================================
ARRAYLIST (List)
========================================================
Sirve para: lista dinámica
Internamente: array redimensionable
Rápido acceso, inserciones lentas en medio
*/

class ArrayListMethods {

    void methods() {
        ArrayList<String> list = new ArrayList<>();

        // add(E e): añade al final
        list.add("A");

        // add(int index, E element): inserta en posición concreta
        list.add(0, "B");

        // addAll(Collection c): añade todos los elementos
        list.addAll(List.of("C", "D"));

        // addAll(int index, Collection c): inserta colección en índice
        list.addAll(1, List.of("E"));

        // get(int index): obtiene elemento
        list.get(0);

        // set(int index, E element): reemplaza elemento
        list.set(0, "Z");

        // remove(int index): elimina por índice
        list.remove(0);

        // remove(Object o): elimina por valor
        list.remove("A");

        // removeIf(Predicate): elimina según condición
        list.removeIf(s -> s.equals("Z"));

        // removeAll(Collection c): elimina elementos coincidentes
        list.removeAll(List.of("C"));

        // retainAll(Collection c): mantiene solo los indicados
        list.retainAll(List.of("Z"));

        // contains(Object o): comprueba existencia
        list.contains("Z");

        // containsAll(Collection c): comprueba si contiene todos
        list.containsAll(List.of("Z"));

        // indexOf(Object o): primera posición
        list.indexOf("Z");

        // lastIndexOf(Object o): última posición
        list.lastIndexOf("Z");

        // size(): tamaño
        list.size();

        // isEmpty(): está vacío?
        list.isEmpty();

        // iterator(): iterador básico
        Iterator<String> it = list.iterator();

        // listIterator(): iterador bidireccional
        ListIterator<String> lit = list.listIterator();

        // forEach(): recorre elementos
        list.forEach(System.out::println);

        // subList(int from, int to): vista parcial
        list.subList(0, 1);

        // toArray(): convierte a Object[]
        list.toArray();

        // toArray(T[] a): convierte a array tipado
        list.toArray(new String[0]);

        // sort(Comparator): ordena lista
        list.sort(String::compareTo);

        // replaceAll(UnaryOperator): modifica todos los elementos
        list.replaceAll(s -> s.toLowerCase());

        // clear(): elimina todo
        list.clear();

        // clone(): copia superficial
        list.clone();

        // ensureCapacity(int): asegura capacidad
        list.ensureCapacity(20);

        // trimToSize(): ajusta tamaño interno
        list.trimToSize();
    }
}

/*
========================================================
LINKEDLIST (List + Deque)
========================================================
Sirve para: inserciones/eliminaciones rápidas
Internamente: nodos enlazados
*/

class LinkedListMethods {

    void methods() {
        LinkedList<String> list = new LinkedList<>();

        // add(E e): añade al final
        list.add("A");

        // addFirst(E e): añade al inicio
        list.addFirst("Start");

        // addLast(E e): añade al final
        list.addLast("End");

        // offer(E e): añade como cola
        list.offer("X");

        // offerFirst(E e): añade al inicio
        list.offerFirst("Y");

        // offerLast(E e): añade al final
        list.offerLast("Z");

        // get(int index): obtiene por índice
        list.get(0);

        // getFirst(): primer elemento
        list.getFirst();

        // getLast(): último elemento
        list.getLast();

        // peek(): mira primero sin eliminar
        list.peek();

        // peekFirst(): igual que peek
        list.peekFirst();

        // peekLast(): mira último
        list.peekLast();

        // remove(): elimina primero
        list.remove();

        // remove(int index): elimina por índice
        list.remove(0);

        // remove(Object o): elimina por valor
        list.remove("A");

        // removeFirst(): elimina primero
        list.removeFirst();

        // removeLast(): elimina último
        list.removeLast();

        // poll(): obtiene y elimina primero
        list.poll();

        // pollFirst(): igual que poll
        list.pollFirst();

        // pollLast(): obtiene y elimina último
        list.pollLast();

        // push(E e): inserta como pila
        list.push("Stack");

        // pop(): elimina como pila
        list.pop();

        // contains(Object o): búsqueda
        list.contains("A");

        // size(): tamaño
        list.size();

        // iterator(): iterador normal
        Iterator<String> it = list.iterator();

        // descendingIterator(): iterador inverso
        list.descendingIterator();

        // clear(): vaciar
        list.clear();
    }
}

/*
========================================================
HASHSET
========================================================
Sin duplicados, sin orden
Internamente: tabla hash
*/

class HashSetMethods {

    void methods() {
        HashSet<String> set = new HashSet<>();

        // add(E e): añade
        set.add("A");

        // addAll(Collection c)
        set.addAll(Set.of("B", "C"));

        // remove(Object o)
        set.remove("A");

        // removeIf(Predicate)
        set.removeIf(s -> s.equals("B"));

        // removeAll(Collection c)
        set.removeAll(Set.of("C"));

        // retainAll(Collection c)
        set.retainAll(Set.of("A"));

        // contains(Object o)
        set.contains("A");

        // containsAll(Collection c)
        set.containsAll(Set.of("A"));

        // size()
        set.size();

        // isEmpty()
        set.isEmpty();

        // iterator()
        Iterator<String> it = set.iterator();

        // forEach()
        set.forEach(System.out::println);

        // clear()
        set.clear();

        // clone()
        set.clone();
    }
}

/*
========================================================
LINKEDHASHSET
========================================================
Sin duplicados + mantiene orden de inserción
Internamente: hash + lista enlazada
*/

class LinkedHashSetMethods {

    void methods() {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add(E e)
        set.add("A");

        // remove(Object o)
        set.remove("A");

        // contains(Object o)
        set.contains("A");

        // iterator(): respeta orden
        Iterator<String> it = set.iterator();

        // size()
        set.size();

        // clear()
        set.clear();
    }
}

/*
========================================================
TREESET
========================================================
Ordenado automáticamente
Internamente: árbol rojo-negro
*/

class TreeSetMethods {

    void methods() {
        TreeSet<Integer> set = new TreeSet<>();

        // add(E e): añade ordenado
        set.add(5);

        // remove(Object o)
        set.remove(5);

        // contains(Object o)
        set.contains(5);

        // first(): menor elemento
        set.first();

        // last(): mayor elemento
        set.last();

        // higher(E e): siguiente mayor
        set.higher(3);

        // lower(E e): siguiente menor
        set.lower(3);

        // ceiling(E e): >= elemento
        set.ceiling(3);

        // floor(E e): <= elemento
        set.floor(3);

        // pollFirst(): elimina menor
        set.pollFirst();

        // pollLast(): elimina mayor
        set.pollLast();

        // iterator(): recorrido ordenado
        Iterator<Integer> it = set.iterator();

        // clear()
        set.clear();
    }
}

/*
========================================================
HASHMAP
========================================================
Clave → valor
Internamente: tabla hash
*/

class HashMapMethods {

    void methods() {
        HashMap<String, Integer> map = new HashMap<>();

        // put(K key, V value)
        map.put("A", 1);

        // putIfAbsent(K key, V value)
        map.putIfAbsent("B", 2);

        // putAll(Map m)
        map.putAll(Map.of("C", 3));

        // get(Object key)
        map.get("A");

        // getOrDefault(Object key, V default)
        map.getOrDefault("X", 0);

        // remove(Object key)
        map.remove("A");

        // remove(Object key, Object value)
        map.remove("B", 2);

        // containsKey(Object key)
        map.containsKey("C");

        // containsValue(Object value)
        map.containsValue(3);

        // size()
        map.size();

        // isEmpty()
        map.isEmpty();

        // keySet()
        map.keySet();

        // values()
        map.values();

        // entrySet()
        map.entrySet();

        // replace(K key, V value)
        map.replace("C", 10);

        // replace(K key, V old, V new)
        map.replace("C", 10, 20);

        // compute()
        map.compute("A", (k, v) -> v == null ? 1 : v + 1);

        // computeIfAbsent()
        map.computeIfAbsent("X", k -> 100);

        // computeIfPresent()
        map.computeIfPresent("C", (k, v) -> v + 1);

        // merge()
        map.merge("Z", 1, Integer::sum);

        // forEach()
        map.forEach((k, v) -> System.out.println(k + v));

        // clear()
        map.clear();

        // clone()
        map.clone();
    }
}

/*
========================================================
ITERATOR (EXPLICACIÓN COMPLETA)
========================================================
*/

class IteratorExplicacion {

    void methods() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // iterator(): crea un objeto que recorre la colección
        Iterator<String> it = list.iterator();

        // hasNext(): comprueba si hay más elementos
        while (it.hasNext()) {

            // next(): devuelve el siguiente elemento
            String e = it.next();

            // remove(): elimina el elemento actual de forma segura
            if (e.equals("B")) {
                it.remove();
            }
        }
    }
}

