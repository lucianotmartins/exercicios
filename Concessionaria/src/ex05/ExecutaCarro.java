package ex05;

import java.text.DecimalFormat;

public class ExecutaCarro {

    DecimalFormat decimal = new DecimalFormat();

    public static void main(String[] args) {

        Carro v1 = new Carro();
        v1.setModelo("EcoSport");
        v1.setFabricante("Ford");
        v1.setpaisFabricacao("Estados Unidos");
        v1.setCor("Preto");
        v1.setPlaca("DFD-7475");
        v1.setAno(2014);
        v1.setnPortas(4);
        v1.setkmAtual(10000);
        v1.setPreco(50000);
        v1.mostrar();
        System.out.println("========");

        Carro v2 = new Carro();
        v2.setModelo("Classic");
        v2.setFabricante("Chevrolet");
        v2.setpaisFabricacao("Estados Unidos");
        v2.setCor("Prata");
        v2.setPlaca("EAY-5143");
        v2.setAno(2008);
        v2.setnPortas(2);
        v2.setkmAtual(136000);
        v2.setPreco(16000);
        v2.mostrar();
    }

}
