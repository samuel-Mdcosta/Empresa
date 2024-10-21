package Visao;

import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Fornecedor;
import Dominio.Funcionario;
import FakeDb.AddCliente;
import FakeDb.AddFornecedor;
import FakeDb.AddFuncionario;

public class Pessoasvisao {
    
    public Pessoasvisao(){
    }

    public void motrar(){
        //instancia um novo objeto da classe
        AddCliente ac = new AddCliente();
        //puxa a tabela ja preenchida do fakedb
        ArrayList<Cliente> listacliente = ac.getTabelaClientes();

        //exibe a tabela
        for (Cliente cliente : listacliente) {
            System.out.println(" ");
            System.out.println("Cliente: ");
            System.out.println("Codigo: " + cliente.getCodigo());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
        }

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");


        //instancia um novo obheto da classe
        AddFornecedor af = new AddFornecedor();
        //puxa a tabela ja preenchida do fakedb
        ArrayList<Fornecedor> listafornecedor = af.getTabelaFornecedores();

        //exibe a tabela
        for (Fornecedor fornecedor : listafornecedor) {
            System.out.println(" ");
            System.out.println("Fornecedor: ");
            System.out.println("Codigo: " + fornecedor.getCodigo());
            System.out.println("CNPJ: " + fornecedor.getCnpj());
            System.out.println("Email: " + fornecedor.getEmail());
            System.out.println("Nome: " + fornecedor.getNome());
            System.out.println("Telefone: " + fornecedor.getTelefone());
            System.out.println("Razao Social: " + fornecedor.getRasaosocial());
        }

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");

        //instancia um novo obheto da classe
        AddFuncionario afun = new AddFuncionario();
        //puxa a tabela ja preenchida do fakedb
        ArrayList<Funcionario> listafuFuncionario = afun.getTabelaFuncionarios();
        
        //exibe a tabela
        for (Funcionario funcionario : listafuFuncionario) {
            System.out.println(" ");
            System.out.println("Funcionario: ");
            System.out.println("Codigo: " + funcionario.getCodigo());
            System.out.println("Salario: " + funcionario.getSalario());
            System.out.println("Email: " + funcionario.getEmail());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Cargo: " + funcionario.getCargo());
        }
    }

}
