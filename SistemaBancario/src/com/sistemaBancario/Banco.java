package com.sistemaBancario;
class Banco{
    private static int contadorId = 1;
    private int id = 1;
    private String usuario;
    private String conta;
    private Double saldo;

    //Construtor, sem o construtor o main não atribui os valores
    public Banco(String usuario, String conta, Double saldo) {
        this.id = contadorId++;
        this.usuario = usuario;
        this.conta = conta;
        this.saldo = saldo;
    }


    // Getters and Setters 
    public String getUsuario() {
        return usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
    //ToString para me imprimir o conteudo do meu codigo e no onde esta armazenado
    @Override
    public String toString() {
        return "Id: " + id + " Cliente: " + usuario + ", Numero da conta: " + conta + ", Saldo: " + saldo;
    }
    
}

