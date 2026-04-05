package Aula2.B_Construtores.test;

import Aula2.B_Construtores.dominio.Personagem;

import java.util.Scanner;

public class PersonagemTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();

        System.out.print("What is your breed: ");
        String breed = sc.nextLine();

        System.out.print("What is your class: ");
        String job = sc.nextLine();

        Personagem personagem1 = new Personagem(name, breed, job);
        System.out.println("\n--------------------");
        System.out.println(personagem1.name);
        System.out.println(personagem1.breed);
        System.out.println(personagem1.job);
        personagem1.Carnivore();
        System.out.println("\n--------------------");
        Personagem personagem2 = new Personagem("Rebeca", "Human", "Archer");
        System.out.println(personagem2.name);
        System.out.println(personagem2.breed);
        System.out.println(personagem2.job);
        personagem2.Herbivore();

        sc.close();
    }
}
