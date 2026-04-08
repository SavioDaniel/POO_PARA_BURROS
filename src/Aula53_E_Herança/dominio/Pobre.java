package Aula53_E_Herança.dominio;

public class Pobre extends Pessoa{

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String Ocupacao() {
        return "Trabalha";
    }



}
