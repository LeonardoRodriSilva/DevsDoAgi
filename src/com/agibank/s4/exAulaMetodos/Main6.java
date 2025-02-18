package com.agibank.s4.exAulaMetodos;

public class Main6 {
    public static double calcularVolatilidade(double[] retornosDiarios) {
        double media = 0, desvio = 0;

        for (int i = 0; i < retornosDiarios.length; i++) {
            media += retornosDiarios[i];
        }
        media /= retornosDiarios.length;

        for (int i = 0; i < retornosDiarios.length; i++) {
            desvio += Math.pow((retornosDiarios[i] - media), 2);
        }
        desvio /= retornosDiarios.length;
        desvio = Math.sqrt(desvio);

        return desvio;
    }

    public static void main(String[] args) {
        double[] retornos = {0.01F, 0.02F, -0.01F, 0.03F, -0.02F};
        double volatilidade;

        volatilidade = calcularVolatilidade(retornos);
        System.out.printf("Volatilidade = %.4f", volatilidade);

    }
}
