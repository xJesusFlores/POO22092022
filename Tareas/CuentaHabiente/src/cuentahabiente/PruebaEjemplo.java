/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

import java.util.Scanner;

/**
 *
 * @author Jesus Flores
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                String [] idCliente = new String [5];
        String [] nombre = new String [5];
        float [] balance = new float [5];
        
        
        balance [0] =  37441f;
        balance [1] =  51378f;
        balance [2] =  17298f;
        balance [3] =  42681f;
        balance [4] =  171921f;
        
        nombre [0] = "Gerardo Gonzalez";
        nombre [1] = "Juan Alvarez";
        nombre [2] = "Carolina Blancas";
        nombre [3] = "Jonathan Ramirez";
        nombre [4] = "Andrea Gonzalez";
        
        idCliente [0] = "71284145-H";
        idCliente [1] = "21874145-H";
        idCliente [2] = "42204349-I";
        idCliente [3] = "75913874-T";
        idCliente [4] = "15675541-H";
                
              

        System.out.println(balance [4]);
        CuentaHabiente cuenta0 = new CuentaHabiente(idCliente [0], nombre [0], balance [0], 0);
        System.out.println(cuenta0);
        cuenta0.evaluarCliente();
        
        CuentaHabiente cuenta1 = new CuentaHabiente(idCliente [1], nombre [1], balance [1], 0);
                System.out.println(cuenta1 );
                cuenta1.evaluarCliente();
         CuentaHabiente cuenta2 = new CuentaHabiente(idCliente [2], nombre [2], balance [2], 0);
                System.out.println(cuenta2);
                cuenta2.evaluarCliente();
         CuentaHabiente cuenta3 = new CuentaHabiente(idCliente [3], nombre [3], balance [3], 0);
                System.out.println(cuenta3);
                cuenta3.evaluarCliente();
           CuentaHabiente cuenta4 = new CuentaHabiente(idCliente [4], nombre [4], balance [4], 0);
                System.out.println(cuenta4);
                cuenta4.evaluarCliente();
                
                
                
                
      /*          
        for (int i = 0; i < balance.length; i++) {
            
            balance[i].evaluarCliente ();
            
            
        }
        */

       
       
    }
    
}
