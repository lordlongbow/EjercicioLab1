/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolab1;

/**
 *
 * @author POSITIVO BGH
 */
public class Rueda {
    private int marca;
    private double presion;           

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public Rueda(int marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public Rueda() {
    }
    
    public void inflar(){
        this.presion=28.0;
        System.out.println("Su Rueda esta inflada");
    }
    
    public void desinflar(){
        this.presion-=0.5;
          System.out.println("Su Rueda se esta desinflando");
    }
    
       public void pinchar(){
        this.presion=0.0;
          System.out.println("Su Rueda pinchada");
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + ", presion=" + presion + '}';
    }
       
}
