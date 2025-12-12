/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int suma = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número:");
            numeros[i] = entrada.nextInt();

            suma = suma + numeros[i];  
        }

        
        double promedio = suma / 10.0;

        
        System.out.println("\nResultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            double diferencia = numeros[i] - promedio;

            System.out.printf("Número %d -> diferencia: %.2f\n",
                    numeros[i], diferencia);
        }
    }

}
