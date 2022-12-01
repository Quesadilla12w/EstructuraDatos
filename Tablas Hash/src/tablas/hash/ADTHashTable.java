/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablas.hash;

import java.util.ArrayList;

/**
 *
 * @author dante
 */
public class ADTHashTable<T> {

    int table_size;
    ArrayList<T> table;
    int valor;

    public ADTHashTable(int table_size) {
        this.table_size = table_size;
         table = new ArrayList<>();
         for (int i = 0; i < table_size; i++) {
            table.add(null);
        }
    }
    
    

    public void add(T key, int value) {
        valor = value % table_size;
        while (table.get(valor) != null) {

            System.out.println("La posicion " + valor + " ya se encuentra ocupada, moviendo a la siguiente");
            valor++;

            if (valor == table.size()) {
                valor = 0;
            }

            if (valor == value % table_size) {
                System.out.println("No hay mas espacios disponibles en la lista.");
            }

        }
        table.add(valor, key);
    }

    public void valueOf(T key) {
        System.out.println(table.indexOf(key));
        
    }

    public void remove(T key) {
        table.remove(table.indexOf(key));
    }

}
