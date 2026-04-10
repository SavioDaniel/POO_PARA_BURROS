package Aula5EHerenca.Aula54.dominio;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, double velocidade, int cilindrada) {
        super(marca, modelo, velocidade);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cilindrada: " + this.cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
