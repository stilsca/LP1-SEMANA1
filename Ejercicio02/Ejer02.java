package Ejercicio02;

import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int num1,num2;
        System.out.println("Digite el primer numero: ");
        num1=scanner.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2=scanner.nextInt();
        if(num1>num2){
            System.out.println("Primer numero es mayor");
        }else if(num2>num1){
            System.out.println("Segundo numero es mayor");
        }else{
            System.out.println("Son iguales");
        }
        scanner.close();
    }
}
