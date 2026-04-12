package Aula6_F_Abstratas.Aula3.dominio;

public abstract class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Forma: " + nome +
                "\nÁrea: " + calcularArea();
    }

}
