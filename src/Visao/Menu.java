package Visao;

import Visao.MostraCliente;
import Servico.ClienteServico;
import Servico.FornecedorServico;
import Servico.FuncionarioServico;
import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Fornecedor;

public class Menu extends BaseMenu{

    private ClienteServico cl;
    private FuncionarioServico fun;
    private FornecedorServico forn;

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
        }    }

    @Override
    public void Listar() {
        Util.ClearConsole();
        System.out.println("Qual deseja ver ?");
        
        int opcaover = 0;
        while (opcaover !=3) {
            Util.ClearConsole();
            System.out.println("Estao no Sistema: ");
            System.out.println("1 - Cliente ");
            System.out.println("2 - Fornecedor");
            System.out.println("3 - Funcionario");
            System.out.println("Digite qual tabela deseja ver");
            opcaover = this.scanner.nextInt();
            switch (opcaover) {
                case 1:
                    Util.ClearConsole();
                    System.out.println("Listando...");
        
                    ArrayList<Cliente> lista = this.cl.LerTodos();
                    for (Cliente cl : lista) {
                        this.ImprimirEmLinha(cl);
                    }
        
                    System.out.println("Clique <ENTER> para continuar...");
                    this.scanner.nextLine();
                    this.scanner.nextLine();
                    break;
            
                case 2:
                Util.ClearConsole();
                System.out.println("Listando...");
    
                ArrayList<Fornecedor> lista2 = this.forn.LerTodos();
                for (Fornecedor forn : lista2) {
                    this.ImprimirEmLinha(forn);
                }
    
                System.out.println("Clique <ENTER> para continuar...");
                this.scanner.nextLine();
                this.scanner.nextLine();

                    break;
                
            }
        }
    }

    @Override
    public void Localizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Localizar'");
    }

    @Override
    public void Adicionar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Adicionar'");
    }

    @Override
    public void Atualizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public void Remover() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Remover'");
    }


    
}
