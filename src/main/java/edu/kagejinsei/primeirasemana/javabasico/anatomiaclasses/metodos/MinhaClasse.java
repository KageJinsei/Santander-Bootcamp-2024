package edu.kagejinsei.primeirasemana.javabasico.anatomiaclasses.metodos;

// Classe
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Kage";
        String segundoNome = "Jinsei";

        // Variável recebendo método com parâmetro
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
