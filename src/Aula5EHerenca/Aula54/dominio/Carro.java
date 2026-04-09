package Aula5EHerenca.Aula54.dominio;

public class Carro extends Veiculo{
    private int qtdPortas;

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
