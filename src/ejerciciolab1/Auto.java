/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author POSITIVO BGH
 */
public class Auto {

    Scanner lector = new Scanner(System.in);
    private String patente;
    private String color;
    private int combustible;
    protected List<Rueda> ruedas = new ArrayList<>();

    public Auto() {
    }

    public Auto(String patente, String color, int combustible) {
        this.patente = patente;
        this.color = color;
        this.combustible = combustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void avanzar() {
       
        System.out.println("INGRESE LOS METROS A AVANZAR");
        int metros, totalcombustible;
        metros = lector.nextInt();
        totalcombustible = metros / 10;
        if (totalcombustible <= this.combustible) {
            System.out.println("PUEDE AVANZAR");
                this.combustible -= totalcombustible;
            System.out.println(combustible +" " + totalcombustible);
        
            
        } else {
            System.out.println("DEBE LLENAR EL TANQUE");
             System.out.println(combustible + " "+totalcombustible);
        }
    }

    public void retroceder() {
        System.out.println("INGRESE LOS METROS A RETROCEDER");
        int metros, totalcombustible;
        metros = lector.nextInt();
        totalcombustible = metros / 10;
        if (totalcombustible <= this.combustible) {
            System.out.println("PUEDE RETROCEDER");
            this.combustible -= totalcombustible;
               System.out.println(combustible +" " + totalcombustible);
        } else {
            System.out.println("DEBE LLENAR EL TANQUE");
               System.out.println(combustible +" " + totalcombustible);
        }
    }

    public void llenarTanque() {
        this.combustible = 50;
        System.out.println("TANQUE LLENO, QUE SUERTE QUE LO PUDO PAGAR!!!!!");
    }

}
