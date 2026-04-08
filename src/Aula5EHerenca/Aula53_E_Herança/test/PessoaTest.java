package Aula5EHerenca.Aula53_E_Herança.test;


import Aula5EHerenca.Aula53_E_Herança.dominio.Miseravel;
import Aula5EHerenca.Aula53_E_Herança.dominio.Pessoa;
import Aula5EHerenca.Aula53_E_Herança.dominio.Pobre;
import Aula5EHerenca.Aula53_E_Herança.dominio.Rico;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa rica = new Rico("Savio", 24, 25000);
        Pessoa pobre = new Pobre("Rebeca", 20);
        Pessoa miseravel = new Miseravel("Claudio", 40);


        System.out.println(rica.Ocupacao());
        System.out.println(pobre.Ocupacao());
        System.out.println(miseravel.Ocupacao());
    }

}

