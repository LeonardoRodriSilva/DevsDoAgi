package com.agibank.s3.exerciciosAulaMatriz;

import java.util.Scanner;

public class LocalizaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha, coluna, numero, linhaNumero = 0, colunaNumero = 0;

        System.out.println("Digite o número de linhas e colunas da matriz: ");
        linha = sc.nextInt();
        coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            System.out.printf("Digite os valores da %dª linha da matriz A: ", i + 1);
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Digite um número dentro da matriz para saber sua linha e coluna: ");
        numero = sc.nextInt();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == numero) {
                    linhaNumero = i;
                    colunaNumero = j;
                    break;
                }
            }
        }
        System.out.printf("O número %d está na linha %d e coluna %d!", numero,
                linhaNumero, colunaNumero);
    }
}
