package org.example;

public abstract class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int poder;

    public Personagem(String nome, int vida, int energia, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void usarHabilidade(){
        System.out.println("Habilidade especial ativada");
    }

}
