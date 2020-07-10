
package modulo2;
import java.util.Scanner;

public class Recurso1 {

   
    String mensaje1 = "Estoy aprendiendo, pero seré el mejor programador del mundo";
    String mensaje2 = "Aprobado";
    String mensaje3 = "Reprobado";
     Recurso1 obj;   
      Recurso1 obj2;
      Recurso1 obj3;
      Recurso1 obj4;
       Recurso1 obj5;
    public static void main(String args[]) {
    Recurso1 obj;  
     Recurso1 obj2;
      Recurso1 obj3;
      Recurso1 obj4;
      Recurso1 obj5;
        obj = new Recurso1();
        obj2 = new Recurso1();
        obj3 = new Recurso1();
        obj4 = new Recurso1();
        obj5=new Recurso1();
        
        
    System.out.println(""+obj.mostrarMensaje()); 
     double nota;
          Scanner teclado = new Scanner(System.in);
         System.out.print("Ingrese la nota:");
         nota=teclado.nextDouble();
          if (nota>=70){
        String mensaje2;
        String mensaje3;
         System.out.println(" "+nota+" " +obj2.nMensaje2());
         }
         else 
         if (nota<=69){
         System.out.println(" "+nota+" " +obj3.tMensaje3());
         
         double numero1 = 15;
         double numero2 = 5;
         double Resultado; 
         int i;
          if (numero2 != 0){
                Resultado = numero1 / numero2;
        
           
      
         Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese el valor de x:"); 
         i=sc.nextInt();
         for (int i=1; <=i; valo; i++)
            
         System.out.print( +obj5.mostrarValor());
        }
    
     public String mostrarMensaje()
           {
         return mensaje1;  
         }
         public String nMensaje2()
            {
         return mensaje2;
         }
   public String tMensaje3()
            {
         return mensaje3;
    }
    
    public int mostrarValor(int i)
             {
        
 return i;
   }
 public double mostrarResultado(double resultado)
             {

         return resultado;
         }

   
    }
   
   

   
    


   
    
    

    
       
       
     

        
     
     
    