package Servico;

import java.util.ArrayList;

import Dominio.Cliente;
import Repositorio.ClienteRepo;

public class ClienteServico extends BaseServico<Cliente>{
    //liga a classe reposiotorio
    private ClienteRepo repositorio;

    public ClienteServico(){
        this.repositorio = new ClienteRepo();
    }

    @Override
    public Cliente Criar(Cliente dados) {
        return this.repositorio.Create(dados);
    }

    @Override
    public ArrayList<Cliente> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Cliente Ler(int chave) {
        return this.repositorio.Read(chave);    
    }

    @Override
    public Cliente Atualizar(Cliente dados) {
        return this.repositorio.Update(dados);    
    }

    @Override
    public Cliente Deletar(int chave) {
        return this.repositorio.Delete(chave);    
    }

}