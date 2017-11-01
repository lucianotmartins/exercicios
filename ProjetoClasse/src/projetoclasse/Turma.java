package projetoclasse;

public class Turma {

    private String semestre;
    private Aluno aluno;
    private Professor professor;
    private Disciplina disciplina;

    public Turma(String semestre, Aluno aluno, Professor professor, Disciplina disciplina) {

        this.semestre = semestre;
        this.aluno = aluno;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void mostrar() {
        System.out.println("Semestre: " + this.getSemestre());
        System.out.println("Aluno: " + this.aluno.getNome());
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Disciplina: " + this.disciplina.getNome());
    }

//    @Override
//    public String toString() {
//        return "Turma{" + "semestre=" + semestre + ", aluno=" + aluno + ", professor=" + professor + ", disciplina=" + disciplina + '}';
//    }
}
