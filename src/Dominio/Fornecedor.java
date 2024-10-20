package Dominio;

public class Fornecedor extends BaseInfo{

    //classe real atributos privados
    private String rasaosocial;
    private String cnpj;

    public String getRasaosocial() {
        return rasaosocial;
    }
    public void setRasaosocial(String rasaosocial) {
        this.rasaosocial = rasaosocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Fornecedor() {
        super();
    }

    public Fornecedor(int codigo, String nome, String email, String telefone, String rasaosocial, String cnpj) {
        super(codigo, nome, email, telefone);
        this.rasaosocial = rasaosocial;
        this.cnpj = cnpj;
    } 
}
