package Aula5EHerenca.Aula54.dominio;

public class Moto extends Veiculo{
    private int cilindrada;


    @Override
    public String toString() {
        return super.toString() +
                ", Quantidade de portas: " + this.cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
