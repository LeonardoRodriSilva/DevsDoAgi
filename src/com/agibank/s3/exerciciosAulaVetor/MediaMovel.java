package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        float[] precos = new float[7];
        Scanner sc = new Scanner(System.in);
        float mediaMovel = 0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o valor do ativo no dia %d: ", i + 1);
            precos[i] = sc.nextFloat();
        }
        for (int i = 4; i < 7; i++) {
            mediaMovel += precos[i];
        }

        System.out.printf("Média móvel dos últimos 3 dias: %.2f", mediaMovel / 3);
    }
}
