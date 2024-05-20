package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Jogo jogo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Usuários\\Jaum\\log.txt"))) {
            writer.write(jogo.getNome() + "\n");
            if(jogo.getPreco()<=0){
                throw new PrecoNegativoException("Preço muito baixo");
            }
            writer.write(jogo.getPreco() + "\n");
            writer.write(jogo.getGenero() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ler(ArrayList<Jogo> jogos){
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Usuários\\Jaum\\log.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Jogo jogo = new Jogo();
                jogo.setNome(line);
                jogo.setPreco(Double.parseDouble(reader.readLine()));
                jogo.setGenero(reader.readLine());
                jogos.add(jogo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
