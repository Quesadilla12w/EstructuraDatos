package adt.pila;

import java.util.ArrayList;

public class Pilas<T> {
    ArrayList<T> pila = new ArrayList<>();

    public Pilas() {
    }

    public boolean isEmpty() {
        System.out.println(pila.size() == 0);
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

    public T peek() {
        System.out.println(pila.get(pila.size() - 1));
        return pila.get(pila.size() - 1);
    }

    public void push(T value) {
        pila.add(value);
    }

    @Override
    public String toString() {
        return "Pilas{" + "pila=" + pila + '}';
    }
    
    
 }

    
    
    


