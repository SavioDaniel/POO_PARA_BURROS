package Aula52_E_Herança.test;

import Aula52_E_Herança.dominio.Animal;
import Aula52_E_Herança.dominio.Cat;
import Aula52_E_Herança.dominio.Dog;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Cat("Chana", "Siames");
        Animal animal2 = new Dog("Billy", "Labrador");

        System.out.println("=== ANIMAL 1 ===");
        System.out.println(animal1);
        System.out.println(animal1.caminhar());
        System.out.println(animal1.emitirSom());

        System.out.println("\n====================\n");

        System.out.println("=== ANIMAL 2 ===");
        System.out.println(animal2);
        System.out.println(animal2.caminhar());
        System.out.println(animal2.emitirSom());
    }
}