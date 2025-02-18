package com.agibank.s3.exerciciosAulaMatriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite os valores da %d linha: ", i + 1);
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2)
                    System.out.printf("%d ",  matriz[i][j]);
                else
                    System.out.printf("%d \n",  matriz[i][j]);
            }
        }
    }
}
