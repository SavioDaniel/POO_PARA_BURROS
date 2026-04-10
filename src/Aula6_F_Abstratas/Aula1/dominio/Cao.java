package Aula6_F_Abstratas.Aula1.dominio;

public class Cao extends Animal{

    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }
}
