package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main1 {
    public static float ConverterMoedaBRL_USD(float valorBRL, float taxaBRL_USD) {
        return valorBRL / taxaBRL_USD;
    }

    public static void main(String[] args) {
        float valorReal, taxaConversao, valorUSD;
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor em reais: ");
        valorReal = sc.nextFloat();

        System.out.println("Taxa de conversão: ");
        taxaConversao = sc.nextFloat();

        valorUSD = ConverterMoedaBRL_USD(valorReal, taxaConversao);

        System.out.printf("%.2f em reais equivale a %.2f em dólares.", valorReal, valorUSD);
    }

}
