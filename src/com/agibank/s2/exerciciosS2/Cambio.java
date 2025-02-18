package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        float valorBRL, valorUSD, conversao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Taxa de câmbio: 1 USD = 5 BRL");

        do {
            System.out.println("Digite o valor a converter: ");
            valorBRL = sc.nextFloat();

            if (valorBRL < 0) {
                System.out.println("O valor BRL não pode ser negativo");
                System.out.println("Digite o valor a converter: ");
                valorBRL = sc.nextFloat();
            }

            conversao += valorBRL;
            valorUSD = valorBRL / 5;
            System.out.printf("Você receberá: %.2f USD\n", valorUSD);
        } while (conversao < 1000);
        System.out.println("Erro: O limite diário de R$ 1000 foi ultrapassado!" +
                "Encerrando conversões.");
    }
}
