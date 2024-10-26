package Servico;

import java.util.ArrayList;

import Dominio.Funcionario;
import Repositorio.FuncionarioRepo;

public class FuncionarioServico extends BaseServico<Funcionario> {

    private FuncionarioRepo repositorio;

    public FuncionarioServico(){
        this.repositorio = new FuncionarioRepo(); 
    }
    
        @Override
    public Funcionario Criar(Funcionario dados) {
        return this.repositorio.Create(dados);
    }

    @Override
    public ArrayList<
    Funcionario> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Funcionario Ler(int chave) {
        return this.repositorio.Read(chave);    
    }

    @Override
    public Funcionario Atualizar(Funcionario dados) {
        return this.repositorio.Update(dados);    
    }

    @Override
    public Funcionario Deletar(int chave) {
        return this.repositorio.Delete(chave);    
    }
}
