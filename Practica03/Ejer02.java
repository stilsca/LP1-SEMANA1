package Practica03;

import java.util.Scanner;

public class Ejer02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla, resul;
        for (tabla = 1; tabla < 11; tabla++) {
            System.out.println("----------------------------- ");
            System.out.println("Mostrando la tabla del  " + tabla);
            System.out.println("------------------------------ ");
            for (int i = 1; i < 11; i++) {
                resul = tabla * i;
                System.out.println(tabla + "x" + i + "=" + resul);
            }
        }

        scanner.close();
    }
}
