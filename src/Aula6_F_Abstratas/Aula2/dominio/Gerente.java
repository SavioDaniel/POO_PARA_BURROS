package Aula6_F_Abstratas.Aula2.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void calculaSalario() {
        System.out.println("Salario Basé: " + (salarioBase * 2));
    }
}
