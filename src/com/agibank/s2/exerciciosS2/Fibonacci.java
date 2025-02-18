package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number, proximo, anterior = 0, atual = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            number = sc.nextInt();
        } while (number < 0);

        System.out.print(anterior);

        while (atual < number) {
            if (number == 1) {
                System.out.print(", " + atual);
                break;
            } else {
                System.out.print(", " + atual);
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }

        System.out.println();
        sc.close();
    }
}
