/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.pila;

import java.util.ArrayList;

/**
 *
 * @author dante
 */
public class PilaLimitada<T> {

    ArrayList<T> pila = new ArrayList<>();
    int tamanio;

    public PilaLimitada(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEmpty() {
        System.out.println(pila.size());
        return pila.size() == 0;
    }

    public int length() {
        System.out.println(pila.size());
        return pila.size();
    }

    public void pop() {
        System.out.println(pila.get(pila.size() - 1));
        pila.remove(pila.size() - 1);
    }

    public void peek() {
        System.out.println(pila.get(pila.size() - 1));
    }

    public void push(T value) {
        if (pila.size()  == tamanio) {
            System.out.println("No caben mas elementos en la pila");
        } else {
            pila.add(value);

        }

    }

    public void isFull() {
        if (pila.size() == tamanio) {
            System.out.println("La pila esta llena");
        } else {
            System.out.println("La pila todavia no esta llena");
        }

    }

    @Override
    public String toString() {
        return "Pilas{" + "pila=" + pila + '}';
    }

}
