//Meu pacote onde contém meus arquivos
package com.sistemaBancario;

//Importações que usei
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String [] args){
    //Criando uma Lista para armazenar os objetos da classe banco
    List<Banco> clientes = new ArrayList<>();

    //Criando Scanner
    Scanner scanner = new Scanner(System.in);

    //Variavel que ira controlar meu loop de opções
    String input;

    //Criando um loop para adicionar novos usuarios
    while(true){
        System.out.println("\n==== MENU ====");
            System.out.println("1. Cadastro de novo cliente");
            System.out.println("2. Listar clientes cadastrados");
            System.out.println("3. Excluir clientes cadastrados");
            System.out.println("4. Modificar cadastrados");
            System.out.println("5. Excluir todos os clientes");
            System.out.println("&. Encerrar programa");
            System.out.print("Escolha uma opção: ");

        input = scanner.nextLine();

        switch (input) {
            case "&":
                System.out.print("Programa encerrado");
                return;
            case "1":
            funcoes.cadastrarCliente(clientes, scanner);
            break;
            case "2":
            funcoes.listarClientes(clientes, scanner);
            break;
            case "3":
            funcoes.excluirCliente(clientes, scanner);
            funcoes.reajustarId(clientes);
            break;
            case "5":
            funcoes.excluirTodos(clientes, scanner);
        }
    }
    }
}