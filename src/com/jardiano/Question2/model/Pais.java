package com.jardiano.Question2.model;

public class Pais {
    String nome;
    String capital;
    double dimensao;
    String[] fronteira = new String[10];

    //construtor que inicializa o nome, capital e dimensão do pais
    Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    //métodos de acesso para nome
    public String getNome() {
        return nome;
    }

    //métodos de acesso para capital
    public String getCapital() {
        return capital;
    }

    //métodos de acesso para dimensão
    public double getDimensao() {
        return dimensao;
    }

    //método para verificar se dois países são iguais
    public boolean equals(Pais p) {
        boolean ret = false;
        if ((this.nome.equals(p.getNome())) && (this.capital == p.getCapital())) {
            ret = true;
        }
        return ret;
    }

    //método para definir quais países fazem fronteira
    public void setFronteira(String[] fronteira) {
        this.fronteira = fronteira;
    }

    //método que retorna a lista de paises da fronteira
    public String[] getFronteira() {
        return fronteira;
    }
}