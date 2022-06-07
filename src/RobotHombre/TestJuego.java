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
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Robot R2D2 = new Robot(001);
      Hombre macho = new Hombre("Mariano");
      Hombre machoso = new Hombre("Marianoso");
      macho.jugarConRobot(R2D2);
      R2D2.despierto();
      machoso.jugarConRobot(R2D2);
    }
    
}
