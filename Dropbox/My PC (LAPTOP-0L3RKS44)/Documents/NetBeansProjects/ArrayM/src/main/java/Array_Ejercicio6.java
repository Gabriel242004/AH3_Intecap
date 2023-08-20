/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Array_Ejercicio6 {
    public static void main(String[] args){

        Scanner sp = new Scanner(System.in);
        String datos[] = {"Nombre", "Apellido", "Telefono", "Cumpleaños", "DPI"};

        String respuestas[] = new String[datos.length];

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Por favor ingrese su " + datos[i]);
            respuestas[i] = sp.nextLine();
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i] + " | " + respuestas[i]);
        }
    }
}
