package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogo> jogos = new ArrayList<>();
        Jogo jogo = new Jogo();
        Arquivo arquivo = new Arquivo();
        int Menu;

        System.out.println("Digite 1 para salvar um jogo, 2 para ler os dados do jogo, 3 para ordenar em ordem crescente, 4 para ordenar em ordem crescente, ou 5 para sair");

        Menu = scanner.nextInt();
        while(Menu!=5){
            switch (Menu){
                case 1:
                    System.out.println("Digite o nome do Jogo:");
                    String nome = scanner.nextLine();
                    jogo.setNome(nome);
                    System.out.println("Digite o preço do Jogo:");
                    double preco = scanner.nextDouble();;
                    jogo.setPreco(preco);
                    System.out.println("Digite o genero do Jogo:");
                    String genero = scanner.nextLine();
                    jogo.setGenero(genero);
                    jogos.add(jogo);
                    arquivo.escrever(jogo);
                    break;

                case 2:
                    arquivo.ler(jogos);
                    break;

                case 3:
                    Collections.sort(jogos);
                    for (Jogo jogo1 : jogos) {
                        System.out.println("Nome: "+jogo1.getNome());
                        System.out.println("Preço: "+jogo1.getPreco());
                        System.out.println("Genero: "+jogo1.getGenero());
                    }
                    break;

                case 4:
                    Collections.sort(jogos);
                    Collections.reverse(jogos);
                    for (Jogo jogo2 : jogos) {
                        System.out.println("Nome: "+jogo2.getNome());
                        System.out.println("Preço: "+jogo2.getPreco());
                        System.out.println("Genero: "+jogo2.getGenero());
                    }
                    break;
            }
        }

    }
}