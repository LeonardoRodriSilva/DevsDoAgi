package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        int number;

        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.printf("O número %d é PAR!", number);
        } else {
            System.out.printf("O número %d é ÍMPAR!", number);
        }
    }
}
