package Ejercicio01;

import java.util.Scanner;

public class Ejer01 {

    public Ejer01(){
        System.out.println("Hola mundo");
    }
    
    public static void main(String[] args) {
        Ejer01 a=new Ejer01();
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum, prod;
        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        prod = num1 * num2;
        System.out.println("La suma de los numeros es: " + sum);
        System.out.println("El producto de los numeros es: " + prod);
    }
    
    
}
