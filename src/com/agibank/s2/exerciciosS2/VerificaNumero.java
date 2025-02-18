package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar seu sinal: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.printf("O número %d é POSITIVO!", number);
        } else if (number < 0) {
            System.out.printf("O número %d é NEGATIVO!", number);
        } else {
            System.out.printf("O número %d é ZERO!", number);
        }
    }
}

