/*
 * EJERCICIO 01: Programa java que realice lo siguiente:
 *  declarar una variable N de tipo int,
 *  una variable A de tipo double y
 *  una variable C de tipo char y asigna a cada una un valor.
 *  A continuación muestra por pantalla: El valor de cada variable,
 *  la suma de N + A, la diferencia de A - N, el valor numérico correspondiente
 *  al carácter que contiene la variable C.
 * SPOILER ALERT: posible solución aquí.
    http://puntocomnoesunlenguaje.blogspot.com.es/2012/10/java-ejercicios-iniciales.html
 */
package cac.java.tdp;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
       int Dia;
       
       System.out.println("Ingrese un numero del 1 al 7: ");
       Dia= entrada.nextInt();
       
       if (Dia<1 && Dia>7){
           System.out.println("Error. Ingrese un numero del 1 al 7");
       }
           else {
                  if (Dia==1){
                      System.out.println("El dia de la semana es Lunes");
                                        } 
                  else{
                      if (Dia==2){
                          System.out.println("El dia de la semana es Martes");
                   
                      }
                      else {
                        if (Dia==3){
                        System.out.println("El dia de la semana es Miercoles");
                      }
                        else{
                            if (Dia==4){
                            System.out.println("El dia de la semana es Jueves");
                            }
                            else{
                                if (Dia==5){
                                System.out.println("El dia de la semana es Viernes");
                                }
                                else{
                                    if (Dia==6){
                                    System.out.println("El dia de la semana es Sabado");
                                    }
                                    else{
                                    if (Dia==7){
                                    System.out.println("El dia de la semana es Domingo");
                                    }
                                        }
                                }
                               }
                      }
                      }
                  }
                   }
    }

    }
    

