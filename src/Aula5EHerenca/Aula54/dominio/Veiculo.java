package Aula5EHerenca.Aula54.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected double velocidade;

    //Vai aumentar a velocidade conforme for acelerando
    public double acelerar(double aumentar){
        return velocidade += aumentar ;
    }

    public Veiculo(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    //Get e set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
