package Aula5EHerenca.Aula5_E_Herança.dominio;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String numeroDeMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroDeMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        if (turno.equalsIgnoreCase("noite")) {
            return super.ganhoAnual() + (adicionalNoturno * 12);
        }
        return super.ganhoAnual();
    }
}