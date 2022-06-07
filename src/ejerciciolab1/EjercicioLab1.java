/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Matias Diaz, Diego Diaz, Agostina Borbone, Luis Brandoni; Diego Orellano
 * @author POSITIVO BGH
 */
public class EjercicioLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto();
        Rueda r = new Rueda();
        List<Rueda> ruedas = new ArrayList<>();
        System.out.println("RUEDAS");
        for (int i = 0; i < 4; i++) {
            r.inflar();
            ruedas.add(r);
            System.out.println("Se ha agregado la rueda " + i);
        }

        a1.llenarTanque();
        a1.avanzar();
        a1.retroceder();
        a1.llenarTanque();
        for (Rueda rueda : ruedas) {
            System.out.println(rueda);
        }
        for (Rueda rueda : ruedas) {
         
        }
    }

}
