package edu.kagejinsei.primeirasemana.javabasico.estruturascondicionais.switchcase.planooperadora;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram Ilimitado");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
