package Servico;

import java.util.ArrayList;

import Dominio.Fornecedor;
import Repositorio.FornecedorRepo;

public class FornecedorServico extends BaseServico<Fornecedor>{
    //liga ao repositorio
    private FornecedorRepo repositorio;

    public FornecedorServico(){
        this.repositorio = new FornecedorRepo();
    }

        @Override
    public Fornecedor Criar(Fornecedor dados) {
        return this.repositorio.Create(dados);
    }

    @Override
    public ArrayList<Fornecedor> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Fornecedor Ler(int chave) {
        return this.repositorio.Read(chave);    
    }

    @Override
    public Fornecedor Atualizar(Fornecedor dados) {
        return this.repositorio.Update(dados);    
    }

    @Override
    public Fornecedor Deletar(int chave) {
        return this.repositorio.Delete(chave);    
    }
}
