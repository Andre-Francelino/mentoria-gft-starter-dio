package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperdadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoVendedor = new Endereco(
                "Samuel Colt",
                "Próximo à antiga estação de trem.",
                "Portões"
        );
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Raquel Basan");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(2847.5d);
        vendedor.setEndereco(enderecoVendedor);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        OperdadorDeCaixa operdadorDeCaixa = new OperdadorDeCaixa(
                "Catarina Leal",
                "789.456.123-00",
                2500.77d,
                new Endereco("Primeira Opção", "Próximo à Caldeira.", "Boladão")
        );
        System.out.println(operdadorDeCaixa);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Pedro Lopes");
        gerente.setDocumento("456.123.789-10");
        Endereco enderecoGerente = new Endereco("Nova Guadalupe", "Próximo a Praça", "Aurora");
        gerente.setEndereco(enderecoGerente);
        gerente.setHorasTrabalhadas(36);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
        System.out.println("-----");

    }
}