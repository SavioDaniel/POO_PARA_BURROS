package Aula6_F_Abstratas.Aula2.dominio;

import java.util.Scanner;

public class Vendedor extends Funcionario{
    private double comissao = 45;

    public Vendedor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void calculaSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas comissões o vendedor vai receber? ");
        int quantidadeComissoes = scanner.nextInt();

        double totalComissoes = comissao * quantidadeComissoes;
        double salarioTotal = salarioBase + totalComissoes;

        System.out.println("Comissão por venda: R$ " + comissao);
        System.out.println("Quantidade de vendas: " + quantidadeComissoes);
        System.out.println("Total de comissões: R$ " + totalComissoes);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Salário total: R$ " + salarioTotal);
    }
}