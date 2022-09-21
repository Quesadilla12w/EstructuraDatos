/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

/**
 *
 * @author dante
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ConjuntoADT<String> conjuntoLetras = new ConjuntoADT();
        System.out.println("---------------Metodo agregar------------------------");
        conjuntoLetras.agregar("C");
        conjuntoLetras.getLongitud();
        System.out.println("---------------Metodo agregar con valor repetido----------------------");
        conjuntoLetras.agregar("C");
        conjuntoLetras.getLongitud();
        System.out.println("---------------Metodo contiene------------------------");
        conjuntoLetras.contiene("B");
        System.out.println("---------------Metodo eliminar------------------------");
        conjuntoLetras.agregar("H");
        conjuntoLetras.agregar("G");
        conjuntoLetras.agregar("J");
        conjuntoLetras.eliminar("J");
        conjuntoLetras.getLongitud();
        conjuntoLetras.eliminar("C");
        conjuntoLetras.getLongitud();
        System.out.println("----------------Metodo ecuals-----------------------");
        conjuntoLetras.agregar("X");
        conjuntoLetras.agregar("Y");
        conjuntoLetras.agregar("Z");
        conjuntoLetras.agregar("I");
        conjuntoLetras.agregar("J");
        conjuntoLetras.agregar("O");
        conjuntoLetras.agregar("P");
        conjuntoLetras.getLongitud();
        ConjuntoADT<String> conjuntoLetras2 = new ConjuntoADT();
        conjuntoLetras2.agregar("H");
        conjuntoLetras2.agregar("G");
        conjuntoLetras2.agregar("X");
        conjuntoLetras2.agregar("Y");
        conjuntoLetras2.agregar("Z");
        conjuntoLetras2.agregar("I");
        conjuntoLetras2.agregar("J");
        conjuntoLetras2.agregar("O");
        conjuntoLetras2.agregar("P");
        conjuntoLetras2.getLongitud();
        ConjuntoADT<String> conjuntoLetras3 = new ConjuntoADT();
        conjuntoLetras3.agregar("T");
        conjuntoLetras3.agregar("R");
        conjuntoLetras3.agregar("Q");
        conjuntoLetras3.agregar("I");
        conjuntoLetras3.agregar("U");
        conjuntoLetras3.agregar("K");
        conjuntoLetras3.agregar("V");
        conjuntoLetras3.agregar("F");
        conjuntoLetras3.agregar("G");
        conjuntoLetras3.getLongitud();
        System.out.println("----------------Metodo ecuals con un cojunto igual-----------------------");
        conjuntoLetras.ecuals(conjuntoLetras2.conjunto1);
        System.out.println("----------------Metodo ecuals con un conjunto diferente -----------------------");
        conjuntoLetras.ecuals(conjuntoLetras3.conjunto1);
        System.out.println("----------------Metodo subConjunto-----------------------");
        ConjuntoADT<String> conjuntoLetras4 = new ConjuntoADT();
        conjuntoLetras4.agregar("H");
        conjuntoLetras4.agregar("G");
        conjuntoLetras4.agregar("X");
        conjuntoLetras4.agregar("O");
        conjuntoLetras4.agregar("C");
        conjuntoLetras4.agregar("V");
        conjuntoLetras4.agregar("B");
        conjuntoLetras4.agregar("L");
        System.out.println("----------------Metodo subConjunto con un conjunto que no es -----------------------");
        conjuntoLetras.esSubconjunto(conjuntoLetras4.conjunto1);
        System.out.println("----------------Metodo subConjunto con un conjunto que si es subconjunto -----------------------");
        ConjuntoADT<String> conjuntoLetras5 = new ConjuntoADT();
        conjuntoLetras5.agregar("X");
        conjuntoLetras5.agregar("Y");
        conjuntoLetras5.agregar("Z");
        conjuntoLetras5.agregar("I");
        conjuntoLetras.esSubconjunto(conjuntoLetras5.conjunto1);
        System.out.println("----------------Metodo union-----------------------");
        conjuntoLetras.union(conjuntoLetras3.conjunto1);
        System.out.println("----------------Metodo interseccion-----------------------");
        conjuntoLetras.interseccion(conjuntoLetras4.conjunto1);
        System.out.println("----------------Metodo diferencia-----------------------");
        conjuntoLetras.diferencia(conjuntoLetras4.conjunto1);
        conjuntoLetras4.diferencia(conjuntoLetras.conjunto1);
    }
    
}
