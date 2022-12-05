/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author dante
 */
public class Vector {
    int valorX;
    int valorY;

    public Vector() {
    }

    public Vector(int valorX, int valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }
    
    public void sumaDevectores(Vector vec1,Vector vec2){
        int vectorResultanteX = vec1.valorX + vec2.valorX;
        int vectorResultanteY = vec1.valorY + vec2.valorY;   
    }
}

