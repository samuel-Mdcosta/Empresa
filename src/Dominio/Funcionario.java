package Dominio;

public class Funcionario extends BaseInfo {

    //classe real atributos privados
    private String cargo;
    private Double salario;
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Funcionario() {
        super();
    }

    public Funcionario(int codigo, String nome, String email, String telefone, String cargo, Double salario) {
        super(codigo, nome, email, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    
    
}
