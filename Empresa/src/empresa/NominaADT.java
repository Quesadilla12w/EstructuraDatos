/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import Arreglo.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author danteleer archivo
 */
public class NominaADT {
    
    private BufferedReader reader;
    private String line;
    private String lines[] = null;
    Arreglo<Empleado> list = new Arreglo(0);
    private int var = 0;
    
    public void readFile(String fileName){
        try {
            reader = new BufferedReader(new FileReader(fileName));
            
            while ((line = reader.readLine()) != null) {
                lines = line.split(",");
                printLine();
                System.out.println();
                if (var == 1) {
                       list.addElemento(new Empleado(Integer.parseInt(lines[0]),lines[1],lines[2],lines[3],Integer.parseInt(lines[4]),Double.parseDouble(lines[5]),Integer.parseInt(lines[6]))); 
                }
                var = 1;
            }
            reader.close();
            line = null;
            lines = null;
        } catch (Exception e) {
        }
        
    }
    
    public void printLine(){
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]+ " | ");
            
        }
    }
    
    public int mayorAntiguedad(){
        int max = 29999999;
        Empleado trabmax = null;
        for (int i = 0; i < 13; i++) {
            if (list.getElemento(i).getAnioIngreso() < max) {
                max = list.getElemento(i).getAnioIngreso();
                trabmax = list.getElemento(i);
            }         
        }

        System.out.println("El empleado mas antiguo es:");
        System.out.println(trabmax);
        System.out.println("Año de ingreso");
        return max;

    }
    
    public int menorAntiguedad(){
        Empleado trabmin = null;
        int min = 0;
        for (int i = 0; i < 13; i++) {
            if (list.getElemento(i).getAnioIngreso() > min) {
                min = list.getElemento(i).getAnioIngreso();
                trabmin = list.getElemento(i);
            }          
        }

        System.out.println("El empleado mas reciente es:");
        System.out.println(trabmin);
        System.out.println("Año de ingreso");
        return min;

    }
          
}
            
    
    

