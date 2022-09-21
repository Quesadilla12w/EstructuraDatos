/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dante
 */
public class ConjuntoADT<T> {

    ArrayList<T> conjunto1;

    public ConjuntoADT() {
        conjunto1 = new ArrayList();
    }

    public int getLongitud() {
        int longitud = conjunto1.size();
        System.out.println(longitud);
        System.out.println(conjunto1);
        return longitud;
    }

    public Boolean contiene(T elemento) {
        System.out.println(conjunto1.contains(elemento));
        return conjunto1.contains(elemento);
    }

    public void agregar(T elemento) {
        if (conjunto1.contains(elemento) == true) {
            System.out.println("El elemento que deseas agregar, ya se encuentra dentro del conjunto");
        } else {
            conjunto1.add(elemento);
        }

    }

    public void eliminar(T elemento) {
        if (conjunto1.contains(elemento) == true) {
            conjunto1.remove(elemento);
        }

    }

    public void ecuals(ArrayList<T> conjunto2) {
        conjunto1.equals(conjunto2);
        System.out.println(conjunto1.equals(conjunto2));

    }

    public boolean esSubconjunto(ArrayList<T> conjunto2) {
        System.out.println(conjunto1.containsAll(conjunto2));
        return conjunto1.containsAll(conjunto2);

    }

    public void union(ArrayList<T> conjunto2) {
        ConjuntoADT<T> conjuntoNuevo = new ConjuntoADT();
        conjuntoNuevo.conjunto1.addAll(conjunto1);
        for (T t : conjunto2) {
            if (conjunto1.contains(t) == false) {
                conjuntoNuevo.conjunto1.add(t);
            }

        }
        System.out.println("La union de los dos conjuntos es");
        System.out.println(conjuntoNuevo.conjunto1);
    }

    public void interseccion(ArrayList<T> conjunto2) {
        ConjuntoADT<T> conjuntoNuevo = new ConjuntoADT();
        for (T t : conjunto2) {
            if (conjunto1.contains(t)) {
                conjuntoNuevo.conjunto1.add(t);
            }
        }
        System.out.println(conjuntoNuevo.conjunto1);

    }

    public void diferencia(ArrayList<T> conjunto2) {
        ConjuntoADT<T> conjuntoNuevo = new ConjuntoADT();
        for (T t : conjunto2) {
            if (conjunto1.contains(t) == false) {
                conjuntoNuevo.conjunto1.add(t);
            }
        }
        System.out.println(conjuntoNuevo.conjunto1);
    }

    @Override
    public String toString() {
        return "ConjuntoADT{" + "conjunto1=" + conjunto1 + '}';
    }
    
    public void iterator() {
       Iterator iterador = conjunto1.iterator();
        while (iterador.hasNext()) {            
            iterador.next();
        }
    }

}
