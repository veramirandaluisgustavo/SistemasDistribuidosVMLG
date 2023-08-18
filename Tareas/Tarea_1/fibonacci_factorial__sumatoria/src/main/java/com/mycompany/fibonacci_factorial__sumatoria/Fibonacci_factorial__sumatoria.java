/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci_factorial__sumatoria;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Fibonacci_factorial__sumatoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int decicion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir n");
            System.out.println("2. Calcular el Fibonacci");
            System.out.println("3. Calcular el factorial");
            System.out.println("4. Calcular la Sumatoria");
            System.out.println("5. Salir");
            
            decicion = sc.nextInt();

            switch (decicion) {
                case 1:
                    System.out.print("Introduce n: ");
                    n = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
                    break;
                case 3:
                    System.out.println("Factorial(" + n + ") = " + factorial(n));
                    break;
                case 4:
                    System.out.println("Sumatoria(" + n + ") = " + sumatoria(n));
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (decicion != 5);

        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int sumatoria(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Introducir x");
        int xnue = sc.nextInt();
        return n*xnue;
    }
}


