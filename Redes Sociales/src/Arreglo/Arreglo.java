
package Arreglo;


import java.lang.reflect.Array;
import java.time.Clock;
import java.util.Arrays;





    public class Arreglo { 
        Perro[] perros;


        
        public void Constructor(int tamaño){
            
            Perro[] perros = new Perro[tamaño];
        
        }
                             
        public static int  getLongitud(Perro[] perros){
            int x = perros.length;
            System.out.println(x);
            return x;  
         }
        
        public static boolean setElemento(Perro[] perros,int indice, Perro valor){
            
            
            
            
            int index = Arrays.binarySearch(perros, indice);

            for (Perro perro : perros) {
                if (indice == index ) { 
                    perros[indice] = valor;
                    
                }

            }
        return true;
            
                     
         }
        
        public static Perro getElemento(Perro[] perros,int indice){
            int index = Arrays.binarySearch(perros, indice);
            for (Perro perro : perros) {
                if (indice == index) {
                     System.out.println(perros[indice]);
                    
                }
                
            }
            
            return null;           
        }
        
        public void limpiar(Perro[] perros,Perro valor){
            for (Perro perro : perros) {
               perro = valor;
                
            }
            
            
            
        
        }




        


}
