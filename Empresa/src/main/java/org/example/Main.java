package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();
        int menu;
        int matricula;

        System.out.println("Escolha uma das opções abaixo para iniciar:");
        System.out.println("1 - Mostrar informações da empresa");
        System.out.println("2 - Adicionar funcionário");
        System.out.println("3 - Alocar funcionário");
        System.out.println("4 - Contar quantos funcionários estão disponiveis");
        System.out.println("5 - Fechar sistema");

        menu = scanner.nextInt();

        while(menu != 5){
            switch(menu){
                case 1:
                    empresa.mostrarInfo();
                    break;
                case 2:

                    System.out.println("Digite a matrícula do funcionário:");
                    matricula = scanner.nextInt();
                    funcionario.setMatricula(matricula);

                    empresa.addFuncionario(funcionario);

                    break;

                case 3:
                    matricula = scanner.nextInt();
                    empresa.alocarFuncionario(matricula);
                    break;
                case 4:
                    System.out.println("Apenas "+empresa.contarFuncionariosDisponiveis()+"% estão disponiveis");
                    break;
            }
            menu = scanner.nextInt();
        }
        System.out.println("Fechando o sistema!!");
    }
}
