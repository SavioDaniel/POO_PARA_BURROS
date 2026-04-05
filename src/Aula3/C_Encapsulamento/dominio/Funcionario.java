package Aula3.C_Encapsulamento.dominio;

public class Funcionario {
    private String name;
    private int age;
    private String CPF;

    public Funcionario(String name, int age, String CPF) {
        this.name = name;
        setAge(age);
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.out.println("This age is not correct.");
        }else {
            this.age = age;
        }

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
