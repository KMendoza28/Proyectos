/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author Karen
 */
public class Ciudadano {
    
    //datos del Ciudadano
    private String nombre;
    private  int edad;
    private  int tiempoExperiencia;
    
    
    /*
    Código agregado por Arnol Gutiérrez++Aprendido
    Nota: Se ha agregado un constructor general y un constructor con parámetros a la clase Ciudadano
    */
    public Ciudadano(){
        
    }
    
    public Ciudadano(String nombre, int edad, int tiempoExperiencia){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTiempoExperiencia(tiempoExperiencia);
    }
    
    public void setNombre(String _nombre){
    this.nombre=_nombre;
    }
    
    public void setEdad(int _edad){
    this.edad=_edad;
    }
    public void setTiempoExperiencia(int _tiempoExperiencia){
    this.tiempoExperiencia = _tiempoExperiencia;
    }
    public String getNombre(){
    return nombre;
    }
    public int getEdad(){
    return edad;
     }
    public int getTiempoExperiencia(){
    return tiempoExperiencia;
     }

  
    }
    
    
        
       
        
    
                                
    


