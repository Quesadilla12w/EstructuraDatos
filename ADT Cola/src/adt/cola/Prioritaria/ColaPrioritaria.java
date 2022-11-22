/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.cola.Prioritaria;

import adt.cola.Cola;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author dante
 */
public class ColaPrioritaria<T> {

    ArrayList<Cola> colaPrioritaria = new ArrayList();
    int niveles;

    public ColaPrioritaria(int niveles) {
        this.niveles = niveles;
        for (int i = 0; i < niveles; i++) {
            colaPrioritaria.add(i, new Cola());
        }
    }

    public void isEmpty() {
        for (Cola colap : colaPrioritaria) {
            colap.isEmpty();
        }
    }

    public void lenght() {
        for (Cola colap : colaPrioritaria) {
            colap.lenght();
        }
    }

    public void enqueue(int prioridad, T element) {
        for (int i = 0; i < niveles; i++) {
            if (prioridad == i) {
                colaPrioritaria.get(prioridad).cola.add(element);
            }
        }
    }

    public void dequeue() {
        int x = 0;
        while (colaPrioritaria.iterator().hasNext() == true) {
            if (colaPrioritaria.get(x).cola.isEmpty()) {
                x++;
                colaPrioritaria.listIterator(x + 1).next().dequeue();

            } else {
                colaPrioritaria.get(x).dequeue();

            }
            break;
        }

    }
}
