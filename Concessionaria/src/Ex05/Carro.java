package Ex05;

public class Carro {

    //Atributos
    private String modelo;
    private String fabricante;
    private String paisFabricacao;
    private String cor;
    private String placa;
    private int ano;
    private int nPortas;
    private float kmAtual;
    private double preco;

    //Construtor
    public Carro() {
    }

    //Getters e Setters  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getpaisFabricacao() {
        return paisFabricacao;
    }

    public void setpaisFabricacao(String paisFabricacao) {
        this.paisFabricacao = paisFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getnPortas() {
        return nPortas;
    }
    
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public float getkmAtual() {
        return kmAtual;
    }

    public void setkmAtual(float kmAtual) {
        this.kmAtual = kmAtual;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    public void mostrar() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("País de Fabricação: " + this.getpaisFabricacao());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Nº de Portas: " + this.getnPortas());
        System.out.println("Km Atual: " + this.getkmAtual());
        System.out.println("Preço R$: " + this.getPreco());
    }

}
