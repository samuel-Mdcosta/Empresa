package Visao;

import java.util.ArrayList;

import Dominio.Funcionario;
import Servico.FuncionarioServico;

public class MostraFuncionario {
    private FuncionarioServico funsrv;

    public MostraFuncionario(){
        this.funsrv = new FuncionarioServico();
    }

    public void Criar(){
        Funcionario fun = new Funcionario();
        fun.setCodigo(0);
        fun.setCargo("Teste");
        fun.setEmail("xxxx@gmail.com");
        fun.setNome("fulano de tal");
        fun.setSalario(Double.valueOf(1000));
        fun.setTelefone("xxxx-xxxx");
        this.funsrv.Criar(fun);
        this.imprimirFuncionario(fun);
    }

    public void mostrarfuncionario(){
        ArrayList<Funcionario> listafuFuncionario = this.funsrv.LerTodos();

        for (Funcionario funcionario : listafuFuncionario) {
            this.imprimirFuncionario(funcionario);
        }

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println(" ");
    
    }

    public void ExibirPorLinha(){
        ArrayList<Funcionario> lista = this.funsrv.LerTodos();
        System.out.println("============================");
        for (Funcionario fun : lista) {
            this.ImprimirEmLinha(fun);
        }
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

    private void ImprimirEmLinha(Funcionario fun){
        String msg = "Funcionario - ";
        msg += "Nome" + fun.getNome() + " | ";
        msg += "Código: " + fun.getCodigo() + " | ";
        msg += "Email: " + fun.getEmail() + " | ";
        msg += "Cargo: " + fun.getCargo() + " | ";
        msg += "Telefone" + fun.getTelefone() + " | ";
        msg += "Salario" + fun.getSalario() + " | ";
        System.out.println(msg);
    }


}
