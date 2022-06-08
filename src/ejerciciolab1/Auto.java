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
 * @author POSITIVO BGH
 */
public class Auto {

    Scanner lector = new Scanner(System.in);
    private String patente;
    private String color;
    private int combustible;
    protected List<Rueda> ruedas = new ArrayList<>();

    public List<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public Auto() {
    }

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
        this.combustible = 50;
        //por determinado el auto tiene el tanque lleno
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
    // no hay setter de combustible para que no se pueda alterar su valor
    public int getCombustible() {
        return combustible;
    }

    public void avanzar() {
        System.out.println("INGRESE LOS METROS A AVANZAR");
        int metros, consume;
        metros = lector.nextInt();
        //consume contiene los litros de combustible usados por cada 10 metros a moverse
        consume = metros / 10;
        if (consume > this.combustible) {
            //si se consume mas de lo que hay
            System.out.println("DEBE LLENAR EL TANQUE");
        } else {
            //si consumo menos de lo que tengo
            System.out.println("PUEDE AVANZAR " +metros+" METROS");
            this.combustible -= consume;
        }
    }

    public void retroceder() {
        System.out.println("INGRESE LOS METROS A RETROCEDER");
        int metros, consume;
        metros = lector.nextInt();
        //consume contiene los litros de combustible usados por cada 10 metros a moverse
        consume = metros / 10;
        if (consume > this.combustible) {
            //si se consume mas de lo que hay
            System.out.println("DEBE LLENAR EL TANQUE");
        } else {
            //si consumo menos de lo que tengo
            System.out.println("PUEDE RETROCEDER " +metros+" METROS");
            this.combustible -= consume;
        }
    }

    public void llenarTanque() {
        this.combustible = 50;
        System.out.println("TANQUE LLENO, QUE SUERTE QUE LO PUDO PAGAR!!!!!");
    }

}
