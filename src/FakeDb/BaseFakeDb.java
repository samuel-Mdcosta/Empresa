package FakeDb;

import java.util.ArrayList;

public abstract class BaseFakeDb<tDominio> {
    
    protected ArrayList<tDominio> tabelaClientes;
    //apenas leitura
    public ArrayList<tDominio> getTabelaClientes() {
        return tabelaClientes;
    }

    protected ArrayList<tDominio> tabelaFornecedores;
    //apenas leitura
    public ArrayList<tDominio> getTabelaFornecedores() {
        return tabelaFornecedores;
    }

    protected ArrayList<tDominio> tabelaFuncionarios;
    //apenas leitura
    public ArrayList<tDominio> getTabelaFuncionarios() {
        return tabelaFuncionarios;
    }
    
    //acao que vai ser executada toda vez que as filhas forem estanciada
    //acoes abstratas nao podem ter codigo 
    protected abstract void preenchertabela();

    public BaseFakeDb(){
        //toda vez que alguma acao dessa classe for chamada o preencherdados sera executado
        this.preenchertabela();
    }
}
