package Aula7_G_Interface.Aula1.dominio;

public class Peixe implements Animal{
    @Override
    public void fazersom() {
        System.out.println("Blublublu");
    }

    @Override
    public void mover() {
        System.out.println("Nada Nada Nada");
    }
}
