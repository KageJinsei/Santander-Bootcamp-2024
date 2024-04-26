package edu.kagejinsei.primeirasemana.javabasico.tiposvariaveis.strings;

public class Caracteres {
    public static void main(String[] args) {
        String nome = "Kage"; // String armazena caracteres
        String sobrenome = "Jinsei";
        String nomeCompleto = nome + " " + sobrenome;
        String endereco = "Rua Gwenhwy, 850, Salvador, Bahia, Brazil";

        System.out.println("Nome: " + nomeCompleto + " " + "\n" + "Endereço: " + endereco);
    }
}
