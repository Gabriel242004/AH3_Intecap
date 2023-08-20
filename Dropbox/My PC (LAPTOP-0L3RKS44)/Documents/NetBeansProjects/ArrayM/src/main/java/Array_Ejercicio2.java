/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabit
 */
public class Array_Ejercicio2 {
    public static void main(String[] args){
        
        int[] numerosImpares = new int[50]; 
        int vayuda = 0;

        for (int i = 1; i <= 100; i+=2) {
            numerosImpares[vayuda] = i;
            vayuda++;
        }

        
        for (int i =0; i < numerosImpares.length; i++) {
            System.out.println(numerosImpares[i]);
            
        }
        
        
    
    
    }
    
}
