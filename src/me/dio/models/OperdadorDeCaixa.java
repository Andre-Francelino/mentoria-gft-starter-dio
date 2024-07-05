package me.dio.models;

public class OperdadorDeCaixa extends FuncionarioCLT {

    // método construtor vázio
    public OperdadorDeCaixa() {
    }

    // método construtor com atributos
    public OperdadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperdadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
