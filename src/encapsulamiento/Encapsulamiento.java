/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import Tarea1.Ciudadano;

/**
 *
 * @author carlos
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  // instanciar clase Ciudadano
  
  Ciudadano ciudadano=new Ciudadano ("Yeni Leon", 30, 5);
        
       
  //Impimir valores de vaiables privadas
  System.out.println("Nombre del ciudadano: " +ciudadano.getNombre());
  System.out.println("Edad del ciudadano: " +ciudadano.getEdad());
  System.out.println("Años de experiencia: " +ciudadano.getTiempoExperiencia()+ " años");
   
    }
    
}
