package edu.kagejinsei.primeirasemana.javabasico.metodos.sistemasmarttv;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smarttTv = new SmartTv();

        smarttTv.diminuirVolume();
        smarttTv.diminuirVolume();
        smarttTv.diminuirVolume();
        smarttTv.aumentarVolume();

        System.out.println("Canal Atual: " + smarttTv.canal);
        smarttTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal Atual: " + smarttTv.canal);

        System.out.println("Volume Atual: " + smarttTv.volume);

        System.out.println("TV Ligada?: " + smarttTv.ligada);
        System.out.println("Canal Atual: " + smarttTv.canal);
        System.out.println("Volume Atual: " + smarttTv.volume);

        smarttTv.ligar();
        System.out.println("Novo Status -> TV Ligada?: " + smarttTv.ligada);
        smarttTv.desligar();
        System.out.println("Novo Status -> TV Ligada?: " + smarttTv.ligada);
    }
}
