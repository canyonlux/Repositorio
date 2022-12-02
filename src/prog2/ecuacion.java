
package prog2;

import java.util.*;

public class ecuacion {
    //ruben garcia  (( Todo lo que está en comentarios son pruebas para sacar el bucle pero me ha sido imposible))
    
  
    
    public static void main (String[] args){
    Scanner entrada= new Scanner( System.in);
 //char finaliza;
//String fin;
 
  
       
    System.out.print("escribe el primer valor: ");
    double a =entrada.nextDouble();
    System.out.print("escribe el segundo valor: ");
    double b =entrada.nextDouble();
    System.out.print("escribe el tercer valor: ");
   double c =entrada.nextDouble();
   
   double x1;
   double x2;
   
   if (Math.pow(b,2)-(4*a*c) >0){
       
       
        x1= (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
    x2= (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
   
    System.out.println("resultado x1: "+x1);
    System.out.println("resultado x2: "+x2);
   }
   else if(Math.pow(b,2)-(4*a*c) ==0){
       
       x1= (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
    x2= (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
   
    System.out.println("Raices iguales, resultado x1: "+x1);
    System.out.println("Raices iguales, resultado x2: "+x2);} 
      
   else{ System.out.print ("Raices complejas");
   }
   

 

}
}
//entrada.nextLine();

//System.out.println("Desea resolver otra ecuacion de segundo grado?");

//while (finaliza != 's' && finaliza != 'n');
  //  System.out.println("Si desea continuar introduzca s, si no desea introduzca n");
    //fin=entrada.nextLine();
    //finaliza= fin.charAt(0);
    
//}
    
     //   }while(finaliza =='s');
    
    

