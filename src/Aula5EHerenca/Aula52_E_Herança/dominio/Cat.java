package Aula5EHerenca.Aula52_E_Herança.dominio;

public class Cat extends Animal{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String emitirSom() {
        return "MIAU MIAU MIAU";
    }
}
