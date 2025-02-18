package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main4 {
    public static float[] calcularMediaMovel (float[] precos, int intervalo) {
        float[] mediaMovel = new float[intervalo];
        for (int i = 0; i < intervalo; i++) {
            for (int j = 0 + i; j < intervalo + i; j++) {
                mediaMovel[i] += precos[j];
            }
            mediaMovel[i] /= 3;
        }
        return mediaMovel;
    }

    public static void main(String[] args) {
        float[] precos = {100.0F, 102.0F, 101.0F, 103.0F, 105.0F};
        int intervalo;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Preços: { ");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%.2f, ", precos[i]);
        }
        System.out.printf("}\n");

        System.out.println("Digite o valor do intervalo:");
        intervalo = sc.nextInt();

        float[] mediaMovel = new float[intervalo];
        mediaMovel = calcularMediaMovel(precos, intervalo);

        System.out.printf("Média Movel: { ");
        for (int i = 0; i < mediaMovel.length; i++) {
            System.out.printf("%.2f, ", mediaMovel[i]);
        }
        System.out.printf("}");
    }
}
