package Aula5EHerenca.Aula54.dominio;

public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(String marca, String modelo, double velocidade, int qtdPortas) {
        super(marca, modelo, velocidade);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Quantidade de portas: " + this.qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
