/*
 * Ejercicio 14: Programa lea la longitud de los catetos de un triángulo
 * rectángulo y calcule la longitud de la hipotenusa según el
 * teorema de Pitágoras. 
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
        double Cateto1;
        double Cateto2;
        double Hipotenusa;
        
        Scanner entrada= new Scanner(System.in);
          
        System.out.println("Ingrese el valor del cateto 1: ");
        Cateto1= entrada.nextDouble();
        
        System.out.println("Ingrese el valor del cateto 2:");
        Cateto2= entrada.nextDouble();
        
        Hipotenusa=Math.sqrt(Math.pow(Cateto1, 2)+ Math.pow(Cateto2, 2));
        
        System.out.printf("La hipotenusa del triangulo es:%.2f\n",Hipotenusa);
        
    }
    
}
