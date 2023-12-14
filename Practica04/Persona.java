package Practica04;

import java.util.Scanner;

public class Persona {

    private Scanner scanner;
    private String nombre;
    private int edad;

    public void inicializar() {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        edad = scanner.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void buscarMayor() {
        System.out.println(edad >= 18 ? nombre + " es mayor de edad" : nombre + " es menor de edad");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.inicializar();
        p1.imprimir();
        p1.buscarMayor();
    }
}
