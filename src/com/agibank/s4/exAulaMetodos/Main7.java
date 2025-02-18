package com.agibank.s4.exAulaMetodos;

public class Main7 {
    public static float simularCarteira(float[] valores, float[] retornos) {
        float valorFinal = 0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] *= (1 + retornos[i]);
            valorFinal += valores[i];
        }
        return valorFinal;
    }

    public static void main(String[] args) {
        float[] valores = { 1000.0F, 2000.0F, 1500.0F};
        float[] retornos = { 0.05F, 0.03F, 0.04F};
        float valorFinal;

        valorFinal = simularCarteira(valores, retornos);

        System.out.printf("Valor final da carteira é: %.2f", valorFinal);


    }
}
