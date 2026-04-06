package Aula5_E_Herança.dominio;

public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, String numeroDeMatricula, double bonus) {
        super(nome, salario, numeroDeMatricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + this.bonus;
    }
}
