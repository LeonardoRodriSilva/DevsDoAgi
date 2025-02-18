package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int number, fatorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial:");
        number = sc.nextInt();


        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial do número %d é igual a %d!", number, fatorial);
        sc.close();
    }
}
