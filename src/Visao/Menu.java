package Visao;

import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Fornecedor;
import Dominio.Funcionario;
import Servico.ClienteServico;
import Servico.FornecedorServico;
import Servico.FuncionarioServico;

public class Menu extends BaseMenu {

    private ClienteServico cl;
    private FornecedorServico forn;
    private FuncionarioServico fun;

    public Menu(){
        super();
        this.cl = new ClienteServico();
        this.forn = new FornecedorServico();
        this.fun = new FuncionarioServico();
    }

    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9)
        {
            Util.ClearConsole();
            System.out.println("Classe Produto");
            System.out.println("Menu de Opções");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = this.scanner.nextInt();
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                case 3:
                    this.Adicionar();
                    break;
                case 4:
                    this.Atualizar();
                    break;
                case 5:
                    this.Remover();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }    
    }

    @Override
    public void Listar() {
        Util.ClearConsole();
        System.out.println("Listando...");

        ArrayList<Cliente> lista = this.cl.LerTodos();
        System.out.println("============================");
        for (Cliente cl : lista) {
            this.ImprimirEmLinhaCl(cl);
        }

        ArrayList<Fornecedor> listaF = this.forn.LerTodos();
        System.out.println("============================");
        for (Fornecedor forn : listaF) {
            this.ImprimirEmLinhaFd(forn);
        }

        ArrayList<Funcionario> listaFun = this.fun.LerTodos();
        System.out.println("============================");
        for (Funcionario fun : listaFun) {
            this.ImprimirEmLinhaFun(fun);
        }
        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.ClearConsole();
        System.out.println("Localizando...");

        System.out.print("Informe o código que deseja localizar: ");
        int codigo = this.scanner.nextInt();

        Cliente cl = this.cl.Ler(codigo);
        Fornecedor forn = this.forn.Ler(codigo);
        Funcionario fun = this.fun.Ler(codigo);
        if (cl != null){
            this.ImprimirEmLinhaCl(cl);
        }else{
            System.out.println("Problema - Codigo de cliente não foi encontrada");
        }

        if (forn != null){
            this.ImprimirEmLinhaFd(forn);
        }else{
            System.out.println("Problema - Codigode fornecedor não foi encontrada");
        }

        if (fun != null) {
            this.ImprimirEmLinhaFun(fun);
        }else{
            System.out.println("Problema - Codigo de funcionario não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();    }

    @Override
    public void Adicionar() {
        Util.ClearConsole();
        System.out.println("Adicionando...");

        System.out.print("Informe o nome do cliente: ");
        String nome = this.scanner.next();
        System.out.print("Informe o Cpf do cliente: ");
        String cpf = this.scanner.next();
        System.out.print("Informe o email do cliente: ");
        String email = this.scanner.next();
        System.out.print("Informe o telefone do cliente: ");
        String telefone = this.scanner.next();

        Cliente cl = new Cliente();
        cl.setCodigo(0);
        cl.setCpf(cpf);
        cl.setEmail(email);
        cl.setNome(nome);
        cl.setTelefone(telefone);
        
        Cliente NovoCliente = this.cl.Criar(cl);
        if (NovoCliente != null){
            System.out.println("Cliente adicionada com sucesso");
        }
        else{
            System.out.println("Problema - Cliente não foi adicionada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();    }

    @Override
    public void Atualizar() {
        Util.ClearConsole();
        System.out.println("Atualizando...");

        System.out.print("Informe o código: ");
        int codigo = this.scanner.nextInt();

        Cliente cl = this.cl.Ler(codigo);
        if (cl != null){
            this.ImprimirEmLinhaCl(cl);
            System.out.print("Informe o novo numero de telefone: ");
            String telefone = this.scanner.next();
            cl.setTelefone(telefone);
            if (this.cl.Atualizar(cl) != null){
                System.out.println("Classe de Produto atualizada com sucesso");
            }
            else{
                System.out.println("Problema - Telefone não foi atualizada");
            }
        }
        else{
            System.out.println("Problema - Cliente não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();    }

    @Override
    public void Remover() {
        //remove a instancia da classe para retornar para que chamou
        Util.ClearConsole();
        System.out.println("Removendo...");

        System.out.print("Informe o código da Classe : ");
        int codigo = this.scanner.nextInt();

        Cliente cl = this.cl.Ler(codigo);
        if (cl != null){
            this.ImprimirEmLinhaCl(cl);
            if (this.cl.Deletar(codigo) != null){
                System.out.println("Cliente removido com sucesso");
            }
            else{
                System.out.println("Problema - Cliente não foi removido");
            }
        }
        else{
            System.out.println("Problema - Cliente não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();    }

    private void ImprimirEmLinhaCl(Cliente cl){
        String msg = "Cliente - ";
        msg += "Nome: " + cl.getNome() + " | ";
        msg += "Código: " + cl.getCodigo() + " | ";
        msg += "Email: " + cl.getEmail() + " | ";
        msg += "CPF: " + cl.getCpf() + " | ";
        msg += "Telefone" + cl.getTelefone() + " | ";
        System.out.println(msg);
    }

        private void ImprimirEmLinhaFd(Fornecedor fd){
        String msg = "Fornecedor - ";
        msg += "Nome: " + fd.getNome() + " | ";
        msg += "Código: " + fd.getCodigo() + " | ";
        msg += "Email: " + fd.getEmail() + " | ";
        msg += "Cargo: " + fd.getCnpj() + " | ";
        msg += "Telefone" + fd.getTelefone() + " | ";
        msg += "Salario" + fd.getRasaosocial() + " | ";
        System.out.println(msg);
    }
    
        private void ImprimirEmLinhaFun(Funcionario fun){
        String msg = "Funcionario - ";
        msg += "Nome: " + fun.getNome() + " | ";
        msg += "Código: " + fun.getCodigo() + " | ";
        msg += "Email: " + fun.getEmail() + " | ";
        msg += "Cargo: " + fun.getCargo() + " | ";
        msg += "Telefone" + fun.getTelefone() + " | ";
        msg += "Salario" + fun.getSalario() + " | ";
        System.out.println(msg);
    }
}