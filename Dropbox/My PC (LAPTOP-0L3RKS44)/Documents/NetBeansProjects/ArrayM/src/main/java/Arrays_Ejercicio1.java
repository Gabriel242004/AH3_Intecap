/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabit
 */
public class Arrays_Ejercicio1 {
    public static void main(String[] args){
        int[] numerosP = new int[51]; 
        int vayuda = 0;
        
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                numerosP[vayuda]=i;
                vayuda++;
            }
        }
        for (int i = 0; i < numerosP.length; i++) {
            System.out.println(numerosP[i]);
        }
    }
    
    
}
