package Aula2.B_Construtores.dominio;

public class Personagem {

    public String name;
    public String breed;
    public String job;

    public Personagem(String name, String breed, String job) {
        this.name = name;
        this.breed = breed;
        this.job = job;
    }

    public void Carnivore (){
        System.out.println("I am a meat eater.");
    }

    public void Herbivore(){
        System.out.println("I am a tree eater.");
    }
}
