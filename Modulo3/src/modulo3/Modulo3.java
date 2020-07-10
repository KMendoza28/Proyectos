/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo3;

/**
 *
 * @author carlos
 */
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instanciar la clase contadora
        Contadora contadora=new Contadora ();
        contadora.setNombre("Isis Cardona");
        contadora.setIdentidad("1804198600695");
        contadora.setEdad(35);
        contadora.setDireccion("Col. Nuevo San Juan,Lima");
        
        // Obtener la info
        System.out.println("Nombe de la contadora "  +contadora.ctNombre());
     System.out.println("No. de Indentidad "  +contadora.ctIdentidad());
   System.out.println("Edad de la contadora "  +contadora.ctEdad());
    System.out.println("Direccion de la contadora "  +contadora.ctDireccion());
   
    
}
    }
