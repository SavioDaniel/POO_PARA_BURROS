package Aula6_F_Abstratas.Aula2.teste;

import Aula6_F_Abstratas.Aula2.dominio.Assistente;
import Aula6_F_Abstratas.Aula2.dominio.Gerente;
import Aula6_F_Abstratas.Aula2.dominio.Vendedor;

public class FuncionarioTeste {
    static void main(String[] args) {
        Assistente assistente = new Assistente("Savio", "PTN-5372");
        Gerente gerente = new Gerente("André", "JNG-6431");
        Vendedor vendedor = new Vendedor("Rebeca", "274263498");


        //Assistente Informações.
        System.out.println(assistente.toString());
        assistente.calculaSalario();

        //Gerente Informações
        System.out.println(gerente.toString());
        gerente.calculaSalario();

        //Gerente Vendedor
        System.out.println(vendedor.toString());
        vendedor.calculaSalario();
    }
}
