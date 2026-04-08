package Aula5EHerenca.Aula52_E_Herança.dominio;

public class Dog extends Animal{
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String emitirSom() {
        return  "AU AU AU AU";
    }

}
