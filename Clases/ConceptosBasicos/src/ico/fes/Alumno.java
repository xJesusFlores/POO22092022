/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Flores
 */
public class Alumno extends Persona {  //hereda tributos y metodos
    private String numeroCuenta;  //2515613-0  //haria una resta con int
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera, int grupo) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
    //super.toString() +   --de la clase persona
   
}
    