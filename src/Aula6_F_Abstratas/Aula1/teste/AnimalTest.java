package Aula6_F_Abstratas.Aula1.teste;

import Aula6_F_Abstratas.Aula1.dominio.Cao;
import Aula6_F_Abstratas.Aula1.dominio.Gato;


public class AnimalTest {
    public static void main(String[] args) {

        Cao cao = new Cao("Billy");
        Gato gato = new Gato("Chana");

        System.out.println(cao);
        cao.fazerSom();

        System.out.println("------------------------");

        System.out.println(gato);
        gato.fazerSom();
    }
}
