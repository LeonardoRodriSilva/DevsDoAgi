package com.agibank.s4.exAulaMetodos;

import java.util.Random;
import java.util.Scanner;

public class Main10 {
    public static double[] simularPrecoMonteCarlo(double precoInicial, double mediaRetorno,
                                                  double volatilidadeDiaria, int periodos) {
        double[] precosPrevistos = new double[periodos];
        Random r = new Random();

        precosPrevistos[0] = precoInicial;
        for (int i = 1; i < periodos; i++) {
            precosPrevistos[i] = precosPrevistos[i-1] * Math.exp(mediaRetorno + volatilidadeDiaria * r.nextGaussian());
        }
        return precosPrevistos;
    }

    public static void main(String[] args) {
        double precoInicial, mediaRetorno, volatilidadeDiaria;
        int periodos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço Inicial: ");
        precoInicial = sc.nextDouble();
        System.out.println("Média do retorno diário");
        mediaRetorno = sc.nextDouble();
        System.out.println("Volatilidade diária: ");
        volatilidadeDiaria = sc.nextDouble();
        System.out.println("Períodos: ");
        periodos = sc.nextInt();

        double[] precos = new double[periodos];

        precos = simularPrecoMonteCarlo(precoInicial, mediaRetorno, volatilidadeDiaria, periodos);

        System.out.printf("{");
        for (int i = 0; i < periodos; i++) {
            System.out.printf(" %.2f,", precos[i]);

        }
        System.out.printf(" }");
    }
}
