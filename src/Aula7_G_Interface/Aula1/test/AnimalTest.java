package Aula7_G_Interface.Aula1.test;

import Aula7_G_Interface.Aula1.dominio.Cachorro;
import Aula7_G_Interface.Aula1.dominio.Gato;
import Aula7_G_Interface.Aula1.dominio.Falcao;
import Aula7_G_Interface.Aula1.dominio.Peixe;

public class AnimalTest {
    public static void main(String[] args) {
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        Peixe p = new Peixe();
        Falcao f = new Falcao();

        g.fazersom();
        g.mover();
        System.out.println("-----------------------");
        c.fazersom();
        c.mover();
        System.out.println("-----------------------");
        p.fazersom();
        p.mover();
        System.out.println("-----------------------");
        f.fazersom();
        f.mover();
    }
}
