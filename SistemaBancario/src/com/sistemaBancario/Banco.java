package com.sistemaBancario;
class Banco{
    private String usuario;
    private String conta;
    private Double saldo;

    //Construtor, sem o construtor o main não atribui os valores
    public Banco(String usuario, String conta, Double saldo) {
        this.usuario = usuario;
        this.conta = conta;
        this.saldo = saldo;
    }


    // Getters and Setters 
    public String getUsuario() {
        return usuario;
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
        return "Banco [usuario=" + usuario + ", conta=" + conta + ", saldo=" + saldo + "]";
    }
    

    
    
}

