/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02_ejercicio7;

import java.util.Scanner;

/**
 *
 * @author mohat
 */
public class Tarea02_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, x;
                
        System.out.println("----- num1(x) + num2 = 0 -----");
        System.out.println("");
        System.out.println("Introduce el operando 1: ");
        num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo operando: ");
        num2 = scanner.nextInt();
        
        x = num2/num1;
        
        System.out.println("El resultado de " + num1+"x"+"+"+num2+"=0 es: " + x);
        
    }
    
}
