package com.agibank.s3.exerciciosAulaMatriz;

import java.util.Scanner;

public class Diagonais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, somaPrincipal = 0, somaSecundaria = 0;

        System.out.println("Digite o número da dimensão da matriz: ");
        n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite os valores da %dª linha: ", i + 1);
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", matriz[i][i]);
            somaPrincipal += matriz[i][i];
        }

        System.out.println("\nDiagonal secundário: ");
        for (int i = 0; i < n; i++) {
            int c = (n - 1) - i;
            System.out.printf("%d ", matriz[i][c]);
            somaSecundaria += matriz[i][c];
        }
        System.out.printf("\nA soma da diagonal principal é %d e da secundária é %d!", somaPrincipal,
                somaSecundaria);
    }
}
