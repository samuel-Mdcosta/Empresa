package Visao;

import java.util.ArrayList;

import Dominio.Fornecedor;
import Servico.FornecedorServico;

public class MostraFornecedor {
    private FornecedorServico fornsrv;

    public MostraFornecedor(){
        this.fornsrv = new FornecedorServico();
    }

        public void Criar(){
        Fornecedor fd = new Fornecedor();
        fd.setCodigo(0);
        fd.setCnpj("XX. XXX. XXX/0001-XX");
        fd.setEmail("xxxx@gmail.com");
        fd.setNome("fulano de tal");
        fd.setRasaosocial("nome resgistrado da empresa");
        fd.setTelefone("xxxx-xxxx");
        this.fornsrv.Criar(fd);
        this.imprimirFornecedor(fd);
    }

    public void mostrarfornecedor(){
        ArrayList<Fornecedor> listafornecedor = this.fornsrv.LerTodos();

        //exibe a tabela
        for (Fornecedor fornecedor : listafornecedor) {
            this.imprimirFornecedor(fornecedor);
        }
        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");
    }

        public void ExibirPorLinha(){
        ArrayList<Fornecedor> lista = this.fornsrv.LerTodos();
        System.out.println("============================");
        for (Fornecedor fd : lista) {
            this.ImprimirEmLinha(fd);
        }
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

    private void ImprimirEmLinha(Fornecedor fd){
        String msg = "Fornecedor - ";
        msg += "Nome" + fd.getNome() + " | ";
        msg += "Código: " + fd.getCodigo() + " | ";
        msg += "Email: " + fd.getEmail() + " | ";
        msg += "Cargo: " + fd.getCnpj() + " | ";
        msg += "Telefone" + fd.getTelefone() + " | ";
        msg += "Salario" + fd.getRasaosocial() + " | ";
        System.out.println(msg);
    }
}
