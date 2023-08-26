package com.funcionariosveiculos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.funcionariosveiculos.Application.Factory.BusinessLogicFactory;
import com.funcionariosveiculos.Application.Interfaces.IFuncionarioBLL;
import com.funcionariosveiculos.Domain.Models.Funcionario;

class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("-------------------------------");
            System.out.println("Digite a ação desejada:");
            System.out.println("1 - Funcionários");
            System.out.println("2 - Veículos");
            System.out.println("3 - Saída/Retorno de Veículos");
            System.out.println("0 - Sair");
            System.out.println("-------------------------------");

            String opcao = scanner.next();

            if (opcao.equals("1")) {
                MenuFuncionario();
            }
            else if (opcao.equals("2")) {
                MenuVeiculo();
            }
            else if (opcao.equals("3")) {
                MenuSaidaRetorno();
            }
            else if (opcao.equals("0")) {
                break;
            }
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void MenuFuncionario() {
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("Digite a ação desejada:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Retornar funcionário por identificador");
            System.out.println("4 - Alterar funcionário");
            System.out.println("5 - Apagar funcionário");
            System.out.println("0 - Voltar");
            System.out.println("-------------------------------");
            String opcao = scanner.next();

            if (opcao.equals("0")) {
                break; 
            }
            else {
                if (opcao.equals("1")) {
                    System.out.println("Qual o nome do novo funcionário?");
                    String nome = scanner.next();
                    Funcionario func = new Funcionario(nome);                    
                    IFuncionarioBLL funcBLL = BusinessLogicFactory.GetFuncionarioBLL();
                    funcBLL.CreateFuncionario(func);
                    System.out.println("Funcionário cadastrado com sucesso");
                }
                else if (opcao.equals("2")) {
                    IFuncionarioBLL funcBLL = BusinessLogicFactory.GetFuncionarioBLL();
                    List<Funcionario> funcionarios = funcBLL.GetFuncionarios();
                    for(Funcionario func : funcionarios) {
                        System.out.println(func.toString());
                    }
                }
                else if (opcao.equals("3")) {
                    System.out.println("Qual o Id do funcionário a ser retornado?");
                    String id = scanner.next();
                    try {
                        IFuncionarioBLL funcBLL = BusinessLogicFactory.GetFuncionarioBLL();
                        Funcionario func = funcBLL.GetFuncionario(Integer.parseInt(id));
                        if(func != null) {
                            System.out.println(func.toString());
                        } else {
                            System.out.println("Não existe funcionário com este Id");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Id com formato inválido");
                    }
                }
                else if (opcao.equals("4")) {
                    System.out.println("Qual o Id do funcionário a ser alterado?");
                    String id = scanner.next();
                    System.out.println("Qual o nome correto do funcionário?");
                    String nome = scanner.next();
                    try {
                        IFuncionarioBLL funcBLL = BusinessLogicFactory.GetFuncionarioBLL();
                        Funcionario func = new Funcionario(Integer.parseInt(id), nome, LocalDateTime.now());
                        funcBLL.UpdateFuncionario(func);
                        System.out.println("Funcionário alterado com sucesso");
                    } catch (NumberFormatException ex) {
                        System.out.println("Id com formato inválido");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                else if (opcao.equals("5")) {
                    System.out.println("Qual o Id do funcionário a ser apagado?");
                    String id = scanner.next();
                    try {
                        IFuncionarioBLL funcBLL = BusinessLogicFactory.GetFuncionarioBLL();
                        funcBLL.DeleteFuncionario(Integer.parseInt(id));
                        System.out.println("Funcionário removido com sucesso");
                    } catch (NumberFormatException ex) {
                        System.out.println("Id com formato inválido");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    public static void MenuVeiculo() {
        System.out.println("-------------------------------");
        System.out.println("Digite a ação desejada:");
        System.out.println("1 - Cadastrar veículo");
        System.out.println("2 - Listar veículos");
        System.out.println("3 - Retornar veículo por identificador");
        System.out.println("4 - Alterar veículo");
        System.out.println("5 - Apagar veículo");
        System.out.println("0 - Voltar");
        System.out.println("-------------------------------");
    }

    public static void MenuSaidaRetorno() {
        System.out.println("-------------------------------");
        System.out.println("Digite a ação desejada:");
        System.out.println("1 - Registrar saída de veículo");
        System.out.println("2 - Registrar entrada de veículo");
        System.out.println("0 - Voltar");
        System.out.println("-------------------------------");
    }
}
