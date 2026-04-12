package Aula6_F_Abstratas.Aula3.dominio;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
