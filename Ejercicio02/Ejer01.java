package Ejercicio02;

import java.util.Scanner;

public class Ejer01 {
    static String RED ="\033[31m";
    static String GREEN ="\033[32m";
    static String RESET ="\u001B[0m";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float ingreso,irp=80000000;
        
        System.out.println(RESET+"Digite el ingreso anual: ");
        ingreso=scanner.nextFloat();
        
        if(ingreso>irp){
            System.out.println(RED+"Debe abonar IRP el siguiente año");
        }else{
            System.out.println(GREEN+"No abona IRP");
        }
        
        scanner.close();
        System.out.println(RESET);
    }
}
