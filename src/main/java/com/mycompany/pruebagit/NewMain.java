package com.mycompany.pruebagit;
import java.util.Scanner;

public class NewMain
{
    public static void main(String[] args) {
        int num1, num2, suma;
        System.out.println("Ingrese el primer número");
        Scanner ingreso = new Scanner(System.in);
        num1 = ingreso.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = ingreso.nextInt();
        suma = num1 +num2;
        System.out.println("El resultado es:" + suma);
    }    
}
