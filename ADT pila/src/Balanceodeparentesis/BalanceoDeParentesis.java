package Balanceodeparentesis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BalanceoDeParentesis {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File doc = new File("C:\\Users\\dante\\Documents\\EstructuraDatos\\ADT pila\\src\\Balanceodeparentesis\\texto1.txt");
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String strng;
        while ((strng = obj.readLine()) != null) {
            //System.out.println(strng);
        }

        File doc2 = new File("C:\\Users\\dante\\Documents\\EstructuraDatos\\ADT pila\\src\\Balanceodeparentesis\\texto1.txt");
        BufferedReader obj2 = new BufferedReader(new FileReader(doc));
        String strng2;
        while ((strng2 = obj.readLine()) != null) {
            //System.out.println(strng);
        }   
        System.out.println(Balanceo.isBalanceSymbolInExpression(strng));
        System.out.println(Balanceo.isBalanceSymbolInExpression(strng2));
       
    }

}
