/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotHombre;

/**
 *
 * @author POSITIVO BGH
 */
public class Hombre {
    private String nombre;

    public Hombre() {
    }

    public Hombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void jugarConRobot(Robot R2D2){
        R2D2.avanzar(500);
        R2D2.retroceder(20);
        System.out.println(R2D2.cargaActual());
        R2D2.dormir();
    }
}
