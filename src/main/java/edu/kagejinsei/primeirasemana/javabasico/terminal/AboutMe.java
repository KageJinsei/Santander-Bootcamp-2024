package edu.kagejinsei.primeirasemana.javabasico.terminal;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo dados do usuário
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
