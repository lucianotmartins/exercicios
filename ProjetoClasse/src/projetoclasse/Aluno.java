package projetoclasse;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String matricula, String curso, String nome, int idade, String sexo) {
        this.matricula = matricula;
        this.curso = curso;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mostrar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("====================");
    }

}
