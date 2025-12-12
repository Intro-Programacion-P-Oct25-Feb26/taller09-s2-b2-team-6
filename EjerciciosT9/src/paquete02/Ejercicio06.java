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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Arreglos simples
        String[] cafes = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};

        // Acumuladores
        int t1 = 0, t2 = 0, t3 = 0;
        double s1 = 0, s2 = 0, s3 = 0;

        boolean seguir = true;

        while (seguir) {

            System.out.println("Seleccione una opción: \n1. Café tradicional"
                    + "\n2. Café francés\n3. Café alemán\n4. Salir");
            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("¿Cuántas tazas desea?");
                    int tazas1 = entrada.nextInt();
                    t1 = t1 + tazas1;
                    s1 = s1 + (tazas1 * precios[0]);
                    break;

                case 2:
                    System.out.println("¿Cuántas tazas desea?");
                    int tazas2 = entrada.nextInt();
                    t2 = t2 + tazas2;
                    s2 = s2 + (tazas2 * precios[1]);
                    break;

                case 3:
                    System.out.println("¿Cuántas tazas desea?");
                    int tazas3 = entrada.nextInt();
                    t3 = t3 + tazas3;
                    s3 = s3 + (tazas3 * precios[2]);
                    break;

                case 4:
                    seguir = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        }

        // Reporte final
        System.out.println("\nEl usuario ha comprado:\n");

        if (t1 > 0) {
            System.out.printf("%s (%d t), valor a cancelar $%.2f\n",
                    cafes[0], t1, s1);
        }

        if (t2 > 0) {
            System.out.printf("%s (%d t), valor a cancelar $%.2f\n",
                    cafes[1], t2, s2);
        }

        if (t3 > 0) {
            System.out.printf("%s (%d t), valor a cancelar $%.2f\n",
                    cafes[2], t3, s3);
        }

        double total = s1 + s2 + s3;
        System.out.printf("\nTotal a pagar: %.2f\n", total);
    }
}


