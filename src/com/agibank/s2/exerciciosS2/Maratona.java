package com.agibank.s2.exerciciosS2;

import java.util.Scanner;


//Programador: Leonardo Rodrigues
//Tester: Gabriel Favareto NOTA: 100

public class Maratona {
    public static void main(String[] args) {
        double velocidade, teta, gravidade = 9.8, x, y, tempo = 0.01;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os valores de velocidade e do" +
                " ângulo téta para o cálculo de sua trajetória!");
        System.out.println("Velocidade: ");
        velocidade = sc.nextFloat();
        System.out.println("Valor do ângulo téta: ");
        teta = sc.nextDouble();
        teta = Math.toRadians(teta);

        if (velocidade < 0.0 && teta > 0.0 || velocidade > 0.0 && teta < 0.0) {
            System.out.println("Não é possível realizar uma trajetória no qual a direção" +
                    " da velocida e do angulo são diferentes!");
        } else {
            do {
                x = (float) (velocidade * (Math.cos(teta)) * tempo);
                y = (float) ((float) (velocidade * (Math.sin(teta)) * tempo) -
                        (0.5 * gravidade * (Math.pow(tempo, 2))));
                System.out.printf("(%.2f, %.2f) - Tempo: %.2f\n", x, y, tempo);
                tempo += 0.01;
            } while (y > 0);
            System.out.printf("O projétil caiu no chão no tempo %.2f", (tempo - 0.02));
        }
    }
}