package projetos.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("BEM-VINDO(A) AO BANCO JINSEI!");

        System.out.print("Por favor, digite o seu nome\n-> ");
        String nome = scanner.next();

        System.out.print("Digite o seu sobrenome\n-> ");
        String sobrenome = scanner.next();
        String nomeCompleto = nome + " " + sobrenome;

        System.out.print("Digite o número da conta (ex: 1234)\n-> ");
        int conta = scanner.nextInt();

        System.out.print("Digite a agência (ex: 123-4)\n-> ");
        String agencia = scanner.next();

        System.out.print("Digite um valor que deseja depositar\n-> ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá, " + nomeCompleto + "! " + "obrigado por abrir a sua conta conosco!\nAqui estão as suas informações:\n- Nome Cliente: " + nomeCompleto + "\n- Agência: " + agencia + "\n- Conta: " + conta + "\n- Saldo: " + saldo + "\n\nO saldo já está disponível para saque.");
    }
}
