package com.agibank.s3.exerciciosAulaVetor;

public class AltaQueda {
    public static void main(String[] args) {
        float[] precos = {1.3f, 4.0f, 5.0f, 2.1f, 0.5f, 2.3f, 5.5f, 6.4f, 3.9f, 2.5f};
        int alta= 0, queda = 0;

        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i+1] > precos[i])
                alta++;
            else
                queda++;
        }

        System.out.println("Valores: ");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%.2f, ", precos[i]);
            if (i == precos.length - 1)
                System.out.printf("%.2f\n", precos[i]);
        }

        System.out.printf("Dias de alta = %d\n", alta);
        System.out.printf("Dias de queda = %d\n", queda);
    }
}
