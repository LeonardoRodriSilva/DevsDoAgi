package com.agibank.s2.exerciciosS2;

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("*".repeat(60));
        System.out.println("Bem vindo ao sistema de avaliação do banco!");
        System.out.println("Digite seu nível de satisfação com os nossos " +
                "serviços abaixo:");
        System.out.println("*".repeat(60));
        System.out.println("5 - Muito satisfeito");
        System.out.println("4 - Satisfeito");
        System.out.println("3 - Mediano");
        System.out.println("2 - Ruim");
        System.out.println("1 - Muito ruim");
        System.out.println("0 - Horrível");
        System.out.println("*".repeat(60));
        System.out.println("Digite sua escolha: ");

        choice = sc.nextInt();

        switch (choice) {
            case 5:
                System.out.println("*".repeat(60));
                System.out.println("Muito bom ouvir isso, nosso objetivo" +
                        " é atender suas expectativas!");
                break;
            case 4:
                System.out.println("*".repeat(60));
                System.out.println("Obrigado pela resposta! Você teria algum " +
                        "feedback para nos incentivar a melhorar?");
                break;
            case 3:
                System.out.println("*".repeat(60));
                System.out.println("Obrigado por usufruir de nossos serviços! Podemos " +
                        "ajudar em algo mais?");
                break;
            case 2:
                System.out.println("*".repeat(60));
                System.out.println("Obrigado por nos avaliar! Você gostaria de nos " +
                        "informar sobre sua experiência negativa?");
                break;
            case 1:
                System.out.println("*".repeat(60));
                System.out.println("Obrigado pelo feedback! Você poderia" +
                        "nos dizer qual é a sua insatisfação?");
                break;
            case 0:
                System.out.println("*".repeat(60));
                System.out.println("Obrigado pelo retorno. Gostaríamos de entender" +
                        " sua situação para melhorar nossa conduta!");
                break;
            default:
                System.out.println("*".repeat(60));
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Obrigado por utilizar nossos sistemas!");
        sc.close();
    }
}
