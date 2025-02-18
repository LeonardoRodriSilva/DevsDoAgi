package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        float gradeFinal;

        System.out.println("Digite sua nota final: ");
        Scanner sc = new Scanner(System.in);
        gradeFinal = sc.nextFloat();

        if (gradeFinal >= 6) {
            System.out.println("Você está aprovado!");
        }else if (gradeFinal < 6 && gradeFinal >= 4) {
            System.out.println("Você está de exame!");
        } else {
            System.out.println("Você está reprovado!");
        }

    }
}
