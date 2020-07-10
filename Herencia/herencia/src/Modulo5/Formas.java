/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo5;

/**
 *
 * @author Karen Mendoza
 */
public class Formas {
   
    //atibuto
    private String Color ;
    private String nombreForma;
    
    public Formas(){}
       
    /*
    Método set
    */
    public void establecerColor(String Color){
      this.Color=Color;
    }
    
    /*
    Método Get
    */
    public String obtenerColor(){
      return this.Color;
    }
   
    /*
    Método para dibujar o imprimir el nombre de la forma
    */
    public void Dibujar(String nombreForma){
         System.out.println("Nombre de la forma: " + nombreForma);
    }
   
    
}
