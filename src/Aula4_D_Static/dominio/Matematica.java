package Aula4_D_Static.dominio;

public class Matematica {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static double areaDoQuadrado(double lado, double altura){
        return lado * altura;
    }

    public static double areaCirculo(double raio){
        return 3.14 * (raio * raio);
    }
}
