package Dominio;

public class Cliente extends BaseInfo {
    
    //classe real atributos private
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente() {
        super();
    }

    public Cliente(int codigo, String nome, String email, String telefone, String cpf) {
        super(codigo, nome, email, telefone);
        this.cpf = cpf;
    }
}
