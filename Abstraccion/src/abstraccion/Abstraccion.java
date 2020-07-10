/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import helpclass.CostaRica;
import helpclass.ElSalvador;
import helpclass.Honduras;

/**
 *
 * @author carlos
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Honduras hn=new Honduras();
        CostaRica cr=new CostaRica();
        ElSalvador esv=new ElSalvador ();
        
        System.out.println(""+hn.getPais()+ ":" +hn.getPresidente());
        System.out.println(""+cr.getPais()+ ":" +cr.getPresidente());
        System.out.println(""+esv.getPais()+ ":" +esv.getPresidente());
        
        
       
        
        
        
      
        
    }
    
}
