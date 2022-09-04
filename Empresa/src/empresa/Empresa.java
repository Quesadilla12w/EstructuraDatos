/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Arreglo.Arreglo;
import java.util.Collections;

/**
 *
 * @author dante
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NominaADT archivo = new NominaADT();
        archivo.readFile("C:\\Users\\dante\\Documents\\EstructuraDatos\\Empresa\\src\\empresa\\junio.dat");
        System.out.println(archivo.list.getElemento(8));
        System.out.println(archivo.list.getElemento(8).calcularSueldo());
        System.out.println(archivo.mayorAntiguedad());
        System.out.println(archivo.menorAntiguedad());

    }
    
}
