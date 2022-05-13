/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Flores
 */
public class VentanaSwing extends JFrame {
        private JTextField cuadro;
        private JButton boton;
        private JLabel resultado;
        
    public VentanaSwing() throws HeadlessException {
        setTitle("Conversion de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout (FlowLayout. CENTER) );
        cuadro = new JTextField(5);
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\car.png");
        
        boton  = new JButton(icono);
        boton.setBackground(Color.GREEN);
        boton.setOpaque(false);
        boton.setToolTipText("Convertir en °F"); 
        
        resultado = new JLabel("°F");
        this.getContentPane(). add(cuadro);
        this.getContentPane(). add(boton);
        this.getContentPane(). add(resultado);
        
        this.validate(); //renderiza
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               // super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
               System.exit(0);
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            //    super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            float gradosFahrenheit = 0.0f;
            float celsius = 0.0f;
                try {
                    celsius = Float.parseFloat(cuadro.getText());
                    gradosFahrenheit =  celsius  * (9.0f / 5.0f) +32.0f;
                    resultado.setText(gradosFahrenheit + " °F");
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                    
                }
            
            }
            
        });
        
    }
    
    
}