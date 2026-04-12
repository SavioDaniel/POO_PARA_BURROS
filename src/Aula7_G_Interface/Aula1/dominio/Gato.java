package Aula7_G_Interface.Aula1.dominio;

public class Gato implements Animal{
    @Override
    public void fazersom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void mover() {
        System.out.println("Anda igual caçador");
    }
}
