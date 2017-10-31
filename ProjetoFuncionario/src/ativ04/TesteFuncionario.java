package ativ04;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setUsuario("bruno.rangel");
        g1.setSenha("123");
        g1.setCod(01);
        g1.setNome("Bruno");
        g1.setSalario(5000);
        g1.mostrar();
        g1.calculaBonificacao(100);
        g1.mostrar();

        Gerente g2 = new Gerente("paulo.ferreira", "456", 02, "Paulo", 6000);
        g2.mostrar();
        g2.calculaBonificacao(100);
        g2.mostrar();

        Secretaria s1 = new Secretaria();
        s1.setRamal(3370);
//        s1.setUsuario("dsa");
//        s1.setSenha("12331");
        s1.setCod(01);
        s1.setNome("Valeria");
        s1.setSalario(2500);
        s1.mostrar();

        Secretaria s2 = new Secretaria(3371, "sandra.escobar", "s2017", 02, "Sandra", 2500);
        s2.mostrar();
        s2.calculaBonificacao();
        s2.mostrar();

        Telefonista t1 = new Telefonista();
        t1.setEstacaoTrabalho(22);
//        t1.setRamal(3300);
//        t1.setUsuario();
        t1.setCod(01);
        t1.setNome("Giovana");
        t1.setSalario(1500);
        t1.mostrar();
        t1.calculaBonificacao();
        t1.mostrar();

        Telefonista t2 = new Telefonista(21, 3300, "maria.oliveira", "m2016", 02, "Maria", 1400);
        t2.mostrar();
        t2.calculaBonificacao();
        t2.mostrar();
    }

}
