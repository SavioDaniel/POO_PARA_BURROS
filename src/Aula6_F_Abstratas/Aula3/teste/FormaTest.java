package Aula6_F_Abstratas.Aula3.teste;


import Aula6_F_Abstratas.Aula3.dominio.Circulo;
import Aula6_F_Abstratas.Aula3.dominio.Forma;
import Aula6_F_Abstratas.Aula3.dominio.Quadrado;

public class FormaTest {
    public static void main(String[] args) {

        Forma circulo = new Circulo("Círculo", 5.78);
        Forma quadrado = new Quadrado("Quadrado", 23.4);

        System.out.println(circulo);
        System.out.println("---------------------");
        System.out.println(quadrado);
    }
}
