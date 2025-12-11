/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String dato;
        int n;
        String[] arreglo1;

        System.out.println("¿Cuántas marcas desea ingresar?");
        n = entrada.nextInt();
        entrada.nextLine();

        arreglo1 = new String[n];

        for (int i = 0; i < arreglo1.length; i++) {

            System.out.println("Ingrese una marca:");
            dato = entrada.nextLine();

            String letra = dato.substring(0, 1);
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println("Marca no válida (empieza con A, C o T)."
                            + " Intente otra.");
                    i--;
                    break;
                default:
                    arreglo1[i] = dato;
            }
        }

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("\nLA MARCA INGREESADA ES:\nMarca: %S -> %d",
                     arreglo1[i], i);
        }
    }
}
