/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Conceptos.Basicos;

import java.awt.Color;

/**
 *
 * @author Flores
 */
public class Automovil { //loa atributos pueden ser de diferntes tipos de datos
    private String Marca;
    private String subMarca;
    private int Modelo;
    private Color Color;

    public Automovil() { //metodo contructor
    }

    public Automovil(String Marca, String subMarca, int Modelo, Color Color) { //metodo contructor sobrecargado
        this.Marca = Marca;
        this.subMarca = subMarca;
        this.Modelo = Modelo;
        this.Color = Color;
    }
//
    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    
    //
      public void encender (){
      System.out.println("El auto "+ this.subMarca +" esta encendido");
  }  
        public void acelerar (){
            System.out.println("Acelerandoal auto " + this.subMarca);
           
        }
        public void avanzar (){
            System.out.println("Avanzando el auto");
        }
}
