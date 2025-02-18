package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        float saldo, saque;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        saldo = sc.nextFloat();

        do {
            System.out.println("Digite o valor do saque: ");
            saque = sc.nextFloat();

            if (saque < 0) {
                System.out.println("Saque nao pode ser negativo");
                System.out.println("Digite o valor do saque: ");
                saque = sc.nextFloat();
            }

            if (saque > saldo){
                System.out.println("Erro: saldo insuficiente!");
            } else {
                saldo -= saque;
                if (saldo > 0){
                    System.out.printf("Novo saldo: R$%.2f\n", saldo);
                } else {
                    System.out.println("Saldo zerado! Conta vazia.");
                    break;
                }
            }
        } while (saldo > 0);
    }
}
