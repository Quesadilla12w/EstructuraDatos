/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.cola;

import java.util.ArrayList;

/**
 *
 * @author dante
 */
public class Cola<T> {

   public ArrayList<T> cola = new ArrayList();

    public Cola() {
    }

    public boolean isEmpty() {
        System.out.println(cola.size() == 0);
        return cola.size() == 0;
    }

    public int lenght() {
        System.out.println(cola.size());
        return cola.size();
    }

    public void enqueue(T elemento) {
        cola.add(elemento);
    }

    public void dequeue() {
        cola.remove(0);
    }

    @Override
    public String toString() {
        return "Cola{" + "cola=" + cola + '}';
    }
    
    

}
