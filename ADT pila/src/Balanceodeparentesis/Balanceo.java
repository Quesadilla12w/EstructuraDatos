/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balanceodeparentesis;

import adt.pila.Pilas;

/**
 *
 * @author dante
 */
public class Balanceo {
    
    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Pilas<Character> pila = new Pilas<>();
      if(exprssion == null || exprssion.length() == 0) {
           return false;
      } else {    
        for(int i = 0; i < exprssion.length(); i++){
            
          if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[' ) {
            pila.push(exprssion.charAt(i));
          } else if(exprssion.charAt(i) == ')') {
        if(!pila.isEmpty() && pila.peek() == '(') {
              pila.pop();
          }else {
              return false;
         }
          } else if (exprssion.charAt(i) == ']') {
               if(!pila.isEmpty() && pila.peek() == '[') {
                  pila.pop();
              } else {
                  return false;
              }
          } else if(exprssion.charAt(i) == '}'){
              if(!pila.isEmpty() && pila.peek() == '{') {
                  pila.pop();
              } else {
                  return false;
              }
          }
        }
        
        // if stack is empty finally , it means symbol is balance in expression
        if(pila.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
 }
}
    
    

