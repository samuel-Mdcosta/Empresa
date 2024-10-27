package Visao;

import java.util.ArrayList;

import Dominio.Cliente;
import Servico.ClienteServico;

public class MostraCliente {
    private ClienteServico clsrv;

    public MostraCliente(){
        this.clsrv = new ClienteServico();
    }

    public void Criar(){
        Cliente cl = new Cliente();
        cl.setCodigo(0);
        cl.setCpf("xxx.xxx.xxx-xx");
        cl.setEmail("xxxx@gmail.com");
        cl.setNome("fulano de tal");
        cl.setTelefone("xxxx-xxxx");
        this.clsrv.Criar(cl);
        this.imprimirCliente(cl);
    }

    public void mostrarcliente(){
        ArrayList<Cliente> listacliente = this.clsrv.LerTodos();

        //exibe a tabela
        for (Cliente cliente : listacliente) {
            this.imprimirCliente(cliente);
        }
        
        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");
    }

        public void ExibirPorLinha(){
        ArrayList<Cliente> lista = this.clsrv.LerTodos();
        System.out.println("============================");
        for (Cliente cl : lista) {
            this.ImprimirEmLinha(cl);
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

    public void ImprimirEmLinha(Cliente cl){
        String msg = "Cliente - ";
        msg += "Nome" + cl.getNome() + " | ";
        msg += "Código: " + cl.getCodigo() + " | ";
        msg += "Email: " + cl.getEmail() + " | ";
        msg += "CPF: " + cl.getCpf() + " | ";
        msg += "Telefone" + cl.getTelefone() + " | ";
        System.out.println(msg);
    }

}
