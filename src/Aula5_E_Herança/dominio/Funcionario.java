package Aula5_E_Herança.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;
    private final static int ANO = 12;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario += valor;
    }

    public double ganhoAnual(){
        return this.salario * ANO;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganho Anual: " + ganhoAnual());
    }
}
