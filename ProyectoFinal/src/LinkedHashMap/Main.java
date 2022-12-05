/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author dante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> perros = new LinkedHashMap();
        //Metodo put asocia el valor especificado con la clave especificada en este mapa.
        System.out.println("------------Metodo put------------");
        perros.put(8, "Pastor Aleman");
        perros.put(16, "Maltes");
        perros.put(24, "Pug");
        perros.put(32, "Pastor belga");
        perros.put(40, "Labrador");
        System.out.println(perros);
        //Metodo putAll copia todas las asignaciones del mapa especificado a este mapa.
        System.out.println("------------Metodo putAll------------");
        LinkedHashMap<Integer, String> perros2 = new LinkedHashMap();
        perros2.put(7, "Galgo");
        perros2.put(9, "Husky");
        perros2.put(10, "Chihuahua");
        perros.putAll(perros2);
        System.out.println(perros);
        //Metodo putIfAbsent si la clave especificada aún no está asociada con un valor (o está asignada a un valor nulo), 
        //la asocia con el valor dado y devuelve un valor nulo; de lo contrario, devuelve el valor actual.
        System.out.println("------------Metodo putIfAbsen------------");
        perros.putIfAbsent(8, "Pitbull");
        perros.putIfAbsent(20, "Doberman");
        System.out.println(perros);
        //Metodo values devuelve una vista de colección de los valores contenidos en este mapa.
        System.out.println("------------Metodo values------------");
        System.out.println(perros.values());
        //Metodo size devuelve el número de asignaciones de clave-valor en esta asignación. 
        System.out.println("------------Metodo size------------");
        System.out.println(perros.size());
        //Metodo replace reemplaza la entrada de la clave especificada solo si actualmente está asignada a algún valor.
        System.out.println("------------Metodo replace------------");
        perros.replace(7, "Xoloitzcuintle");
        perros.replace(9, "Chow chow", "Boxer");
        System.out.println(perros);
        //Metodo remove elimina la entrada de la clave especificada solo si actualmente está asignada al valor especificado.
        System.out.println("------------Metodo remove------------");
        perros.remove(10);
        perros.remove(40, "Dalmata");
        System.out.println(perros);
        //Metodo merge i la clave especificada aún no está asociada con un valor o está asociada con un valor nulo, 
        //la asocia con el valor no nulo proporcionado.
        System.out.println("------------Metodo merge------------");
        perros.merge(1, "Beagle", (oldValue, newValue) -> oldValue + "/" + newValue);
        perros.merge(1, "Salchica", (oldValue, newValue) -> oldValue + "/" + newValue);
        System.out.println(perros);
        //Metodo keySet devuelve una vista de conjunto de las claves contenidas en este mapa.
        System.out.println("------------Metodo keySet------------");
        System.out.println(perros.keySet());
        //Metodo isEmpty devuelve verdadero si este mapa no contiene asignaciones de clave-valor.
        System.out.println(perros.isEmpty());
        //Metodos get y getOrDefault devuelve el valor al que se asigna la clave especificada, 
        //o nulo si este mapa no contiene ninguna asignación para la clave. 
        System.out.println("------------Metodo get y getOrDefault------------ ");
        System.out.println(perros.get(1));
        System.out.println(perros.get(2));
        System.out.println(perros.getOrDefault(1, "Esta clave no esta asociada a ningun valor"));
        System.out.println(perros.getOrDefault(2, "Esta clave no esta asociada a ningun valor"));
        //Metodo entrySet devuelve una vista de conjunto de las asignaciones contenidas en este mapa.
        System.out.println("------------Metodo entrySet------------");
        System.out.println(perros.entrySet());
        //Metodo containsValue devuelve verdadero si este mapa asigna una o más claves al valor especificado.
        System.out.println("------------Metodo containsValue------------");
        System.out.println(perros.containsValue("Perro"));
        System.out.println(perros.containsValue("araña"));
        //Metodo containsKey devuelve verdadero si este mapa contiene un mapeo para la clave especificada.
        System.out.println("------------Metodo containskey------------");
        System.out.println(perros.containsKey(1));
        System.out.println(perros.containsKey(2));
        //Metodo compute intenta calcular una asignación para la clave especificada y su valor asignado actual (o nulo si no hay una asignación actual).
        System.out.println("------------Metodo compute------------");
        System.out.println(perros.compute(16, (key, val) -> val.concat("Cocker Spaniel")));
        System.out.println(perros);
        //Metodo computeIfAbsent Si la clave especificada aún no está asociada con un valor (o está asignada a un valor nulo), 
        //intenta calcular su valor utilizando la función de asignación dada y lo ingresa en este mapa a menos que sea nulo.
        System.out.println("------------Metodo computeIfAbsent------------");
        System.out.println(perros.computeIfAbsent(18, k -> "Bulldog"));
        System.out.println(perros);
        //Metodo computeIfPresent si el valor de la clave especificada está presente y no es nulo, 
        //intenta calcular una nueva asignación dada la clave y su valor asignado actual.
        System.out.println("------------Metodo computeIfPresent------------");
        System.out.println(perros.computeIfPresent(24, (key, val) -> "Corgi"));
        System.out.println(perros);
        //Metodo clone devuelve una copia superficial de esta instancia de HashMap: las claves y los valores en sí no se clonan.
        System.out.println("------------Metodo clone------------");
        System.out.println(perros.clone());
        //Metodo clear elimina todas las asignaciones de este mapa.
        System.out.println("------------Metodo clear------------");
        perros.clear();
        System.out.println(perros);
        //Metodo equal() compara el objeto especificado con este mapa para la igualdad. 
        //Devuelve verdadero si el objeto dado también es un mapa y los dos mapas representan las mismas asignaciones. 
        //Más formalmente, dos mapas m1 y m2 representan los mismos mapeos si m1.entrySet().equals(m2.entrySet()). 
        //Esto garantiza que el método equals funcione correctamente en diferentes implementaciones de la interfaz Map.
        System.out.println("------------Metodo equal------------");
        LinkedHashMap<Integer, String> perros3 = new LinkedHashMap();
        perros3.put(7, "Galgo");
        perros3.put(9, "Husky");
        perros3.put(10, "Chihuahua");
        System.out.println(perros2.equals(perros3));
        System.out.println(perros.equals(perros3)); 
        //Metodo hasCode()devuelve un valor de código hash para el objeto. Este método se admite en beneficio de las tablas hash, 
        //como las proporcionadas por HashMap.
        
        
             
        
    }

}
