/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabit
 */
public class Array_Ejercicio5 {
    public static void main(String[] args){
        int numeros[][]= new int [20][5];
        int ayuda = 1;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]= ayuda;
                ayuda++;
            }
                    
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                System.out.print(numeros[i][j] + " | ");
            }
          System.out.println("\n-----------------------------");  
        }
    }
    
}
