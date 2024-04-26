package edu.kagejinsei.primeirasemana.javabasico.operadores.relacional;

public class OperadorRelacional {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual a número 2?: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de número 2?: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que número 2?: " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor que número 2?: " + simNao);
    }
}
