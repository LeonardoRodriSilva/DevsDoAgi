package com.agibank.s4.exExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double[] calcularMediaMovel(double[] precos, int tamanhoVetor) {
        double MM;
        double[] mediaMovel = new double[tamanhoVetor - 2];

        for (int i = 0; i < tamanhoVetor - 2; i++) {
            MM = (precos[i] + precos[i + 1] + precos[i + 2]) / 3.0;
            mediaMovel[i] = MM;
        }

        return mediaMovel;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor = 0;
        boolean digitar = true;
        System.out.println("Digite o tamanho do vetor: ");
        do {
            try {
                tamanhoVetor = sc.nextInt();
                if (tamanhoVetor < 3)
                    throw new IllegalArgumentException("Erro: o tamanho do vetor é menor que 3");
                else
                    digitar = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (digitar);

        boolean entradaValida = false;

        double[] precos = new double[tamanhoVetor], mediaMovel;

        for (int i = 0; i < tamanhoVetor; i++) {
            while (!entradaValida) {
                try {
                    System.out.printf("Digite o preço do dia %d: \n", i + 1);
                    precos[i] = sc.nextDouble();
                    if (precos[i] <= 0) {
                        throw new IllegalArgumentException("Erro: o número digitado deve ser maior que 0");
                    }
                    entradaValida = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Erro: valor inválido. Digite um número válido");
                    sc.nextLine();
                }
            }
            entradaValida = false;
        }
        mediaMovel = calcularMediaMovel(precos, tamanhoVetor);

        for (int i = 0; i < tamanhoVetor - 2; i++) {
            System.out.printf("Média Móvel (dia %d): %.2f\n", i + 3, mediaMovel[i]);
        }
    }
}
