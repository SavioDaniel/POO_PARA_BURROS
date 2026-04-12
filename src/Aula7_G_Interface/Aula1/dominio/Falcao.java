package Aula7_G_Interface.Aula1.dominio;

public class Falcao implements Animal{
    @Override
    public void fazersom() {
        System.out.println("AAAAAAAA AAAAAAA");
    }

    @Override
    public void mover() {
        System.out.println("Voa bem alto");
    }
}
