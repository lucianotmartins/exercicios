package ativ03;

public class Ativ03 {

    public static void main(String[] args) {

        Elevador p1 = new Elevador();
        Elevador p2 = new Elevador(800, 50);
        Elevador p3 = new Elevador(900, true, 50, -5, 8, 6, false);

        p1.setCapacidade(700);
//      p1.abrirPorta();
//      p1.mostrar();
//      p1.fecharPorta();
//      p1.mostrar();
        p1.subir(20);
        p1.descer(5);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

    }

}
