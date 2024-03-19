
package com.mycompany.tabuadadowhile;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class TabuadaDoWhile {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in); 
        
       int numero = 0;
       int tabuada = 1;
       
         System.out.print("Digite algum Nº para ver a sua tabuada: ");
         
         numero = teclado.nextInt();
         
         System.out.println("");
         
       do{
           System.out.println(numero + " x " + tabuada + " = " + (numero * tabuada)); 
           tabuada +=1;
           
       }while (tabuada <= 10);
    }
        
}

