/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author Jesus Flores
 */
public class VentanaSw extends JFrame {

    private JTextField cuadro, cuadro2, numeroA;
    private JButton boton;
    private JButton boton1;
    private JLabel resultado, etiqueta, etiqueta2, cifrado, numeroAu;
    

    public VentanaSw() throws HeadlessException {
        setTitle("Cifrado César");
        setSize(400, 600);

    

        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(10);
        boton = new JButton("Cifrar");
        boton1 = new JButton("S1");
        resultado = new JLabel("");
        etiqueta = new JLabel("Nombre ");
        cuadro2 = new JTextField(5);
        etiqueta2 = new JLabel("Edad ");
        cifrado = new JLabel("/*Texto Codificado");
        numeroA = new JTextField(4);
        numeroAu = new JLabel("   Tipo de desplazamiento: ");
        
        
        this.getContentPane(). add(etiqueta); //n
        this.getContentPane().add(cuadro);
        this.getContentPane(). add(etiqueta2); //e
        this.getContentPane().add(cuadro2);
        this.getContentPane().add(numeroAu);
        this.getContentPane().add(numeroA);
        this.getContentPane().add(boton1);        
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(cifrado);

        cifrado.setToolTipText("Texto cifrado");
        
        this.boton1.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int variable_x;
                variable_x = 10;
                System.out.println(System.getProperty("user.dir"));
                resultado.setText("Hola " + cuadro.getText() + " tienes " + cuadro2.getText() + " años.");
           }
         
            
        });
        this.boton.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                /*Ingresar codigo para cifrar 
                */
                String cuadro1p; 
               cuadro1p = cuadro.getText().toUpperCase();
               String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
               
                String textoCodificado = "";
                char caracter;
                for (int i = 0; i < cuadro1p.length(); i++) {
                    caracter = cuadro1p.charAt(i);
                    
                    int pos = letras.indexOf(caracter);
                    int num = Integer.parseInt(numeroA.getText());
                    
                    if (pos == -1 ){
                        textoCodificado += caracter;
                    }
                    else{
                    textoCodificado += letras.charAt((pos + num ) % letras.length());
                }
                }
                
                cifrado.setText(textoCodificado);
            
            }
        
        });

                setVisible(true);
                

                        this.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            System.exit(0);
                        }

                
        });
    }
    
    

    
    
}
