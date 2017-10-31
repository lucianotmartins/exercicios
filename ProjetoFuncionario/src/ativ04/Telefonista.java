package ativ04;

public class Telefonista extends Funcionario {

    private int estacaoTrabalho;

    public Telefonista() {

    }

    public Telefonista(int estacaoTrabalho, int ramal, String usuario, String senha, int codigo, String nome, float salario) {
        super(codigo, nome, salario);
        this.estacaoTrabalho = estacaoTrabalho;
    }

    public int getEstacaoTrabalho() {
        return estacaoTrabalho;
    }

    public void setEstacaoTrabalho(int est) {
        this.estacaoTrabalho = est;
    }

    @Override
    public void mostrar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cod: " + this.getCod());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Estação: " + this.getEstacaoTrabalho());
//        System.out.println("Estação: " + this.getRamal());
        //        System.out.println("Usuário: " + this.getUsuario());
        //        System.out.println("Senha: " + this.getSenha());
        System.out.println("===============");
    }
}
