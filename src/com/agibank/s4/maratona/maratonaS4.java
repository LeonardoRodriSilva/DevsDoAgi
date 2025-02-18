package com.agibank.s4.maratona;
/*
Nota: 100 - 5
Nome do Dev: Leonardo Rodrigues da Silva
Nome do Tester: Ithalo Farias Mendes Silva
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class maratonaS4 {

    public static double calculaMedia(int ativo, double[][] precos) {
        double media = 0;
        for (int i = 0; i < 5; i++) {
            media += precos[ativo][i];
        }
        media /= 5;
        return media;
    }

    // Método que calcula a valorização de todas as empresas e retorna o vetor (genérico)

    public static double[] calculaValorizacao(double[][] precos) {
        double[] valorizacao = new double[3];
        for (int i = 0; i < 3; i++) {
            valorizacao[i] += (precos[i][4] - precos[i][0]) / precos[i][0] * 100;
        }
        return valorizacao;
    }

    // Método que analisa o vetor de valorização e retorna a maior valorização (específico)

    public static double calculaMaiorValorizacao(double[] valorizacao) {
        double maior = 0;
        for (int i = 0; i < 3; i++) {
            if (valorizacao[i] > maior)
                maior = valorizacao[i];
        }
        return maior;
    }

    public static double consultaValor(int dia, int ativo, double[][] precos) {
        double valorDia = precos[ativo][dia];
        return valorDia;
    }

    public static void main(String[] args) {
        double[][] precos = {
                {22.5, 23.0, 22.0, 24.5, 25.0},
                {85.0, 86.5, 84.0, 83.5, 87.0},
                {30.0, 29.5, 30.5, 31.0, 32.5}
        };

        double[] valorizacao = new double[3];
        double maiorValorizacao;

        boolean entradaValida = false;
        int ativo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("=".repeat(50));
        System.out.println();
        System.out.println("SIMULACAO DE CARTEIRA DE INVESTIMENTOS");
        System.out.printf("=".repeat(50));
        System.out.println();

        // Exibição da tabela para o usuário analisar previamente

        System.out.printf("| Ativo |");
        for (int i = 0; i < 5; i++) {
            System.out.printf(" Dia %d |", i + 1);
        }
        System.out.println();
        System.out.printf("| PETR4 |");
        for (int i = 0; i < 5; i++) {
            System.out.printf(" %.2f |", precos[0][i]);
        }
        System.out.println();
        System.out.printf("| VALE3 |");
        for (int i = 0; i < 5; i++) {
            System.out.printf(" %.2f |", precos[1][i]);
        }
        System.out.println();
        System.out.printf("| ITUB4 |");
        for (int i = 0; i < 5; i++) {
            System.out.printf(" %.2f |", precos[2][i]);
        }

        // Tela para selecionar o ativo no qual deseja calcular a média

        System.out.println();
        System.out.printf("=".repeat(50));
        System.out.println();
        System.out.println("Qual ativo deseja calcular a média?");
        System.out.println("1 - PETR4");
        System.out.println("2 - VALE3");
        System.out.println("3 - ITUB4");
        System.out.printf("=".repeat(50));
        System.out.println();

        // Tratamento de erros relacionados a entrada digitada pelo usuário

        while (!entradaValida) {
            try {
                ativo = sc.nextInt();
                if (ativo > 3 || ativo < 1) {
                    throw new IllegalArgumentException("Erro: valor inválido! Digite um valor existente na tabela.");
                }
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um valor válido!");
                sc.nextLine();
            }
        }

        // Lógica utilizada para exibir os valores conforme as escolhas do
        // usuário com a formatação adequada

        switch (ativo) {
            case 1:
                System.out.printf("A média do ativo PETR4 é de %.2f", calculaMedia(ativo - 1, precos));
                System.out.println();
                break;
            case 2:
                System.out.printf("A média do ativo VALE3 é de %.2f", calculaMedia(ativo - 1, precos));
                System.out.println();
                break;
            case 3:
                System.out.printf("A média do ativo ITUB4 é de %.2f", calculaMedia(ativo - 1, precos));
                System.out.println();
                break;
        }


        valorizacao = calculaValorizacao(precos);


        // Separação das telas para uma outra função

        maiorValorizacao = calculaMaiorValorizacao(valorizacao);
        System.out.printf("=".repeat(50));
        System.out.println();
        System.out.println("MAIOR VALORIZAÇÃO");

        if (maiorValorizacao == valorizacao[0])
            System.out.printf("Ativo com maior valorização --> PETR4 (de %.2f para %.2f, crescimento de %.2f%%)", precos[0][0], precos[0][4], valorizacao[0]);
        else if (maiorValorizacao == valorizacao[1])
            System.out.printf("Ativo com maior valorização --> VALE3 (de %.2f para %.2f, crescimento de %.2f%%)", precos[1][0], precos[1][4], valorizacao[1]);
        else if (maiorValorizacao == valorizacao[2])
            System.out.printf("Ativo com maior valorização --> ITUB4 (de %.2f para %.2f, crescimento de %.2f%%)", precos[2][0], precos[2][4], valorizacao[2]);

        System.out.println();
        System.out.printf("=".repeat(50));

        // Separação das telas para uma outra função

        System.out.println();
        System.out.println("LUCRO/PERDA DE CADA ATIVO");

        // Lógica implementada para os valores saírem formatados adequadamente
        // e de acordo com os valores de valorização

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0: {
                    if (valorizacao[0] > 0) {
                        System.out.printf("PETR4: Lucro (%.2f%%)", valorizacao[0]);
                        System.out.println();
                    }
                    else if (valorizacao[0] < 0) {
                        System.out.printf("PETR4: Prejuízo (%.2f%%)", valorizacao[0]);
                        System.out.println();
                    }
                    else {
                        System.out.printf("PETR4: Não alterou (%.2f%%)", valorizacao[0]);
                        System.out.println();
                    }
                    break;
                }

                case 1: {
                    if (valorizacao[1] > 0) {
                        System.out.printf("VALE3: Lucro (%.2f%%)", valorizacao[1]);
                        System.out.println();
                    }
                    else if (valorizacao[1] < 0) {
                        System.out.printf("VALE3: Prejuízo (%.2f%%)", valorizacao[1]);
                        System.out.println();
                    }
                    else {
                        System.out.printf("VALE3: Não alterou (%.2f%%)", valorizacao[1]);
                        System.out.println();
                    }
                    break;
                }

                case 2: {
                    if (valorizacao[2] > 0) {
                        System.out.printf("ITUB4: Lucro (%.2f%%)", valorizacao[2]);
                        System.out.println();
                    }
                    else if (valorizacao[2] < 0) {
                        System.out.printf("ITUB4: Prejuízo (%.2f%%)", valorizacao[2]);
                        System.out.println();
                    }
                    else {
                        System.out.printf("ITUB4: Não alterou (%.2f%%)", valorizacao[2]);
                        System.out.println();
                    }
                    break;
                }
                default:
                    break;
            }
        }
        System.out.printf("=".repeat(50));
        System.out.println();

        // Separação das telas para uma outra função

        // Reset da variável para repetir a lógica de tratamento de erros

        entradaValida = false;

        // Tela para selecionar o ativo no qual deseja consultar os valores

        System.out.println("CONSULTA DE PRECO DE ATIVO E DIA");
        System.out.println("Qual ativo deseja consultar?");
        System.out.println("1 - PETR4");
        System.out.println("2 - VALE3");
        System.out.println("3 - ITUB4");
        System.out.printf("=".repeat(50));
        System.out.println();

        // Tratamento de erros relacionados a entrada digitada pelo usuário

        while (!entradaValida) {
            try {
                ativo = sc.nextInt();
                if (ativo > 3 || ativo < 1) {
                    throw new IllegalArgumentException("Erro: valor inválido! Digite um valor existente na tabela.");
                }
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um valor válido!");
                sc.nextLine();
            }
        }

        System.out.printf("=".repeat(50));
        System.out.println();

        // Reset da variável para repetir a lógica de tratamento de erros
        entradaValida = false;
        int dia = 0;

        // Tela para selecionar o dia que deseja consultar o valor

        System.out.println("Qual dia deseja consultar?");
        System.out.println("1 - Dia 1");
        System.out.println("2 - Dia 2");
        System.out.println("3 - Dia 3");
        System.out.println("4 - Dia 4");
        System.out.println("5 - Dia 5");
        System.out.printf("=".repeat(50));
        System.out.println();

        // Tratamento de erros relacionados a entrada digitada pelo usuário

        while (!entradaValida) {
            try {
                dia = sc.nextInt();
                if (ativo > 5 || ativo < 1) {
                    throw new IllegalArgumentException("Erro: valor inválido! Digite um valor existente na tabela.");
                }
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um valor válido!");
                sc.nextLine();
            }
        }

        System.out.printf("=".repeat(50));
        System.out.println();

        // Lógica implementada para os valores saírem formatados adequadamente
        // e de acordo com os valores consultados
        // - esta andando 1 dia a mais

        switch (ativo) {
            case 1:
                System.out.printf("Consulta do preço do ativo PETR4 no dia %d --> %.2f", dia, consultaValor(dia - 1, ativo - 1, precos));
                System.out.println();
                break;
            case 2:
                System.out.printf("Consulta do preço do ativo VALE3 no dia %d --> %.2f", dia, consultaValor(dia - 1, ativo - 1, precos));
                System.out.println();
                break;
            case 3:
                System.out.printf("Consulta do preço do ativo ITUB4 no dia %d --> %.2f", dia, consultaValor(dia - 1, ativo - 1, precos));
                System.out.println();
                break;
        }

        System.out.printf("=".repeat(50));
        System.out.println();
        System.out.println("FIM DO PROGRAMA");


    }
}
