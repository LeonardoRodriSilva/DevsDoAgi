package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        float weight, height, imc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        weight = sc.nextFloat();
        System.out.println("Digite sua altura: ");
        height = sc.nextFloat();

        imc = weight / (height * height);

        System.out.printf("Seu IMC é de %.2f!\n", imc);
        if (imc < 18.5) {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação de magreza.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação normal de peso.");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação de sobrepeso.");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação de obesidade I.");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação de obesidade II.");
        } else {
            System.out.println("De acordo com seu IMC, " +
                    "você se encontra numa situação de obesidade III");
        }
    }
}
