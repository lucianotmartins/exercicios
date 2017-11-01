package projetoclasse;

public class Disciplina {

    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrar() {
        System.out.println("Nome:" + this.getNome());
        System.out.println("Carga Horária:" + this.getCargaHoraria());
        System.out.println("====================");
    }

}
