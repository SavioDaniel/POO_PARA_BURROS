package Aula53_E_Herança.dominio;

public class Rico extends Pessoa{
    private double dinheiro;

    public Rico(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String Ocupacao() {
        return "Faz Compras";
    }

}

