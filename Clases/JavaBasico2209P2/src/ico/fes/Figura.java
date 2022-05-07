/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Jesus Flores
 */
public interface Figura {
    
    public static final float PI=3.1415f;
    public static final int CUADRADO = 1;
    public static final int CIRCULO = 2;
    public static final int TRIANGULO = 3;
    public static final int RECTAGULO = 4;
    
    /*Las constantes de escriben en mayusculas por convencion de buenas practicas de programación.
    
    */
     /*Interface*/
    public abstract float calcularArea();
    
}
