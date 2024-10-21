package FakeDb;

import java.util.ArrayList;

import Dominio.Fornecedor;

public class AddFornecedor extends BaseFakeDb<Fornecedor> {

    @Override
    protected void preenchertabela() {
        //instancia a tabela
        this.tabelaFornecedores = new ArrayList<Fornecedor>();
        //adiciona a tabaleFornecedores
        this.tabelaFornecedores.add(new Fornecedor(1,"Frutila", "frutila@gmail.com", "(67)3333-3333", "frutila Bebidas ltda.", "XX. XXX. XXX/0001-XX"));
        this.tabelaFornecedores.add(new Fornecedor(2,"Pequi", "pequi@gmail.com", "(67)3333-3333", "Limpeza Pequi ltda.", "XX. XXX. XXX/0001-XX"));
        this.tabelaFornecedores.add(new Fornecedor(3,"Paquito", "paquito@gmail.com", "(67)3333-3333", "Graos santa clara ltda.", "XX. XXX. XXX/0001-XX"));
        this.tabelaFornecedores.add(new Fornecedor(4,"Sonora", "sonora@gmail.com", "(67)3333-3333", "acucar sonora ltda.", "XX. XXX. XXX/0001-XX"));
        this.tabelaFornecedores.add(new Fornecedor(5,"Primor", "primor@gmail.com", "(67)3333-3333", "Farinha primor ltda.", "XX. XXX. XXX/0001-XX"));
    }

    public AddFornecedor(){
        super();
    }
}
