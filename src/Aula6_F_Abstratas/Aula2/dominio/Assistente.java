package Aula6_F_Abstratas.Aula2.dominio;

public class Assistente extends Funcionario{
    public Assistente(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void calculaSalario() {
        System.out.println("Salario Base: " + salarioBase);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
