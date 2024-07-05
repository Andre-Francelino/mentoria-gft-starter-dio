package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }


    // método To String p/ exibir informações
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }


}
