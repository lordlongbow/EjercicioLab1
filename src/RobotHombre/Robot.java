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
public class Robot {
    private int serie;
    private double bateria = 1000;
    private boolean despierto = true;
    
    public Robot() {
    }

    public Robot(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public double getBateria() {
        return bateria;
    }

    public boolean isDespierto() {
        return despierto;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    public boolean despierto(){
        this.despierto=true;
        return true;
        
    }
      public boolean dormir(){
        this.despierto=false;
        return false;
    } 
      
     public void recargar(){
        this.bateria=1000;
    }
     public boolean bateriaLLena(){
        boolean aux=false;
         if(this.bateria==1000){
          aux = true;
        }
        return aux;
    }
     
     public boolean bateriaVacia(){
         boolean aux=false;
         if(this.bateria==0){
          aux = true;
        }
        return aux;
    }
     public double cargaActual(){
        return this.bateria;
     }
     
     public void avanzar(int pasos){
         if(!this.despierto){
             System.out.println("SU ROBOT ESTA DORMIDO, NO PUEDE AVANZAR");
         }else {
             if(cargaActual()>=(pasos*10)/100){
                  this.bateria -= (pasos*10)/100;
                  System.out.println("SU ROBOT HA AVANZADO");
             }else{
                 System.out.println("EL ROBOT NO TIENE CARGA SUFICIENTE");
             }           
         }
     }
     
     public void retroceder(int pasos){
           if(this.despierto==false){
             System.out.println("SU ROBOT ESTA DORMIDO, NO PUEDE RETROCEDER");
         }else {
             if(cargaActual()>=(pasos*10)/100){
                  this.bateria -= (pasos*10)/100;
                  System.out.println("SU ROBOT HA RETROCEDIDO");
             }else{
                 System.out.println("EL ROBOT NO TIENE CARGA SUFICIENTE");
             }           
         }
     }
     
     }
