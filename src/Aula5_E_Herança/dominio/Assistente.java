package Aula5_E_Herança.dominio;

public class Assistente extends Funcionario{
    private String numeroDeMatricula;

    public Assistente(String nome, double salario, String numeroDeMatricula) {
        super(nome, salario);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Número de matricula: " + this.numeroDeMatricula);
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
}
