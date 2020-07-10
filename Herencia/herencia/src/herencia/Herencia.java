 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Modulo5.*;

/**
 * 
 * @author Karen Mendoza
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
     /*
     Instancia de la clase circulo  
       
     */   
     Circulo circulo= new Circulo();
     Cuadrado cuadrado=new Cuadrado ();
     Triangulo triangulo =new Triangulo ();
      Lineas lineas =new Lineas ();   
     /*
     El 12 es el valor de la circunferencia necesario en la formula, puede ser cualquier valor-
     Agregamos los valores necesarios en la formula para las diferentes formas  
     */
     double radioCirculo = circulo.calcularRadio(12);
     System.out.println("Radio del circulo: " + radioCirculo);
     double areaCuadrado = cuadrado.calcularArea(25);
     System.out.println("Area del cuadrado: " + areaCuadrado + " cm2");
     double areaTriangulo = triangulo.calcularArea(3,2.6);
     System.out.println("Area del triangulo: " + areaTriangulo + " cm2");
     double largoLinea = lineas.calcularLinea(5);
     System.out.println("El largo de la linea es : " + largoLinea);
     /*
     Para imprimir el nombre del circulo usamos el método creado en la clase Formas
     Note que dicho método no está creado en la clase circulo, pero al hereder de la clase formas
     automáticamente tenemos acceso a usar ese método en esta clase circulo y en las demas en las que 
     hagamos herencia de el.
     */
     circulo.Dibujar("Circulo");
     cuadrado.Dibujar("Cuadrado");
     triangulo.Dibujar("Triangulo");
     lineas.Dibujar("Linea");
   
    }


    
}
