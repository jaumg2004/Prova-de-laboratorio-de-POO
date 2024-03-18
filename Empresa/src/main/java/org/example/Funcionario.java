package org.example;

public class Funcionario {

    public int matricula;
    public Pessoa pessoa = new Pessoa();

    public Funcionario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public void mostrarInfo(){
        System.out.println("Matricula do funcionário: "+matricula);
        pessoa.mostrarInfo();
    }

}
