package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        float[] precosCompra = new float[5], precosVenda = new float[5];
        float lucro = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < precosCompra.length; i++) {
            System.out.printf("\nDigite o preço de compra do ativo %d: ", i + 1);
            precosCompra[i] = sc.nextFloat();
            System.out.printf("\nDigite o preço de venda do ativo %d: ", i + 1);
            precosVenda[i] = sc.nextFloat();
            lucro += precosVenda[i] - precosCompra[i];
        }

        System.out.printf("Lucro total = R$%.2f\n", lucro);
        if (lucro > 20000) {
            System.out.printf("Você deve pagar um imposto de R$%.2f", (lucro - 20000) * 0.15);
            System.out.printf("Lucro líquido = R$%.2f\n", lucro, lucro - (lucro - 20000) * 0.15);
        }
        else
            System.out.println("Sem imposto devido.");
    }
}
