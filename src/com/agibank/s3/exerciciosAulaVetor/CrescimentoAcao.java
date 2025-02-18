package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class CrescimentoAcao {
    public static void main(String[] args) {
        float[] precos = new float[5];
        Scanner sc = new Scanner(System.in);
        float crescimento = 0, diario;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor do ativo referente ao dia %d: ", i + 1);
            precos[i] = sc.nextFloat();
        }

        for (int i = 1; i < 5; i++) {
            diario = (precos[i] - precos[i - 1]) / precos[i - 1];
            crescimento += diario;
        }
        System.out.printf("O crescimento percentual acumulado em 5 dias desse ativo" +
                " foi de %.2f", crescimento);
    }
}
