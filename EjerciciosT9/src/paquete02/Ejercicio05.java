/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        double[] ventas = new double[5];

        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingrese las ventas del día %s: ", dias[i]);
            ventas[i] = entrada.nextDouble();
        }
        System.out.println("\nReporte de Ventas ");
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("- %s $%.2f\n", dias[i], ventas[i]);

        }

    }
}
