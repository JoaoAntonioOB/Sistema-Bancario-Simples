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

    //Criando um loop para adicionar novos usuarios (Mais tarde implementar uma função Swit case para escolher implementar usuario, excluir...)
    for(int cont = 0; cont < 2; cont++){
        System.out.print("Informe seus dados");
        System.out.println("\nDigite o nome de usuario: ");
        String usuario = scanner.next();
        System.out.println("Digite o numero da conta: ");
        String conta = scanner.next();
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();


        //Banco cliente1 = new Banco("João", "5656", 564.50);
    }
        


    //Criando um cliente(Usuario) e suas informações
    Banco cliente1 = new Banco("João", "5656", 564.50);
    
    //Adicionando clientes a lista
    clientes.add(cliente1);
    
    System.out.print(clientes);

    }
}
