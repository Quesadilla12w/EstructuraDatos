/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adt.cola;

/**
 *
 * @author dante
 */
public class ADTCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Integer> colaPrueba = new Cola();
        colaPrueba.lenght();
        colaPrueba.isEmpty();
        System.out.println("--------Metodo enqueue-----------");
        colaPrueba.enqueue(1);
        colaPrueba.enqueue(2);
        colaPrueba.enqueue(3);
        colaPrueba.enqueue(4);
        colaPrueba.enqueue(5);
        colaPrueba.enqueue(6);
        colaPrueba.enqueue(7);
        colaPrueba.enqueue(8);
        System.out.println(colaPrueba.cola);
        System.out.println("--------Metodo leght y isEmpty-----------");
        colaPrueba.lenght();
        colaPrueba.isEmpty();
        System.out.println("--------Metodo dequeue-----------");
        colaPrueba.dequeue();
        System.out.println(colaPrueba.cola);
        colaPrueba.dequeue();
        System.out.println(colaPrueba.cola);
    }
    
}
