package org.example;

public class Assasino extends Personagem {

    private Arma arma;

    public Assasino(String nome, int vida, int energia, int poder, Arma arma) {
        super(nome, vida, energia, poder);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacarPersonagem(Personagem personagem){
        System.out.println("Atacar "+personagem.getNome()+" com "+arma.getNome());
    }

}
