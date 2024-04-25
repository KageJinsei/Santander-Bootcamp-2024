package edu.kagejinsei.primeirasemana.javabasico.anatomiaclasses.boletim;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;
        if (mediaFinal < 7)
            System.out.println("REPROVADO!");
        else if (mediaFinal == 7)
            System.out.println("PROVA MINERVA!");
        else
            System.out.println("APROVADO!");
    }
}
