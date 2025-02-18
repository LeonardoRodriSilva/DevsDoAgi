package com.agibank.s3.exerciciosAulaVetor;

public class Juros {
    public static void main(String[] args) {
        float[] valores = new float[6];
        float P = 1000f;
        float r = 0.02f;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = P * (float) Math.pow(1 + r, i);
        }

        System.out.print("{ ");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f", valores[i]);
            if (i < valores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
