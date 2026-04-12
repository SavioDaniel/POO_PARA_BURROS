package Aula6_F_Abstratas.Aula3.dominio;

public class Circulo extends Forma{
    private double raio;
    private final double PI = 3.14159;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }
}
