/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg5;

/**
 *
 * @author dante
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimplementeLigada<Integer> lista = new ListaSimplementeLigada<>();
        // Metodo estaVacia
        lista.estaVacia();
        System.out.println("----------------");
        // Metodo getTamanio
        lista.getTaminio();
        System.out.println("----------------");
        // Metodo agregarAlFinal
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(3);
        lista.agregarAlFinal(4);
        // Metodo getTamanio
        lista.getTaminio();
        System.out.println("----------------");
        // Metodo estaVacia
        lista.estaVacia();
        System.out.println("----------------");
        // Metodo agregarAlInicio
        lista.agregarAlInicio(0);
        lista.agregarAlInicio(9);
        lista.agregarAlInicio(7);
        lista.agregarAlInicio(6);
        // Metodo agregarDespuesDe
        lista.agregarDespuesDe(1, 5);
        lista.agregarDespuesDe(5, 12);
        lista.agregarDespuesDe(12, 13);
        lista.agregarDespuesDe(4, 10);
        // Metodo transversal
        lista.transversal();
        System.out.println("----------------");
        // Metodo eliminar
        lista.eliminar(1);
        System.out.println("Se elimino el 1");
        lista.transversal();
        System.out.println("------Se elimino el primer valor----------");
        // Metodo eliminarElPrimero
        lista.eliminarElPrimero();
        lista.transversal();
        System.out.println("------Se elimino ultimo valor----------");
        // Metodo eliminarElUltimo
        lista.eliminarElFinal();
        lista.transversal();
        System.out.println("------Se busca la posicion del numero 12----------");
        // Metodo buscar
        lista.buscar(12);
        System.out.println("------Se actualiza el valor 12 numero 7----------");
        // Metodo actualizar
        lista.actualizar(12,7);
        lista.transversal();
        
    }

}
