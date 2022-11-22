/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adt.cola.Prioritaria;

import adt.cola.Cola;

/**
 *
 * @author dante
 */
public class ADTColaPrioritaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ColaPrioritaria<Integer> colaPrueba = new ColaPrioritaria(4);
        colaPrueba.isEmpty();
        colaPrueba.lenght();
        colaPrueba.enqueue(2, 2);
        colaPrueba.enqueue(3, 3);
        colaPrueba.enqueue(1, 1);
        colaPrueba.enqueue(0, 0);
        System.out.println(colaPrueba.colaPrioritaria);
        colaPrueba.enqueue(1, 45);
        colaPrueba.enqueue(1, 566);
        colaPrueba.enqueue(0, 9);
        colaPrueba.enqueue(0, 10);
        System.out.println(colaPrueba.colaPrioritaria);
        colaPrueba.dequeue();
        System.out.println(colaPrueba.colaPrioritaria);
        colaPrueba.dequeue();
        colaPrueba.dequeue();




    }

}
