package FakeDb;

import java.util.ArrayList;

import Dominio.Funcionario;

public class AddFuncionario extends BaseFakeDb<Funcionario>{

    @Override
    protected void preenchertabela() {
        //instancia a tabela
        this.tabelaFuncionarios = new ArrayList<Funcionario>();
        //adiciona a tableaFuncionario
        this.tabelaFuncionarios.add(new Funcionario(1, "Fabio alexandre", "fabio@gmail.com", "(67)xxxx-xxxx", "Vendedor", Double.valueOf(2500)));
        this.tabelaFuncionarios.add(new Funcionario(2, "Tania chaves", "tania@gmail.com", "(67)xxxx-xxxx", "chefe RH", Double.valueOf(3000)));
        this.tabelaFuncionarios.add(new Funcionario(3, "Audemir Lima", "mima@gmail.com", "(67)xxxx-xxxx", "Motorista", Double.valueOf(2500)));
        this.tabelaFuncionarios.add(new Funcionario(4, "Lucas Greff", "lucas@gmail.com", "(67)xxxx-xxxx", "Embalador", Double.valueOf(2500)));
        this.tabelaFuncionarios.add(new Funcionario(5, "Samara Paez", "samara@gmail.com", "(67)xxxx-xxxx", "Juridico", Double.valueOf(4000)));
        
    }

    public AddFuncionario(){
        super();
    }
    
}
