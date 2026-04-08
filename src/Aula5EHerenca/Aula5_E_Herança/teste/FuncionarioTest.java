package Aula5EHerenca.Aula5_E_Herança.teste;

import Aula5EHerenca.Aula5_E_Herança.dominio.Funcionario;
import Aula5EHerenca.Aula5_E_Herança.dominio.Assistente;
import Aula5EHerenca.Aula5_E_Herança.dominio.Tecnico;
import Aula5EHerenca.Aula5_E_Herança.dominio.Administrativo;

public class FuncionarioTest {
    public static void main(String[] args) {

        // 🔹 Funcionário comum
        Funcionario f1 = new Funcionario("Sávio", 2400);
        System.out.println("=== FUNCIONÁRIO ===");
        f1.exibeDados();

        System.out.println("\n");

        // 🔹 Assistente
        Assistente a1 = new Assistente("Maria", 2000, "A123");
        System.out.println("=== ASSISTENTE ===");
        a1.exibeDados();

        System.out.println("\n");

        // 🔹 Técnico (com bônus)
        Tecnico t1 = new Tecnico("João", 3000, "T456", 500);
        System.out.println("=== TÉCNICO ===");
        t1.exibeDados();
        System.out.println("Ganho anual com bônus: " + t1.ganhoAnual());

        System.out.println("\n");

        // 🔹 Administrativo (turno DIA)
        Administrativo admDia = new Administrativo("Ana", 2500, "ADM789", "dia", 300);
        System.out.println("=== ADMINISTRATIVO (DIA) ===");
        admDia.exibeDados();
        System.out.println("Ganho anual: " + admDia.ganhoAnual());

        System.out.println("\n");

        // 🔹 Administrativo (turno NOITE)
        Administrativo admNoite = new Administrativo("Carlos", 2500, "ADM999", "noite", 300);
        System.out.println("=== ADMINISTRATIVO (NOITE) ===");
        admNoite.exibeDados();
        System.out.println("Ganho anual com adicional: " + admNoite.ganhoAnual());
    }
}