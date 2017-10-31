package ativ03;

public class Elevador {
    
    private int capacidade;
    private boolean porta;
    private int andares;
    private int subsolo;
    private int andar;
    private int lotacao;
    private boolean panico;
    
    public Elevador() {
        
    }
    
    public Elevador(int c, int a) {
        this.capacidade = c;
        this.andares = a;
    }
    
    public Elevador(int ca, boolean po, int an, int su, int a, int lo, boolean pa) {
        this.capacidade = ca;
        this.setPorta(false);
        this.andares = an;
        this.subsolo = su;
        this.andar = a;
        this.lotacao = lo;
        this.panico = pa;
    }
    
    public int getCapacidade() {
        if (this.capacidade > 1000) {
            this.setCapacidade(1000);
        }
        return capacidade;
    }
    
    public void setCapacidade(int c) {
        
        this.capacidade = c;
    }
    
    public boolean getPorta() {
        return porta;
    }
    
    public void setPorta(boolean p) {
        this.porta = p;
    }
    
    public int getAndares() {
        this.setAndares(50);
        return andares;
    }
    
    public void setAndares(int a) {
        this.andares = a;
    }
    
    public int getSubsolo() {
        this.setSubsolo(-5);
        return subsolo;
    }
    
    public void setSubsolo(int s) {
        this.subsolo = s;
    }
    
    public int getAndar() {
        if (this.andar < -5 || this.andar > 50) {
            this.setAndar(0);
        }        
        return andar;
    }
    
    public void setAndar(int a) {
        this.andar = a;
    }
    
    public int getLotacao() {
        if (this.lotacao > 10) {
            this.setLotacao(10);
        }
        return lotacao;
    }
    
    public void setLotacao(int l) {
        this.lotacao = l;
    }
    
    public boolean getPanico() {
        if (this.panico == true) {
            System.out.println("Botão de Emergência acionado");
        }
        return panico;
    }
    
    public void setPanico(boolean p) {
        this.panico = p;
    }
    
    public boolean abrirPorta() {
        this.setPorta(true);
        return true;
    }
    
    public boolean fecharPorta() {
        this.setPorta(false);
        return false;
    }
    
    public int subir(int n) {
        if (this.porta == false) {
            this.setAndar(getAndar() + n);
        } else {
            System.out.println("A porta está aberta! não é possivel subir");
        }
        return n;
    }
    
    public int descer(int n) {
        if (this.porta == false) {
            this.setAndar(getAndar() - n);
        } else {
            System.out.println("A porta está aberta! Não é possivel descer");
        }
        return n;
    }
    
    public void mostrar() {
        System.out.println("Capacidade: " + this.getCapacidade() + " KG");
        System.out.println("Porta: " + this.getPorta());
        System.out.println("Quantidade de Andares: " + this.getAndares());
        System.out.println("Quantidade de Subsolo: " + this.getSubsolo());
        System.out.println("Andar Atual: " + this.getAndar());
        System.out.println("Lotação: " + this.getLotacao());
        System.out.println("Panico: " + this.getPanico());
        System.out.println("==============//==========");
    }
}
