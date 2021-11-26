
package Model;


public class Propriedade {
    private int id_empresa;
    private String cpf_user;
    private int quantidade;
    private double valor_uni;

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getCpf_user() {
        return cpf_user;
    }

    public void setCpf_user(String cpf_user) {
        this.cpf_user = cpf_user;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_uni() {
        return valor_uni;
    }

    public void setValor_uni(double valor_uni) {
        this.valor_uni = valor_uni;
    }

    
}
