package com.agibank.s3.exerciciosAulaMatriz;

import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] diagonal = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite os valores da %dª linha: ", i + 1);
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();

                if (i == j) {
                    diagonal[i] = matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nDiagonal da matriz:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", diagonal[i]);
        }
    }
}
