package Aula1.A_classe_objeto.test;

import Aula1.A_classe_objeto.dominio.Cao;

public class CaoTest {
    static void main(String[] args) {
        Cao cao = new Cao();
        cao.name = "Billy";
        cao.breed = "Picher";
        cao.age = 11;

        System.out.println(cao.name);
        System.out.println(cao.breed);
        System.out.println(cao.age);
    }
}
