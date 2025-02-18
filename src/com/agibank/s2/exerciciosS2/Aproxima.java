package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Aproxima {
    public static void main(String[] args) {
        float mean, value, abs, percent;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o " +
                "valor referente a média e o valor que deseja saber a " +
                "percentual em relação a média");
        mean = sc.nextFloat();
        value = sc.nextFloat();



        abs = Math.abs(mean - value);
        percent = (abs / mean) * 100;
        System.out.printf("O valor se aproxima da média em %.2f%%", percent);
    }
}
