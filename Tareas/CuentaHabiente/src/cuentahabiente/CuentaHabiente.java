/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Jesus Flores
 */
public class CuentaHabiente {
    
         private String idCliente;
         private String nombre;
         private float balance;
         private float monto;

    public CuentaHabiente() {
    }

    public CuentaHabiente(String idCliente, String nombre, float balance, float monto) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + ", monto=" + monto + '}';
    }
         
      public void retirarDinero(float monto){
          this.balance = this.balance - monto;
      }   
    
     /*   public void retirarDinero(){
        balance = this.balance;
        balance = this.balance - retiro;
            System.out.println("Su balance actual es de: " + this.balance);
            
}     e */    
        public void evaluarCliente (){
  /*                  Scanner sc = new Scanner(System.in);

            balance = sc.nextDouble();*/
            if (balance > 50000f){
                System.out.println("Cliente Premium\n");  
              
        }
            else {
                System.out.println("Cliente Regular\n");
            }
        }
     
}
