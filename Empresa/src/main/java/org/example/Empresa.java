package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Empresa {


        public String nome = "Inatel";
        public String cnpj = "24.492.886/0001-04";
        public String endereco = "Avenida João de Camargo, 510";
        public int funcionariosDisponiveis = 0;
        Funcionario funcionario[] = new Funcionario[5];
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        Empresa() {
        }

        public void mostrarInfo(){
                System.out.println("Nome da empresa: "+nome);
                System.out.println("Endereço da empresa: "+endereco);
                System.out.println("CNPJ da empresa: "+cnpj);
                for(int i = 0; i<5; i++){
                        funcionario[i].mostrarInfo();
                }
        }

        public void addFuncionario(Funcionario funcionario){

                for(int i = 0; i<5; i++){
                        if(funcionario[i]==null){
                                System.out.println("Digite o nome do funcionário novo:");
                                pessoa.nome = scanner.nextLine();

                                System.out.println("Digite o cpf do funcionário novo:");
                                pessoa.cpf = scanner.nextLine();

                                System.out.println("Digite a idade do funcionário novo:");
                                pessoa.idade = scanner.nextInt();

                                funcionario[i] = Funcionario(pessoa);

                                funcionariosDisponiveis++;

                                break;
                        }
                        else{
                                System.out.println("Vaga já foi preenchida");
                        }
                }
        }

        public void alocarFuncionario(int index){
                for(int i = 0; i<5; i++){
                        if(index == funcionario[i].matricula){
                                funcionariosDisponiveis--;
                        }
                }
        }

        public float contarFuncionariosDisponiveis(){
                return funcionariosDisponiveis*100/5;
        }

}