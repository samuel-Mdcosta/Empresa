package FakeDb;

import java.util.ArrayList;

import Dominio.Cliente;

public class AddCliente extends BaseFakeDb<Cliente> {

    @Override
    protected void preenchertabela() {
        //instancia a tabela
        this.tabelaClientes = new ArrayList<Cliente>();
        //adiciona um novo cliente ao arraylist tabelacliente
        this.tabelaClientes.add(new Cliente(1, "Mariana Assato", "mariana@gmail.com", "(67)xxxx-xxxx", "xxx.xxx.xxx-xx"));
        this.tabelaClientes.add(new Cliente(2, "Miguel Costa", "miguel@gmail.com", "(67)xxxx-xxxx", "xxx.xxx.xxx-xx"));
        this.tabelaClientes.add(new Cliente(3, "Caue Assato", "caue@gmail.com", "(67)xxxx-xxxx", "xxx.xxx.xxx-xx"));
        this.tabelaClientes.add(new Cliente(4, "fulano de tal", "fulano@gmail.com", "(67)xxxx-xxxx", "xxx.xxx.xxx-xx"));
        this.tabelaClientes.add(new Cliente(5, "ciclano da silva", "ciclano@gmail.com", "(67)xxxx-xxxx", "xxx.xxx.xxx-xx"));

    }

    public AddCliente(){
        super();
    }
}
