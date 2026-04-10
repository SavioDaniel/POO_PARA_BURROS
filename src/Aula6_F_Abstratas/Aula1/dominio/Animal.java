package Aula6_F_Abstratas.Aula1.dominio;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();

    @Override
    public String toString() {
        return nome + ", está dormindo";
    }
}
