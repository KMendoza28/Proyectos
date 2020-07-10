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
public final class Contadora {
    private String identidad;
    private String nombre;
    private int celular;
    private int edad;
    private String direccion;
    
    
public Contadora (){
    
}
/*constructor pérsonalizado*/
public Contadora (String identidad,String nombre,int edad, String direccion ){
    this.setIdentidad(identidad);
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setDireccion(direccion);
}
        public String ctIdentidad(){
        return identidad;
}
        public  String ctNombre(){
        return nombre;
        }
      
       public int ctEdad (){
     return edad;
     }
      public String ctDireccion (){
    return direccion;
}
      public void setIdentidad(String _identidad){
          this.identidad=_identidad;
      }
      public void setNombre(String _nombre){
          this.nombre=_nombre;
}
       public void setEdad(int _edad){
          this.edad=_edad;
}
       public void setDireccion(String _direccion){
          this.direccion=_direccion;
       }

    
    }
         