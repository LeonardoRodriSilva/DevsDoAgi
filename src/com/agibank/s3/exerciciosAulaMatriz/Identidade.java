package com.agibank.s3.exerciciosAulaMatriz;

public class Identidade {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
        }
        if (identidade) {
            System.out.printf("A matriz \n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%d ", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println("é uma identidade!");
        } else {
            System.out.printf("A matriz \n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%d ", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println("não é uma identidade!");
        }
    }
}
