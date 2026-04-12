package Aula7_G_Interface.Aula1.dominio;

public class Cachorro implements Animal{
    @Override
    public void fazersom() {
        System.out.println("AU AU");
    }

    @Override
    public void mover() {
        System.out.println("Corre rapido igual doido");
    }
}
