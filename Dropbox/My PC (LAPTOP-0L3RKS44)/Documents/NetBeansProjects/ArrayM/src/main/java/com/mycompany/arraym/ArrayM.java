/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraym;

import java.util.Scanner;
public class ArrayM {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        
        //int numeros [][] = new int[8][8];
        
        //numeros[1][1] = 5;
        //numeros[1][2] = 2;
        
        int numeros [][] = new int[3][5];
        //int ayuda = 64;
        
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingresa tu numero");
                numeros[i][j]=sp.nextInt();
                
               
           }
            
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                
                System.out.print(numeros[i][j]+ " | ");
               
           }
            System.out.println("\n-----------------------------");
        }
        
    }
}
