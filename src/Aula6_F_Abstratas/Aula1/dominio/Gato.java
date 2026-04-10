package Aula6_F_Abstratas.Aula1.dominio;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau Miau!");
    }
}
