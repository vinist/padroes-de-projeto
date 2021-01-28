package model;

public class Cliente {
    
    private String nome;
    private Boolean vip;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Boolean getVip() {
        return vip;
    }
    
    public void setVip(Boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + ", vip=" + vip + '}';
    }
}
