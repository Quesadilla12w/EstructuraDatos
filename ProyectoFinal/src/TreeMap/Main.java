/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TreeMap;

import java.awt.BorderLayout;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, String> personas = new TreeMap();
        //Metodo put asocia el valor especificado con la clave especificada en este mapa.
        System.out.println("------------Metodo put------------");
        personas.put(1, "Luis");
        personas.put(2, "Perlette");
        personas.put(3, "Fernando");
        personas.put(4, "Teodoro");
        personas.put(5, "Mario");
        personas.put(6, "Antonio");
        personas.put(7, "Iaan");
        personas.put(8, "Daniel");
        System.out.println(personas);
        //Metodo ceilingEntry devuelve una asignación de clave-valor asociada con la clave mínima mayor o igual que la clave dada, 
        //o nulo si no existe tal clave.
        System.out.println("------------Metodo ceilingEntry------------");
        System.out.println(personas.ceilingEntry(8));
        System.out.println(personas.ceilingEntry(10));
        //Metodo ceilingKey() devuelve la clave mínima mayor o igual que la clave dada, o nula si no existe tal clave.
        System.out.println("------------Metodo ceilingKey------------");
        System.out.println(personas.ceilingKey(8));
        System.out.println(personas.ceilingKey(10));
        //Metodo comparator() devuelve el comparador usado para ordenar las claves en este mapa, 
        //o nulo si este mapa usa el ordenamiento natural de sus claves.
        System.out.println("------------Metodo comparator()------------");
        System.out.println(personas.comparator());
        //Metodo descendingKeySet() devuelve una vista de NavigableSet en orden inverso de las claves contenidas en este mapa.
        System.out.println("------------Metodo descendingKeySet() ------------");
        System.out.println(personas.descendingKeySet());
        //Metodo descendingMap() devuelve una vista en orden inverso de las asignaciones contenidas en este mapa.
        System.out.println("------------Metodo descendingMap() ------------");
        System.out.println(personas.descendingMap());
        //Metodo firstEntry() devuelve una asignación de clave-valor asociada con la clave mínima en esta asignación, o nula si la asignación está vacía.
        System.out.println("------------Metodo firstEntry() ------------");
        System.out.println(personas.firstEntry());
        //Metodo firstKey() devuelve la primera clave (más baja) actualmente en este mapa.
        System.out.println("------------Metodo firstKey() ------------");
        System.out.println(personas.firstKey());
        //Metodo floorEntry() devuelve una asignación de clave-valor asociada con la clave mayor menor o igual que la clave dada, 
        //o nula si no existe tal clave.
        System.out.println("------------Metodo floorEntry()------------");
        System.out.println(personas.floorEntry(2));
        System.out.println(personas.floorEntry(10));
        //Metodo floorKey() devuelve la clave mayor menor o igual que la clave dada, o nula si no existe tal clave.
        System.out.println("------------Metodo floorKey()------------");
        System.out.println(personas.floorKey(2));
        System.out.println(personas.floorKey(10));
        //Metodo headMap() devuelve una vista de la parte de este mapa cuyas claves son estrictamente menores que toKey.
        //Metodo headMap(K toKey, boolean inclusive) devuelve una vista de la parte de este mapa cuyas claves son menores que 
        //(o iguales, si inclusive es verdadero) toKey.
        System.out.println("------------Metodo headMap() y (K toKey, boolean inclusive)------------");
        System.out.println(personas.headMap(4));
        System.out.println(personas.headMap(5, true));
        System.out.println(personas.headMap(5, false));
        //Metodo higherEntry() devuelve un mapeo de clave-valor asociado con la clave mínima estrictamente mayor que la clave dada, 
        //o nulo si no existe tal clave.
        System.out.println("------------Metodo higherEntry()------------");
        System.out.println(personas.higherEntry(6));
        System.out.println(personas.higherEntry(8));
        //Metodo higherKey() devuelve la clave mínima estrictamente mayor que la clave dada, o nula si no existe tal clave.
        System.out.println("------------Metodo higherKey()------------");
        System.out.println(personas.higherKey(6));
        System.out.println(personas.higherKey(8));
        //Metodo lastEntry() devuelve una asignación de clave-valor asociada con la clave mayor en esta asignación, o nula si la asignación está vacía.
        System.out.println("------------Metodo lastEntry()------------");
        System.out.println(personas.lastEntry());
        //Metodo lastKey() Devuelve la última clave (más alta) actualmente en este mapa.
        System.out.println("------------Metodo lastKey()------------");
        System.out.println(personas.lastKey());
        //Metodo lowerEntry() Devuelve un mapeo de clave-valor asociado con la clave mayor estrictamente menor que la clave dada, 
        //o nulo si no existe tal clave.
        System.out.println("------------Metodo lowerEntry()------------");
        System.out.println(personas.lowerEntry(5));
        System.out.println(personas.lowerEntry(1));
        //Metodo lowerKey() devuelve la clave mayor estrictamente menor que la clave dada, o nula si no existe tal clave.
        System.out.println("------------Metodo lowerKey()------------");
        System.out.println(personas.lowerEntry(6));
        System.out.println(personas.lowerEntry(1));
        //Metodo navigableKeySet() devuelve una vista NavigableSet de las claves contenidas en este mapa.
        System.out.println("------------Metodo navigableKeySet()------------");
        System.out.println(personas.navigableKeySet());
        //Metodo pollFirstEntry() elimina y devuelve un mapeo de clave-valor asociado con la clave mínima en este mapa, o nulo si el mapa está vacío.
        System.out.println("------------Metodo pollFirstEntry()------------");
        System.out.println(personas.pollFirstEntry());
        //Metodo pollLastEntry() elimina y devuelve un mapeo de clave-valor asociado con la clave mayor en este mapa, o nulo si el mapa está vacío.
        System.out.println("------------Metodo pollLastEntry()------------");
        System.out.println(personas.pollLastEntry());
        //Metodo subMap() devuelve una vista de la parte de este mapa cuyas claves van desde fromKey hasta toKey.
        System.out.println("------------Metodo subMap()------------");
        System.out.println(personas.subMap(2,6));
        System.out.println(personas.subMap(2, true, 6, true));
        System.out.println(personas.subMap(2, false, 6, false));
        //Metodo tailMap() devuelve una vista de la parte de este mapa cuyas claves son mayores que (o iguales, si inclusive es verdadero) fromKey.
        System.out.println("------------Metodo tailMap()------------");
        System.out.println(personas.tailMap(4));
        System.out.println(personas.tailMap(4, false));
    }

}
