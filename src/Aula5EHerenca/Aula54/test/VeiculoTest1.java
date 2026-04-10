package Aula5EHerenca.Aula54.test;

import Aula5EHerenca.Aula54.dominio.Carro;
import Aula5EHerenca.Aula54.dominio.Moto;
import Aula5EHerenca.Aula54.dominio.Veiculo;

public class VeiculoTest1 {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Fiat", "Uno", 120, 4);
        Veiculo moto = new Moto("Honda", "Fan", 140, 160);

        carro.acelerar(20);
        moto.acelerar(30);

        System.out.println(carro);
        System.out.println(moto);
    }
}
