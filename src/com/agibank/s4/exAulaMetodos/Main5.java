package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main5 {
    public static float compararAtivos(float retorno1, float retorno2) {
        if (retorno1 > retorno2)
            return retorno1;
        else
            return retorno2;
    }

    public static void main(String[] args) {
        float retorno1, retorno2, maior;
        Scanner sc = new Scanner(System.in);

        System.out.println("Retorno ativo 1: ");
        retorno1 = sc.nextFloat();

        System.out.println("Retorno ativo 2: ");
        retorno2 = sc.nextFloat();

        maior = compararAtivos(retorno1, retorno2);

        if (maior == retorno1)
            System.out.printf("O ativo com maior retorno é o 1!");
        else
            System.out.printf("O ativo com maior retorno é o 2!");
    }
}
