package Aula3.C_Encapsulamento.test;

import Aula3.C_Encapsulamento.dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sávio", -24, "609.201.693-17");
        System.out.println(funcionario.toString());
        
    }
}
