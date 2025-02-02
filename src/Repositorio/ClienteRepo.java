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
        //pega o ultimo do arraylist                
        //guarda outro elemento na lista
        //proxima chave e a chave do novo objeto que ira para o array list
        int proximaChave = this.FonteDeDados.getLast().getCodigo();
        proximaChave ++;
        
        //atualiza o codigo que est na instancia
        instancia.setCodigo(proximaChave);
        this.FonteDeDados.add(instancia);
        return instancia;
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
            //pega o telefone que est em instancia e coloca em cl
            cl.setTelefone(instancia.getTelefone());
            return cl;
        }else{
            return null;
        }
    }

    @Override
    public Cliente Delete(int chave) {
        Cliente cl = this.Read(chave);
        if (cl != null) {
            //remove a instancia de cp da lista, nao esta apagando a lista
            //quando mando apagar devolve a intanica para quem pediu para caso o usuaio se arrependa
            this.FonteDeDados.remove(cl);
            return cl;
        }else{
            return null;
        }
    }
    
}
