package com.agibank.s3.exerciciosAulaVetor;

import java.util.Scanner;

public class Drawdown {
    public static void main(String[] args) {
        float[] precos = new float[10];
        float maximo = 0, drowDown = 0, aux, minimo = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Digite o valor do ativo no dia %d: ", i + 1);
            precos[i] = sc.nextFloat();
        }

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > maximo)
                maximo = precos[i];
            else {
                aux = ((precos[i] - maximo) / maximo) * 100;
                if (aux < drowDown) {
                    drowDown = aux;
                    minimo = precos[i];
                }
            }
        }

        System.out.printf("O maior drowDown foi de %.2f", drowDown);
        System.out.printf("\nOBS: A maior queda ocorreu do pico %.2f" +
                " para o mínimo %.2f", maximo, minimo);
    }
}
