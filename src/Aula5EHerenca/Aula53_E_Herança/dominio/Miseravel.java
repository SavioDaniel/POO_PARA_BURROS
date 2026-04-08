package Aula5EHerenca.Aula53_E_Herança.dominio;

public class Miseravel extends Pessoa {

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String Ocupacao() {
        // TODO Auto-generated method stub
        return "Mendiga";
    }

}