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
        List<Rueda> ruedas = new ArrayList<>();
        //creamos una lista de ruedas y las generamos con presion al maximo
        for (int i = 0; i < 4; i++) {
            Rueda r = new Rueda();
            r.inflar();
            //las añadimos una a una a la lista de ruedas
            ruedas.add(r);
        }
        //agregamos la lista de ruedas como atributo del auto
        Auto a1 = new Auto();
        a1.setRuedas(ruedas);
        //creamos un contador para usar las distintas funciones de la rueda en cada una
        int i =0;
        for (Rueda rueda : a1.getRuedas()) {
            i++;
            switch(i){
                case 1:{
                    rueda.desinflar();
                    break;
                }
                case 2:{
                    a1.avanzar();
                    rueda.pinchar();
                    break;
                }
                case 3:{
                    //llenamos el tanque e inflamos la rueda anterior
                    a1.llenarTanque();
                    i--;
                    rueda.inflar();
                    i++;
                    break;
                }
                case 4:{
                    a1.retroceder();
                    rueda.desinflar();
                    break;
                }
            }
        }   
    }
}
