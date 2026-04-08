package Aula5EHerenca.Aula52_E_Herança.dominio;

public class Animal {
    protected String name;
    protected String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String emitirSom() {
        return "Som genérico";
    }

    public String caminhar() {
        return name + " está caminhando";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}
