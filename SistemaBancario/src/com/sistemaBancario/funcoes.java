package com.sistemaBancario;

import java.util.List;
import java.util.Scanner;

public class funcoes {
    //Melhoria implementar try/catch
    //Metodo para cadastrar um modificar Cliente
    public static void cadastrarCliente(List<Banco> clientes, Scanner scanner){
        try{
        //Pergunta e recolhe os dados do usuario
        System.out.print("Informe seus dados");
        System.out.println("\n\nDigite o nome de usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite o numero da conta: ");
        String conta = scanner.nextLine();
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();
        
        //Cria o objeto cliente e adiciona ele a lista de clientes
        Banco cliente1 = new Banco(usuario, conta, saldo);
        clientes.add(cliente1);

        //Informa que o cadastro foi efetuado com sucesso.
        System.out.print("Cliente cadastrado com sucesso.");
        scanner.nextLine();
        }
        catch(Exception e){
            System.out.print("Erro ao cadastrar cliente. Certifique-se de digitar os dados corretamente.");
        }

    }

    //Lista os cliente dentro da lista
    public static void listarClientes(List<Banco> clientes, Scanner scanner){
        try{
        System.out.println("-----Lista de clientes cadastrados-----");

        if(clientes.isEmpty()){
            System.out.print("Nenhum cliente cadastrado.");
        } 
        else{
        for(Banco cliente : clientes){
            System.out.println("Id: " + cliente.getId()+ " | Nome: " + cliente.getUsuario() + 
                                   " | Conta: " + cliente.getConta() + 
                                   " | Saldo: R$ " + cliente.getSaldo());
            }
        }
        scanner.nextLine();
        } catch(Exception e){
            System.out.print("Erro ao listar os clientes.");
        }
    }

    //Excluir cliente
    public static void excluirCliente(List<Banco> clientes, Scanner scanner){
        try{
        if(clientes.isEmpty()){
            System.out.print("Nenhum cliente para excluir");
        } else{
            System.out.print("Digite o Id do cliente a excluir: ");
            int excluir = scanner.nextInt();
            clientes.remove(excluir - 1);
            System.out.print("Cliente excluido com sucesso!");
            }
            scanner.nextLine();
            } catch(Exception e){
                System.out.print("Erro ao excluir cliente. Certifique-se de digitar os dados corretamente.");
            }
        }
    
    //Reajusta os ids dos clientes quando algum é excluido
    public static void reajustarId(List<Banco> clientes){
        int novoId = 1;
        for(Banco cliente : clientes){
            cliente.setId(novoId++);
        }
    }

    //Modificar cadastro
    public static void modificarCadastro(List<Banco> clientes, Scanner scanner){
        try{
        System.out.print("Digite o id do cliente a modificar cadastro: ");
        int idModificar = scanner.nextInt();
        scanner.nextLine();
        clientes.get(idModificar -1);

        Banco clienteModificar = null;
        for(Banco cliente : clientes){
            if(cliente.getId() == idModificar){
                clienteModificar = cliente;
                break;
            }
        }
        if(clienteModificar == null){
            System.out.print("Cliente não encontrado");
        }

        //Mudando os atributos do cliente
        System.out.print("Nome atual: " + clienteModificar.getUsuario() + "\nDigite o novo nome de usuario: ");
        String usuarioNovo = scanner.nextLine();
        clienteModificar.setUsuario(usuarioNovo);
        System.out.println("Conta atual: " + clienteModificar.getConta() + "\nDigite a nova conta: ");
        String contaNova = scanner.nextLine();
        clienteModificar.setConta(contaNova);
        System.out.print("Saldo atual: " + clienteModificar.getSaldo() + "\nDigite o novo saldo: ");
        Double saldoNovo = scanner.nextDouble();
        clienteModificar.setSaldo(saldoNovo);

        System.out.print("Dados modificados com sucesso");
        scanner.nextLine();
        } catch(Exception e){
            System.out.print("Erro ao modificar cliente. Certifique-se de digitar os dados corretamente.");
        }
    }

    //Excluir todos os clientes
    public static void excluirTodos(List<Banco> clientes, Scanner scanner){
        try{
        clientes.clear();
        System.out.print("Todos os clientes excluidos com sucesso.");
        scanner.nextLine();
        } catch(Exception e){
            System.out.print("Erro ao excluir todos os cliente. Certifique-se de digitar os dados corretamente.");
        }
    }
}
