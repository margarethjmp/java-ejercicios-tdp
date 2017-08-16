/*
 * Ejercicio 26: Programa que lea un carácter y compruebe si es un
 * número (Carácter entre '0' y '9'). 
 */
package cac.java.tdp;

import java.util.Scanner;
/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        String Num;
        
        System.out.println("Ingrese un numero del 0 al 9: ");
        Num= entrada.next();
        
        byte num2 = Byte.parseByte(Num);
        
        
        
    }
        
        
        
    }
    
}
