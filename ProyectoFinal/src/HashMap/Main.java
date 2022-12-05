/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashMap;

import java.util.HashMap;

/**
 *
 * @author dante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,String> mascotas = new HashMap();
        //Metodo put asocia el valor especificado con la clave especificada en este mapa.
        System.out.println("------------Metodo put------------");
        mascotas.put(8, "Perro");
        mascotas.put(16, "Gato");
        mascotas.put(24, "Tortuga");
        mascotas.put(32, "Conejo");
        mascotas.put(40, "Pez");
        System.out.println(mascotas);
        //Metodo putAll copia todas las asignaciones del mapa especificado a este mapa.
        System.out.println("------------Metodo putAll------------");
        HashMap<Integer,String> mascotas2 = new HashMap();
        mascotas2.put(7, "Perro1");
        mascotas2.put(9, "Perro2");
        mascotas2.put(10, "Perro3");
        mascotas.putAll(mascotas2);
        System.out.println(mascotas);
        //Metodo putIfAbsent si la clave especificada aún no está asociada con un valor (o está asignada a un valor nulo), 
        //la asocia con el valor dado y devuelve un valor nulo; de lo contrario, devuelve el valor actual.
        System.out.println("------------Metodo putIfAbsen------------");
        mascotas.putIfAbsent(8, "PerroA");
        mascotas.putIfAbsent(20, "PerroA");
        System.out.println(mascotas);
        //Metodo values devuelve una vista de colección de los valores contenidos en este mapa.
        System.out.println("------------Metodo values------------");
        System.out.println(mascotas.values());
        //Metodo size devuelve el número de asignaciones de clave-valor en esta asignación. 
        System.out.println("------------Metodo size------------");
        System.out.println(mascotas.size());
        //Metodo replace reemplaza la entrada de la clave especificada solo si actualmente está asignada a algún valor.
        System.out.println("------------Metodo replace------------");
        mascotas.replace(7, "Hurón");
        mascotas.replace(9, "Perro2", "Tarántula");
        System.out.println(mascotas);
        //Metodo remove elimina la entrada de la clave especificada solo si actualmente está asignada al valor especificado.
        System.out.println("------------Metodo remove------------");
        mascotas.remove(10);
        mascotas.remove(40, "Pez");
        System.out.println(mascotas);
        //Metodo merge i la clave especificada aún no está asociada con un valor o está asociada con un valor nulo, 
        //la asocia con el valor no nulo proporcionado.
        System.out.println("------------Metodo merge------------");
        mascotas.merge(1, "vaca",(oldValue, newValue) -> oldValue + "/" + newValue);
        mascotas.merge(1, "vaca2",(oldValue, newValue) -> oldValue + "/" + newValue);
        System.out.println(mascotas);
        //Metodo keySet devuelve una vista de conjunto de las claves contenidas en este mapa.
        System.out.println("------------Metodo keySet------------");
        System.out.println(mascotas.keySet());
        //Metodo isEmpty devuelve verdadero si este mapa no contiene asignaciones de clave-valor.
        System.out.println(mascotas.isEmpty());
        //Metodos get y getOrDefault devuelve el valor al que se asigna la clave especificada, 
        //o nulo si este mapa no contiene ninguna asignación para la clave. 
        System.out.println("------------Metodo get y getOrDefault------------ ");
        System.out.println(mascotas.get(1));
        System.out.println(mascotas.get(2));
        System.out.println(mascotas.getOrDefault(1, "Esta clave no esta asociada a ningun valor"));
        System.out.println(mascotas.getOrDefault(2, "Esta clave no esta asociada a ningun valor"));
        //Metodo entrySet devuelve una vista de conjunto de las asignaciones contenidas en este mapa.
        System.out.println("------------Metodo entrySet------------");
        System.out.println(mascotas.entrySet());
        //Metodo containsValue devuelve verdadero si este mapa asigna una o más claves al valor especificado.
        System.out.println("------------Metodo containsValue------------");
        System.out.println(mascotas.containsValue("Perro"));
        System.out.println(mascotas.containsValue("araña"));
        //Metodo containsKey devuelve verdadero si este mapa contiene un mapeo para la clave especificada.
        System.out.println("------------Metodo containskey------------");
        System.out.println(mascotas.containsKey(1));
        System.out.println(mascotas.containsKey(2));
        //Metodo compute intenta calcular una asignación para la clave especificada y su valor asignado actual (o nulo si no hay una asignación actual).
        System.out.println("------------Metodo compute------------");
        System.out.println(mascotas.compute(16, (key, val) -> val.concat("Michi")));
        System.out.println(mascotas);
        //Metodo computeIfAbsent Si la clave especificada aún no está asociada con un valor (o está asignada a un valor nulo), 
        //intenta calcular su valor utilizando la función de asignación dada y lo ingresa en este mapa a menos que sea nulo.
        System.out.println("------------Metodo computeIfAbsent------------");
        System.out.println(mascotas.computeIfAbsent(18, k -> "Oveja"));
        System.out.println(mascotas);
        //Metodo computeIfPresent si el valor de la clave especificada está presente y no es nulo, 
        //intenta calcular una nueva asignación dada la clave y su valor asignado actual.
        System.out.println("------------Metodo computeIfPresent------------");
        System.out.println(mascotas.computeIfPresent(24, (key, val) -> "Tortuga2"));
        System.out.println(mascotas);
        //Metodo clone devuelve una copia superficial de esta instancia de HashMap: las claves y los valores en sí no se clonan.
        System.out.println("Metodo clone");
        System.out.println(mascotas.clone());
        //Metodo clear elimina todas las asignaciones de este mapa.
        System.out.println("Metodo clear");
        mascotas.clear();
        System.out.println(mascotas);
    }
    
}
