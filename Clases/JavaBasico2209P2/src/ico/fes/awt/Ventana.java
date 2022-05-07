/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Jesus Flores
 */
public class Ventana extends Frame{
    private String titulo;
    private Button boton1; 
    private FlowLayout layout;
    private Label etiqueta;
    private TextField cuadroTexto;

        public Ventana() throws HeadlessException {
        }

        public Ventana(String titulo) throws HeadlessException {
        
            super (titulo);
            this.titulo = titulo;
            this.setSize(400, 600);
            layout = new FlowLayout(FlowLayout.LEFT);
            this.setLayout(layout);
            boton1 = new Button("S1");
           
            cuadroTexto = new TextField(15);
            etiqueta = new Label("Texto Incial");

            this.add(cuadroTexto);
            this.add(boton1);   
            this.add(etiqueta);
          
            
            this.setVisible(true);
            
        }

            public String getTitulo() {
                return titulo;
            }

            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }

    @Override
    public String toString() {
        return "Ventana{" + "titulo=" + titulo + '}';
    }
 
        

}

            /*
            addWindowListener(
       new WindowAdapter (){
            public void windowclosing (WindowEvent e){
            System. exit (0);
            )
            */