package com.agibank.s4.exAulaMetodos;

public class Main9 {
    public static double calcularCorrelacao(double[] serie1, double[] serie2) {
        double cor, cov = 0, media1 = 0, media2 = 0;
        for (int i = 0; i < serie1.length; i++) {
            media1 += serie1[i];
            media2 += serie2[i];
        }

        media1 /= serie1.length;
        media2 /= serie2.length;

        for (int i = 0; i < serie1.length; i++) {
            cov += ((serie1[i] - media1) * (serie2[i] - media2)) / serie1.length;
        }

        cor = cov / (Main6.calcularVolatilidade(serie1) * Main6.calcularVolatilidade(serie2));
        return cor;
    }

    public static void main(String[] args) {
        double[] serie1 = { 100.0, 102.0, 104.0, 106.0};
        double[] serie2 = { 50.0, 51.0, 52.0, 53.0};
        double cor;
        cor = calcularCorrelacao(serie1, serie2);

        System.out.printf("Correlação: %.2f", cor);

    }
}
