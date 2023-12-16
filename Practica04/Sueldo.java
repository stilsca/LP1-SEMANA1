package Practica04;

import java.util.Scanner;

public class Sueldo {

    private Scanner scanner;
    private int[] sueldos;

    public Sueldo() {
        scanner = new Scanner(System.in);
        sueldos = new int[5];
        //capturar();
        //mostrar();
    }

    private void capturar() {
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese sueldo en la posicion [" + (i+1) + "]: ");
            sueldos[i] = scanner.nextInt();
        }
    }

    private void imprimir() {
        int i=1;
        for (int sueldo : sueldos) {
            System.out.println("Sueldo en la posicion [" + (i++) + "]: " + sueldo);
        }
    }
    
    public static void main(String[] args) {
        Sueldo sueldo=new Sueldo();
        sueldo.capturar();
        sueldo.imprimir();
    }
}
