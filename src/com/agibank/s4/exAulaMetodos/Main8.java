package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main8 {
    public static float calcularJurosCompostos(float capitalInicial, float juros, int meses) {
        capitalInicial *= Math.pow(1 + juros, meses);
        return capitalInicial;
    }

    public static void main(String[] args) {
        float capitalInicial, juros, montante;
        int meses;
        Scanner sc = new Scanner(System.in);

        System.out.println("Capital Inicial: ");
        capitalInicial = sc.nextFloat();
        System.out.println("Juros: ");
        juros = sc.nextFloat();
        System.out.println("Meses: ");
        meses = sc.nextInt();

        montante = calcularJurosCompostos(capitalInicial, juros, meses);

        System.out.printf("O montate final é %.2f", montante);
    }
}
