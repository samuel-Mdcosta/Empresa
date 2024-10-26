package Visao;

import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Fornecedor;
import Dominio.Funcionario;
import Servico.ClienteServico;
import Servico.FornecedorServico;
import Servico.FuncionarioServico;

public class Pessoasvisao {
    
    public Pessoasvisao(){
    }

    public void motrar(){
        //instancia um novo objeto da classe
        //AddCliente ac = new AddCliente();
        //puxa a tabela ja preenchida do fakedb
        //ArrayList<Cliente> listacliente = ac.getTabelaClientes();

        //ClienteRepo repo = new ClienteRepo();
        //ArrayList<Cliente> listacliente = repo.ReadAll();

        ClienteServico clsrv = new ClienteServico();
        ArrayList<Cliente> listacliente = clsrv.LerTodos();

        //exibe a tabela
        for (Cliente cliente : listacliente) {
            this.imprimirCliente(cliente);
        }

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");


        //instancia um novo obheto da classe
        //FornecedorRepo forrepo = new FornecedorRepo();
        //puxa a tabela ja preenchida do fakedb
        //ArrayList<Fornecedor> listafornecedor = forrepo.ReadAll();

        FornecedorServico fornsrv = new FornecedorServico();
        ArrayList<Fornecedor> listafornecedor = fornsrv.LerTodos();

        //exibe a tabela
        for (Fornecedor fornecedor : listafornecedor) {
            this.imprimirFornecedor(fornecedor);
        }

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");

        //instancia um novo obheto da classe
        //FuncionarioRepo afun = new FuncionarioRepo();
        //puxa a tabela ja preenchida do fakedb
        //ArrayList<Funcionario> listafuFuncionario = afun.ReadAll();

        FuncionarioServico funsrv = new FuncionarioServico();
        ArrayList<Funcionario> listafuFuncionario = funsrv.LerTodos();
        
        //exibe a tabela
        for (Funcionario funcionario : listafuFuncionario) {
            this.imprimirFuncionario(funcionario);
        }
    }

    private void imprimirCliente(Cliente cliente){
        System.out.println(" ");
        System.out.println("Cliente: ");
        System.out.println("Codigo: " + cliente.getCodigo());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());

    }

    private void imprimirFornecedor(Fornecedor fornecedor){
        System.out.println(" ");
        System.out.println("Fornecedor: ");
        System.out.println("Codigo: " + fornecedor.getCodigo());
        System.out.println("CNPJ: " + fornecedor.getCnpj());
        System.out.println("Email: " + fornecedor.getEmail());
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Razao Social: " + fornecedor.getRasaosocial());
    }

    private void imprimirFuncionario(Funcionario funcionario){
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
