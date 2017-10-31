package prova;

public class TesteCarro {

    public static void main(String[] args) {

        Carro v1 = new Carro();
        v1.setCodigo(001);
        v1.setMarca("Ford");
        v1.setModelo("EcoSport");
        v1.setAno(2012);
        v1.setCor("Branco");
        v1.setLigado(false);
        v1.ligar();
        v1.setVelocidade(80);
        v1.setVelmax(140);
        v1.acelerar(30);
        v1.mostrar();
        v1.desacelerar(40);
        v1.mostrar();
        v1.acelerar(30);
        v1.mostrar();
        v1.desacelerar(20);
        v1.mostrar();
//      v1.desligar();

        
        Carro v2 = new Carro();
        v2.setCodigo(002);
        v2.setMarca("Chevrolet");
        v2.setModelo("Classic");
        v2.setAno(2008);
        v2.setCor("Prata");
        v2.setLigado(false);
        v2.ligar();
        v2.setVelocidade(90);
        v2.setVelmax(140);
        v2.acelerar(10);
        v2.mostrar();
        v2.desacelerar(50);
        v2.mostrar();
        v2.acelerar(30);
        v2.mostrar();
        v2.desacelerar(20);
        v2.mostrar();
//      v2.desligar();

        Carro v3 = new Carro(003);
        v3.mostrar();
        
        Carro v4 = new Carro(004, "Volks", "Gol");
        v4.mostrar();
        
        Carro v5 = new Carro("Chevrolet", "Captiva", 2010, "Branca", 180);
        v5.mostrar();
    }
}
