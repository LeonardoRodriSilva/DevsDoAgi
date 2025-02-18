package com.agibank;

import java.util.Scanner;

public class maratonaEX2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade atual:");
        int idadeAtual = scanner.nextInt();

        System.out.println("Digite a contribuição mensal:");
        double contribuicaoMensal = scanner.nextDouble();

        System.out.println("Digite a taxa de juros anual:");
        double taxaJurosAnual = scanner.nextDouble();
        double taxaJurosMensal = (taxaJurosAnual / 100) / 12;

        System.out.println("Digite a idade o qual quer se aposentar:");
        int idadeAposentadoria = scanner.nextInt();

        int deltaIdadeMeses = (idadeAposentadoria - idadeAtual) * 12;
        double saldoAcumulado = 0;

        // Vetor para armazenar o saldo ao final de cada ano
        double[] contribuicaoAnual = new double[(deltaIdadeMeses / 12)];

        // Cálculo do saldo acumulado
        for (int i = 1; i <= deltaIdadeMeses; i++) {
            // Calcula o saldo acumulado mês a mês
            saldoAcumulado = saldoAcumulado * (1 + taxaJurosMensal) + contribuicaoMensal;

            // A cada 12 meses, salva o saldo acumulado no vetor
            if (i % 12 == 0) {
                int index = i / 12 - 1; // Índice para armazenar no vetor contribuicaoAnual
                contribuicaoAnual[index] = saldoAcumulado;
            }
        }

        // Exibe o saldo acumulado ao final de cada ano
        System.out.println("\nSaldos acumulados ao final de cada ano:");
        for (int i = 0; i < contribuicaoAnual.length; i++) {
            System.out.printf("Ano %d: %.2f\n", i + 1, contribuicaoAnual[i]);
        }

        scanner.close();
    }
}
