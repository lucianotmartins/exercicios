package projetoclasse;

import java.text.DecimalFormat;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    private DecimalFormat df = new DecimalFormat("#0,000");
    
    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        this.especialidade = especialidade;
        this.salario = salario;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário R$: " + this.df.format(getSalario()));
        System.out.println("====================");
        
    }
    
    public int receberAum(int aum) {
        this.setSalario(this.getSalario() + aum);
        return aum;
    }
    
}
