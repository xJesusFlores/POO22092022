/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Flores
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        
            //w
            
            Arbol three1 = new Arbol(2.1f, 10);
            
            System.out.println("Troncos de un arbol = " + Arbol.tronco);
            Arbol.generarOxigeno();
            
            //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);

//atributos de clase como emtodos de clase ---
            //Un atributo de clase o un metodo de clase (elementos miembro) son identificadores que almacenan un valor constante
            /* o un comportamiento constante igual para todos lo objetos de la misma; al ser constantes no es necesario crear una 
            instancia (objeto) para acceder a ellos
            
            
            */      
            int edad3 =17;
            String resultado = "";
                    if (edad3 < 18) {
                        resultado = "Menor de edad";
                        
                    }else {
                        resultado = "Mayor de edad";
                    }
                    System.out.println(resultado);
                     int edad4 = 24;
        String res = "";
       res = edad4 < 18? "Menor de edad edad 4": "Mayor de edad, tequila";    
        System.out.println(res);
        
        //version minima
        int edad5= 19;
        //--------------------
        int val1 = 1;
        int val2 = 2;
        
        System.out.println(val1 & val2);
        int val3 =1; // 0000... 0001
        //int val4 <<= val3;
        //System.out.println(val3 <<= );
        int val4 = 0;
        val4 = val3 <<1; //?? 1 = 2 -- 2 = 4;
        System.out.println(val4); //tiene que dar 2
        /*
        En este caso esta ocurriendo lo siguiente: Se esta reccoreindo los bits 
        a la izq... se rellena con 0 el bit menos significativo
        */
        
        System.out.println("---------ARREGLOS-----");
        int[] edades ;
        
        //parecido al lenguaje C solo con pequeñas diferencias en la sintaxis
 // primero se declara que sera un arreglo, en este punto aun no se reserva
 /*memoria*/
 
  //subfijo []
  
  /**El segundo  paso es reservarlo, de un*/
        edades  = new int [5];
        System.out.println(edades);
        // Ahora la usamos como siempre la han hecho
        
        edades [0] = 10;
        System.out.println("La primera edad es: " + edades [0]);
        //declarar e inicializar en una sola linea..
        int [] estaturas = new int[5];
        //ahora al igual que en C y C++, puedes asignar valores
        int [] pesos = {86, 99, 57, 76, 77};
        System.out.println(pesos [0]);
        System.out.println(pesos [1]);
        System.out.println(pesos [2]);
        System.out.println(pesos [3]);
        System.out.println(pesos [4]);
        
/**
 */
        
        System.out.println("-----CON FOR------");
        for (int i = 0; i < pesos.length; i++) {
            int peso = pesos[i];
            System.out.println(pesos [i]);
        }
        //Imprimirlos en orden inverso
        
        for (int i = 0; i < pesos.length; i++) {
            int peso = pesos[i];
            System.out.println(pesos [i]);
        }
        System.out.println("Orden Inverso-------");
        for(int i=pesos.length-1;i>=0; i--){
            System.out.println(pesos[i]);
        }
/*
        */
        
        System.out.println("Arreglo de alumnos----------");
        Alumno[] lista = new Alumno[5]; //5 alumnos
        lista [0] = new Alumno("8454575", 2, 9.0f);
        lista [1] = new Alumno("8454515", 2, 7.0f);
        lista [2] = new Alumno("8454525", 2, 7.0f);
        lista [3] = new Alumno("8454585", 2, 10.0f);
        lista [4] = new Alumno("8454565", 2, 6.0f);
        /*
        for (int i = 0; i < 10; i++) { //for +  tab
            
        }
        for (int i = 0; i < lista.length; i++) { //fori +tab
            Alumno alumno = lista[i];
            
        }
*/
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempeno());
        }
        
        System.out.println("FOR EACH, es un FOR especial introduciendo en la segunda version de Javva, esa version fue la que sufrio cambios muy grandes java");
        System.out.println("El FOR EACH fue introducido para simplicicar los FOR con arreglos.");
        
        //fore + TAB  
        
        System.out.println("FOR EACH ---------");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempeno());
        }
        
    }
    
    }