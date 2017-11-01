package projetoclasse;

public class ProjetoClasse {

    public static void main(String[] args) {

        Aluno a1[] = new Aluno[1];
        a1[0] = new Aluno("0001", "Análise e Desenvolvimento de Sistemas", "Luciano", 25, "M");
        a1[0].mostrar();

        Professor p1[] = new Professor[1];
        p1[0] = new Professor("Programação", 4000, "Ederson", 40, "M");
        p1[0].mostrar();
        p1[0].receberAum(100);
        p1[0].mostrar();

        Disciplina d1[] = new Disciplina[1];
        d1[0] = new Disciplina("POO", 80);
        d1[0].mostrar();

        Turma t1 = new Turma("1º Semestre", a1[0], p1[0], d1[0]);
        t1.mostrar();
        //System.out.println(t1.toString());

    }

}
