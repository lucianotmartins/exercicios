package ativ04;

public abstract class Funcionario {

    private int cod;
    private String nome;
    private float salario;

    public Funcionario() {

    }

    public Funcionario(int c, String n, float s) {
        this.cod = c;
        this.nome = n;
        this.salario = s;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int c) {
        this.cod = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float s) {
        this.salario = s;
    }

    public void calculaBonificacao() {
        this.setSalario(this.getSalario() * 1.10f);
    }

    public abstract void mostrar();

}
