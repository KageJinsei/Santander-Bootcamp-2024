package projetos.contabanco.operacoesbancarias;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.print("1. Depositar\n2. Sacar\n3. Consultar\n4. Encerrar\nSelecione uma opção: ");
            int opcao = scanner.nextInt();

            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o valor a ser depositado: ");
                    saldo = scanner.nextDouble();

                    System.out.println("\nSeu novo saldo é: " + saldo);
                    break;
                }
                case 2: {
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSacado = scanner.nextDouble();

                    if (valorSacado <= saldo) {
                        saldo = saldo - valorSacado;
                        System.out.println("\nValor sacado com sucesso! Novo saldo: " + saldo);
                        break;
                    } else
                        System.out.println("Saldo insuficiente!\n");
                    break;
                }
                case 3: {
                    System.out.println("Seu saldo é: " + saldo + "\n");
                    break;
                }
                case 4: {
                    System.out.println("Programa encerrado.");
                    return;
                }

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
