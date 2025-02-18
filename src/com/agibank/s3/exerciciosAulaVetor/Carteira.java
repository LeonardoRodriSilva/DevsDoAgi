package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class Carteira {
    public static void main(String[] args) {
        float[] acoes = new float[5], acoesPercentual = new float[5];
        float total = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < acoes.length; i++) {
            System.out.printf("Digite o valor investido da ação %d: ", i + 1);
            acoes[i] = sc.nextFloat();
            total += acoes[i];
        }

        for (int i = 0; i < acoes.length; i++) {
            acoesPercentual[i] = (acoes[i] / total) * 100;
        }

        System.out.printf("Total investido: R$%.2f\n", total);
        System.out.printf("Percentual de cada ação = ");
        for (int i = 0; i < acoes.length; i++) {
            if (i == 0)
                System.out.printf("{ %.2f%%, ", acoesPercentual[i]);
            else if (i == acoes.length - 1)
                System.out.printf(" %.2f%% }", acoesPercentual[i]);
            else
                System.out.printf(" %.2f%%, ", acoesPercentual[i]);
        }
    }
}
