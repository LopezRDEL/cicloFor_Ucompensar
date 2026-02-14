package com.mycompany.ciclofor;

import java.util.Scanner;

//Autor LopezRDEL

public class CicloFor {

    public static void main(String[] args) {
        
        //Declarar el scanner
        Scanner lector = new Scanner (System.in);
        
        //Declaracion de variables
        int sum=0, i, num=0;
        
        //Como es promedio (Division) sera de dato float
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
        
        //imprimir la suma de los numeros insertados
        System.out.println("La suma de los numeros es " + sum);
        
        //Calculando el promedio de los 10 numeros ingresados 
        promedio = num/10;
        
        //Imprimir los numeros insertados 
        System.out.println("El promedio de ellos es " + promedio );
    }
}
