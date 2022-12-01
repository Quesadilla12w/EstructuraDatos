/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablas.hash;

/**
 *
 * @author dante
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ADTHashTable<String> tabla = new ADTHashTable(97);
        tabla.add("Perro",704);
        tabla.add("Perro",510);
        tabla.valueOf("Perro");
    }
    
}
