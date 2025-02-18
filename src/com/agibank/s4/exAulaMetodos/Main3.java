package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main3 {
    public static float calcularCrescimento(float precoAcao1, float precoAcao2) {
        return ((precoAcao2 - precoAcao1) / precoAcao1) * 1000;
    }

    public static void main(String[] args) {
        float preco1, preco2, crescimento;
        Scanner sc = new Scanner(System.in);

        System.out.println("Preco no dia 1: ");
        preco1 = sc.nextFloat();

        System.out.println("Preco no dia 2: ");
        preco2 = sc.nextFloat();

        crescimento = calcularCrescimento(preco1, preco2);

        System.out.printf("Crescimento: %.2f%%", crescimento);
    }
}
