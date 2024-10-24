package Repositorio;

import Dominio.Fornecedor;
import FakeDb.AddFornecedor;

public class FornecedorRepo extends BaseRepositorio<Fornecedor> {
    
    //faz ligaçao com o fakedb
    private AddFornecedor af;

    public FornecedorRepo(){

        //cria a lista
        this.af = new AddFornecedor();
        //armazena a table dentro do fonte de daods da baserepositorio
        this.FonteDeDados = this.af.getTabelaFornecedores();
    }

    @Override
    public Fornecedor Create(Fornecedor instancia) {
        int proximaChave = this.FonteDeDados.getLast().getCodigo();
        proximaChave ++;

        //atualiza o codigo que est na instancia
        instancia.setCodigo(proximaChave);
        this.FonteDeDados.add(instancia);
        return instancia;
    }

    @Override
    public Fornecedor Read(int chave) {
        //tipo generico da lista = nome da variavel - lista que ira usar
        for (Fornecedor af : this.FonteDeDados) {
            //se o codgo da lista for igual ao da chave ele retorna cl (lista)
            if (af.getCodigo() == chave) {
                return af;
            }
        }
        return null;
    }

    @Override
    public Fornecedor Update(Fornecedor instancia) {
        //acha a chave para atualizar a lista
        Fornecedor af = this.Read(instancia.getCodigo());

        //acha a lista
        if (af != null) {
            //pega o telefone que est em instancia e coloca em cl
            af.setTelefone(instancia.getTelefone());
            return af;
        }else{
            return null;
        }
    }

    @Override
    public Fornecedor Delete(int chave) {
        Fornecedor af = this.Read(chave);
        if (af != null) {
            //remove a instancia de cp da lista, nao esta apagando a lista
            //quando mando apagar devolve a intanica para quem pediu para caso o usuaio se arrependa
            this.FonteDeDados.remove(af);
            return af;
        }else{
            return null;
        }    
    }

}
