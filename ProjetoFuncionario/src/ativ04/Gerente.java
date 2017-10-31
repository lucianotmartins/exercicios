package ativ04;

public class Gerente extends Funcionario {

    private String usuario;
    private String senha;

    public Gerente() {

    }

    public Gerente(String usuario, String senha, int cod, String nome, float salario) {
        super(cod, nome, salario);
        this.usuario = usuario;
        this.senha = senha;

    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String u) {
        this.usuario = u;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String s) {
        this.senha = s;
    }

    @Override
    public void mostrar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cod: " + this.getCod());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Usuário: " + this.getUsuario());
        System.out.println("Senha: " + this.getSenha());
        System.out.println("===============");
    }

    public float calculaBonificacao(float c) {
        this.setSalario(this.getSalario() * 0.60f + 100);
        return c;
    }

}
