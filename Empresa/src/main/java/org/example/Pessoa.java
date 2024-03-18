package org.example;

public class Pessoa {

    public String nome;
    public String cpf;
    public int idade;

    public Pessoa() {
    }

    public void mostrarInfo(){

        System.out.println("Nome do funcionario: "+nome);
        System.out.println("CPF do funcionario: "+cpf);
        System.out.println("Idade do funcionario: "+idade);

    }

}
