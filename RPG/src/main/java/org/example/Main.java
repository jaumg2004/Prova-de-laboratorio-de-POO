package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu;

        Arma armaAssasino = new Arma("Tesoura", 10);
        Arma armaGuerreiro = new Arma("Espada", 100);

        Guerreiro guerreiro = new Guerreiro("Lancelot",500, 100, 20, armaGuerreiro);
        Assasino assasino = new Assasino("Jack",250, 100, 10, armaAssasino);
        Mago mago = new Mago("Merlin", 250, 100, 50);

        System.out.println("Escolha uma das opções a baixo:\n"+"1-Mostrar informações do mago\n"+"2-Mostrar informações do assasino\n"+"3-Mostrar informações do guerreiro");
        System.out.println("4-Atacar usando o mago\n"+"5-Atacar personagem");
        menu=scanner.nextInt();
        scanner.nextLine();

        while(menu!=6){
            switch(menu){
                case 1:
                    System.out.println("Nome: "+mago.getNome());
                    System.out.println("Vida: "+mago.getVida());
                    System.out.println("Energia: "+mago.getEnergia());
                    System.out.println("Poder: "+mago.getPoder());
                    break;

                case 2:
                    System.out.println("Nome: "+assasino.getNome());
                    System.out.println("Vida: "+assasino.getVida());
                    System.out.println("Energia: "+assasino.getEnergia());
                    System.out.println("Poder: "+assasino.getPoder());
                    System.out.println(assasino.toString());
                    break;

                case 3:
                    System.out.println("Nome: "+guerreiro.getNome());
                    System.out.println("Vida: "+guerreiro.getVida());
                    System.out.println("Energia: "+guerreiro.getEnergia());
                    System.out.println("Poder: "+guerreiro.getPoder());
                    System.out.println(guerreiro.toString());
                    break;
                case 4:
                    mago.usarHabilidade();

                    break;
                case 5:
                    System.out.println("Escolha qual persogame vai atacar:\n"+"1-Assasino\n"+"2-Guerreiro");
                    int M=scanner.nextInt();
                    switch(M){
                        case 1:
                            assasino.atacarPersonagem(guerreiro);
                            break;
                        case 2:
                            guerreiro.atacarPersonagem(assasino);
                            break;
                    }
                    break;
            }
            menu=scanner.nextInt();
        }

    }
}