package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte escolha;

        System.out.println("=".repeat(60));
        System.out.println("Bem vindo ao seletor de investimentos!!");
        System.out.println("Selecione o investimento desejado abaixo:");
        System.out.println("=".repeat(60));
        System.out.println("1 - CDB");
        System.out.println("2 - CDI");
        System.out.println("3 - Tesouro Direto");
        System.out.println("4 - FII");
        System.out.println("=".repeat(60));
        System.out.println("Digite sua escolha:");

        escolha = sc.nextByte();

        switch (escolha) {
            case 1:
                System.out.println("=".repeat(60));
                System.out.println("Você escolheu o CDB!");
                break;
            case 2:
                System.out.println("=".repeat(60));
                System.out.println("Voce escolheu o CDI");
                break;
            case 3:
                System.out.println("=".repeat(60));
                System.out.println("Você escolheu o Tesouro Direto");
                break;
            case 4:
                System.out.println("=".repeat(60));
                System.out.println("Você escolheu o FII");
                break;
            default:
                System.out.println("=".repeat(60));
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Obrigado por utilizar os nossos sistemas!");
        sc.close();
    }
}
