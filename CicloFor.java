/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclofor;

import java.util.Scanner;

/**
 *
 * @author DiegoEstebanLopezRic
 */
public class CicloFor {

    public static void main(String[] args) {
        
        //Declarar el scanner
        Scanner lector = new Scanner (System.in);
        //Declaracion de variables
        int sum=0, i, num=0;
        float promedio;
        //Peticion
        System.out.println("Ingrese 10 numeros ");
        
        //Ciclo for para acumular los numeros
        for ( i = 0; i < 10; i++) {
            
        // El num que inicia en 0 ira acumulandolos y guardandolos en el lector (Scanner)
            num = lector.nextInt();
            
            //Imprimir la suma de todos los numeros    
            sum = sum + num;   
            
             
        }
        System.out.println("La suma de los numeros es " + sum);
        
        promedio = num/10;
        
        System.out.println("El promedio de ellos es " + promedio );
    }
}
