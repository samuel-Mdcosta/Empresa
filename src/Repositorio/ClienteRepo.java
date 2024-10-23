package Repositorio;

import Dominio.Cliente;
import FakeDb.AddCliente;

public class ClienteRepo extends BaseRepositorio<Cliente>{

    //faz a ligaçao com o fakedb
    private AddCliente ac;

    public ClienteRepo(){

        //cria a lista
        this.ac = new AddCliente();

        //armazena a table dentro do fonte de daods da baserepositorio
        this.FonteDeDados = this.ac.getTabelaClientes();
    }

    @Override
    public Cliente Create(Cliente instancia) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'Delete'");

    }

    @Override
    public Cliente Read(int chave) {
        //tipo generico da lista = nome da variavel - lista que ira usar
        for (Cliente cl : this.FonteDeDados) {
            //se o codgo da lista for igual ao da chave ele retorna cl (lista)
            if (cl.getCodigo() == chave) {
                return cl;
            }
        }
        return null;
    }

    @Override
    public Cliente Update(Cliente instancia) {
        //acha a chave para atualizar a lista
        Cliente cl = this.Read(instancia.getCodigo());

        //acha a lista
        if (cl != null) {
            
        }else{
            return null;
        }
    }

    @Override
    public Cliente Delete(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
    
}
