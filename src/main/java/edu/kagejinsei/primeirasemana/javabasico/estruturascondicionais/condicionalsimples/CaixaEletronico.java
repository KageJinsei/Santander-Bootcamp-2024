package edu.kagejinsei.primeirasemana.javabasico.estruturascondicionais.condicionalsimples;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 62.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor sacado: " + valorSolicitado + " | Novo saldo: " + saldo);
        } else
            System.out.println("Saldo insuficiente!\nValor desejado: " + valorSolicitado + " | Saldo atual: " + saldo);
    }
}
