package Aula6_F_Abstratas.Aula2.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase = 1680;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract void calculaSalario();

    @Override
    public String toString() {
        String tipo = getClass().getSimpleName(); // Pega o nome da classe real (Vendedor, Gerente, Assistente)

        return "\n=========================================\n" +
                "        DADOS DO " + tipo.toUpperCase() + "         \n" +
                "=========================================\n" +
                "  • Nome:           " + nome + "\n" +
                "  • Matrícula:      " + matricula + "\n" +
                "  • Salário Base:   R$ " + String.format("%.2f", salarioBase) + "\n" +
                "=========================================\n";
    }
}
