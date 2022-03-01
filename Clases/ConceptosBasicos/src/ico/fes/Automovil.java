/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author Flores
 */
public class Automovil {
    private String marca;  //Los atributos van en notación lower camel case /*CODE CONVENTIONS*/
    private String subMarca;   //*El lowe camel case todas en minusculas y a partir de la segunda palabra en mayusculas
    //Upper -- --  Coche de Carreras
    /*https://www.oracle.com/technetwork/java/codeconventions-150003.pdf*/
    
            //s
     private int modelo;
     private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }
     // GETTER AND SETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
     
    //Encapsulamiento: tiene que ver con seguridad de codigo.
    
    //to string

    @Override  /*Override - Herencia  : Esta escribiendo un objeto de la clase que estas generando*/
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
            public Automovil(String m, Color c){
            this.marca = m;
            this.color = c;
            }            
        /*    public Automovil(String sM, Color c){
            this.marca = sM;
            this.color = c;
        }    */
        
}

