package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
        float gasto, gastoTotal = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um gasto: ");
            gasto = sc.nextFloat();
            gastoTotal += gasto;

            if (gastoTotal > 5000) {
                System.out.println("Alerta! Seus gastos ultrapssaram R$5000!");
            }
        } while (gasto >= 0);
        System.out.printf("Total de gastos: R$%.2f", gastoTotal);
    }
}
