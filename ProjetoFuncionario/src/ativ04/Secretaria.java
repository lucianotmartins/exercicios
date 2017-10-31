package ativ04;

public class Secretaria extends Funcionario {

    private int ramal;

    public Secretaria() {

    }

    public Secretaria(int ramal, String usuario, String senha, int cod, String nome, float salario) {
        super(cod, nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int r) {
        this.ramal = r;
    }

    @Override
    public void mostrar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cod: " + this.getCod());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Ramal: " + this.getRamal());
//        System.out.println("Usuário: " + this.getUsuario());
//        System.out.println("Senha: " + this.getSenha());
        System.out.println("===============");
    }
}
