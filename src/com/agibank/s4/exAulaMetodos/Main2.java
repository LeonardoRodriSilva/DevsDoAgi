package com.agibank.s4.exAulaMetodos;

import java.util.Scanner;

public class Main2 {
    public static float calcularJurosSimples(float capitalInicial, float taxaJuros, int anos) {
        return capitalInicial + ((capitalInicial * taxaJuros) * anos);
    }

    public static void main(String[] args) {
        float capitalInicial, taxaJuros, montante;
        int anos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Capital: ");
        capitalInicial = sc.nextFloat();

        System.out.println("Taxa: ");
        taxaJuros = sc.nextFloat();

        System.out.println("Anos: ");
        anos = sc.nextInt();

        montante = calcularJurosSimples(capitalInicial, taxaJuros, anos);

        System.out.printf("Montante final: %.2f", montante);
    }
}
