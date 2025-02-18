package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class MenorMaiorPreco {
    public static void main(String[] args) {
        float[] precos = new float[10];
        Scanner sc = new Scanner(System.in);
        float maior = 0, menor;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor da ação no dia %d: ", i + 1);
            precos[i] = sc.nextFloat();
        }
        maior = precos[0];
        menor = precos[0];

        for (int i = 0; i < 10; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
            if (precos[i] < menor) {
                menor = precos[i];
            }
        }

        System.out.printf("Maior preço registrado: R$%.2f\n", maior);
        System.out.printf("Menor preço registrado: R$%.2f\n", menor);

    }
}
