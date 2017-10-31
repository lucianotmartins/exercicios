package prova;

public class Carro {

    public int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;
    private boolean flex;
    private int velocidade;
    private int velmax;

    public Carro() {

    }

    public Carro(int codigo) {
        this.codigo = codigo;
    }

    public Carro(int codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo, int ano, String cor, int velmax) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velmax = velmax;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getFlex() {
        flex = true;
        return flex;
    }

    public void setFlex(boolean flex) {
        this.flex = flex;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;

    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public int acelerar(int a) {
        if (this.ligado == true) {
            velocidade += a;
            if (velocidade > velmax) {
                velocidade = velmax;
            }

        } else {
            velocidade = 0;
            velmax = 0;
        }

        return velocidade;
    }

    public int desacelerar(int d) {
        if (this.ligado == true) {
            if (velocidade > 0) {
                velocidade -= d;
            }
            if (velocidade < 0) {
                velocidade = 0;
                this.ligado = false;
            }

        } else {
            velocidade = 0;
            velmax = 0;
        }
        return velocidade;
    }

    public void ligar() {
        if (this.ligado == false);
        this.ligado = true;

    }

    public void desligar() {
        if (this.ligado == true);
        this.ligado = false;
        velocidade =0;
        velmax=0;
    }

    public void mostrar() {

        System.out.println("Código: " + this.getCodigo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Flex: " + this.getFlex());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Velocidade Máxima: " + this.getVelmax());
        System.out.println("=====//======");

    }

}
